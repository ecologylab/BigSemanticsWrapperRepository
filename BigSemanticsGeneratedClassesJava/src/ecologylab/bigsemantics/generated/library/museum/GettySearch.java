package ecologylab.bigsemantics.generated.library.museum;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.museum.GettyObject;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GettySearch extends CompoundDocument
{
	@simpl_collection("getty_object")
	@mm_name("search_results")
	private List<GettyObject> searchResults;

	public GettySearch()
	{ super(); }

	public GettySearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<GettyObject> getSearchResults()
	{
		return searchResults;
	}

  // lazy evaluation:
  public List<GettyObject> searchResults()
  {
    if (searchResults == null)
      searchResults = new ArrayList<GettyObject>();
    return searchResults;
  }

  // addTo:
  public void addToSearchResults(GettyObject element)
  {
    searchResults().add(element);
  }

  // size:
  public int searchResultsSize()
  {
    return searchResults == null ? 0 : searchResults.size();
  }

	public void setSearchResults(List<GettyObject> searchResults)
	{
		this.searchResults = searchResults;
	}
}