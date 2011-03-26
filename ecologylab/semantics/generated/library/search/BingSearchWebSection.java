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
public class BingSearchWebSection
extends Document
{

@simpl_collection("web:WebResult") @xml_tag("web:Results") @mm_name("web_search_results")
private ArrayList<BingWebSearchResult>	webSearchResults;



/**
	Constructor
*/
public BingSearchWebSection()
{
 super();
}

/**
	Constructor
*/
public BingSearchWebSection(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for webSearchResults
*/
public ArrayList<BingWebSearchResult>	webSearchResults()
{
	ArrayList<BingWebSearchResult>	result = this.webSearchResults;
	if (result == null)
	{
		result = new ArrayList<BingWebSearchResult>();
		this.webSearchResults = result;
	}
	return result;
}

/**
	Get the value of field webSearchResults
*/
public ArrayList<BingWebSearchResult> getWebSearchResults()
{
	return this.webSearchResults;
}

/**
	Set the value of field webSearchResults
*/
public void setWebSearchResults(ArrayList<BingWebSearchResult> webSearchResults)
{
	this.webSearchResults = webSearchResults;
}


}

