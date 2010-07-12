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

public class  FlickrTwoImageDetail
extends  Document
{

	@simpl_collection("related_photo") private ArrayList<RelatedPhoto>	relatedPhotos;
	@simpl_collection("flickr_two_image") private ArrayList<FlickrTwoImage>	flickrTwoImage;
	@simpl_collection("author_photos") private ArrayList<AuthorPhotos>	authorPhotos;
	@simpl_collection("flickr_two_tag") private ArrayList<FlickrTwoTag>	flickrTwoTags;

/**
	Constructor
**/ 

public FlickrTwoImageDetail()
{
 super();
}

/**
	Constructor
**/ 

public FlickrTwoImageDetail(MetaMetadata metaMetadata)
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
	Lazy Evaluation for flickrTwoImage
**/ 

public  ArrayList<FlickrTwoImage>	flickrTwoImage()
{
 ArrayList<FlickrTwoImage>	result	=this.flickrTwoImage;
if(result == null)
{
result = new  ArrayList<FlickrTwoImage>();
this.flickrTwoImage	=	 result;
}
return result;
}

/**
	Set the value of field flickrTwoImage
**/ 

public void setFlickrTwoImage(  ArrayList<FlickrTwoImage> flickrTwoImage )
{
this.flickrTwoImage = flickrTwoImage ;
}

/**
	Get the value of field flickrTwoImage
**/ 

public  ArrayList<FlickrTwoImage> getFlickrTwoImage(){
return this.flickrTwoImage;
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
	Lazy Evaluation for flickrTwoTags
**/ 

public  ArrayList<FlickrTwoTag>	flickrTwoTags()
{
 ArrayList<FlickrTwoTag>	result	=this.flickrTwoTags;
if(result == null)
{
result = new  ArrayList<FlickrTwoTag>();
this.flickrTwoTags	=	 result;
}
return result;
}

/**
	Set the value of field flickrTwoTags
**/ 

public void setFlickrTwoTags(  ArrayList<FlickrTwoTag> flickrTwoTags )
{
this.flickrTwoTags = flickrTwoTags ;
}

/**
	Get the value of field flickrTwoTags
**/ 

public  ArrayList<FlickrTwoTag> getFlickrTwoTags(){
return this.flickrTwoTags;
}

}

