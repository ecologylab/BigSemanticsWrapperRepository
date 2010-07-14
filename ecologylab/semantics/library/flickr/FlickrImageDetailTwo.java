package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
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

public class  FlickrImageDetailTwo
extends  Document
{

	@simpl_collection("related_photo") private ArrayList<RelatedPhoto>	relatedPhotos;

private  @simpl_composite FlickrImage	flickr_image;	@simpl_collection("author_photos") private ArrayList<AuthorPhotos>	authorPhotos;
	@simpl_collection("flickr_tag") private ArrayList<FlickrTag>	flickrTags;

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

public FlickrImageDetailTwo(MetaMetadata metaMetadata)
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
	Lazy Evaluation for flickr_image
**/ 

public FlickrImage	flickr_image()
{
FlickrImage	result	=this.flickr_image;
if(result == null)
{
result = new FlickrImage();
this.flickr_image	=	 result;
}
return result;
}

/**
	Set the value of field flickr_image
**/ 

public void setFlickrImage( FlickrImage flickr_image )
{
this.flickr_image = flickr_image ;
}

/**
	Get the value of field flickr_image
**/ 

public FlickrImage getFlickrImage(){
return this.flickr_image;
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

