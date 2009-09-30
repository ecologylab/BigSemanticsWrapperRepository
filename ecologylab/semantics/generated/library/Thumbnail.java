package ecologylab.semantics.generated.library;

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

@xml_inherit
@xml_tag("thumbnail")
public class Thumbnail extends Metadata{


/**
	Constructor
**/ 

public Thumbnail()
{
 super();
}

/**
	Constructor
**/ 

public Thumbnail(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("Url") @xml_nested private MetadataParsedURL	Url;

/**
	Lazy Evaluation for Url
**/ 

public MetadataParsedURL	Url()
{
MetadataParsedURL	result	=this.Url;
if(result == null)
{
result = new MetadataParsedURL();
this.Url	=	 result;
}
return result;
}

/**
	Gets the value of the field Url
**/ 

public ParsedURL getUrl(){
return Url().getValue();
}

/**
	Sets the value of the field Url
**/ 

public void setUrl( ParsedURL Url )
{
this.Url().setValue(Url);
}

/**
	The heavy weight setter method for field Url
**/ 

public void hwSetUrl( ParsedURL Url )
{
this.Url().setValue(Url);
rebuildCompositeTermVector();
 }
/**
	 Sets the Url directly
**/ 

public void setUrlMetadata(MetadataParsedURL Url)
{	this.Url = Url;
}
/**
	Heavy Weight Direct setter method for Url
**/ 

public void hwSetUrlMetadata(MetadataParsedURL Url)
{	 if(this.Url!=null && this.Url.getValue()!=null && hasTermVector())
		 termVector().remove(this.Url.termVector());
	 this.Url = Url;
	rebuildCompositeTermVector();
}}
