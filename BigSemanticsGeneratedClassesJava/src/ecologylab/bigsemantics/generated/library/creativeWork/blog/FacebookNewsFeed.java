package ecologylab.bigsemantics.generated.library.creativeWork.blog;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.blog.Blog;
import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.SocialMediaPost;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FacebookNewsFeed extends Blog
{
	/** 
	 *mainFeed
	 */ 
	@simpl_collection("social_media_post")
	@mm_name("feed")
	private List<SocialMediaPost> feed;

	public FacebookNewsFeed()
	{ super(); }

	public FacebookNewsFeed(MetaMetadataCompositeField mmd) {
		super(mmd);
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
