package ecologylab.semantics.generated.library.rss;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.rss.Dc;
import ecologylab.semantics.generated.library.rss.MediaContent;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *News feeds.
 */ 
@simpl_inherit
public class YahooMediaRss extends Dc
{
	@simpl_composite
	@simpl_tag("media:content")
	@mm_name("media_content")
	private MediaContent mediaContent;

	@simpl_scalar
	@simpl_hints({Hint.XML_LEAF})
	@simpl_tag("media:description")
	private MetadataString mediaDescription;

	public YahooMediaRss()
	{ }

	public YahooMediaRss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MediaContent getMediaContent()
	{
		return mediaContent;
	}

	public void setMediaContent(MediaContent mediaContent)
	{
		this.mediaContent = mediaContent;
	}

	public MetadataString	mediaDescription()
	{
		MetadataString	result = this.mediaDescription;
		if (result == null)
		{
			result = new MetadataString();
			this.mediaDescription = result;
		}
		return result;
	}

	public String getMediaDescription()
	{
		return this.mediaDescription == null ? null : mediaDescription().getValue();
	}

	public MetadataString getMediaDescriptionMetadata()
	{
		return mediaDescription;
	}

	public void setMediaDescription(String mediaDescription)
	{
		if (mediaDescription != null)
			this.mediaDescription().setValue(mediaDescription);
	}

	public void setMediaDescriptionMetadata(MetadataString mediaDescription)
	{
		this.mediaDescription = mediaDescription;
	}
}
