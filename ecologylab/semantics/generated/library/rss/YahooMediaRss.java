package ecologylab.semantics.generated.library.rss;


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

