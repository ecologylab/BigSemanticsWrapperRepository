package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SearchCrumb extends Metadata
{
	@simpl_scalar
	private MetadataString searchQuery;

	public SearchCrumb()
	{ super(); }

	public SearchCrumb(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	searchQuery()
	{
		MetadataString	result = this.searchQuery;
		if (result == null)
		{
			result = new MetadataString();
			this.searchQuery = result;
		}
		return result;
	}

	public String getSearchQuery()
	{
		return this.searchQuery == null ? null : searchQuery().getValue();
	}

	public MetadataString getSearchQueryMetadata()
	{
		return searchQuery;
	}

	public void setSearchQuery(String searchQuery)
	{
		if (searchQuery != null)
			this.searchQuery().setValue(searchQuery);
	}

	public void setSearchQueryMetadata(MetadataString searchQuery)
	{
		this.searchQuery = searchQuery;
	}
}
