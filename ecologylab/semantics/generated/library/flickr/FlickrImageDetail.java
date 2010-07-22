package ecologylab.semantics.generated.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.uva.*;
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
	A Flickr Image result page
**/ 

@simpl_inherit

public class  FlickrImageDetail
extends  Document
{


private  @simpl_composite FlickrImage	flickrImage;
/**
	Constructor
**/ 

public FlickrImageDetail()
{
 super();
}

/**
	Constructor
**/ 

public FlickrImageDetail(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickrImage
**/ 

public FlickrImage	flickrImage()
{
FlickrImage	result	=this.flickrImage;
if(result == null)
{
result = new FlickrImage();
this.flickrImage	=	 result;
}
return result;
}

/**
	Set the value of field flickrImage
**/ 

public void setFlickrImage( FlickrImage flickrImage )
{
this.flickrImage = flickrImage ;
}

/**
	Get the value of field flickrImage
**/ 

public FlickrImage getFlickrImage(){
return this.flickrImage;
}

}

