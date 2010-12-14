package ecologylab.semantics.generated.library.flickr;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
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
	A Flickr Image result page

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrImageDetailTwo
extends Document
{

@simpl_scalar
private MetadataString	views;

@simpl_scalar
private MetadataString	place;

@simpl_scalar
private MetadataParsedURL	placeLink;

@simpl_composite @mm_name("flickr_image")
private FlickrImage	flickrImage;

@simpl_collection("flickr_tag") @xml_tag("flickr_tags") @mm_name("flickr_tags")
private ArrayList<FlickrTag>	flickrTags;

@simpl_composite @mm_name("author_photos")
private AuthorPhotos	authorPhotos;



/**
	Constructor
*/
public FlickrImageDetailTwo()
{
 super();
}

/**
	Constructor
*/
public FlickrImageDetailTwo(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for views
*/
public MetadataString	views()
{
	MetadataString	result = this.views;
	if (result == null)
	{
		result = new MetadataString();
		this.views = result;
	}
	return result;
}

/**
	Gets the value of the field views
*/
public String getViews()
{
	return this.views().getValue();
}

/**
	Sets the value of the field views
*/
public void setViews(String views)
{
	this.views().setValue(views);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: views
*/
public boolean isNullViews()
{
	return views == null || views.getValue() == null;
}

/**
	The heavy weight setter method for field views
*/
public void hwSetViews(String views)
{
	this.views().setValue(views);
	rebuildCompositeTermVector();
}

/**
	 Sets the views directly.
*/
public void setViewsMetadata(MetadataString views)
{
	this.views = views;
}

/**
	Heavy Weight Direct setter method for views
*/
public void hwSetViewsMetadata(MetadataString views)
{
	if (this.views != null && this.views.getValue() != null && hasTermVector())
		termVector().remove(this.views.termVector());
	this.views = views;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for place
*/
public MetadataString	place()
{
	MetadataString	result = this.place;
	if (result == null)
	{
		result = new MetadataString();
		this.place = result;
	}
	return result;
}

/**
	Gets the value of the field place
*/
public String getPlace()
{
	return this.place().getValue();
}

/**
	Sets the value of the field place
*/
public void setPlace(String place)
{
	this.place().setValue(place);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: place
*/
public boolean isNullPlace()
{
	return place == null || place.getValue() == null;
}

/**
	The heavy weight setter method for field place
*/
public void hwSetPlace(String place)
{
	this.place().setValue(place);
	rebuildCompositeTermVector();
}

/**
	 Sets the place directly.
*/
public void setPlaceMetadata(MetadataString place)
{
	this.place = place;
}

/**
	Heavy Weight Direct setter method for place
*/
public void hwSetPlaceMetadata(MetadataString place)
{
	if (this.place != null && this.place.getValue() != null && hasTermVector())
		termVector().remove(this.place.termVector());
	this.place = place;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for placeLink
*/
public MetadataParsedURL	placeLink()
{
	MetadataParsedURL	result = this.placeLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.placeLink = result;
	}
	return result;
}

/**
	Gets the value of the field placeLink
*/
public ParsedURL getPlaceLink()
{
	return this.placeLink().getValue();
}

/**
	Sets the value of the field placeLink
*/
public void setPlaceLink(ParsedURL placeLink)
{
	this.placeLink().setValue(placeLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: placeLink
*/
public boolean isNullPlaceLink()
{
	return placeLink == null || placeLink.getValue() == null;
}

/**
	The heavy weight setter method for field placeLink
*/
public void hwSetPlaceLink(ParsedURL placeLink)
{
	this.placeLink().setValue(placeLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the placeLink directly.
*/
public void setPlaceLinkMetadata(MetadataParsedURL placeLink)
{
	this.placeLink = placeLink;
}

/**
	Heavy Weight Direct setter method for placeLink
*/
public void hwSetPlaceLinkMetadata(MetadataParsedURL placeLink)
{
	if (this.placeLink != null && this.placeLink.getValue() != null && hasTermVector())
		termVector().remove(this.placeLink.termVector());
	this.placeLink = placeLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for flickrImage
*/
public FlickrImage	flickrImage()
{
	FlickrImage	result = this.flickrImage;
	if (result == null)
	{
		result = new FlickrImage();
		this.flickrImage = result;
	}
	return result;
}

/**
	Get the value of field flickrImage
*/
public FlickrImage getFlickrImage()
{
	return this.flickrImage;
}

/**
	Set the value of field flickrImage
*/
public void setFlickrImage(FlickrImage flickrImage)
{
	this.flickrImage = flickrImage;
}

/**
	Lazy evaluation for flickrTags
*/
public ArrayList<FlickrTag>	flickrTags()
{
	ArrayList<FlickrTag>	result = this.flickrTags;
	if (result == null)
	{
		result = new ArrayList<FlickrTag>();
		this.flickrTags = result;
	}
	return result;
}

/**
	Get the value of field flickrTags
*/
public ArrayList<FlickrTag> getFlickrTags()
{
	return this.flickrTags;
}

/**
	Set the value of field flickrTags
*/
public void setFlickrTags(ArrayList<FlickrTag> flickrTags)
{
	this.flickrTags = flickrTags;
}

/**
	Lazy evaluation for authorPhotos
*/
public AuthorPhotos	authorPhotos()
{
	AuthorPhotos	result = this.authorPhotos;
	if (result == null)
	{
		result = new AuthorPhotos();
		this.authorPhotos = result;
	}
	return result;
}

/**
	Get the value of field authorPhotos
*/
public AuthorPhotos getAuthorPhotos()
{
	return this.authorPhotos;
}

/**
	Set the value of field authorPhotos
*/
public void setAuthorPhotos(AuthorPhotos authorPhotos)
{
	this.authorPhotos = authorPhotos;
}


}

