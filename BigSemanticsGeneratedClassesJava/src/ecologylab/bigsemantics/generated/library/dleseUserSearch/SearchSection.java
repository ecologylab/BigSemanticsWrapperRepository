package ecologylab.bigsemantics.generated.library.dleseUserSearch;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.dleseUserSearch.ResultInfo;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SearchSection extends Metadata
{
	@simpl_composite
	@mm_name("result_info")
	private ResultInfo resultInfo;

	public SearchSection()
	{ super(); }

	public SearchSection(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ResultInfo getResultInfo()
	{
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo)
	{
		this.resultInfo = resultInfo;
	}
}
