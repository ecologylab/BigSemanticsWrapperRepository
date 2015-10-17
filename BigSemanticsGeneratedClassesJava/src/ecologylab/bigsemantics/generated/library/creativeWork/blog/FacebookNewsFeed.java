package ecologylab.bigsemantics.generated.library.creativeWork.blog;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.blog.Blog;
import ecologylab.bigsemantics.generated.library.creativeWork.blog.SocialMediaFeed;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FacebookNewsFeed extends Blog
{
	@simpl_composite
	@mm_name("user_feed")
	private SocialMediaFeed userFeed;

	public FacebookNewsFeed()
	{ super(); }

	public FacebookNewsFeed(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public SocialMediaFeed getUserFeed()
	{
		return userFeed;
	}

	public void setUserFeed(SocialMediaFeed userFeed)
	{
		this.userFeed = userFeed;
	}
}
