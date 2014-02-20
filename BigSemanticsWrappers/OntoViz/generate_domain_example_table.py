#!/usr/bin/python

import sys
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

def collect_example_urls(node, is_filter, results):
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
        if not is_filter or d in display_domain:
            if not results.has_key(d):
                results[d] = dict()
            if not results[d].has_key(name):
                results[d][name] = list()
            results[d][name].extend(urls)

def example_urls_by_domain_type(repo_json_file, is_filter):
    f = open(repo_json_file, 'r')
    repo = json.load(f)
    f.close()

    root = repo['node']
    # {domain: {type: [urls]}}
    results = dict()
    dfs(root, subtypes, lambda n: collect_example_urls(n, is_filter, results))
    return results

def print_domain_example_json(results, f):
    objs = []
    for domain in sorted(results.keys()):
        obj = {}
        obj['domain'] = domain
        obj['type'] = sorted(list(results[domain].keys()))
        obj['urls'] = sorted([u for t in obj['type']
                                for u in results[domain][t]])
        objs.append(obj)
    root = {'examples': objs}
    json.dump(root, f)

def print_domain_example_table(results, f):
    f.write("<table>\n")
    f.write("  <tr>\n")
    f.write("    <th>Domain</th>\n")
    f.write("    <th>Wrappers</th>\n")
    f.write("    <th>Examples in MICE</th>\n")
    f.write("  </tr>\n")
    for d in sorted(results.keys()):
        s_types = [] 
        s_urls = []
        for t in sorted(results[d].keys()):
            s_types.append(t)
            for u in sorted(results[d][t]):
                mice_url = mice_demo + '?' + urlencode({'url': u})
                a = '<a href="' + mice_url + '" target="_blank">' +\
                    u + '</a>'
                s_urls.append(a)
        f.write("  <tr>\n")
        f.write("    <td>" + d + "</td>\n")
        f.write("    <td>\n" + "<br/>\n".join(s_types) + "\n    </td>\n")
        f.write("    <td>\n" + "<br/>\n".join(s_urls)+ "\n    </td>\n")
        f.write("  </tr>\n") 
    f.write("</table>\n")



if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        description="Generate domain-example table in HTML for meta-metadata.")
    parser.add_argument('--repo', type = str, default = 'mmd_repo.json',
                        help = 'The file containing the ontology for ' +
                               'visualization, in JSON.')
    parser.add_argument('--type', type = str, default = 'json',
                        choices = ['json', 'html'],
                        help = 'Output type.')
    parser.add_argument('--out', type = str, default = None,
                        help = 'Output file.')
    parser.add_argument('--filter', type = bool, nargs = '?', const = True,
                        default = False, help = 'Filter domains for output.')
    args = parser.parse_args()
    results = example_urls_by_domain_type(args.repo, args.filter)
    f = sys.stdout
    if args.out is not None:
        try:
            f = open(args.out, 'wb')
        except Exception as e:
            sys.stderr.write("Cannot write output: " + e.message + "\n")
            sys.exit(-1)
    if args.type == 'json':
        print_domain_example_json(results, f)
    else:
        print_domain_example_table(results, f)
    f.flush()
    if f is not sys.stdout:
        f.close()

