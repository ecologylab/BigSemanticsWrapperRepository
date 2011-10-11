package ecologylab.semantics.generated.library.search;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.generated.library.search.YahooResult;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  YahooResultSet.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Yahoo Web Search Service
 */ 
@simpl_inherit
@simpl_tag("ResultSet")
public class YahooResultSet extends Document
{
	/** 
	 * Collection of results for yahoo search
	 */ 
	@simpl_nowrap	@simpl_collection("Result")	@mm_name("results")
	private List<YahooResult> results;

	public YahooResultSet()
	{ }

	public YahooResultSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<YahooResult> getResults()
	{
		return results;
	}

	public void setResults(List<YahooResult> results)
	{
		this.results = results;
	}
}
