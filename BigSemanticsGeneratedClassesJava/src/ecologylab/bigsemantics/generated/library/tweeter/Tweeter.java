package ecologylab.bigsemantics.generated.library.tweeter;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.author.Author;
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
 *an author of twitter microblog
 */ 
@simpl_inherit
public class Tweeter extends Author
{
	@simpl_scalar
	private MetadataInteger numTweets;

	@simpl_scalar
	private MetadataInteger numFollowing;

	@simpl_scalar
	private MetadataInteger numFollowers;

	public Tweeter()
	{ super(); }

	public Tweeter(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	numTweets()
	{
		MetadataInteger	result = this.numTweets;
		if (result == null)
		{
			result = new MetadataInteger();
			this.numTweets = result;
		}
		return result;
	}

	public Integer getNumTweets()
	{
		return this.numTweets == null ? 0 : numTweets().getValue();
	}

	public MetadataInteger getNumTweetsMetadata()
	{
		return numTweets;
	}

	public void setNumTweets(Integer numTweets)
	{
		if (numTweets != 0)
			this.numTweets().setValue(numTweets);
	}

	public void setNumTweetsMetadata(MetadataInteger numTweets)
	{
		this.numTweets = numTweets;
	}

	public MetadataInteger	numFollowing()
	{
		MetadataInteger	result = this.numFollowing;
		if (result == null)
		{
			result = new MetadataInteger();
			this.numFollowing = result;
		}
		return result;
	}

	public Integer getNumFollowing()
	{
		return this.numFollowing == null ? 0 : numFollowing().getValue();
	}

	public MetadataInteger getNumFollowingMetadata()
	{
		return numFollowing;
	}

	public void setNumFollowing(Integer numFollowing)
	{
		if (numFollowing != 0)
			this.numFollowing().setValue(numFollowing);
	}

	public void setNumFollowingMetadata(MetadataInteger numFollowing)
	{
		this.numFollowing = numFollowing;
	}

	public MetadataInteger	numFollowers()
	{
		MetadataInteger	result = this.numFollowers;
		if (result == null)
		{
			result = new MetadataInteger();
			this.numFollowers = result;
		}
		return result;
	}

	public Integer getNumFollowers()
	{
		return this.numFollowers == null ? 0 : numFollowers().getValue();
	}

	public MetadataInteger getNumFollowersMetadata()
	{
		return numFollowers;
	}

	public void setNumFollowers(Integer numFollowers)
	{
		if (numFollowers != 0)
			this.numFollowers().setValue(numFollowers);
	}

	public void setNumFollowersMetadata(MetadataInteger numFollowers)
	{
		this.numFollowers = numFollowers;
	}
}
