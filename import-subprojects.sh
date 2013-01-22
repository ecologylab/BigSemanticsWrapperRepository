git checkout -b importing

git remote add remote_MetaMetadataRepository https://github.com/ecologylab/MetaMetadataRepository.git
git fetch remote_MetaMetadataRepository
git checkout -b branch_MetaMetadataRepository remote_MetaMetadataRepository/master
git checkout importing
git read-tree --prefix=bigSemanticsWrappers/ -u branch_MetaMetadataRepository
git add bigSemanticsWrappers
git commit -m "Imported MetaMetadataRepository as subproject bigSemanticsWrappers."

git remote add remote_ecologylabGeneratedSemantics https://github.com/ecologylab/ecologylabGeneratedSemantics.git
git fetch remote_ecologylabGeneratedSemantics
git checkout -b branch_ecologylabGeneratedSemantics remote_ecologylabGeneratedSemantics/master
git checkout importing
git read-tree --prefix=bigSemanticsGeneratedClassesJava/ -u branch_ecologylabGeneratedSemantics
git add bigSemanticsGeneratedClassesJava
git commit -m "Imported ecologylabGeneratedSemantics as subproject bigSemanticsGeneratedClassesJava."

