package ecologylab.semantics.generated.library.search;


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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class YahooResult
extends Document
{

@simpl_scalar @xml_tag("Title")
private MetadataString	title;

@simpl_scalar @xml_tag("Summary")
private MetadataString	summary;

@simpl_scalar @xml_tag("Url")
private MetadataParsedURL	location;

@simpl_scalar @xml_tag("RefererUrl")
private MetadataParsedURL	refererUrl;

@simpl_scalar @xml_tag("ModificationDate")
private MetadataString	modificationDate;

@simpl_scalar @xml_tag("MimeType")
private MetadataString	mimeType;

@simpl_composite @xml_tag("Thumbnail") @mm_name("thumbnail")
private YahooThumbnail	thumbnail;



/**
	Constructor
*/
public YahooResult()
{
 super();
}

/**
	Constructor
*/
public YahooResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for title
*/
public MetadataString	title()
{
	MetadataString	result = this.title;
	if (result == null)
	{
		result = new MetadataString();
		this.title = result;
	}
	return result;
}

/**
	Gets the value of the field title
*/
public String getTitle()
{
	return this.title().getValue();
}

/**
	Sets the value of the field title
*/
public void setTitle(String title)
{
	this.title().setValue(title);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: title
*/
public boolean isNullTitle()
{
	return title == null || title.getValue() == null;
}

/**
	The heavy weight setter method for field title
*/
public void hwSetTitle(String title)
{
	this.title().setValue(title);
	rebuildCompositeTermVector();
}

/**
	 Sets the title directly.
*/
public void setTitleMetadata(MetadataString title)
{
	this.title = title;
}

/**
	Heavy Weight Direct setter method for title
*/
public void hwSetTitleMetadata(MetadataString title)
{
	if (this.title != null && this.title.getValue() != null && hasTermVector())
		termVector().remove(this.title.termVector());
	this.title = title;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for summary
*/
public MetadataString	summary()
{
	MetadataString	result = this.summary;
	if (result == null)
	{
		result = new MetadataString();
		this.summary = result;
	}
	return result;
}

/**
	Gets the value of the field summary
*/
public String getSummary()
{
	return this.summary().getValue();
}

/**
	Sets the value of the field summary
*/
public void setSummary(String summary)
{
	this.summary().setValue(summary);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: summary
*/
public boolean isNullSummary()
{
	return summary == null || summary.getValue() == null;
}

/**
	The heavy weight setter method for field summary
*/
public void hwSetSummary(String summary)
{
	this.summary().setValue(summary);
	rebuildCompositeTermVector();
}

/**
	 Sets the summary directly.
*/
public void setSummaryMetadata(MetadataString summary)
{
	this.summary = summary;
}

/**
	Heavy Weight Direct setter method for summary
*/
public void hwSetSummaryMetadata(MetadataString summary)
{
	if (this.summary != null && this.summary.getValue() != null && hasTermVector())
		termVector().remove(this.summary.termVector());
	this.summary = summary;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for location
*/
public MetadataParsedURL	location()
{
	MetadataParsedURL	result = this.location;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.location = result;
	}
	return result;
}

/**
	Gets the value of the field location
*/
public ParsedURL getLocation()
{
	return this.location().getValue();
}

/**
	Sets the value of the field location
*/
public void setLocation(ParsedURL location)
{
	this.location().setValue(location);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: location
*/
public boolean isNullLocation()
{
	return location == null || location.getValue() == null;
}

/**
	The heavy weight setter method for field location
*/
public void hwSetLocation(ParsedURL location)
{
	this.location().setValue(location);
	rebuildCompositeTermVector();
}

/**
	 Sets the location directly.
*/
public void setLocationMetadata(MetadataParsedURL location)
{
	this.location = location;
}

/**
	Heavy Weight Direct setter method for location
*/
public void hwSetLocationMetadata(MetadataParsedURL location)
{
	if (this.location != null && this.location.getValue() != null && hasTermVector())
		termVector().remove(this.location.termVector());
	this.location = location;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for refererUrl
*/
public MetadataParsedURL	refererUrl()
{
	MetadataParsedURL	result = this.refererUrl;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.refererUrl = result;
	}
	return result;
}

/**
	Gets the value of the field refererUrl
*/
public ParsedURL getRefererUrl()
{
	return this.refererUrl().getValue();
}

/**
	Sets the value of the field refererUrl
*/
public void setRefererUrl(ParsedURL refererUrl)
{
	this.refererUrl().setValue(refererUrl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: refererUrl
*/
public boolean isNullRefererUrl()
{
	return refererUrl == null || refererUrl.getValue() == null;
}

/**
	The heavy weight setter method for field refererUrl
*/
public void hwSetRefererUrl(ParsedURL refererUrl)
{
	this.refererUrl().setValue(refererUrl);
	rebuildCompositeTermVector();
}

/**
	 Sets the refererUrl directly.
*/
public void setRefererUrlMetadata(MetadataParsedURL refererUrl)
{
	this.refererUrl = refererUrl;
}

/**
	Heavy Weight Direct setter method for refererUrl
*/
public void hwSetRefererUrlMetadata(MetadataParsedURL refererUrl)
{
	if (this.refererUrl != null && this.refererUrl.getValue() != null && hasTermVector())
		termVector().remove(this.refererUrl.termVector());
	this.refererUrl = refererUrl;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for modificationDate
*/
public MetadataString	modificationDate()
{
	MetadataString	result = this.modificationDate;
	if (result == null)
	{
		result = new MetadataString();
		this.modificationDate = result;
	}
	return result;
}

/**
	Gets the value of the field modificationDate
*/
public String getModificationDate()
{
	return this.modificationDate().getValue();
}

/**
	Sets the value of the field modificationDate
*/
public void setModificationDate(String modificationDate)
{
	this.modificationDate().setValue(modificationDate);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: modificationDate
*/
public boolean isNullModificationDate()
{
	return modificationDate == null || modificationDate.getValue() == null;
}

/**
	The heavy weight setter method for field modificationDate
*/
public void hwSetModificationDate(String modificationDate)
{
	this.modificationDate().setValue(modificationDate);
	rebuildCompositeTermVector();
}

/**
	 Sets the modificationDate directly.
*/
public void setModificationDateMetadata(MetadataString modificationDate)
{
	this.modificationDate = modificationDate;
}

/**
	Heavy Weight Direct setter method for modificationDate
*/
public void hwSetModificationDateMetadata(MetadataString modificationDate)
{
	if (this.modificationDate != null && this.modificationDate.getValue() != null && hasTermVector())
		termVector().remove(this.modificationDate.termVector());
	this.modificationDate = modificationDate;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for mimeType
*/
public MetadataString	mimeType()
{
	MetadataString	result = this.mimeType;
	if (result == null)
	{
		result = new MetadataString();
		this.mimeType = result;
	}
	return result;
}

/**
	Gets the value of the field mimeType
*/
public String getMimeType()
{
	return this.mimeType().getValue();
}

/**
	Sets the value of the field mimeType
*/
public void setMimeType(String mimeType)
{
	this.mimeType().setValue(mimeType);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: mimeType
*/
public boolean isNullMimeType()
{
	return mimeType == null || mimeType.getValue() == null;
}

/**
	The heavy weight setter method for field mimeType
*/
public void hwSetMimeType(String mimeType)
{
	this.mimeType().setValue(mimeType);
	rebuildCompositeTermVector();
}

/**
	 Sets the mimeType directly.
*/
public void setMimeTypeMetadata(MetadataString mimeType)
{
	this.mimeType = mimeType;
}

/**
	Heavy Weight Direct setter method for mimeType
*/
public void hwSetMimeTypeMetadata(MetadataString mimeType)
{
	if (this.mimeType != null && this.mimeType.getValue() != null && hasTermVector())
		termVector().remove(this.mimeType.termVector());
	this.mimeType = mimeType;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for thumbnail
*/
public YahooThumbnail	thumbnail()
{
	YahooThumbnail	result = this.thumbnail;
	if (result == null)
	{
		result = new YahooThumbnail();
		this.thumbnail = result;
	}
	return result;
}

/**
	Get the value of field thumbnail
*/
public YahooThumbnail getThumbnail()
{
	return this.thumbnail;
}

/**
	Set the value of field thumbnail
*/
public void setThumbnail(YahooThumbnail thumbnail)
{
	this.thumbnail = thumbnail;
}


}

