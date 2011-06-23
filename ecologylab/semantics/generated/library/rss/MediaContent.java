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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("media:content")
public class MediaContent
extends Metadata
{

@simpl_scalar @xml_tag("url")
private MetadataParsedURL	mediaUrl;

@simpl_scalar
private MetadataInteger	height;

@simpl_scalar
private MetadataInteger	width;



/**
	Constructor
*/
public MediaContent()
{
 super();
}

/**
	Constructor
*/
public MediaContent(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for mediaUrl
*/
public MetadataParsedURL	mediaUrl()
{
	MetadataParsedURL	result = this.mediaUrl;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.mediaUrl = result;
	}
	return result;
}

/**
	Gets the value of the field mediaUrl
*/
public ParsedURL getMediaUrl()
{
	return this.mediaUrl().getValue();
}

/**
	Sets the value of the field mediaUrl
*/
public void setMediaUrl(ParsedURL mediaUrl)
{
	this.mediaUrl().setValue(mediaUrl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: mediaUrl
*/
public boolean isNullMediaUrl()
{
	return mediaUrl == null || mediaUrl.getValue() == null;
}

/**
	The heavy weight setter method for field mediaUrl
*/
public void hwSetMediaUrl(ParsedURL mediaUrl)
{
	this.mediaUrl().setValue(mediaUrl);
	rebuildCompositeTermVector();
}

/**
	 Sets the mediaUrl directly.
*/
public void setMediaUrlMetadata(MetadataParsedURL mediaUrl)
{
	this.mediaUrl = mediaUrl;
}

/**
	Heavy Weight Direct setter method for mediaUrl
*/
public void hwSetMediaUrlMetadata(MetadataParsedURL mediaUrl)
{
	if (this.mediaUrl != null && this.mediaUrl.getValue() != null && hasTermVector())
		termVector().remove(this.mediaUrl.termVector());
	this.mediaUrl = mediaUrl;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for height
*/
public MetadataInteger	height()
{
	MetadataInteger	result = this.height;
	if (result == null)
	{
		result = new MetadataInteger();
		this.height = result;
	}
	return result;
}

/**
	Gets the value of the field height
*/
public Integer getHeight()
{
	return this.height().getValue();
}

/**
	Sets the value of the field height
*/
public void setHeight(Integer height)
{
	this.height().setValue(height);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: height
*/
public boolean isNullHeight()
{
	return height == null || height.getValue() == null;
}

/**
	The heavy weight setter method for field height
*/
public void hwSetHeight(Integer height)
{
	this.height().setValue(height);
	rebuildCompositeTermVector();
}

/**
	 Sets the height directly.
*/
public void setHeightMetadata(MetadataInteger height)
{
	this.height = height;
}

/**
	Heavy Weight Direct setter method for height
*/
public void hwSetHeightMetadata(MetadataInteger height)
{
	if (this.height != null && this.height.getValue() != null && hasTermVector())
		termVector().remove(this.height.termVector());
	this.height = height;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for width
*/
public MetadataInteger	width()
{
	MetadataInteger	result = this.width;
	if (result == null)
	{
		result = new MetadataInteger();
		this.width = result;
	}
	return result;
}

/**
	Gets the value of the field width
*/
public Integer getWidth()
{
	return this.width().getValue();
}

/**
	Sets the value of the field width
*/
public void setWidth(Integer width)
{
	this.width().setValue(width);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: width
*/
public boolean isNullWidth()
{
	return width == null || width.getValue() == null;
}

/**
	The heavy weight setter method for field width
*/
public void hwSetWidth(Integer width)
{
	this.width().setValue(width);
	rebuildCompositeTermVector();
}

/**
	 Sets the width directly.
*/
public void setWidthMetadata(MetadataInteger width)
{
	this.width = width;
}

/**
	Heavy Weight Direct setter method for width
*/
public void hwSetWidthMetadata(MetadataInteger width)
{
	if (this.width != null && this.width.getValue() != null && hasTermVector())
		termVector().remove(this.width.termVector());
	this.width = width;
	rebuildCompositeTermVector();
}


}

