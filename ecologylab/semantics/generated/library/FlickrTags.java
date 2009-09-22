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
	All flickr photos of a tag
**/ 

@xml_inherit
@xml_tag("flickr_tags")
public class  FlickrTags
extends  Document
{


/**
	Constructor
**/ 

public FlickrTags()
{
 super();
}

/**
	Constructor
**/ 

public FlickrTags(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
	@xml_collection("flickr_link_set") private ArrayList<FlickrLink>	flickrLinkSet;

/**
	Lazy Evaluation for flickrLinkSet
**/ 

public ArrayList<FlickrLink>	flickrLinkSet()
{
ArrayList<FlickrLink>	result	=this.flickrLinkSet;
if(result == null)
{
result = new ArrayList<FlickrLink>();
this.flickrLinkSet	=	 result;
}
return result;
}

/**
	Set the value of field flickrLinkSet
**/ 

public void setFlickrLinkSet( ArrayList<FlickrLink> flickrLinkSet )
{
this.flickrLinkSet = flickrLinkSet ;
}

/**
	Get the value of field flickrLinkSet
**/ 

public ArrayList<FlickrLink> getFlickrLinkSet(){
return this.flickrLinkSet;
}

}

