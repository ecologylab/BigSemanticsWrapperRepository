package ecologylab.semantics.generated.library.acm;

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
public class AcmPortalAuthorPublicationDetail extends Metadata
{
	@simpl_scalar
	private MetadataString publicationCount;

	@simpl_scalar
	private MetadataString citationCount;

	@simpl_scalar
	private MetadataString years;

	public AcmPortalAuthorPublicationDetail()
	{ super(); }

	public AcmPortalAuthorPublicationDetail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	publicationCount()
	{
		MetadataString	result = this.publicationCount;
		if (result == null)
		{
			result = new MetadataString();
			this.publicationCount = result;
		}
		return result;
	}

	public String getPublicationCount()
	{
		return this.publicationCount == null ? null : publicationCount().getValue();
	}

	public MetadataString getPublicationCountMetadata()
	{
		return publicationCount;
	}

	public void setPublicationCount(String publicationCount)
	{
		if (publicationCount != null)
			this.publicationCount().setValue(publicationCount);
	}

	public void setPublicationCountMetadata(MetadataString publicationCount)
	{
		this.publicationCount = publicationCount;
	}

	public MetadataString	citationCount()
	{
		MetadataString	result = this.citationCount;
		if (result == null)
		{
			result = new MetadataString();
			this.citationCount = result;
		}
		return result;
	}

	public String getCitationCount()
	{
		return this.citationCount == null ? null : citationCount().getValue();
	}

	public MetadataString getCitationCountMetadata()
	{
		return citationCount;
	}

	public void setCitationCount(String citationCount)
	{
		if (citationCount != null)
			this.citationCount().setValue(citationCount);
	}

	public void setCitationCountMetadata(MetadataString citationCount)
	{
		this.citationCount = citationCount;
	}

	public MetadataString	years()
	{
		MetadataString	result = this.years;
		if (result == null)
		{
			result = new MetadataString();
			this.years = result;
		}
		return result;
	}

	public String getYears()
	{
		return this.years == null ? null : years().getValue();
	}

	public MetadataString getYearsMetadata()
	{
		return years;
	}

	public void setYears(String years)
	{
		if (years != null)
			this.years().setValue(years);
	}

	public void setYearsMetadata(MetadataString years)
	{
		this.years = years;
	}
}
