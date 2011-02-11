package ecologylab.semantics.generated.library.products;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.publication.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableMetadata;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Product
extends Document
{

@simpl_scalar
private MetadataString	price;

@simpl_scalar
private MetadataString	model;

@simpl_scalar
private MetadataParsedURL	imageUrl;

@simpl_scalar
private MetadataString	overallRating;

@simpl_collection("product_review") @xml_tag("reviews") @mm_name("reviews")
private ArrayList<ProductReview>	reviews;



/**
	Constructor
*/
public Product()
{
 super();
}

/**
	Constructor
*/
public Product(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for price
*/
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

/**
	Gets the value of the field price
*/
public String getPrice()
{
	return this.price().getValue();
}

/**
	Sets the value of the field price
*/
public void setPrice(String price)
{
	this.price().setValue(price);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: price
*/
public boolean isNullPrice()
{
	return price == null || price.getValue() == null;
}

/**
	The heavy weight setter method for field price
*/
public void hwSetPrice(String price)
{
	this.price().setValue(price);
	rebuildCompositeTermVector();
}

/**
	 Sets the price directly.
*/
public void setPriceMetadata(MetadataString price)
{
	this.price = price;
}

/**
	Heavy Weight Direct setter method for price
*/
public void hwSetPriceMetadata(MetadataString price)
{
	if (this.price != null && this.price.getValue() != null && hasTermVector())
		termVector().remove(this.price.termVector());
	this.price = price;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for model
*/
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

/**
	Gets the value of the field model
*/
public String getModel()
{
	return this.model().getValue();
}

/**
	Sets the value of the field model
*/
public void setModel(String model)
{
	this.model().setValue(model);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: model
*/
public boolean isNullModel()
{
	return model == null || model.getValue() == null;
}

/**
	The heavy weight setter method for field model
*/
public void hwSetModel(String model)
{
	this.model().setValue(model);
	rebuildCompositeTermVector();
}

/**
	 Sets the model directly.
*/
public void setModelMetadata(MetadataString model)
{
	this.model = model;
}

/**
	Heavy Weight Direct setter method for model
*/
public void hwSetModelMetadata(MetadataString model)
{
	if (this.model != null && this.model.getValue() != null && hasTermVector())
		termVector().remove(this.model.termVector());
	this.model = model;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for imageUrl
*/
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

/**
	Gets the value of the field imageUrl
*/
public ParsedURL getImageUrl()
{
	return this.imageUrl().getValue();
}

/**
	Sets the value of the field imageUrl
*/
public void setImageUrl(ParsedURL imageUrl)
{
	this.imageUrl().setValue(imageUrl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: imageUrl
*/
public boolean isNullImageUrl()
{
	return imageUrl == null || imageUrl.getValue() == null;
}

/**
	The heavy weight setter method for field imageUrl
*/
public void hwSetImageUrl(ParsedURL imageUrl)
{
	this.imageUrl().setValue(imageUrl);
	rebuildCompositeTermVector();
}

/**
	 Sets the imageUrl directly.
*/
public void setImageUrlMetadata(MetadataParsedURL imageUrl)
{
	this.imageUrl = imageUrl;
}

/**
	Heavy Weight Direct setter method for imageUrl
*/
public void hwSetImageUrlMetadata(MetadataParsedURL imageUrl)
{
	if (this.imageUrl != null && this.imageUrl.getValue() != null && hasTermVector())
		termVector().remove(this.imageUrl.termVector());
	this.imageUrl = imageUrl;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for overallRating
*/
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

/**
	Gets the value of the field overallRating
*/
public String getOverallRating()
{
	return this.overallRating().getValue();
}

/**
	Sets the value of the field overallRating
*/
public void setOverallRating(String overallRating)
{
	this.overallRating().setValue(overallRating);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: overallRating
*/
public boolean isNullOverallRating()
{
	return overallRating == null || overallRating.getValue() == null;
}

/**
	The heavy weight setter method for field overallRating
*/
public void hwSetOverallRating(String overallRating)
{
	this.overallRating().setValue(overallRating);
	rebuildCompositeTermVector();
}

/**
	 Sets the overallRating directly.
*/
public void setOverallRatingMetadata(MetadataString overallRating)
{
	this.overallRating = overallRating;
}

/**
	Heavy Weight Direct setter method for overallRating
*/
public void hwSetOverallRatingMetadata(MetadataString overallRating)
{
	if (this.overallRating != null && this.overallRating.getValue() != null && hasTermVector())
		termVector().remove(this.overallRating.termVector());
	this.overallRating = overallRating;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for reviews
*/
public ArrayList<ProductReview>	reviews()
{
	ArrayList<ProductReview>	result = this.reviews;
	if (result == null)
	{
		result = new ArrayList<ProductReview>();
		this.reviews = result;
	}
	return result;
}

/**
	Get the value of field reviews
*/
public ArrayList<ProductReview> getReviews()
{
	return this.reviews;
}

/**
	Set the value of field reviews
*/
public void setReviews(ArrayList<ProductReview> reviews)
{
	this.reviews = reviews;
}


}

