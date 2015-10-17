package ecologylab.bigsemantics.generated.library.creativeWork.blog;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.SocialMediaPost;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SocialMediaFeed extends RichDocument
{
	/** 
	 *name of feed
	 */ 
	@simpl_scalar
	private MetadataString feedName;

	/** 
	 *mainFeed
	 */ 
	@simpl_collection("social_media_post")
	@mm_name("feed")
	private List<SocialMediaPost> feed;

	public SocialMediaFeed()
	{ super(); }

	public SocialMediaFeed(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	feedName()
	{
		MetadataString	result = this.feedName;
		if (result == null)
		{
			result = new MetadataString();
			this.feedName = result;
		}
		return result;
	}

	public String getFeedName()
	{
		return this.feedName == null ? null : feedName().getValue();
	}

	public MetadataString getFeedNameMetadata()
	{
		return feedName;
	}

	public void setFeedName(String feedName)
	{
		if (feedName != null)
			this.feedName().setValue(feedName);
	}

	public void setFeedNameMetadata(MetadataString feedName)
	{
		this.feedName = feedName;
	}

	public List<SocialMediaPost> getFeed()
	{
		return feed;
	}

  // lazy evaluation:
  public List<SocialMediaPost> feed()
  {
    if (feed == null)
      feed = new ArrayList<SocialMediaPost>();
    return feed;
  }

  // addTo:
  public void addToFeed(SocialMediaPost element)
  {
    feed().add(element);
  }

  // size:
  public int feedSize()
  {
    return feed == null ? 0 : feed.size();
  }

	public void setFeed(List<SocialMediaPost> feed)
	{
		this.feed = feed;
	}
}
