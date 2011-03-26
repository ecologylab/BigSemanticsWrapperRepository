package ecologylab.semantics.generated.library.flickr;


import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	A Flickr Image result page

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrImageDetail
extends Document
{

@simpl_composite @mm_name("flickr_image")
private FlickrImage	flickrImage;



/**
	Constructor
*/
public FlickrImageDetail()
{
 super();
}

/**
	Constructor
*/
public FlickrImageDetail(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for flickrImage
*/
public FlickrImage	flickrImage()
{
	FlickrImage	result = this.flickrImage;
	if (result == null)
	{
		result = new FlickrImage();
		this.flickrImage = result;
	}
	return result;
}

/**
	Get the value of field flickrImage
*/
public FlickrImage getFlickrImage()
{
	return this.flickrImage;
}

/**
	Set the value of field flickrImage
*/
public void setFlickrImage(FlickrImage flickrImage)
{
	this.flickrImage = flickrImage;
}


}

