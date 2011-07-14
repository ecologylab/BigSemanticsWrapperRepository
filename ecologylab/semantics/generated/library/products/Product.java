package ecologylab.semantics.generated.library.products;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.products.MmdInlineProductReviewInReviewsInProduct;

/**
*  Product.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Product extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString price;

	/** 
	 */ 
	@simpl_scalar	private MetadataString model;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL imageUrl;

	/** 
	 */ 
	@simpl_scalar	private MetadataString overallRating;

	/** 
	 */ 
	@simpl_collection("product_review") @mm_name("reviews")	private ArrayList<MmdInlineProductReviewInReviewsInProduct> reviews;

	public Product()
	{ }

	public Product(MetaMetadataCompositeField mmd) {
		super(mmd);
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
		return this.price().getValue();
	}

	public void setPrice(String price)
	{
		this.price().setValue(price);
	}

	public MetadataString	model()
	{
		MetadataString	result = this.model;
		if (result == null)
		{
			result = new MetadataString();
			this.model = result;
		}
		return result;
	}

	public String getModel()
	{
		return this.model().getValue();
	}

	public void setModel(String model)
	{
		this.model().setValue(model);
	}

	public MetadataParsedURL	imageUrl()
	{
		MetadataParsedURL	result = this.imageUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imageUrl = result;
		}
		return result;
	}

	public ParsedURL getImageUrl()
	{
		return this.imageUrl().getValue();
	}

	public void setImageUrl(ParsedURL imageUrl)
	{
		this.imageUrl().setValue(imageUrl);
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
		return this.overallRating().getValue();
	}

	public void setOverallRating(String overallRating)
	{
		this.overallRating().setValue(overallRating);
	}


	public ArrayList<MmdInlineProductReviewInReviewsInProduct> getReviews()
	{
		return reviews;
	}

	public void setReviews(ArrayList<MmdInlineProductReviewInReviewsInProduct> reviews)
	{
		this.reviews = reviews;
	}
}
