#!/usr/bin/env python

# This script generates a shell script that imports subprojects into this
# project as remotes, branches, and subtrees.

subprojects = [
		("MetaMetadataRepository", "bigSemanticsWrappers"),
		("ecologylabGeneratedSemantics", "bigSemanticsGeneratedClassesJava"),
]

importing_branch_name = "importing"

print "git checkout -b {0}".format(importing_branch_name)
print
for subproject in subprojects:
	current_name = subproject[0]
	new_name = subproject[1]
	print "git remote add remote_{0} https://github.com/ecologylab/{0}.git".format(current_name)
	print "git fetch remote_{0}".format(current_name)
	print "git checkout -b branch_{0} remote_{0}/master".format(current_name)
	print "git checkout {0}".format(importing_branch_name)
	print "git read-tree --prefix={1}/ -u branch_{0}".format(current_name, new_name)
	print "git add {0}".format(new_name)
	print "git commit -m \"Imported {0} as subproject {1}.\"".format(current_name, new_name)
	print

