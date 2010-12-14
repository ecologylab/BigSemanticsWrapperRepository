package ecologylab.semantics.generated.library;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
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
	The restaurant class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Restaurant
extends Document
{


/**
	Phone number of the restaurant
*/
@simpl_scalar
private MetadataString	phone;


/**
	A picture from the restaurant
*/
@simpl_scalar
private MetadataParsedURL	pic;


/**
	Link to the restaurant's website
*/
@simpl_scalar
private MetadataParsedURL	link;


/**
	Rating of the restaurant
*/
@simpl_scalar
private MetadataString	rating;


/**
	Price range of the restaurant
*/
@simpl_scalar
private MetadataString	priceRange;


/**
	Map image of the restaurant's location or link to a directions page
*/
@simpl_scalar
private MetadataParsedURL	map;


/**
	The genres of food offered
*/
@simpl_collection("search_result") @xml_tag("genres") @mm_name("genres")
private ArrayList<SearchResult>	genres;



/**
	Constructor
*/
public Restaurant()
{
 super();
}

/**
	Constructor
*/
public Restaurant(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for phone
*/
public MetadataString	phone()
{
	MetadataString	result = this.phone;
	if (result == null)
	{
		result = new MetadataString();
		this.phone = result;
	}
	return result;
}

/**
	Gets the value of the field phone
*/
public String getPhone()
{
	return this.phone().getValue();
}

/**
	Sets the value of the field phone
*/
public void setPhone(String phone)
{
	this.phone().setValue(phone);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: phone
*/
public boolean isNullPhone()
{
	return phone == null || phone.getValue() == null;
}

/**
	The heavy weight setter method for field phone
*/
public void hwSetPhone(String phone)
{
	this.phone().setValue(phone);
	rebuildCompositeTermVector();
}

/**
	 Sets the phone directly.
*/
public void setPhoneMetadata(MetadataString phone)
{
	this.phone = phone;
}

/**
	Heavy Weight Direct setter method for phone
*/
public void hwSetPhoneMetadata(MetadataString phone)
{
	if (this.phone != null && this.phone.getValue() != null && hasTermVector())
		termVector().remove(this.phone.termVector());
	this.phone = phone;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for pic
*/
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

/**
	Gets the value of the field pic
*/
public ParsedURL getPic()
{
	return this.pic().getValue();
}

/**
	Sets the value of the field pic
*/
public void setPic(ParsedURL pic)
{
	this.pic().setValue(pic);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pic
*/
public boolean isNullPic()
{
	return pic == null || pic.getValue() == null;
}

/**
	The heavy weight setter method for field pic
*/
public void hwSetPic(ParsedURL pic)
{
	this.pic().setValue(pic);
	rebuildCompositeTermVector();
}

/**
	 Sets the pic directly.
*/
public void setPicMetadata(MetadataParsedURL pic)
{
	this.pic = pic;
}

/**
	Heavy Weight Direct setter method for pic
*/
public void hwSetPicMetadata(MetadataParsedURL pic)
{
	if (this.pic != null && this.pic.getValue() != null && hasTermVector())
		termVector().remove(this.pic.termVector());
	this.pic = pic;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for link
*/
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

/**
	Gets the value of the field link
*/
public ParsedURL getLink()
{
	return this.link().getValue();
}

/**
	Sets the value of the field link
*/
public void setLink(ParsedURL link)
{
	this.link().setValue(link);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: link
*/
public boolean isNullLink()
{
	return link == null || link.getValue() == null;
}

/**
	The heavy weight setter method for field link
*/
public void hwSetLink(ParsedURL link)
{
	this.link().setValue(link);
	rebuildCompositeTermVector();
}

/**
	 Sets the link directly.
*/
public void setLinkMetadata(MetadataParsedURL link)
{
	this.link = link;
}

/**
	Heavy Weight Direct setter method for link
*/
public void hwSetLinkMetadata(MetadataParsedURL link)
{
	if (this.link != null && this.link.getValue() != null && hasTermVector())
		termVector().remove(this.link.termVector());
	this.link = link;
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

/**
	Lazy evaluation for priceRange
*/
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

/**
	Gets the value of the field priceRange
*/
public String getPriceRange()
{
	return this.priceRange().getValue();
}

/**
	Sets the value of the field priceRange
*/
public void setPriceRange(String priceRange)
{
	this.priceRange().setValue(priceRange);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: priceRange
*/
public boolean isNullPriceRange()
{
	return priceRange == null || priceRange.getValue() == null;
}

/**
	The heavy weight setter method for field priceRange
*/
public void hwSetPriceRange(String priceRange)
{
	this.priceRange().setValue(priceRange);
	rebuildCompositeTermVector();
}

/**
	 Sets the priceRange directly.
*/
public void setPriceRangeMetadata(MetadataString priceRange)
{
	this.priceRange = priceRange;
}

/**
	Heavy Weight Direct setter method for priceRange
*/
public void hwSetPriceRangeMetadata(MetadataString priceRange)
{
	if (this.priceRange != null && this.priceRange.getValue() != null && hasTermVector())
		termVector().remove(this.priceRange.termVector());
	this.priceRange = priceRange;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for map
*/
public MetadataParsedURL	map()
{
	MetadataParsedURL	result = this.map;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.map = result;
	}
	return result;
}

/**
	Gets the value of the field map
*/
public ParsedURL getMap()
{
	return this.map().getValue();
}

/**
	Sets the value of the field map
*/
public void setMap(ParsedURL map)
{
	this.map().setValue(map);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: map
*/
public boolean isNullMap()
{
	return map == null || map.getValue() == null;
}

/**
	The heavy weight setter method for field map
*/
public void hwSetMap(ParsedURL map)
{
	this.map().setValue(map);
	rebuildCompositeTermVector();
}

/**
	 Sets the map directly.
*/
public void setMapMetadata(MetadataParsedURL map)
{
	this.map = map;
}

/**
	Heavy Weight Direct setter method for map
*/
public void hwSetMapMetadata(MetadataParsedURL map)
{
	if (this.map != null && this.map.getValue() != null && hasTermVector())
		termVector().remove(this.map.termVector());
	this.map = map;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for genres
*/
public ArrayList<SearchResult>	genres()
{
	ArrayList<SearchResult>	result = this.genres;
	if (result == null)
	{
		result = new ArrayList<SearchResult>();
		this.genres = result;
	}
	return result;
}

/**
	Get the value of field genres
*/
public ArrayList<SearchResult> getGenres()
{
	return this.genres;
}

/**
	Set the value of field genres
*/
public void setGenres(ArrayList<SearchResult> genres)
{
	this.genres = genres;
}


}

