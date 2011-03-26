package ecologylab.semantics.generated.library.products;


import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class ProductReview
extends Metadata
{

@simpl_scalar
private MetadataString	content;

@simpl_scalar
private MetadataString	rating;



/**
	Constructor
*/
public ProductReview()
{
 super();
}

/**
	Constructor
*/
public ProductReview(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for content
*/
public MetadataString	content()
{
	MetadataString	result = this.content;
	if (result == null)
	{
		result = new MetadataString();
		this.content = result;
	}
	return result;
}

/**
	Gets the value of the field content
*/
public String getContent()
{
	return this.content().getValue();
}

/**
	Sets the value of the field content
*/
public void setContent(String content)
{
	this.content().setValue(content);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: content
*/
public boolean isNullContent()
{
	return content == null || content.getValue() == null;
}

/**
	The heavy weight setter method for field content
*/
public void hwSetContent(String content)
{
	this.content().setValue(content);
	rebuildCompositeTermVector();
}

/**
	 Sets the content directly.
*/
public void setContentMetadata(MetadataString content)
{
	this.content = content;
}

/**
	Heavy Weight Direct setter method for content
*/
public void hwSetContentMetadata(MetadataString content)
{
	if (this.content != null && this.content.getValue() != null && hasTermVector())
		termVector().remove(this.content.termVector());
	this.content = content;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for rating
*/
public MetadataString	rating()
{
	MetadataString	result = this.rating;
	if (result == null)
	{
		result = new MetadataString();
		this.rating = result;
	}
	return result;
}

/**
	Gets the value of the field rating
*/
public String getRating()
{
	return this.rating().getValue();
}

/**
	Sets the value of the field rating
*/
public void setRating(String rating)
{
	this.rating().setValue(rating);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: rating
*/
public boolean isNullRating()
{
	return rating == null || rating.getValue() == null;
}

/**
	The heavy weight setter method for field rating
*/
public void hwSetRating(String rating)
{
	this.rating().setValue(rating);
	rebuildCompositeTermVector();
}

/**
	 Sets the rating directly.
*/
public void setRatingMetadata(MetadataString rating)
{
	this.rating = rating;
}

/**
	Heavy Weight Direct setter method for rating
*/
public void hwSetRatingMetadata(MetadataString rating)
{
	if (this.rating != null && this.rating.getValue() != null && hasTermVector())
		termVector().remove(this.rating.termVector());
	this.rating = rating;
	rebuildCompositeTermVector();
}


}

