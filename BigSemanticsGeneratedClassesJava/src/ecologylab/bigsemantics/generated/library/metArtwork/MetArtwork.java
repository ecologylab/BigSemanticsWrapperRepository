package ecologylab.bigsemantics.generated.library.metArtwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.artwork.Artwork;
import ecologylab.bigsemantics.generated.library.metArtwork.MetArtwork;
import ecologylab.bigsemantics.generated.library.metFilter.MetFilter;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class MetArtwork extends Artwork
{
	/** 
	 *Location of the work.
	 */ 
	@simpl_scalar
	private MetadataString geography;

	/** 
	 *Bit of info about author
	 */ 
	@simpl_scalar
	private MetadataString authorInfo;

	@simpl_collection("met_artwork")
	@simpl_other_tags({"creative_works"})
	@mm_name("works_of_interest")
	private List<MetArtwork> worksOfInterest;

	@simpl_collection("met_filter")
	@mm_name("tags")
	private List<MetFilter> tags;

	public MetArtwork()
	{ super(); }

	public MetArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	geography()
	{
		MetadataString	result = this.geography;
		if (result == null)
		{
			result = new MetadataString();
			this.geography = result;
		}
		return result;
	}

	public String getGeography()
	{
		return this.geography == null ? null : geography().getValue();
	}

	public MetadataString getGeographyMetadata()
	{
		return geography;
	}

	public void setGeography(String geography)
	{
		if (geography != null)
			this.geography().setValue(geography);
	}

	public void setGeographyMetadata(MetadataString geography)
	{
		this.geography = geography;
	}

	public MetadataString	authorInfo()
	{
		MetadataString	result = this.authorInfo;
		if (result == null)
		{
			result = new MetadataString();
			this.authorInfo = result;
		}
		return result;
	}

	public String getAuthorInfo()
	{
		return this.authorInfo == null ? null : authorInfo().getValue();
	}

	public MetadataString getAuthorInfoMetadata()
	{
		return authorInfo;
	}

	public void setAuthorInfo(String authorInfo)
	{
		if (authorInfo != null)
			this.authorInfo().setValue(authorInfo);
	}

	public void setAuthorInfoMetadata(MetadataString authorInfo)
	{
		this.authorInfo = authorInfo;
	}

	public List<MetArtwork> getWorksOfInterest()
	{
		return worksOfInterest;
	}

  // lazy evaluation:
  public List<MetArtwork> worksOfInterest()
  {
    if (worksOfInterest == null)
      worksOfInterest = new ArrayList<MetArtwork>();
    return worksOfInterest;
  }

  // addTo:
  public void addToWorksOfInterest(MetArtwork element)
  {
    worksOfInterest().add(element);
  }

  // size:
  public int worksOfInterestSize()
  {
    return worksOfInterest == null ? 0 : worksOfInterest.size();
  }

	public void setWorksOfInterest(List<MetArtwork> worksOfInterest)
	{
		this.worksOfInterest = worksOfInterest;
	}

	public List<MetFilter> getTags()
	{
		return tags;
	}

  // lazy evaluation:
  public List<MetFilter> tags()
  {
    if (tags == null)
      tags = new ArrayList<MetFilter>();
    return tags;
  }

  // addTo:
  public void addToTags(MetFilter element)
  {
    tags().add(element);
  }

  // size:
  public int tagsSize()
  {
    return tags == null ? 0 : tags.size();
  }

	public void setTags(List<MetFilter> tags)
	{
		this.tags = tags;
	}
}
