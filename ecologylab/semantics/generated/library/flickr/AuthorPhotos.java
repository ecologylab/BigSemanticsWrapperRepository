package ecologylab.semantics.generated.library.flickr;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
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
public class AuthorPhotos
extends Metadata
{

@simpl_scalar
private MetadataParsedURL	authorPhotostreamLink;

@simpl_scalar
private MetadataString	authorPhotostream;

@simpl_scalar
private MetadataParsedURL	photosThatDayLink;

@simpl_scalar
private MetadataParsedURL	photosThatMonthLink;

@simpl_scalar
private MetadataParsedURL	photosThatYearLink;

@simpl_scalar
private MetadataString	photosThatDay;

@simpl_scalar
private MetadataString	photosThatMonth;

@simpl_scalar
private MetadataString	photosThatYear;



/**
	Constructor
*/
public AuthorPhotos()
{
 super();
}

/**
	Constructor
*/
public AuthorPhotos(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for authorPhotostreamLink
*/
public MetadataParsedURL	authorPhotostreamLink()
{
	MetadataParsedURL	result = this.authorPhotostreamLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.authorPhotostreamLink = result;
	}
	return result;
}

/**
	Gets the value of the field authorPhotostreamLink
*/
public ParsedURL getAuthorPhotostreamLink()
{
	return this.authorPhotostreamLink().getValue();
}

/**
	Sets the value of the field authorPhotostreamLink
*/
public void setAuthorPhotostreamLink(ParsedURL authorPhotostreamLink)
{
	this.authorPhotostreamLink().setValue(authorPhotostreamLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: authorPhotostreamLink
*/
public boolean isNullAuthorPhotostreamLink()
{
	return authorPhotostreamLink == null || authorPhotostreamLink.getValue() == null;
}

/**
	The heavy weight setter method for field authorPhotostreamLink
*/
public void hwSetAuthorPhotostreamLink(ParsedURL authorPhotostreamLink)
{
	this.authorPhotostreamLink().setValue(authorPhotostreamLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the authorPhotostreamLink directly.
*/
public void setAuthorPhotostreamLinkMetadata(MetadataParsedURL authorPhotostreamLink)
{
	this.authorPhotostreamLink = authorPhotostreamLink;
}

/**
	Heavy Weight Direct setter method for authorPhotostreamLink
*/
public void hwSetAuthorPhotostreamLinkMetadata(MetadataParsedURL authorPhotostreamLink)
{
	if (this.authorPhotostreamLink != null && this.authorPhotostreamLink.getValue() != null && hasTermVector())
		termVector().remove(this.authorPhotostreamLink.termVector());
	this.authorPhotostreamLink = authorPhotostreamLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for authorPhotostream
*/
public MetadataString	authorPhotostream()
{
	MetadataString	result = this.authorPhotostream;
	if (result == null)
	{
		result = new MetadataString();
		this.authorPhotostream = result;
	}
	return result;
}

/**
	Gets the value of the field authorPhotostream
*/
public String getAuthorPhotostream()
{
	return this.authorPhotostream().getValue();
}

/**
	Sets the value of the field authorPhotostream
*/
public void setAuthorPhotostream(String authorPhotostream)
{
	this.authorPhotostream().setValue(authorPhotostream);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: authorPhotostream
*/
public boolean isNullAuthorPhotostream()
{
	return authorPhotostream == null || authorPhotostream.getValue() == null;
}

/**
	The heavy weight setter method for field authorPhotostream
*/
public void hwSetAuthorPhotostream(String authorPhotostream)
{
	this.authorPhotostream().setValue(authorPhotostream);
	rebuildCompositeTermVector();
}

/**
	 Sets the authorPhotostream directly.
*/
public void setAuthorPhotostreamMetadata(MetadataString authorPhotostream)
{
	this.authorPhotostream = authorPhotostream;
}

/**
	Heavy Weight Direct setter method for authorPhotostream
*/
public void hwSetAuthorPhotostreamMetadata(MetadataString authorPhotostream)
{
	if (this.authorPhotostream != null && this.authorPhotostream.getValue() != null && hasTermVector())
		termVector().remove(this.authorPhotostream.termVector());
	this.authorPhotostream = authorPhotostream;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for photosThatDayLink
*/
public MetadataParsedURL	photosThatDayLink()
{
	MetadataParsedURL	result = this.photosThatDayLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.photosThatDayLink = result;
	}
	return result;
}

/**
	Gets the value of the field photosThatDayLink
*/
public ParsedURL getPhotosThatDayLink()
{
	return this.photosThatDayLink().getValue();
}

/**
	Sets the value of the field photosThatDayLink
*/
public void setPhotosThatDayLink(ParsedURL photosThatDayLink)
{
	this.photosThatDayLink().setValue(photosThatDayLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: photosThatDayLink
*/
public boolean isNullPhotosThatDayLink()
{
	return photosThatDayLink == null || photosThatDayLink.getValue() == null;
}

/**
	The heavy weight setter method for field photosThatDayLink
*/
public void hwSetPhotosThatDayLink(ParsedURL photosThatDayLink)
{
	this.photosThatDayLink().setValue(photosThatDayLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the photosThatDayLink directly.
*/
public void setPhotosThatDayLinkMetadata(MetadataParsedURL photosThatDayLink)
{
	this.photosThatDayLink = photosThatDayLink;
}

/**
	Heavy Weight Direct setter method for photosThatDayLink
*/
public void hwSetPhotosThatDayLinkMetadata(MetadataParsedURL photosThatDayLink)
{
	if (this.photosThatDayLink != null && this.photosThatDayLink.getValue() != null && hasTermVector())
		termVector().remove(this.photosThatDayLink.termVector());
	this.photosThatDayLink = photosThatDayLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for photosThatMonthLink
*/
public MetadataParsedURL	photosThatMonthLink()
{
	MetadataParsedURL	result = this.photosThatMonthLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.photosThatMonthLink = result;
	}
	return result;
}

/**
	Gets the value of the field photosThatMonthLink
*/
public ParsedURL getPhotosThatMonthLink()
{
	return this.photosThatMonthLink().getValue();
}

/**
	Sets the value of the field photosThatMonthLink
*/
public void setPhotosThatMonthLink(ParsedURL photosThatMonthLink)
{
	this.photosThatMonthLink().setValue(photosThatMonthLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: photosThatMonthLink
*/
public boolean isNullPhotosThatMonthLink()
{
	return photosThatMonthLink == null || photosThatMonthLink.getValue() == null;
}

/**
	The heavy weight setter method for field photosThatMonthLink
*/
public void hwSetPhotosThatMonthLink(ParsedURL photosThatMonthLink)
{
	this.photosThatMonthLink().setValue(photosThatMonthLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the photosThatMonthLink directly.
*/
public void setPhotosThatMonthLinkMetadata(MetadataParsedURL photosThatMonthLink)
{
	this.photosThatMonthLink = photosThatMonthLink;
}

/**
	Heavy Weight Direct setter method for photosThatMonthLink
*/
public void hwSetPhotosThatMonthLinkMetadata(MetadataParsedURL photosThatMonthLink)
{
	if (this.photosThatMonthLink != null && this.photosThatMonthLink.getValue() != null && hasTermVector())
		termVector().remove(this.photosThatMonthLink.termVector());
	this.photosThatMonthLink = photosThatMonthLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for photosThatYearLink
*/
public MetadataParsedURL	photosThatYearLink()
{
	MetadataParsedURL	result = this.photosThatYearLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.photosThatYearLink = result;
	}
	return result;
}

/**
	Gets the value of the field photosThatYearLink
*/
public ParsedURL getPhotosThatYearLink()
{
	return this.photosThatYearLink().getValue();
}

/**
	Sets the value of the field photosThatYearLink
*/
public void setPhotosThatYearLink(ParsedURL photosThatYearLink)
{
	this.photosThatYearLink().setValue(photosThatYearLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: photosThatYearLink
*/
public boolean isNullPhotosThatYearLink()
{
	return photosThatYearLink == null || photosThatYearLink.getValue() == null;
}

/**
	The heavy weight setter method for field photosThatYearLink
*/
public void hwSetPhotosThatYearLink(ParsedURL photosThatYearLink)
{
	this.photosThatYearLink().setValue(photosThatYearLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the photosThatYearLink directly.
*/
public void setPhotosThatYearLinkMetadata(MetadataParsedURL photosThatYearLink)
{
	this.photosThatYearLink = photosThatYearLink;
}

/**
	Heavy Weight Direct setter method for photosThatYearLink
*/
public void hwSetPhotosThatYearLinkMetadata(MetadataParsedURL photosThatYearLink)
{
	if (this.photosThatYearLink != null && this.photosThatYearLink.getValue() != null && hasTermVector())
		termVector().remove(this.photosThatYearLink.termVector());
	this.photosThatYearLink = photosThatYearLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for photosThatDay
*/
public MetadataString	photosThatDay()
{
	MetadataString	result = this.photosThatDay;
	if (result == null)
	{
		result = new MetadataString();
		this.photosThatDay = result;
	}
	return result;
}

/**
	Gets the value of the field photosThatDay
*/
public String getPhotosThatDay()
{
	return this.photosThatDay().getValue();
}

/**
	Sets the value of the field photosThatDay
*/
public void setPhotosThatDay(String photosThatDay)
{
	this.photosThatDay().setValue(photosThatDay);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: photosThatDay
*/
public boolean isNullPhotosThatDay()
{
	return photosThatDay == null || photosThatDay.getValue() == null;
}

/**
	The heavy weight setter method for field photosThatDay
*/
public void hwSetPhotosThatDay(String photosThatDay)
{
	this.photosThatDay().setValue(photosThatDay);
	rebuildCompositeTermVector();
}

/**
	 Sets the photosThatDay directly.
*/
public void setPhotosThatDayMetadata(MetadataString photosThatDay)
{
	this.photosThatDay = photosThatDay;
}

/**
	Heavy Weight Direct setter method for photosThatDay
*/
public void hwSetPhotosThatDayMetadata(MetadataString photosThatDay)
{
	if (this.photosThatDay != null && this.photosThatDay.getValue() != null && hasTermVector())
		termVector().remove(this.photosThatDay.termVector());
	this.photosThatDay = photosThatDay;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for photosThatMonth
*/
public MetadataString	photosThatMonth()
{
	MetadataString	result = this.photosThatMonth;
	if (result == null)
	{
		result = new MetadataString();
		this.photosThatMonth = result;
	}
	return result;
}

/**
	Gets the value of the field photosThatMonth
*/
public String getPhotosThatMonth()
{
	return this.photosThatMonth().getValue();
}

/**
	Sets the value of the field photosThatMonth
*/
public void setPhotosThatMonth(String photosThatMonth)
{
	this.photosThatMonth().setValue(photosThatMonth);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: photosThatMonth
*/
public boolean isNullPhotosThatMonth()
{
	return photosThatMonth == null || photosThatMonth.getValue() == null;
}

/**
	The heavy weight setter method for field photosThatMonth
*/
public void hwSetPhotosThatMonth(String photosThatMonth)
{
	this.photosThatMonth().setValue(photosThatMonth);
	rebuildCompositeTermVector();
}

/**
	 Sets the photosThatMonth directly.
*/
public void setPhotosThatMonthMetadata(MetadataString photosThatMonth)
{
	this.photosThatMonth = photosThatMonth;
}

/**
	Heavy Weight Direct setter method for photosThatMonth
*/
public void hwSetPhotosThatMonthMetadata(MetadataString photosThatMonth)
{
	if (this.photosThatMonth != null && this.photosThatMonth.getValue() != null && hasTermVector())
		termVector().remove(this.photosThatMonth.termVector());
	this.photosThatMonth = photosThatMonth;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for photosThatYear
*/
public MetadataString	photosThatYear()
{
	MetadataString	result = this.photosThatYear;
	if (result == null)
	{
		result = new MetadataString();
		this.photosThatYear = result;
	}
	return result;
}

/**
	Gets the value of the field photosThatYear
*/
public String getPhotosThatYear()
{
	return this.photosThatYear().getValue();
}

/**
	Sets the value of the field photosThatYear
*/
public void setPhotosThatYear(String photosThatYear)
{
	this.photosThatYear().setValue(photosThatYear);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: photosThatYear
*/
public boolean isNullPhotosThatYear()
{
	return photosThatYear == null || photosThatYear.getValue() == null;
}

/**
	The heavy weight setter method for field photosThatYear
*/
public void hwSetPhotosThatYear(String photosThatYear)
{
	this.photosThatYear().setValue(photosThatYear);
	rebuildCompositeTermVector();
}

/**
	 Sets the photosThatYear directly.
*/
public void setPhotosThatYearMetadata(MetadataString photosThatYear)
{
	this.photosThatYear = photosThatYear;
}

/**
	Heavy Weight Direct setter method for photosThatYear
*/
public void hwSetPhotosThatYearMetadata(MetadataString photosThatYear)
{
	if (this.photosThatYear != null && this.photosThatYear.getValue() != null && hasTermVector())
		termVector().remove(this.photosThatYear.termVector());
	this.photosThatYear = photosThatYear;
	rebuildCompositeTermVector();
}


}

