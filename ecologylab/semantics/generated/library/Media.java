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
	The Media Class
**/ 

public class  Media
extends  Metadata
{

/**
	Constructor
**/ 

public Media()
{
}
/**
	Constructor
**/ 

public Media(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
/**
	
**/ 

	@xml_tag("context") @xml_nested private MetadataString	context;
/**
	Lazy Evaluation for context
**/ 

MetadataString	context()
{
MetadataString	result	=this.context;
if(result == null)
{
result = new MetadataString();
this.context	=	 result;
}
return result;
}
/**
	Gets the value of the field context
**/ 

public String getContext(){
return context().getValue();
}
/**
	Sets the value of the field context
**/ 

public void setContext( String context )
{
this.context().setValue(context);
}
/**
	The heavy weight setter method for field context
**/ 

public void hwSetContext( String context )
{
this.context().setValue(context);
rebuildCompositeTermVector();
 }
}

