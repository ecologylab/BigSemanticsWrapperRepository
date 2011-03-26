package ecologylab.semantics.generated.library.search;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	The google Search class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GoogleScholarSearch
extends Document
{

@simpl_collection("google_scholar_search_result") @simpl_nowrap @mm_name("search_results")
private ArrayList<GoogleScholarSearchResult>	searchResults;



/**
	Constructor
*/
public GoogleScholarSearch()
{
 super();
}

/**
	Constructor
*/
public GoogleScholarSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for searchResults
*/
public ArrayList<GoogleScholarSearchResult>	searchResults()
{
	ArrayList<GoogleScholarSearchResult>	result = this.searchResults;
	if (result == null)
	{
		result = new ArrayList<GoogleScholarSearchResult>();
		this.searchResults = result;
	}
	return result;
}

/**
	Get the value of field searchResults
*/
public ArrayList<GoogleScholarSearchResult> getSearchResults()
{
	return this.searchResults;
}

/**
	Set the value of field searchResults
*/
public void setSearchResults(ArrayList<GoogleScholarSearchResult> searchResults)
{
	this.searchResults = searchResults;
}


}

