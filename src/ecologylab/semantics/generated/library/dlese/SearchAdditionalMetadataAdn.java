package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SearchAdditionalMetadataAdn extends Metadata
{
	@simpl_scalar
	@simpl_tag("partOfDrc")
	private MetadataString partOfDrc;

	@simpl_scalar
	@simpl_tag("accessionStatus")
	private MetadataString accessionStatus;

	public SearchAdditionalMetadataAdn()
	{ }

	public SearchAdditionalMetadataAdn(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	partOfDrc()
	{
		MetadataString	result = this.partOfDrc;
		if (result == null)
		{
			result = new MetadataString();
			this.partOfDrc = result;
		}
		return result;
	}

	public String getPartOfDrc()
	{
		return this.partOfDrc == null ? null : partOfDrc().getValue();
	}

	public MetadataString getPartOfDrcMetadata()
	{
		return partOfDrc;
	}

	public void setPartOfDrc(String partOfDrc)
	{
		if (partOfDrc != null)
			this.partOfDrc().setValue(partOfDrc);
	}

	public void setPartOfDrcMetadata(MetadataString partOfDrc)
	{
		this.partOfDrc = partOfDrc;
	}

	public MetadataString	accessionStatus()
	{
		MetadataString	result = this.accessionStatus;
		if (result == null)
		{
			result = new MetadataString();
			this.accessionStatus = result;
		}
		return result;
	}

	public String getAccessionStatus()
	{
		return this.accessionStatus == null ? null : accessionStatus().getValue();
	}

	public MetadataString getAccessionStatusMetadata()
	{
		return accessionStatus;
	}

	public void setAccessionStatus(String accessionStatus)
	{
		if (accessionStatus != null)
			this.accessionStatus().setValue(accessionStatus);
	}

	public void setAccessionStatusMetadata(MetadataString accessionStatus)
	{
		this.accessionStatus = accessionStatus;
	}
}
