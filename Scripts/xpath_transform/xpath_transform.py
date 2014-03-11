#!/usr/bin/python

import lxml.etree
import io
import os
import os.path

if __name__ == '__main__':
    xslt_file = open('xpath_transform.xslt')
    xslt_root = lxml.etree.parse(xslt_file)
    transform = lxml.etree.XSLT(xslt_root)
    xslt_file.close()

    result_dir = 'result'

    if not os.path.exists(result_dir):
        os.mkdir(result_dir)

    files = [os.path.join(d, f)
             for d, subdirs, fs in os.walk('.')
             for f in fs if f.endswith('.xml')]
    for repo_file_name in files:
        repo_file = open(repo_file_name)
        repo = lxml.etree.parse(repo_file)
        repo_file.close()

        new_repo = transform(repo)
        new_repo_ugly = lxml.etree.tostring(new_repo)
        parser = lxml.etree.XMLParser(remove_blank_text=True)
        result = lxml.etree.parse(io.BytesIO(new_repo_ugly), parser)
        result_xml = lxml.etree.tostring(result, pretty_print=True)
        result_file = open(os.path.join(result_dir, repo_file_name), 'wb')
        result_file.write(result_xml)
        result_file.close()

