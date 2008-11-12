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
	The RSS Class.
**/ 

public class  Rss
extends  Document
{

/**
	Constructor
**/ 

public Rss()
{
}
/**
	Constructor
**/ 

public Rss(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
/**
	
**/ 

	@xml_tag("subject") @xml_nested private MetadataString	subject;
/**
	Lazy Evaluation for subject
**/ 

MetadataString	subject()
{
MetadataString	result	=this.subject;
if(result == null)
{
result = new MetadataString();
this.subject	=	 result;
}
return result;
}
/**
	Gets the value of the field subject
**/ 

public String getSubject(){
return subject().getValue();
}
/**
	Sets the value of the field subject
**/ 

public void setSubject( String subject )
{
this.subject().setValue(subject);
}
/**
	The heavy weight setter method for field subject
**/ 

public void hwSetSubject( String subject )
{
this.subject().setValue(subject);
rebuildCompositeTermVector();
 }
}

