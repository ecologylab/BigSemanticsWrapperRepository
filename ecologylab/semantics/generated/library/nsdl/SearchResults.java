package ecologylab.semantics.generated.library.nsdl;


import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("SearchResults")
public class SearchResults
extends Metadata
{


/**
	this_should_be_document
*/
@simpl_collection("nsdl_document") @xml_tag("results") @mm_name("results")
private ArrayList<NsdlDocument>	results;



/**
	Constructor
*/
public SearchResults()
{
 super();
}

/**
	Constructor
*/
public SearchResults(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for results
*/
public ArrayList<NsdlDocument>	results()
{
	ArrayList<NsdlDocument>	result = this.results;
	if (result == null)
	{
		result = new ArrayList<NsdlDocument>();
		this.results = result;
	}
	return result;
}

/**
	Get the value of field results
*/
public ArrayList<NsdlDocument> getResults()
{
	return this.results;
}

/**
	Set the value of field results
*/
public void setResults(ArrayList<NsdlDocument> results)
{
	this.results = results;
}


}

