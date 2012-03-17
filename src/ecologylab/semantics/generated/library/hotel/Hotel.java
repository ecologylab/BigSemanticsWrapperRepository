package ecologylab.semantics.generated.library.hotel;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.gps.PostalAddress;
import ecologylab.semantics.generated.library.products.ProductReview;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Hotel extends Document
{
	@simpl_collection("product_review")
	@mm_name("reviews")
	private List<ProductReview> reviews;

	@simpl_composite
	@mm_name("place")
	private PostalAddress place;

	@simpl_scalar
	private MetadataString price;

	@simpl_scalar
	private MetadataString spaceSize;

	@simpl_scalar
	private MetadataString bedrooms;

	@simpl_scalar
	private MetadataString sleeps;

	@simpl_scalar
	private MetadataString checkIn;

	@simpl_scalar
	private MetadataString checkOut;

	public Hotel()
	{ super(); }

	public Hotel(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<ProductReview> getReviews()
	{
		return reviews;
	}

	public void setReviews(List<ProductReview> reviews)
	{
		this.reviews = reviews;
	}

	public PostalAddress getPlace()
	{
		return place;
	}

	public void setPlace(PostalAddress place)
	{
		this.place = place;
	}

	public MetadataString	price()
	{
		MetadataString	result = this.price;
		if (result == null)
		{
			result = new MetadataString();
			this.price = result;
		}
		return result;
	}

	public String getPrice()
	{
		return this.price == null ? null : price().getValue();
	}

	public MetadataString getPriceMetadata()
	{
		return price;
	}

	public void setPrice(String price)
	{
		if (price != null)
			this.price().setValue(price);
	}

	public void setPriceMetadata(MetadataString price)
	{
		this.price = price;
	}

	public MetadataString	spaceSize()
	{
		MetadataString	result = this.spaceSize;
		if (result == null)
		{
			result = new MetadataString();
			this.spaceSize = result;
		}
		return result;
	}

	public String getSpaceSize()
	{
		return this.spaceSize == null ? null : spaceSize().getValue();
	}

	public MetadataString getSpaceSizeMetadata()
	{
		return spaceSize;
	}

	public void setSpaceSize(String spaceSize)
	{
		if (spaceSize != null)
			this.spaceSize().setValue(spaceSize);
	}

	public void setSpaceSizeMetadata(MetadataString spaceSize)
	{
		this.spaceSize = spaceSize;
	}

	public MetadataString	bedrooms()
	{
		MetadataString	result = this.bedrooms;
		if (result == null)
		{
			result = new MetadataString();
			this.bedrooms = result;
		}
		return result;
	}

	public String getBedrooms()
	{
		return this.bedrooms == null ? null : bedrooms().getValue();
	}

	public MetadataString getBedroomsMetadata()
	{
		return bedrooms;
	}

	public void setBedrooms(String bedrooms)
	{
		if (bedrooms != null)
			this.bedrooms().setValue(bedrooms);
	}

	public void setBedroomsMetadata(MetadataString bedrooms)
	{
		this.bedrooms = bedrooms;
	}

	public MetadataString	sleeps()
	{
		MetadataString	result = this.sleeps;
		if (result == null)
		{
			result = new MetadataString();
			this.sleeps = result;
		}
		return result;
	}

	public String getSleeps()
	{
		return this.sleeps == null ? null : sleeps().getValue();
	}

	public MetadataString getSleepsMetadata()
	{
		return sleeps;
	}

	public void setSleeps(String sleeps)
	{
		if (sleeps != null)
			this.sleeps().setValue(sleeps);
	}

	public void setSleepsMetadata(MetadataString sleeps)
	{
		this.sleeps = sleeps;
	}

	public MetadataString	checkIn()
	{
		MetadataString	result = this.checkIn;
		if (result == null)
		{
			result = new MetadataString();
			this.checkIn = result;
		}
		return result;
	}

	public String getCheckIn()
	{
		return this.checkIn == null ? null : checkIn().getValue();
	}

	public MetadataString getCheckInMetadata()
	{
		return checkIn;
	}

	public void setCheckIn(String checkIn)
	{
		if (checkIn != null)
			this.checkIn().setValue(checkIn);
	}

	public void setCheckInMetadata(MetadataString checkIn)
	{
		this.checkIn = checkIn;
	}

	public MetadataString	checkOut()
	{
		MetadataString	result = this.checkOut;
		if (result == null)
		{
			result = new MetadataString();
			this.checkOut = result;
		}
		return result;
	}

	public String getCheckOut()
	{
		return this.checkOut == null ? null : checkOut().getValue();
	}

	public MetadataString getCheckOutMetadata()
	{
		return checkOut;
	}

	public void setCheckOut(String checkOut)
	{
		if (checkOut != null)
			this.checkOut().setValue(checkOut);
	}

	public void setCheckOutMetadata(MetadataString checkOut)
	{
		this.checkOut = checkOut;
	}
}
