package ecologylab.semantics.generated.library;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Google image search type

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GoogleImageSearchType
extends Document
{


/**
	Collection of results for google image search
*/
@simpl_collection("image_result") @simpl_nowrap @mm_name("image_results")
private ArrayList<ImageResult>	imageResults;



/**
	Constructor
*/
public GoogleImageSearchType()
{
 super();
}

/**
	Constructor
*/
public GoogleImageSearchType(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for imageResults
*/
public ArrayList<ImageResult>	imageResults()
{
	ArrayList<ImageResult>	result = this.imageResults;
	if (result == null)
	{
		result = new ArrayList<ImageResult>();
		this.imageResults = result;
	}
	return result;
}

/**
	Get the value of field imageResults
*/
public ArrayList<ImageResult> getImageResults()
{
	return this.imageResults;
}

/**
	Set the value of field imageResults
*/
public void setImageResults(ArrayList<ImageResult> imageResults)
{
	this.imageResults = imageResults;
}


}

