package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;


/**
	A Flickr Image result page
**/ 

@simpl_inherit

public class  FlickrImageDetail
extends  Document
{


private  @simpl_composite FlickrImage	flickr_image;
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

}

