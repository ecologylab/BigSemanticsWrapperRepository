package ecologylab.semantics.generated.library.nsdl;


import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("NSDLSearchService")
public class NsdlService
extends Metadata
{

@simpl_composite @xml_tag("SearchResults") @mm_name("search_results")
private SearchResults	searchResults;



/**
	Constructor
*/
public NsdlService()
{
 super();
}

/**
	Constructor
*/
public NsdlService(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for searchResults
*/
public SearchResults	searchResults()
{
	SearchResults	result = this.searchResults;
	if (result == null)
	{
		result = new SearchResults();
		this.searchResults = result;
	}
	return result;
}

/**
	Get the value of field searchResults
*/
public SearchResults getSearchResults()
{
	return this.searchResults;
}

/**
	Set the value of field searchResults
*/
public void setSearchResults(SearchResults searchResults)
{
	this.searchResults = searchResults;
}


}

