package ecologylab.semantics.generated.library.buzz;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Google trends

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GoogleTrends
extends Document
{

@simpl_collection("hot_search") @simpl_nowrap @mm_name("hot_searches")
private ArrayList<HotSearch>	hotSearches;



/**
	Constructor
*/
public GoogleTrends()
{
 super();
}

/**
	Constructor
*/
public GoogleTrends(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for hotSearches
*/
public ArrayList<HotSearch>	hotSearches()
{
	ArrayList<HotSearch>	result = this.hotSearches;
	if (result == null)
	{
		result = new ArrayList<HotSearch>();
		this.hotSearches = result;
	}
	return result;
}

/**
	Get the value of field hotSearches
*/
public ArrayList<HotSearch> getHotSearches()
{
	return this.hotSearches;
}

/**
	Set the value of field hotSearches
*/
public void setHotSearches(ArrayList<HotSearch> hotSearches)
{
	this.hotSearches = hotSearches;
}


}

