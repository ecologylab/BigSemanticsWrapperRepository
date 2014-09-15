import re
import os
 

def recursiveFixer(path):
	for files in os.listdir(path):
		str2=path.split('\\') 
		print str2
		n=len(str2)
		packageList = str2[9:]
		
		if os.path.isfile(path + '\\' +files):

			
			if str2[n-1] == 'primitiveTypes':
				print 'primitives detected'
			else:
				newPackage = 'ecologylab.bigsemantics.generated.library'
				for packageName in packageList:
					newPackage = newPackage + '.' + packageName 
				newPackage = newPackage + '"'
				f = open(path + '\\' +files, 'r+')
				replaceString = f.read()
				p = re.compile( 'ecologylab\.bigsemantics\.generated\.library.*\"')
				x = p.sub( newPackage, replaceString)
				f.seek(0)
				f.write(x)
				f.truncate()
				f.close()
				
		else:
			
			#pList = packageList.append(str2[n-1]) 
			recursiveFixer(path + '\\' + files)



cwd = os.getcwd()
recursiveFixer(cwd + '\\repository')
 