#!/usr/bin/python

import json
from urllib import urlencode
# install package tldextract by:
#   $ pip install tldextract
from tldextract import extract

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

def collect_example_urls(node, results):
    name = node['name']
    urls = node.get('all_example_urls', None)
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
    dfs(root,
        lambda n: n.get('subtypes', []),
        lambda n: collect_example_urls(n, results))
    return results



if __name__ == '__main__':
    results = get_example_urls_by_domain_and_mmd('mmd_repo.json')
    print "<table>"
    print "  <tr>"
    print "    <th>Domain</th>"
    print "    <th>Wrappers</th>"
    print "    <th>Examples in MICE</th>"
    print "  </tr>"
    for d in sorted(results.keys()):
        if d in display_domain:
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

