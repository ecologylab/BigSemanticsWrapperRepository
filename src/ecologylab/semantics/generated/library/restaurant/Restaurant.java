package ecologylab.semantics.generated.library.restaurant;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.gps.PostalAddress;
import ecologylab.semantics.generated.library.restaurant.RestaurantGenre;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
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

/** 
 *The restaurant class.
 */ 
@simpl_inherit
public class Restaurant extends CompoundDocument
{
	@simpl_composite
	@mm_name("place")
	private PostalAddress place;

	/** 
	 *picture of food or place
	 */ 
	@simpl_composite
	@mm_name("image")
	private Image image;

	/** 
	 *Link to the restaurant's website
	 */ 
	@simpl_scalar
	private MetadataParsedURL link;

	/** 
	 *Rating of the restaurant
	 */ 
	@simpl_scalar
	private MetadataString rating;

	/** 
	 *Price range of the restaurant
	 */ 
	@simpl_scalar
	private MetadataString priceRange;

	/** 
	 *The genres of food offered
	 */ 
	@simpl_collection("restaurant_genre")
	@mm_name("genres")
	private List<RestaurantGenre> genres;

	public Restaurant()
	{ super(); }

	public Restaurant(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public PostalAddress getPlace()
	{
		return place;
	}

	public void setPlace(PostalAddress place)
	{
		this.place = place;
	}

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(MetadataParsedURL link)
	{
		this.link = link;
	}

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

	public String getRating()
	{
		return this.rating == null ? null : rating().getValue();
	}

	public MetadataString getRatingMetadata()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		if (rating != null)
			this.rating().setValue(rating);
	}

	public void setRatingMetadata(MetadataString rating)
	{
		this.rating = rating;
	}

	public MetadataString	priceRange()
	{
		MetadataString	result = this.priceRange;
		if (result == null)
		{
			result = new MetadataString();
			this.priceRange = result;
		}
		return result;
	}

	public String getPriceRange()
	{
		return this.priceRange == null ? null : priceRange().getValue();
	}

	public MetadataString getPriceRangeMetadata()
	{
		return priceRange;
	}

	public void setPriceRange(String priceRange)
	{
		if (priceRange != null)
			this.priceRange().setValue(priceRange);
	}

	public void setPriceRangeMetadata(MetadataString priceRange)
	{
		this.priceRange = priceRange;
	}

	public List<RestaurantGenre> getGenres()
	{
		return genres;
	}

  // lazy evaluation:
  public List<RestaurantGenre> genres()
  {
    if (genres == null)
      genres = new ArrayList<RestaurantGenre>();
    return genres;
  }

  // addTo:
  public void addToGenres(RestaurantGenre element)
  {
    genres().add(element);
  }

  // size:
  public int genresSize()
  {
    return genres == null ? 0 : genres.size();
  }

	public void setGenres(List<RestaurantGenre> genres)
	{
		this.genres = genres;
	}
}