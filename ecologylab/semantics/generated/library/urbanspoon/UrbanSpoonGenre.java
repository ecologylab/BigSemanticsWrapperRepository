package ecologylab.semantics.generated.library.urbanspoon;


import java.util.ArrayList;

import ecologylab.semantics.generated.library.search.Search;
import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	UrbanSpoon Search Class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class UrbanSpoonGenre
extends Search
{

@simpl_collection("search_result") @xml_tag("top_results") @mm_name("top_results")
private ArrayList<SearchResult>	topResults;



/**
	Constructor
*/
public UrbanSpoonGenre()
{
 super();
}

/**
	Constructor
*/
public UrbanSpoonGenre(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for topResults
*/
public ArrayList<SearchResult>	topResults()
{
	ArrayList<SearchResult>	result = this.topResults;
	if (result == null)
	{
		result = new ArrayList<SearchResult>();
		this.topResults = result;
	}
	return result;
}

/**
	Get the value of field topResults
*/
public ArrayList<SearchResult> getTopResults()
{
	return this.topResults;
}

/**
	Set the value of field topResults
*/
public void setTopResults(ArrayList<SearchResult> topResults)
{
	this.topResults = topResults;
}


}

