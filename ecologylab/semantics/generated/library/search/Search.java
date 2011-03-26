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
public class Search
extends Document
{

@simpl_collection("search_result") @simpl_nowrap @mm_name("search_results")
private ArrayList<SearchResult>	searchResults;



/**
	Constructor
*/
public Search()
{
 super();
}

/**
	Constructor
*/
public Search(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for searchResults
*/
public ArrayList<SearchResult>	searchResults()
{
	ArrayList<SearchResult>	result = this.searchResults;
	if (result == null)
	{
		result = new ArrayList<SearchResult>();
		this.searchResults = result;
	}
	return result;
}

/**
	Get the value of field searchResults
*/
public ArrayList<SearchResult> getSearchResults()
{
	return this.searchResults;
}

/**
	Set the value of field searchResults
*/
public void setSearchResults(ArrayList<SearchResult> searchResults)
{
	this.searchResults = searchResults;
}


}

