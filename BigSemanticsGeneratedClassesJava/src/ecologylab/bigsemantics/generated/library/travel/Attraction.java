package ecologylab.bigsemantics.generated.library.travel;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.gis.PostalAddress;
import ecologylab.bigsemantics.generated.library.misc.Review;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Attraction extends CompoundDocument
{
	@simpl_scalar
	private MetadataString overallRating;

	@simpl_collection("review")
	@mm_name("reviews")
	private List<Review> reviews;

	/** 
	 *Price/fee of the attraction
	 */ 
	@simpl_scalar
	private MetadataString fee;

	/** 
	 *type of the attraction, i.e. museum
	 */ 
	@simpl_scalar
	private MetadataString attractionType;

	/** 
	 *the hours that the attraction is open
	 */ 
	@simpl_scalar
	private MetadataString openHours;

	@simpl_composite
	@mm_name("attraction_address")
	private PostalAddress attractionAddress;

	/** 
	 *website to go to for more information
	 */ 
	@simpl_scalar
	private MetadataParsedURL attractionWebsite;

	/** 
	 *area of where attraction is and other attractions in the area
	 */ 
	@simpl_scalar
	private MetadataParsedURL attractionsInTheArea;

	public Attraction()
	{ super(); }

	public Attraction(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	overallRating()
	{
		MetadataString	result = this.overallRating;
		if (result == null)
		{
			result = new MetadataString();
			this.overallRating = result;
		}
		return result;
	}

	public String getOverallRating()
	{
		return this.overallRating == null ? null : overallRating().getValue();
	}

	public MetadataString getOverallRatingMetadata()
	{
		return overallRating;
	}

	public void setOverallRating(String overallRating)
	{
		if (overallRating != null)
			this.overallRating().setValue(overallRating);
	}

	public void setOverallRatingMetadata(MetadataString overallRating)
	{
		this.overallRating = overallRating;
	}

	public List<Review> getReviews()
	{
		return reviews;
	}

  // lazy evaluation:
  public List<Review> reviews()
  {
    if (reviews == null)
      reviews = new ArrayList<Review>();
    return reviews;
  }

  // addTo:
  public void addToReviews(Review element)
  {
    reviews().add(element);
  }

  // size:
  public int reviewsSize()
  {
    return reviews == null ? 0 : reviews.size();
  }

	public void setReviews(List<Review> reviews)
	{
		this.reviews = reviews;
	}

	public MetadataString	fee()
	{
		MetadataString	result = this.fee;
		if (result == null)
		{
			result = new MetadataString();
			this.fee = result;
		}
		return result;
	}

	public String getFee()
	{
		return this.fee == null ? null : fee().getValue();
	}

	public MetadataString getFeeMetadata()
	{
		return fee;
	}

	public void setFee(String fee)
	{
		if (fee != null)
			this.fee().setValue(fee);
	}

	public void setFeeMetadata(MetadataString fee)
	{
		this.fee = fee;
	}

	public MetadataString	attractionType()
	{
		MetadataString	result = this.attractionType;
		if (result == null)
		{
			result = new MetadataString();
			this.attractionType = result;
		}
		return result;
	}

	public String getAttractionType()
	{
		return this.attractionType == null ? null : attractionType().getValue();
	}

	public MetadataString getAttractionTypeMetadata()
	{
		return attractionType;
	}

	public void setAttractionType(String attractionType)
	{
		if (attractionType != null)
			this.attractionType().setValue(attractionType);
	}

	public void setAttractionTypeMetadata(MetadataString attractionType)
	{
		this.attractionType = attractionType;
	}

	public MetadataString	openHours()
	{
		MetadataString	result = this.openHours;
		if (result == null)
		{
			result = new MetadataString();
			this.openHours = result;
		}
		return result;
	}

	public String getOpenHours()
	{
		return this.openHours == null ? null : openHours().getValue();
	}

	public MetadataString getOpenHoursMetadata()
	{
		return openHours;
	}

	public void setOpenHours(String openHours)
	{
		if (openHours != null)
			this.openHours().setValue(openHours);
	}

	public void setOpenHoursMetadata(MetadataString openHours)
	{
		this.openHours = openHours;
	}

	public PostalAddress getAttractionAddress()
	{
		return attractionAddress;
	}

	public void setAttractionAddress(PostalAddress attractionAddress)
	{
		this.attractionAddress = attractionAddress;
	}

	public MetadataParsedURL	attractionWebsite()
	{
		MetadataParsedURL	result = this.attractionWebsite;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.attractionWebsite = result;
		}
		return result;
	}

	public ParsedURL getAttractionWebsite()
	{
		return this.attractionWebsite == null ? null : attractionWebsite().getValue();
	}

	public MetadataParsedURL getAttractionWebsiteMetadata()
	{
		return attractionWebsite;
	}

	public void setAttractionWebsite(ParsedURL attractionWebsite)
	{
		if (attractionWebsite != null)
			this.attractionWebsite().setValue(attractionWebsite);
	}

	public void setAttractionWebsiteMetadata(MetadataParsedURL attractionWebsite)
	{
		this.attractionWebsite = attractionWebsite;
	}

	public MetadataParsedURL	attractionsInTheArea()
	{
		MetadataParsedURL	result = this.attractionsInTheArea;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.attractionsInTheArea = result;
		}
		return result;
	}

	public ParsedURL getAttractionsInTheArea()
	{
		return this.attractionsInTheArea == null ? null : attractionsInTheArea().getValue();
	}

	public MetadataParsedURL getAttractionsInTheAreaMetadata()
	{
		return attractionsInTheArea;
	}

	public void setAttractionsInTheArea(ParsedURL attractionsInTheArea)
	{
		if (attractionsInTheArea != null)
			this.attractionsInTheArea().setValue(attractionsInTheArea);
	}

	public void setAttractionsInTheAreaMetadata(MetadataParsedURL attractionsInTheArea)
	{
		this.attractionsInTheArea = attractionsInTheArea;
	}
}
