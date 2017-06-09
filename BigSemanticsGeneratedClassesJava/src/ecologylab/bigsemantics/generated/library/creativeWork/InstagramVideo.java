package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.SocialVideo;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *instagram video
 */ 
@simpl_inherit
public class InstagramVideo extends SocialVideo
{
	@simpl_scalar
	private MetadataString videoLink;

	public InstagramVideo()
	{ super(); }

	public InstagramVideo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	videoLink()
	{
		MetadataString	result = this.videoLink;
		if (result == null)
		{
			result = new MetadataString();
			this.videoLink = result;
		}
		return result;
	}

	public String getVideoLink()
	{
		return this.videoLink == null ? null : videoLink().getValue();
	}

	public MetadataString getVideoLinkMetadata()
	{
		return videoLink;
	}

	public void setVideoLink(String videoLink)
	{
		if (videoLink != null)
			this.videoLink().setValue(videoLink);
	}

	public void setVideoLinkMetadata(MetadataString videoLink)
	{
		this.videoLink = videoLink;
	}
}
