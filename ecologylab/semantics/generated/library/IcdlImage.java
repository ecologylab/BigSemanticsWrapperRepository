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
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	Image from The Interantional Children's digital library.
**/ 

@xml_inherit
@xml_tag("icdl_image")
public class  IcdlImage
extends  Image
{


/**
	Constructor
**/ 

public IcdlImage()
{
 super();
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

public MetadataString	languages()
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
/**
	 Sets the languages directly
**/ 

public void setLanguagesMetadata(MetadataString languages)
{	this.languages = languages;
}
/**
	Heavy Weight Direct setter method for languages
**/ 

public void hwSetLanguagesMetadata(MetadataString languages)
{	 if(this.languages!=null && this.languages.getValue()!=null && hasTermVector())
		 termVector().remove(this.languages.termVector());
	 this.languages = languages;
	rebuildCompositeTermVector();
}
}

