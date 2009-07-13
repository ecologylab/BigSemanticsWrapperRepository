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
import ecologylab.xml.ElementState.xml_tag;


/**
	The Text Class
**/ 

@xml_inherit
@xml_tag("text")
public class  Text
extends  Media
{


/**
	Constructor
**/ 

public Text()
{
 super();
}

/**
	Constructor
**/ 

public Text(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
**/ 

	@xml_tag("text") @xml_nested private MetadataString	text;

/**
	Lazy Evaluation for text
**/ 

MetadataString	text()
{
MetadataString	result	=this.text;
if(result == null)
{
result = new MetadataString();
this.text	=	 result;
}
return result;
}

/**
	Gets the value of the field text
**/ 

public String getText(){
return text().getValue();
}

/**
	Sets the value of the field text
**/ 

public void setText( String text )
{
this.text().setValue(text);
}

/**
	The heavy weight setter method for field text
**/ 

public void hwSetText( String text )
{
this.text().setValue(text);
rebuildCompositeTermVector();
 }
}

