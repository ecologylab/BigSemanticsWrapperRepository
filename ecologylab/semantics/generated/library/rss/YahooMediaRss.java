package ecologylab.semantics.generated.library.rss;


import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;


/**
	News feeds.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class YahooMediaRss
extends Dc
{

@simpl_composite @xml_tag("media:content") @mm_name("media_content")
private MediaContent	mediaContent;

@simpl_scalar @xml_tag("media:description") @simpl_hints(Hint.XML_LEAF)
private MetadataString	mediaDescription;



/**
	Constructor
*/
public YahooMediaRss()
{
 super();
}

/**
	Constructor
*/
public YahooMediaRss(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for mediaContent
*/
public MediaContent	mediaContent()
{
	MediaContent	result = this.mediaContent;
	if (result == null)
	{
		result = new MediaContent();
		this.mediaContent = result;
	}
	return result;
}

/**
	Get the value of field mediaContent
*/
public MediaContent getMediaContent()
{
	return this.mediaContent;
}

/**
	Set the value of field mediaContent
*/
public void setMediaContent(MediaContent mediaContent)
{
	this.mediaContent = mediaContent;
}

/**
	Lazy evaluation for mediaDescription
*/
public MetadataString	mediaDescription()
{
	MetadataString	result = this.mediaDescription;
	if (result == null)
	{
		result = new MetadataString();
		this.mediaDescription = result;
	}
	return result;
}

/**
	Gets the value of the field mediaDescription
*/
public String getMediaDescription()
{
	return this.mediaDescription().getValue();
}

/**
	Sets the value of the field mediaDescription
*/
public void setMediaDescription(String mediaDescription)
{
	this.mediaDescription().setValue(mediaDescription);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: mediaDescription
*/
public boolean isNullMediaDescription()
{
	return mediaDescription == null || mediaDescription.getValue() == null;
}

/**
	The heavy weight setter method for field mediaDescription
*/
public void hwSetMediaDescription(String mediaDescription)
{
	this.mediaDescription().setValue(mediaDescription);
	rebuildCompositeTermVector();
}

/**
	 Sets the mediaDescription directly.
*/
public void setMediaDescriptionMetadata(MetadataString mediaDescription)
{
	this.mediaDescription = mediaDescription;
}

/**
	Heavy Weight Direct setter method for mediaDescription
*/
public void hwSetMediaDescriptionMetadata(MetadataString mediaDescription)
{
	if (this.mediaDescription != null && this.mediaDescription.getValue() != null && hasTermVector())
		termVector().remove(this.mediaDescription.termVector());
	this.mediaDescription = mediaDescription;
	rebuildCompositeTermVector();
}


}

