package ecologylab.semantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.search.BingSearchImageSection;
import ecologylab.semantics.generated.library.search.BingSearchWebSection;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;
import java.util.Map;

@simpl_inherit
@simpl_tag("SearchResponse")
public class BingSearch extends CompoundDocument
{
	@simpl_composite
	@simpl_tag("web:Web")
	@mm_name("web_section")
	private BingSearchWebSection webSection;

	@simpl_composite
	@simpl_tag("mms:Image")
	@mm_name("image_section")
	private BingSearchImageSection imageSection;

	public BingSearch()
	{ }

	public BingSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public BingSearchWebSection getWebSection()
	{
		return webSection;
	}

	public void setWebSection(BingSearchWebSection webSection)
	{
		this.webSection = webSection;
	}

	public BingSearchImageSection getImageSection()
	{
		return imageSection;
	}

	public void setImageSection(BingSearchImageSection imageSection)
	{
		this.imageSection = imageSection;
	}
}
