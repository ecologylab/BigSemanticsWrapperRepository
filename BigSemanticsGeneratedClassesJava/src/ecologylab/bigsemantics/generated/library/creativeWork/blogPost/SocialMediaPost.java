package ecologylab.bigsemantics.generated.library.creativeWork.blogPost;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.SocialVideo;
import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.Post;
import ecologylab.bigsemantics.generated.library.creativeWork.blogPost.SocialMediaPost;
import ecologylab.bigsemantics.generated.library.person.author.SocialMediaUser;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.Person;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *social media post
 */ 
@simpl_inherit
public class SocialMediaPost extends Post
{
	@simpl_scalar
	private MetadataString titleContent;

	@simpl_composite
	@mm_name("shared")
	private SocialMediaUser shared;

	@simpl_scalar
	private MetadataString shares;

	@simpl_scalar
	private MetadataString feeling;

	/** 
	 *location created
	 */ 
	@simpl_scalar
	private MetadataString creationLocation;

	/** 
	 *date created
	 */ 
	@simpl_scalar
	private MetadataString date;

	/** 
	 *Timestamp of when created AM/PM
	 */ 
	@simpl_scalar
	private MetadataString time;

	@simpl_collection("up_vote")
	@mm_name("up_votes")
	private List<MetadataString> upVotes;

	@simpl_scalar
	private MetadataString downVotes;

	@simpl_collection("url")
	@mm_name("urls")
	private List<MetadataString> urls;

	@simpl_composite
	@mm_name("video")
	private SocialVideo video;

	@simpl_collection("description_content")
	@mm_name("description_content")
	private List<MetadataString> descriptionContent;

	@simpl_composite
	@mm_name("sticker")
	private Image sticker;

	/** 
	 *Photos posted in post.
	 */ 
	@simpl_collection("image")
	@mm_name("photos")
	private List<Image> photos;

	@simpl_scalar
	private MetadataString numComments;

	@simpl_collection("person")
	@mm_name("with_users")
	private List<Person> withUsers;

	/** 
	 *comments,replys,subtweets
	 */ 
	@simpl_collection("social_media_post")
	@mm_name("comments")
	private List<SocialMediaPost> comments;

	public SocialMediaPost()
	{ super(); }

	public SocialMediaPost(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	titleContent()
	{
		MetadataString	result = this.titleContent;
		if (result == null)
		{
			result = new MetadataString();
			this.titleContent = result;
		}
		return result;
	}

	public String getTitleContent()
	{
		return this.titleContent == null ? null : titleContent().getValue();
	}

	public MetadataString getTitleContentMetadata()
	{
		return titleContent;
	}

	public void setTitleContent(String titleContent)
	{
		if (titleContent != null)
			this.titleContent().setValue(titleContent);
	}

	public void setTitleContentMetadata(MetadataString titleContent)
	{
		this.titleContent = titleContent;
	}

	public SocialMediaUser getShared()
	{
		return shared;
	}

	public void setShared(SocialMediaUser shared)
	{
		this.shared = shared;
	}

	public MetadataString	shares()
	{
		MetadataString	result = this.shares;
		if (result == null)
		{
			result = new MetadataString();
			this.shares = result;
		}
		return result;
	}

	public String getShares()
	{
		return this.shares == null ? null : shares().getValue();
	}

	public MetadataString getSharesMetadata()
	{
		return shares;
	}

	public void setShares(String shares)
	{
		if (shares != null)
			this.shares().setValue(shares);
	}

	public void setSharesMetadata(MetadataString shares)
	{
		this.shares = shares;
	}

	public MetadataString	feeling()
	{
		MetadataString	result = this.feeling;
		if (result == null)
		{
			result = new MetadataString();
			this.feeling = result;
		}
		return result;
	}

	public String getFeeling()
	{
		return this.feeling == null ? null : feeling().getValue();
	}

	public MetadataString getFeelingMetadata()
	{
		return feeling;
	}

	public void setFeeling(String feeling)
	{
		if (feeling != null)
			this.feeling().setValue(feeling);
	}

	public void setFeelingMetadata(MetadataString feeling)
	{
		this.feeling = feeling;
	}

	public MetadataString	creationLocation()
	{
		MetadataString	result = this.creationLocation;
		if (result == null)
		{
			result = new MetadataString();
			this.creationLocation = result;
		}
		return result;
	}

	public String getCreationLocation()
	{
		return this.creationLocation == null ? null : creationLocation().getValue();
	}

	public MetadataString getCreationLocationMetadata()
	{
		return creationLocation;
	}

	public void setCreationLocation(String creationLocation)
	{
		if (creationLocation != null)
			this.creationLocation().setValue(creationLocation);
	}

	public void setCreationLocationMetadata(MetadataString creationLocation)
	{
		this.creationLocation = creationLocation;
	}

	public MetadataString	date()
	{
		MetadataString	result = this.date;
		if (result == null)
		{
			result = new MetadataString();
			this.date = result;
		}
		return result;
	}

	public String getDate()
	{
		return this.date == null ? null : date().getValue();
	}

	public MetadataString getDateMetadata()
	{
		return date;
	}

	public void setDate(String date)
	{
		if (date != null)
			this.date().setValue(date);
	}

	public void setDateMetadata(MetadataString date)
	{
		this.date = date;
	}

	public MetadataString	time()
	{
		MetadataString	result = this.time;
		if (result == null)
		{
			result = new MetadataString();
			this.time = result;
		}
		return result;
	}

	public String getTime()
	{
		return this.time == null ? null : time().getValue();
	}

	public MetadataString getTimeMetadata()
	{
		return time;
	}

	public void setTime(String time)
	{
		if (time != null)
			this.time().setValue(time);
	}

	public void setTimeMetadata(MetadataString time)
	{
		this.time = time;
	}

	public List<MetadataString> getUpVotes()
	{
		return upVotes;
	}

  // lazy evaluation:
  public List<MetadataString> upVotes()
  {
    if (upVotes == null)
      upVotes = new ArrayList<MetadataString>();
    return upVotes;
  }

  // addTo:
  public void addToUpVotes(MetadataString element)
  {
    upVotes().add(element);
  }

  // size:
  public int upVotesSize()
  {
    return upVotes == null ? 0 : upVotes.size();
  }

	public void setUpVotes(List<MetadataString> upVotes)
	{
		this.upVotes = upVotes;
	}

	public MetadataString	downVotes()
	{
		MetadataString	result = this.downVotes;
		if (result == null)
		{
			result = new MetadataString();
			this.downVotes = result;
		}
		return result;
	}

	public String getDownVotes()
	{
		return this.downVotes == null ? null : downVotes().getValue();
	}

	public MetadataString getDownVotesMetadata()
	{
		return downVotes;
	}

	public void setDownVotes(String downVotes)
	{
		if (downVotes != null)
			this.downVotes().setValue(downVotes);
	}

	public void setDownVotesMetadata(MetadataString downVotes)
	{
		this.downVotes = downVotes;
	}

	public List<MetadataString> getUrls()
	{
		return urls;
	}

  // lazy evaluation:
  public List<MetadataString> urls()
  {
    if (urls == null)
      urls = new ArrayList<MetadataString>();
    return urls;
  }

  // addTo:
  public void addToUrls(MetadataString element)
  {
    urls().add(element);
  }

  // size:
  public int urlsSize()
  {
    return urls == null ? 0 : urls.size();
  }

	public void setUrls(List<MetadataString> urls)
	{
		this.urls = urls;
	}

	public SocialVideo getVideo()
	{
		return video;
	}

	public void setVideo(SocialVideo video)
	{
		this.video = video;
	}

	public List<MetadataString> getDescriptionContent()
	{
		return descriptionContent;
	}

  // lazy evaluation:
  public List<MetadataString> descriptionContent()
  {
    if (descriptionContent == null)
      descriptionContent = new ArrayList<MetadataString>();
    return descriptionContent;
  }

  // addTo:
  public void addToDescriptionContent(MetadataString element)
  {
    descriptionContent().add(element);
  }

  // size:
  public int descriptionContentSize()
  {
    return descriptionContent == null ? 0 : descriptionContent.size();
  }

	public void setDescriptionContent(List<MetadataString> descriptionContent)
	{
		this.descriptionContent = descriptionContent;
	}

	public Image getSticker()
	{
		return sticker;
	}

	public void setSticker(Image sticker)
	{
		this.sticker = sticker;
	}

	public List<Image> getPhotos()
	{
		return photos;
	}

  // lazy evaluation:
  public List<Image> photos()
  {
    if (photos == null)
      photos = new ArrayList<Image>();
    return photos;
  }

  // addTo:
  public void addToPhotos(Image element)
  {
    photos().add(element);
  }

  // size:
  public int photosSize()
  {
    return photos == null ? 0 : photos.size();
  }

	public void setPhotos(List<Image> photos)
	{
		this.photos = photos;
	}

	public MetadataString	numComments()
	{
		MetadataString	result = this.numComments;
		if (result == null)
		{
			result = new MetadataString();
			this.numComments = result;
		}
		return result;
	}

	public String getNumComments()
	{
		return this.numComments == null ? null : numComments().getValue();
	}

	public MetadataString getNumCommentsMetadata()
	{
		return numComments;
	}

	public void setNumComments(String numComments)
	{
		if (numComments != null)
			this.numComments().setValue(numComments);
	}

	public void setNumCommentsMetadata(MetadataString numComments)
	{
		this.numComments = numComments;
	}

	public List<Person> getWithUsers()
	{
		return withUsers;
	}

  // lazy evaluation:
  public List<Person> withUsers()
  {
    if (withUsers == null)
      withUsers = new ArrayList<Person>();
    return withUsers;
  }

  // addTo:
  public void addToWithUsers(Person element)
  {
    withUsers().add(element);
  }

  // size:
  public int withUsersSize()
  {
    return withUsers == null ? 0 : withUsers.size();
  }

	public void setWithUsers(List<Person> withUsers)
	{
		this.withUsers = withUsers;
	}

	public List<SocialMediaPost> getComments()
	{
		return comments;
	}

  // lazy evaluation:
  public List<SocialMediaPost> comments()
  {
    if (comments == null)
      comments = new ArrayList<SocialMediaPost>();
    return comments;
  }

  // addTo:
  public void addToComments(SocialMediaPost element)
  {
    comments().add(element);
  }

  // size:
  public int commentsSize()
  {
    return comments == null ? 0 : comments.size();
  }

	public void setComments(List<SocialMediaPost> comments)
	{
		this.comments = comments;
	}
}
