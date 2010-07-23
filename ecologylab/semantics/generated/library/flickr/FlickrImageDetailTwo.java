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
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
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

public class  FlickrImageDetailTwo
extends  Document
{

	@simpl_collection("related_photo") @mm_name("related_photos") private ArrayList<RelatedPhoto>	relatedPhotos;

private @simpl_composite @mm_name("flickr_image") FlickrImage	flickrImage;	@simpl_collection("author_photos") @mm_name("author_photos") private ArrayList<AuthorPhotos>	authorPhotos;
	@simpl_collection("flickr_tag") @mm_name("flickr_tags") private ArrayList<FlickrTag>	flickrTags;

/**
	Constructor
**/ 

public FlickrImageDetailTwo()
{
 super();
}

/**
	Constructor
**/ 

public FlickrImageDetailTwo(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for relatedPhotos
**/ 

public  ArrayList<RelatedPhoto>	relatedPhotos()
{
 ArrayList<RelatedPhoto>	result	=this.relatedPhotos;
if(result == null)
{
result = new  ArrayList<RelatedPhoto>();
this.relatedPhotos	=	 result;
}
return result;
}

/**
	Set the value of field relatedPhotos
**/ 

public void setRelatedPhotos(  ArrayList<RelatedPhoto> relatedPhotos )
{
this.relatedPhotos = relatedPhotos ;
}

/**
	Get the value of field relatedPhotos
**/ 

public  ArrayList<RelatedPhoto> getRelatedPhotos(){
return this.relatedPhotos;
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

/**
	Lazy Evaluation for authorPhotos
**/ 

public  ArrayList<AuthorPhotos>	authorPhotos()
{
 ArrayList<AuthorPhotos>	result	=this.authorPhotos;
if(result == null)
{
result = new  ArrayList<AuthorPhotos>();
this.authorPhotos	=	 result;
}
return result;
}

/**
	Set the value of field authorPhotos
**/ 

public void setAuthorPhotos(  ArrayList<AuthorPhotos> authorPhotos )
{
this.authorPhotos = authorPhotos ;
}

/**
	Get the value of field authorPhotos
**/ 

public  ArrayList<AuthorPhotos> getAuthorPhotos(){
return this.authorPhotos;
}

/**
	Lazy Evaluation for flickrTags
**/ 

public  ArrayList<FlickrTag>	flickrTags()
{
 ArrayList<FlickrTag>	result	=this.flickrTags;
if(result == null)
{
result = new  ArrayList<FlickrTag>();
this.flickrTags	=	 result;
}
return result;
}

/**
	Set the value of field flickrTags
**/ 

public void setFlickrTags(  ArrayList<FlickrTag> flickrTags )
{
this.flickrTags = flickrTags ;
}

/**
	Get the value of field flickrTags
**/ 

public  ArrayList<FlickrTag> getFlickrTags(){
return this.flickrTags;
}

}

