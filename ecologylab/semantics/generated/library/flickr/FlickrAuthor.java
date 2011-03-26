package ecologylab.semantics.generated.library.flickr;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	All flickr photos of a particular user

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrAuthor
extends Document
{


/**
	Collection of all images of a user
*/
@simpl_collection("flickr_link") @xml_tag("flickr_link_set") @mm_name("flickr_link_set")
private ArrayList<FlickrLink>	flickrLinkSet;



/**
	Constructor
*/
public FlickrAuthor()
{
 super();
}

/**
	Constructor
*/
public FlickrAuthor(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for flickrLinkSet
*/
public ArrayList<FlickrLink>	flickrLinkSet()
{
	ArrayList<FlickrLink>	result = this.flickrLinkSet;
	if (result == null)
	{
		result = new ArrayList<FlickrLink>();
		this.flickrLinkSet = result;
	}
	return result;
}

/**
	Get the value of field flickrLinkSet
*/
public ArrayList<FlickrLink> getFlickrLinkSet()
{
	return this.flickrLinkSet;
}

/**
	Set the value of field flickrLinkSet
*/
public void setFlickrLinkSet(ArrayList<FlickrLink> flickrLinkSet)
{
	this.flickrLinkSet = flickrLinkSet;
}


}

