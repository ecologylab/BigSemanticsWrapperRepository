package ecologylab.semantics.generated.library.search;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;


/**
	Yahoo Web Search Service

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("ResultSet")
public class YahooResultSet
extends Document
{


/**
	Collection of results for yahoo search
*/
@simpl_collection("Result") @simpl_nowrap @mm_name("results")
private ArrayList<YahooResult>	results;



/**
	Constructor
*/
public YahooResultSet()
{
 super();
}

/**
	Constructor
*/
public YahooResultSet(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for results
*/
public ArrayList<YahooResult>	results()
{
	ArrayList<YahooResult>	result = this.results;
	if (result == null)
	{
		result = new ArrayList<YahooResult>();
		this.results = result;
	}
	return result;
}

/**
	Get the value of field results
*/
public ArrayList<YahooResult> getResults()
{
	return this.results;
}

/**
	Set the value of field results
*/
public void setResults(ArrayList<YahooResult> results)
{
	this.results = results;
}


}

