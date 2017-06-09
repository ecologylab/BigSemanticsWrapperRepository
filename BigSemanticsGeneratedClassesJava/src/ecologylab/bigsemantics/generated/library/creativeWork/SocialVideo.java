package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Document;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.comment.Comment;
import ecologylab.bigsemantics.metadata.builtins.creativeWork.CreativeWork;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SocialVideo extends CreativeWork
{
	/** 
	 *Date on which video is uploaded
	 */ 
	@simpl_scalar
	private MetadataString uploadDate;

	/** 
	 *video License
	 */ 
	@simpl_scalar
	private MetadataString license;

	@simpl_scalar
	private MetadataParsedURL pic;

	/** 
	 *collection of thumbnails
	 */ 
	@simpl_collection("image")
	@mm_name("thumbnails")
	private List<Image> thumbnails;

	/** 
	 *list of tags
	 */ 
	@simpl_collection("document")
	@mm_name("tag")
	private List<Document> tag;

	/** 
	 *Top 2 comments if any
	 */ 
	@simpl_collection("comment")
	@mm_name("top_comments")
	private List<Comment> topComments;

	/** 
	 *Total number of comments received
	 */ 
	@simpl_scalar
	private MetadataInteger numberOfComments;

	/** 
	 *Total number of likes recived
	 */ 
	@simpl_scalar
	private MetadataString likes;

	/** 
	 *Total number of dislikes received
	 */ 
	@simpl_scalar
	private MetadataString dislikes;

	/** 
	 *Total number of views
	 */ 
	@simpl_scalar
	private MetadataString viewCount;

	public SocialVideo()
	{ super(); }

	public SocialVideo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	uploadDate()
	{
		MetadataString	result = this.uploadDate;
		if (result == null)
		{
			result = new MetadataString();
			this.uploadDate = result;
		}
		return result;
	}

	public String getUploadDate()
	{
		return this.uploadDate == null ? null : uploadDate().getValue();
	}

	public MetadataString getUploadDateMetadata()
	{
		return uploadDate;
	}

	public void setUploadDate(String uploadDate)
	{
		if (uploadDate != null)
			this.uploadDate().setValue(uploadDate);
	}

	public void setUploadDateMetadata(MetadataString uploadDate)
	{
		this.uploadDate = uploadDate;
	}

	public MetadataString	license()
	{
		MetadataString	result = this.license;
		if (result == null)
		{
			result = new MetadataString();
			this.license = result;
		}
		return result;
	}

	public String getLicense()
	{
		return this.license == null ? null : license().getValue();
	}

	public MetadataString getLicenseMetadata()
	{
		return license;
	}

	public void setLicense(String license)
	{
		if (license != null)
			this.license().setValue(license);
	}

	public void setLicenseMetadata(MetadataString license)
	{
		this.license = license;
	}

	public MetadataParsedURL	pic()
	{
		MetadataParsedURL	result = this.pic;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pic = result;
		}
		return result;
	}

	public ParsedURL getPic()
	{
		return this.pic == null ? null : pic().getValue();
	}

	public MetadataParsedURL getPicMetadata()
	{
		return pic;
	}

	public void setPic(ParsedURL pic)
	{
		if (pic != null)
			this.pic().setValue(pic);
	}

	public void setPicMetadata(MetadataParsedURL pic)
	{
		this.pic = pic;
	}

	public List<Image> getThumbnails()
	{
		return thumbnails;
	}

  // lazy evaluation:
  public List<Image> thumbnails()
  {
    if (thumbnails == null)
      thumbnails = new ArrayList<Image>();
    return thumbnails;
  }

  // addTo:
  public void addToThumbnails(Image element)
  {
    thumbnails().add(element);
  }

  // size:
  public int thumbnailsSize()
  {
    return thumbnails == null ? 0 : thumbnails.size();
  }

	public void setThumbnails(List<Image> thumbnails)
	{
		this.thumbnails = thumbnails;
	}

	public List<Document> getTag()
	{
		return tag;
	}

  // lazy evaluation:
  public List<Document> tag()
  {
    if (tag == null)
      tag = new ArrayList<Document>();
    return tag;
  }

  // addTo:
  public void addToTag(Document element)
  {
    tag().add(element);
  }

  // size:
  public int tagSize()
  {
    return tag == null ? 0 : tag.size();
  }

	public void setTag(List<Document> tag)
	{
		this.tag = tag;
	}

	public List<Comment> getTopComments()
	{
		return topComments;
	}

  // lazy evaluation:
  public List<Comment> topComments()
  {
    if (topComments == null)
      topComments = new ArrayList<Comment>();
    return topComments;
  }

  // addTo:
  public void addToTopComments(Comment element)
  {
    topComments().add(element);
  }

  // size:
  public int topCommentsSize()
  {
    return topComments == null ? 0 : topComments.size();
  }

	public void setTopComments(List<Comment> topComments)
	{
		this.topComments = topComments;
	}

	public MetadataInteger	numberOfComments()
	{
		MetadataInteger	result = this.numberOfComments;
		if (result == null)
		{
			result = new MetadataInteger();
			this.numberOfComments = result;
		}
		return result;
	}

	public Integer getNumberOfComments()
	{
		return this.numberOfComments == null ? 0 : numberOfComments().getValue();
	}

	public MetadataInteger getNumberOfCommentsMetadata()
	{
		return numberOfComments;
	}

	public void setNumberOfComments(Integer numberOfComments)
	{
		if (numberOfComments != 0)
			this.numberOfComments().setValue(numberOfComments);
	}

	public void setNumberOfCommentsMetadata(MetadataInteger numberOfComments)
	{
		this.numberOfComments = numberOfComments;
	}

	public MetadataString	likes()
	{
		MetadataString	result = this.likes;
		if (result == null)
		{
			result = new MetadataString();
			this.likes = result;
		}
		return result;
	}

	public String getLikes()
	{
		return this.likes == null ? null : likes().getValue();
	}

	public MetadataString getLikesMetadata()
	{
		return likes;
	}

	public void setLikes(String likes)
	{
		if (likes != null)
			this.likes().setValue(likes);
	}

	public void setLikesMetadata(MetadataString likes)
	{
		this.likes = likes;
	}

	public MetadataString	dislikes()
	{
		MetadataString	result = this.dislikes;
		if (result == null)
		{
			result = new MetadataString();
			this.dislikes = result;
		}
		return result;
	}

	public String getDislikes()
	{
		return this.dislikes == null ? null : dislikes().getValue();
	}

	public MetadataString getDislikesMetadata()
	{
		return dislikes;
	}

	public void setDislikes(String dislikes)
	{
		if (dislikes != null)
			this.dislikes().setValue(dislikes);
	}

	public void setDislikesMetadata(MetadataString dislikes)
	{
		this.dislikes = dislikes;
	}

	public MetadataString	viewCount()
	{
		MetadataString	result = this.viewCount;
		if (result == null)
		{
			result = new MetadataString();
			this.viewCount = result;
		}
		return result;
	}

	public String getViewCount()
	{
		return this.viewCount == null ? null : viewCount().getValue();
	}

	public MetadataString getViewCountMetadata()
	{
		return viewCount;
	}

	public void setViewCount(String viewCount)
	{
		if (viewCount != null)
			this.viewCount().setValue(viewCount);
	}

	public void setViewCountMetadata(MetadataString viewCount)
	{
		this.viewCount = viewCount;
	}
}
