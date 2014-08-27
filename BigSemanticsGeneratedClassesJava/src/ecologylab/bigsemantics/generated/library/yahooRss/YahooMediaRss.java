package ecologylab.bigsemantics.generated.library.yahooRss;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.dublinCore.Dc;
import ecologylab.bigsemantics.generated.library.yahooRss.MediaContent;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.Hint;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_hints;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
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
	@mm_name("media_content")
	private MediaContent mediaContent;

	@simpl_scalar
	@simpl_hints({Hint.XML_LEAF})
	private MetadataString mediaDescription;

	public YahooMediaRss()
	{ super(); }

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
