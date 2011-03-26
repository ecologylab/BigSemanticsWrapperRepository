package ecologylab.semantics.generated.library.flickr;


import java.util.ArrayList;

import ecologylab.semantics.generated.library.search.Search;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Searching from a photo for nearby photos

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrGroups
extends Search
{

@simpl_collection("flickr_tag") @xml_tag("flickr_tags") @mm_name("flickr_tags")
private ArrayList<FlickrTag>	flickrTags;



/**
	Constructor
*/
public FlickrGroups()
{
 super();
}

/**
	Constructor
*/
public FlickrGroups(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for flickrTags
*/
public ArrayList<FlickrTag>	flickrTags()
{
	ArrayList<FlickrTag>	result = this.flickrTags;
	if (result == null)
	{
		result = new ArrayList<FlickrTag>();
		this.flickrTags = result;
	}
	return result;
}

/**
	Get the value of field flickrTags
*/
public ArrayList<FlickrTag> getFlickrTags()
{
	return this.flickrTags;
}

/**
	Set the value of field flickrTags
*/
public void setFlickrTags(ArrayList<FlickrTag> flickrTags)
{
	this.flickrTags = flickrTags;
}


}

