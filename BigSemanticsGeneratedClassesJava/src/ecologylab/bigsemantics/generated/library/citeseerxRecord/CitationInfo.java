package ecologylab.bigsemantics.generated.library.citeseerxRecord;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.util.List;
import java.util.Map;

/** 
 *Citation numbers.
 */ 
@simpl_inherit
public class CitationInfo extends Metadata
{
	@simpl_scalar
	private MetadataInteger totalCitation;

	@simpl_scalar
	private MetadataInteger selfCitation;

	public CitationInfo()
	{ super(); }

	public CitationInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	totalCitation()
	{
		MetadataInteger	result = this.totalCitation;
		if (result == null)
		{
			result = new MetadataInteger();
			this.totalCitation = result;
		}
		return result;
	}

	public Integer getTotalCitation()
	{
		return this.totalCitation == null ? 0 : totalCitation().getValue();
	}

	public MetadataInteger getTotalCitationMetadata()
	{
		return totalCitation;
	}

	public void setTotalCitation(Integer totalCitation)
	{
		if (totalCitation != 0)
			this.totalCitation().setValue(totalCitation);
	}

	public void setTotalCitationMetadata(MetadataInteger totalCitation)
	{
		this.totalCitation = totalCitation;
	}

	public MetadataInteger	selfCitation()
	{
		MetadataInteger	result = this.selfCitation;
		if (result == null)
		{
			result = new MetadataInteger();
			this.selfCitation = result;
		}
		return result;
	}

	public Integer getSelfCitation()
	{
		return this.selfCitation == null ? 0 : selfCitation().getValue();
	}

	public MetadataInteger getSelfCitationMetadata()
	{
		return selfCitation;
	}

	public void setSelfCitation(Integer selfCitation)
	{
		if (selfCitation != 0)
			this.selfCitation().setValue(selfCitation);
	}

	public void setSelfCitationMetadata(MetadataInteger selfCitation)
	{
		this.selfCitation = selfCitation;
	}
}
