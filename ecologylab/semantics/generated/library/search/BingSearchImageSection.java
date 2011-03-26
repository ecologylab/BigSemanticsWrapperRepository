package ecologylab.semantics.generated.library.search;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class BingSearchImageSection
extends Document
{

@simpl_collection("mms:ImageResult") @xml_tag("mms:Results") @mm_name("image_search_results")
private ArrayList<BingImageSearchResult>	imageSearchResults;



/**
	Constructor
*/
public BingSearchImageSection()
{
 super();
}

/**
	Constructor
*/
public BingSearchImageSection(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for imageSearchResults
*/
public ArrayList<BingImageSearchResult>	imageSearchResults()
{
	ArrayList<BingImageSearchResult>	result = this.imageSearchResults;
	if (result == null)
	{
		result = new ArrayList<BingImageSearchResult>();
		this.imageSearchResults = result;
	}
	return result;
}

/**
	Get the value of field imageSearchResults
*/
public ArrayList<BingImageSearchResult> getImageSearchResults()
{
	return this.imageSearchResults;
}

/**
	Set the value of field imageSearchResults
*/
public void setImageSearchResults(ArrayList<BingImageSearchResult> imageSearchResults)
{
	this.imageSearchResults = imageSearchResults;
}


}

