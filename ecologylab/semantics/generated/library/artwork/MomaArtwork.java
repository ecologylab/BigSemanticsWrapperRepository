package ecologylab.semantics.generated.library.artwork;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
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
public class MomaArtwork
extends Artwork
{

@simpl_scalar
private MetadataString	status;

@simpl_composite @mm_name("moma_deparment")
private CompoundDocument	momaDeparment;

@simpl_composite @mm_name("moma_classification")
private CompoundDocument	momaClassification;

@simpl_scalar
private MetadataParsedURL	permalink;

@simpl_scalar
private MetadataParsedURL	databaseLink;

@simpl_scalar
private MetadataString	momaId;

@simpl_scalar
private MetadataParsedURL	imageUrl;

@simpl_composite @mm_name("temp_field_value_holder")
private TempFieldValueHolder	tempFieldValueHolder;



/**
	Constructor
*/
public MomaArtwork()
{
 super();
}

/**
	Constructor
*/
public MomaArtwork(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for status
*/
public MetadataString	status()
{
	MetadataString	result = this.status;
	if (result == null)
	{
		result = new MetadataString();
		this.status = result;
	}
	return result;
}

/**
	Gets the value of the field status
*/
public String getStatus()
{
	return this.status().getValue();
}

/**
	Sets the value of the field status
*/
public void setStatus(String status)
{
	this.status().setValue(status);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: status
*/
public boolean isNullStatus()
{
	return status == null || status.getValue() == null;
}

/**
	The heavy weight setter method for field status
*/
public void hwSetStatus(String status)
{
	this.status().setValue(status);
	rebuildCompositeTermVector();
}

/**
	 Sets the status directly.
*/
public void setStatusMetadata(MetadataString status)
{
	this.status = status;
}

/**
	Heavy Weight Direct setter method for status
*/
public void hwSetStatusMetadata(MetadataString status)
{
	if (this.status != null && this.status.getValue() != null && hasTermVector())
		termVector().remove(this.status.termVector());
	this.status = status;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for momaDeparment
*/
public CompoundDocument	momaDeparment()
{
	CompoundDocument	result = this.momaDeparment;
	if (result == null)
	{
		result = new CompoundDocument();
		this.momaDeparment = result;
	}
	return result;
}

/**
	Get the value of field momaDeparment
*/
public CompoundDocument getMomaDeparment()
{
	return this.momaDeparment;
}

/**
	Set the value of field momaDeparment
*/
public void setMomaDeparment(CompoundDocument momaDeparment)
{
	this.momaDeparment = momaDeparment;
}

/**
	Lazy evaluation for momaClassification
*/
public CompoundDocument	momaClassification()
{
	CompoundDocument	result = this.momaClassification;
	if (result == null)
	{
		result = new CompoundDocument();
		this.momaClassification = result;
	}
	return result;
}

/**
	Get the value of field momaClassification
*/
public CompoundDocument getMomaClassification()
{
	return this.momaClassification;
}

/**
	Set the value of field momaClassification
*/
public void setMomaClassification(CompoundDocument momaClassification)
{
	this.momaClassification = momaClassification;
}

/**
	Lazy evaluation for permalink
*/
public MetadataParsedURL	permalink()
{
	MetadataParsedURL	result = this.permalink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.permalink = result;
	}
	return result;
}

/**
	Gets the value of the field permalink
*/
public ParsedURL getPermalink()
{
	return this.permalink().getValue();
}

/**
	Sets the value of the field permalink
*/
public void setPermalink(ParsedURL permalink)
{
	this.permalink().setValue(permalink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: permalink
*/
public boolean isNullPermalink()
{
	return permalink == null || permalink.getValue() == null;
}

/**
	The heavy weight setter method for field permalink
*/
public void hwSetPermalink(ParsedURL permalink)
{
	this.permalink().setValue(permalink);
	rebuildCompositeTermVector();
}

/**
	 Sets the permalink directly.
*/
public void setPermalinkMetadata(MetadataParsedURL permalink)
{
	this.permalink = permalink;
}

/**
	Heavy Weight Direct setter method for permalink
*/
public void hwSetPermalinkMetadata(MetadataParsedURL permalink)
{
	if (this.permalink != null && this.permalink.getValue() != null && hasTermVector())
		termVector().remove(this.permalink.termVector());
	this.permalink = permalink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for databaseLink
*/
public MetadataParsedURL	databaseLink()
{
	MetadataParsedURL	result = this.databaseLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.databaseLink = result;
	}
	return result;
}

/**
	Gets the value of the field databaseLink
*/
public ParsedURL getDatabaseLink()
{
	return this.databaseLink().getValue();
}

/**
	Sets the value of the field databaseLink
*/
public void setDatabaseLink(ParsedURL databaseLink)
{
	this.databaseLink().setValue(databaseLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: databaseLink
*/
public boolean isNullDatabaseLink()
{
	return databaseLink == null || databaseLink.getValue() == null;
}

/**
	The heavy weight setter method for field databaseLink
*/
public void hwSetDatabaseLink(ParsedURL databaseLink)
{
	this.databaseLink().setValue(databaseLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the databaseLink directly.
*/
public void setDatabaseLinkMetadata(MetadataParsedURL databaseLink)
{
	this.databaseLink = databaseLink;
}

/**
	Heavy Weight Direct setter method for databaseLink
*/
public void hwSetDatabaseLinkMetadata(MetadataParsedURL databaseLink)
{
	if (this.databaseLink != null && this.databaseLink.getValue() != null && hasTermVector())
		termVector().remove(this.databaseLink.termVector());
	this.databaseLink = databaseLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for momaId
*/
public MetadataString	momaId()
{
	MetadataString	result = this.momaId;
	if (result == null)
	{
		result = new MetadataString();
		this.momaId = result;
	}
	return result;
}

/**
	Gets the value of the field momaId
*/
public String getMomaId()
{
	return this.momaId().getValue();
}

/**
	Sets the value of the field momaId
*/
public void setMomaId(String momaId)
{
	this.momaId().setValue(momaId);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: momaId
*/
public boolean isNullMomaId()
{
	return momaId == null || momaId.getValue() == null;
}

/**
	The heavy weight setter method for field momaId
*/
public void hwSetMomaId(String momaId)
{
	this.momaId().setValue(momaId);
	rebuildCompositeTermVector();
}

/**
	 Sets the momaId directly.
*/
public void setMomaIdMetadata(MetadataString momaId)
{
	this.momaId = momaId;
}

/**
	Heavy Weight Direct setter method for momaId
*/
public void hwSetMomaIdMetadata(MetadataString momaId)
{
	if (this.momaId != null && this.momaId.getValue() != null && hasTermVector())
		termVector().remove(this.momaId.termVector());
	this.momaId = momaId;
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
	Lazy evaluation for tempFieldValueHolder
*/
public TempFieldValueHolder	tempFieldValueHolder()
{
	TempFieldValueHolder	result = this.tempFieldValueHolder;
	if (result == null)
	{
		result = new TempFieldValueHolder();
		this.tempFieldValueHolder = result;
	}
	return result;
}

/**
	Get the value of field tempFieldValueHolder
*/
public TempFieldValueHolder getTempFieldValueHolder()
{
	return this.tempFieldValueHolder;
}

/**
	Set the value of field tempFieldValueHolder
*/
public void setTempFieldValueHolder(TempFieldValueHolder tempFieldValueHolder)
{
	this.tempFieldValueHolder = tempFieldValueHolder;
}


}

