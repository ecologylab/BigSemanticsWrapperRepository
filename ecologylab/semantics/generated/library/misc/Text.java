package ecologylab.semantics.generated.library.misc;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	The Text Class
**/ 

@simpl_inherit

public class  Text
extends  Media
{

	 @simpl_scalar private MetadataString	text;

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

