#!/usr/bin/python

import json
from urllib import urlencode
# install package tldextract by:
#   $ pip install tldextract
from tldextract import extract
# argparse requires python 2.7
import argparse

mice_demo = 'http://ecologylab.net/mice'

retain_subdomain = [
    'psu.edu',
]

display_domain = [
    'airbnb.com',
    'amazon.co.uk',
    'amazon.com',
    'apple.com',
    'ebay.com',
    'etsy.com',
    'hilton.com',
    'homeaway.com',
    'newegg.com',
    'overstock.com',
    'target.com',
    'tigerdirect.com',
    'tripadvisor.com',
    'urbanspoon.com',
    'warlmart.com',
    'yelp.com',
]

def dfs(node, children, op):
    if node is not None:
        op(node)
        for child in children(node):
            dfs(child, children, op)

def subtypes(node):
    subtypes = node.get('subtype', [])
    if subtypes is None:
        subtypes = node.get('subtypes', [])
    if subtypes is not None:
        if isinstance(subtypes, list):
            return subtypes
        else:
            subtypes = subtypes.get('subtype', [])
            if isinstance(subtypes, list):
                return subtypes
    return None

def all_example_urls(node):
    all_example_urls = node.get('all_example_url', [])
    if all_example_urls is None:
        all_example_urls = node.get('all_example_urls', [])
    if all_example_urls is not None:
        if isinstance(all_example_urls, list):
            return all_example_urls
        else:
            all_example_urls = all_example_urls.get('all_example_url', [])
            if isinstance(all_example_urls, list):
                return all_example_urls
    return None

def collect_example_urls(node, results):
    name = node['name']
    urls = all_example_urls(node)
    if urls is not None and len(urls) > 0:
        subdomain = None
        domain = None
        suffix = None
        for url in urls:
            er = extract(urls[0])
            subdomain = er.subdomain
            domain = er.domain
            suffix = er.suffix
        d = domain + '.' + suffix
        if d in retain_subdomain:
            d = subdomain + '.' + d
        if not results.has_key(d):
            results[d] = dict()
        if not results[d].has_key(name):
            results[d][name] = list()
        results[d][name].extend(urls)

def get_example_urls_by_domain_and_mmd(repo_json_file):
    f = open(repo_json_file, 'r')
    repo = json.load(f)
    f.close()

    root = repo['node']
    # {domain: {type: [urls]}}
    results = dict()
    dfs(root, subtypes, lambda n: collect_example_urls(n, results))
    return results

def print_domain_example_table(repo_file, is_filter):
    results = get_example_urls_by_domain_and_mmd(repo_file)
    print "<table>"
    print "  <tr>"
    print "    <th>Domain</th>"
    print "    <th>Wrappers</th>"
    print "    <th>Examples in MICE</th>"
    print "  </tr>"
    for d in sorted(results.keys()):
        if not is_filter or d in display_domain:
            s_types = [] 
            s_urls = []
            for t in sorted(results[d].keys()):
                s_types.append(t)
                for u in sorted(results[d][t]):
                    mice_url = mice_demo + '?' + urlencode({'url': u})
                    a = '<a href="' + mice_url + '" target="_blank">' +\
                        u + '</a>'
                    s_urls.append(a)
            print "  <tr>" 
            print "    <td>" + d + "</td>"
            print "    <td>\n" + "<br/>\n".join(s_types) + "\n    </td>"
            print "    <td>\n" + "<br/>\n".join(s_urls)+ "\n    </td>"
            print "  </tr>" 
    print "</table>"



if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        description="Generate domain-example table in HTML for meta-metadata.")
    parser.add_argument('--repo', type = str, default = 'mmd_repo.json',
                        help = 'The file containing the ontology for ' +
                               'visualization, in JSON.')
    parser.add_argument('--filter', type = bool, nargs = '?', const = True,
                        default = False, help = 'Filter domains for output.')
    args = parser.parse_args()
    print_domain_example_table(args.repo, args.filter)

