package ecologylab.semantics.generated.library.imdb;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	IMDB genre

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class ImdbGenre
extends Document
{

@simpl_collection("imdb_title") @xml_tag("results") @mm_name("results")
private ArrayList<ImdbTitle>	results;



/**
	Constructor
*/
public ImdbGenre()
{
 super();
}

/**
	Constructor
*/
public ImdbGenre(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for results
*/
public ArrayList<ImdbTitle>	results()
{
	ArrayList<ImdbTitle>	result = this.results;
	if (result == null)
	{
		result = new ArrayList<ImdbTitle>();
		this.results = result;
	}
	return result;
}

/**
	Get the value of field results
*/
public ArrayList<ImdbTitle> getResults()
{
	return this.results;
}

/**
	Set the value of field results
*/
public void setResults(ArrayList<ImdbTitle> results)
{
	this.results = results;
}


}

