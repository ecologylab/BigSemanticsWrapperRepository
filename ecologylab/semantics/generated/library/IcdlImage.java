package ecologylab.semantics.generated.library;
/**
This is a generated code. Please do not edit or modify it.
 @author MetadataCompiler 

**/ 



 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;

/**
	Image from The Interantional Children's digital library.
**/ 

public class  IcdlImage
extends  Image
{

/**
	Constructor
**/ 

public IcdlImage()
{
}
/**
	Constructor
**/ 

public IcdlImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
/**
	The language of the library
**/ 

	@xml_tag("languages") @xml_nested private MetadataString	languages;
/**
	Lazy Evaluation for languages
**/ 

MetadataString	languages()
{
MetadataString	result	=this.languages;
if(result == null)
{
result = new MetadataString();
this.languages	=	 result;
}
return result;
}
/**
	Gets the value of the field languages
**/ 

public String getLanguages(){
return languages().getValue();
}
/**
	Sets the value of the field languages
**/ 

public void setLanguages( String languages )
{
this.languages().setValue(languages);
}
/**
	The heavy weight setter method for field languages
**/ 

public void hwSetLanguages( String languages )
{
this.languages().setValue(languages);
rebuildCompositeTermVector();
 }
}

