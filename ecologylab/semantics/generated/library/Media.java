package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;


/**
	The Media Class
**/ 

@xml_inherit
public class  Media
extends  Metadata
{


/**
	Constructor
**/ 

public Media()
{
 super();
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

