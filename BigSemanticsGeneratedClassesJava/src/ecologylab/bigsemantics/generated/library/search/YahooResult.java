package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.search.YahooThumbnail;
import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class YahooResult extends Document
{
	@simpl_scalar
	private MetadataString summary;

	@simpl_scalar
	private MetadataParsedURL refererUrl;

	@simpl_composite
	@mm_name("thumbnail")
	private YahooThumbnail thumbnail;

	@simpl_scalar
	private MetadataString mimeType;

	@simpl_scalar
	private MetadataString modificationDate;

	@simpl_scalar
	private MetadataString title;

	public YahooResult()
	{ super(); }

	public YahooResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	summary()
	{
		MetadataString	result = this.summary;
		if (result == null)
		{
			result = new MetadataString();
			this.summary = result;
		}
		return result;
	}

	public String getSummary()
	{
		return this.summary == null ? null : summary().getValue();
	}

	public MetadataString getSummaryMetadata()
	{
		return summary;
	}

	public void setSummary(String summary)
	{
		if (summary != null)
			this.summary().setValue(summary);
	}

	public void setSummaryMetadata(MetadataString summary)
	{
		this.summary = summary;
	}

	public MetadataParsedURL	refererUrl()
	{
		MetadataParsedURL	result = this.refererUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.refererUrl = result;
		}
		return result;
	}

	public ParsedURL getRefererUrl()
	{
		return this.refererUrl == null ? null : refererUrl().getValue();
	}

	public MetadataParsedURL getRefererUrlMetadata()
	{
		return refererUrl;
	}

	public void setRefererUrl(ParsedURL refererUrl)
	{
		if (refererUrl != null)
			this.refererUrl().setValue(refererUrl);
	}

	public void setRefererUrlMetadata(MetadataParsedURL refererUrl)
	{
		this.refererUrl = refererUrl;
	}

	public YahooThumbnail getThumbnail()
	{
		return thumbnail;
	}

	public void setThumbnail(YahooThumbnail thumbnail)
	{
		this.thumbnail = thumbnail;
	}

	public MetadataString	mimeType()
	{
		MetadataString	result = this.mimeType;
		if (result == null)
		{
			result = new MetadataString();
			this.mimeType = result;
		}
		return result;
	}

	public String getMimeType()
	{
		return this.mimeType == null ? null : mimeType().getValue();
	}

	public MetadataString getMimeTypeMetadata()
	{
		return mimeType;
	}

	public void setMimeType(String mimeType)
	{
		if (mimeType != null)
			this.mimeType().setValue(mimeType);
	}

	public void setMimeTypeMetadata(MetadataString mimeType)
	{
		this.mimeType = mimeType;
	}

	public MetadataString	modificationDate()
	{
		MetadataString	result = this.modificationDate;
		if (result == null)
		{
			result = new MetadataString();
			this.modificationDate = result;
		}
		return result;
	}

	public String getModificationDate()
	{
		return this.modificationDate == null ? null : modificationDate().getValue();
	}

	public MetadataString getModificationDateMetadata()
	{
		return modificationDate;
	}

	public void setModificationDate(String modificationDate)
	{
		if (modificationDate != null)
			this.modificationDate().setValue(modificationDate);
	}

	public void setModificationDateMetadata(MetadataString modificationDate)
	{
		this.modificationDate = modificationDate;
	}

	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}
}
