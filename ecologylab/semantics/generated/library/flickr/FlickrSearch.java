package ecologylab.semantics.generated.library.flickr;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	The flickr search class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrSearch
extends Document
{

@simpl_collection("flickr_image") @xml_tag("flickr_results") @mm_name("flickr_results")
private ArrayList<FlickrImage>	flickrResults;



/**
	Constructor
*/
public FlickrSearch()
{
 super();
}

/**
	Constructor
*/
public FlickrSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for flickrResults
*/
public ArrayList<FlickrImage>	flickrResults()
{
	ArrayList<FlickrImage>	result = this.flickrResults;
	if (result == null)
	{
		result = new ArrayList<FlickrImage>();
		this.flickrResults = result;
	}
	return result;
}

/**
	Get the value of field flickrResults
*/
public ArrayList<FlickrImage> getFlickrResults()
{
	return this.flickrResults;
}

/**
	Set the value of field flickrResults
*/
public void setFlickrResults(ArrayList<FlickrImage> flickrResults)
{
	this.flickrResults = flickrResults;
}


}

