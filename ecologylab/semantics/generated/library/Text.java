package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.builtins.Entity;

 import java.util.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.net.ParsedURL;
import ecologylab.generic.HashMapArrayList;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	The Text Class
**/ 

@xml_inherit

public class  Text
extends  Media
{


/**
	null
**/ 

	 @xml_nested private MetadataString	text;

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
	Lazy Evaluation for text
**/ 

public MetadataString	text()
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
/**
	 Sets the text directly
**/ 

public void setTextMetadata(MetadataString text)
{	this.text = text;
}
/**
	Heavy Weight Direct setter method for text
**/ 

public void hwSetTextMetadata(MetadataString text)
{	 if(this.text!=null && this.text.getValue()!=null && hasTermVector())
		 termVector().remove(this.text.termVector());
	 this.text = text;
	rebuildCompositeTermVector();
}
}

