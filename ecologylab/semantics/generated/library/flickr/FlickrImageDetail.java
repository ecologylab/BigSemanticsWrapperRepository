package ecologylab.semantics.generated.library.flickr;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.camera.*;
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
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.ImageClipping;
import ecologylab.semantics.metadata.builtins.MediaClipping;
import ecologylab.semantics.metadata.builtins.TextClipping;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
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
public class FlickrImageDetail
extends CompoundDocument
{

@simpl_scalar
private MetadataParsedURL	thumbnailKludge;

@simpl_scalar
private MetadataParsedURL	imageKludge;

@simpl_collection("flickr_tag") @xml_tag("flickr_tags") @mm_name("flickr_tags")
private ArrayList<FlickrTag>	flickrTags;



/**
	Constructor
*/
public FlickrImageDetail()
{
 super();
}

/**
	Constructor
*/
public FlickrImageDetail(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for thumbnailKludge
*/
public MetadataParsedURL	thumbnailKludge()
{
	MetadataParsedURL	result = this.thumbnailKludge;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.thumbnailKludge = result;
	}
	return result;
}

/**
	Gets the value of the field thumbnailKludge
*/
public ParsedURL getThumbnailKludge()
{
	return this.thumbnailKludge().getValue();
}

/**
	Sets the value of the field thumbnailKludge
*/
public void setThumbnailKludge(ParsedURL thumbnailKludge)
{
	this.thumbnailKludge().setValue(thumbnailKludge);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: thumbnailKludge
*/
public boolean isNullThumbnailKludge()
{
	return thumbnailKludge == null || thumbnailKludge.getValue() == null;
}

/**
	The heavy weight setter method for field thumbnailKludge
*/
public void hwSetThumbnailKludge(ParsedURL thumbnailKludge)
{
	this.thumbnailKludge().setValue(thumbnailKludge);
	rebuildCompositeTermVector();
}

/**
	 Sets the thumbnailKludge directly.
*/
public void setThumbnailKludgeMetadata(MetadataParsedURL thumbnailKludge)
{
	this.thumbnailKludge = thumbnailKludge;
}

/**
	Heavy Weight Direct setter method for thumbnailKludge
*/
public void hwSetThumbnailKludgeMetadata(MetadataParsedURL thumbnailKludge)
{
	if (this.thumbnailKludge != null && this.thumbnailKludge.getValue() != null && hasTermVector())
		termVector().remove(this.thumbnailKludge.termVector());
	this.thumbnailKludge = thumbnailKludge;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for imageKludge
*/
public MetadataParsedURL	imageKludge()
{
	MetadataParsedURL	result = this.imageKludge;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.imageKludge = result;
	}
	return result;
}

/**
	Gets the value of the field imageKludge
*/
public ParsedURL getImageKludge()
{
	return this.imageKludge().getValue();
}

/**
	Sets the value of the field imageKludge
*/
public void setImageKludge(ParsedURL imageKludge)
{
	this.imageKludge().setValue(imageKludge);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: imageKludge
*/
public boolean isNullImageKludge()
{
	return imageKludge == null || imageKludge.getValue() == null;
}

/**
	The heavy weight setter method for field imageKludge
*/
public void hwSetImageKludge(ParsedURL imageKludge)
{
	this.imageKludge().setValue(imageKludge);
	rebuildCompositeTermVector();
}

/**
	 Sets the imageKludge directly.
*/
public void setImageKludgeMetadata(MetadataParsedURL imageKludge)
{
	this.imageKludge = imageKludge;
}

/**
	Heavy Weight Direct setter method for imageKludge
*/
public void hwSetImageKludgeMetadata(MetadataParsedURL imageKludge)
{
	if (this.imageKludge != null && this.imageKludge.getValue() != null && hasTermVector())
		termVector().remove(this.imageKludge.termVector());
	this.imageKludge = imageKludge;
	rebuildCompositeTermVector();
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


}

