package ecologylab.semantics.generated.library.flickr;


import java.util.ArrayList;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	A Flickr Image

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FlickrImage
extends Image
{

@simpl_scalar
private MetadataParsedURL	browsePurl;

@simpl_collection("flickr_tag") @xml_tag("flickr_tags") @mm_name("flickr_tags")
private ArrayList<FlickrTag>	flickrTags;



/**
	Constructor
*/
public FlickrImage()
{
 super();
}

/**
	Constructor
*/
public FlickrImage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for browsePurl
*/
public MetadataParsedURL	browsePurl()
{
	MetadataParsedURL	result = this.browsePurl;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.browsePurl = result;
	}
	return result;
}

/**
	Gets the value of the field browsePurl
*/
public ParsedURL getBrowsePurl()
{
	return this.browsePurl().getValue();
}

/**
	Sets the value of the field browsePurl
*/
public void setBrowsePurl(ParsedURL browsePurl)
{
	this.browsePurl().setValue(browsePurl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: browsePurl
*/
public boolean isNullBrowsePurl()
{
	return browsePurl == null || browsePurl.getValue() == null;
}

/**
	The heavy weight setter method for field browsePurl
*/
public void hwSetBrowsePurl(ParsedURL browsePurl)
{
	this.browsePurl().setValue(browsePurl);
	rebuildCompositeTermVector();
}

/**
	 Sets the browsePurl directly.
*/
public void setBrowsePurlMetadata(MetadataParsedURL browsePurl)
{
	this.browsePurl = browsePurl;
}

/**
	Heavy Weight Direct setter method for browsePurl
*/
public void hwSetBrowsePurlMetadata(MetadataParsedURL browsePurl)
{
	if (this.browsePurl != null && this.browsePurl.getValue() != null && hasTermVector())
		termVector().remove(this.browsePurl.termVector());
	this.browsePurl = browsePurl;
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

