package ecologylab.semantics.generated.library.imdb;


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
	Metadata for storing details of birth (date and place) of people

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class BirthDetail
extends Document
{

@simpl_scalar
private MetadataString	dayOfBirth;

@simpl_scalar
private MetadataString	yearOfBirth;

@simpl_scalar
private MetadataString	placeOfBirth;

@simpl_scalar
private MetadataParsedURL	dayOfBirthLink;

@simpl_scalar
private MetadataParsedURL	yearOfBirthLink;

@simpl_scalar
private MetadataParsedURL	placeOfBirthLink;



/**
	Constructor
*/
public BirthDetail()
{
 super();
}

/**
	Constructor
*/
public BirthDetail(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for dayOfBirth
*/
public MetadataString	dayOfBirth()
{
	MetadataString	result = this.dayOfBirth;
	if (result == null)
	{
		result = new MetadataString();
		this.dayOfBirth = result;
	}
	return result;
}

/**
	Gets the value of the field dayOfBirth
*/
public String getDayOfBirth()
{
	return this.dayOfBirth().getValue();
}

/**
	Sets the value of the field dayOfBirth
*/
public void setDayOfBirth(String dayOfBirth)
{
	this.dayOfBirth().setValue(dayOfBirth);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dayOfBirth
*/
public boolean isNullDayOfBirth()
{
	return dayOfBirth == null || dayOfBirth.getValue() == null;
}

/**
	The heavy weight setter method for field dayOfBirth
*/
public void hwSetDayOfBirth(String dayOfBirth)
{
	this.dayOfBirth().setValue(dayOfBirth);
	rebuildCompositeTermVector();
}

/**
	 Sets the dayOfBirth directly.
*/
public void setDayOfBirthMetadata(MetadataString dayOfBirth)
{
	this.dayOfBirth = dayOfBirth;
}

/**
	Heavy Weight Direct setter method for dayOfBirth
*/
public void hwSetDayOfBirthMetadata(MetadataString dayOfBirth)
{
	if (this.dayOfBirth != null && this.dayOfBirth.getValue() != null && hasTermVector())
		termVector().remove(this.dayOfBirth.termVector());
	this.dayOfBirth = dayOfBirth;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for yearOfBirth
*/
public MetadataString	yearOfBirth()
{
	MetadataString	result = this.yearOfBirth;
	if (result == null)
	{
		result = new MetadataString();
		this.yearOfBirth = result;
	}
	return result;
}

/**
	Gets the value of the field yearOfBirth
*/
public String getYearOfBirth()
{
	return this.yearOfBirth().getValue();
}

/**
	Sets the value of the field yearOfBirth
*/
public void setYearOfBirth(String yearOfBirth)
{
	this.yearOfBirth().setValue(yearOfBirth);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: yearOfBirth
*/
public boolean isNullYearOfBirth()
{
	return yearOfBirth == null || yearOfBirth.getValue() == null;
}

/**
	The heavy weight setter method for field yearOfBirth
*/
public void hwSetYearOfBirth(String yearOfBirth)
{
	this.yearOfBirth().setValue(yearOfBirth);
	rebuildCompositeTermVector();
}

/**
	 Sets the yearOfBirth directly.
*/
public void setYearOfBirthMetadata(MetadataString yearOfBirth)
{
	this.yearOfBirth = yearOfBirth;
}

/**
	Heavy Weight Direct setter method for yearOfBirth
*/
public void hwSetYearOfBirthMetadata(MetadataString yearOfBirth)
{
	if (this.yearOfBirth != null && this.yearOfBirth.getValue() != null && hasTermVector())
		termVector().remove(this.yearOfBirth.termVector());
	this.yearOfBirth = yearOfBirth;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for placeOfBirth
*/
public MetadataString	placeOfBirth()
{
	MetadataString	result = this.placeOfBirth;
	if (result == null)
	{
		result = new MetadataString();
		this.placeOfBirth = result;
	}
	return result;
}

/**
	Gets the value of the field placeOfBirth
*/
public String getPlaceOfBirth()
{
	return this.placeOfBirth().getValue();
}

/**
	Sets the value of the field placeOfBirth
*/
public void setPlaceOfBirth(String placeOfBirth)
{
	this.placeOfBirth().setValue(placeOfBirth);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: placeOfBirth
*/
public boolean isNullPlaceOfBirth()
{
	return placeOfBirth == null || placeOfBirth.getValue() == null;
}

/**
	The heavy weight setter method for field placeOfBirth
*/
public void hwSetPlaceOfBirth(String placeOfBirth)
{
	this.placeOfBirth().setValue(placeOfBirth);
	rebuildCompositeTermVector();
}

/**
	 Sets the placeOfBirth directly.
*/
public void setPlaceOfBirthMetadata(MetadataString placeOfBirth)
{
	this.placeOfBirth = placeOfBirth;
}

/**
	Heavy Weight Direct setter method for placeOfBirth
*/
public void hwSetPlaceOfBirthMetadata(MetadataString placeOfBirth)
{
	if (this.placeOfBirth != null && this.placeOfBirth.getValue() != null && hasTermVector())
		termVector().remove(this.placeOfBirth.termVector());
	this.placeOfBirth = placeOfBirth;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for dayOfBirthLink
*/
public MetadataParsedURL	dayOfBirthLink()
{
	MetadataParsedURL	result = this.dayOfBirthLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.dayOfBirthLink = result;
	}
	return result;
}

/**
	Gets the value of the field dayOfBirthLink
*/
public ParsedURL getDayOfBirthLink()
{
	return this.dayOfBirthLink().getValue();
}

/**
	Sets the value of the field dayOfBirthLink
*/
public void setDayOfBirthLink(ParsedURL dayOfBirthLink)
{
	this.dayOfBirthLink().setValue(dayOfBirthLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dayOfBirthLink
*/
public boolean isNullDayOfBirthLink()
{
	return dayOfBirthLink == null || dayOfBirthLink.getValue() == null;
}

/**
	The heavy weight setter method for field dayOfBirthLink
*/
public void hwSetDayOfBirthLink(ParsedURL dayOfBirthLink)
{
	this.dayOfBirthLink().setValue(dayOfBirthLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the dayOfBirthLink directly.
*/
public void setDayOfBirthLinkMetadata(MetadataParsedURL dayOfBirthLink)
{
	this.dayOfBirthLink = dayOfBirthLink;
}

/**
	Heavy Weight Direct setter method for dayOfBirthLink
*/
public void hwSetDayOfBirthLinkMetadata(MetadataParsedURL dayOfBirthLink)
{
	if (this.dayOfBirthLink != null && this.dayOfBirthLink.getValue() != null && hasTermVector())
		termVector().remove(this.dayOfBirthLink.termVector());
	this.dayOfBirthLink = dayOfBirthLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for yearOfBirthLink
*/
public MetadataParsedURL	yearOfBirthLink()
{
	MetadataParsedURL	result = this.yearOfBirthLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.yearOfBirthLink = result;
	}
	return result;
}

/**
	Gets the value of the field yearOfBirthLink
*/
public ParsedURL getYearOfBirthLink()
{
	return this.yearOfBirthLink().getValue();
}

/**
	Sets the value of the field yearOfBirthLink
*/
public void setYearOfBirthLink(ParsedURL yearOfBirthLink)
{
	this.yearOfBirthLink().setValue(yearOfBirthLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: yearOfBirthLink
*/
public boolean isNullYearOfBirthLink()
{
	return yearOfBirthLink == null || yearOfBirthLink.getValue() == null;
}

/**
	The heavy weight setter method for field yearOfBirthLink
*/
public void hwSetYearOfBirthLink(ParsedURL yearOfBirthLink)
{
	this.yearOfBirthLink().setValue(yearOfBirthLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the yearOfBirthLink directly.
*/
public void setYearOfBirthLinkMetadata(MetadataParsedURL yearOfBirthLink)
{
	this.yearOfBirthLink = yearOfBirthLink;
}

/**
	Heavy Weight Direct setter method for yearOfBirthLink
*/
public void hwSetYearOfBirthLinkMetadata(MetadataParsedURL yearOfBirthLink)
{
	if (this.yearOfBirthLink != null && this.yearOfBirthLink.getValue() != null && hasTermVector())
		termVector().remove(this.yearOfBirthLink.termVector());
	this.yearOfBirthLink = yearOfBirthLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for placeOfBirthLink
*/
public MetadataParsedURL	placeOfBirthLink()
{
	MetadataParsedURL	result = this.placeOfBirthLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.placeOfBirthLink = result;
	}
	return result;
}

/**
	Gets the value of the field placeOfBirthLink
*/
public ParsedURL getPlaceOfBirthLink()
{
	return this.placeOfBirthLink().getValue();
}

/**
	Sets the value of the field placeOfBirthLink
*/
public void setPlaceOfBirthLink(ParsedURL placeOfBirthLink)
{
	this.placeOfBirthLink().setValue(placeOfBirthLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: placeOfBirthLink
*/
public boolean isNullPlaceOfBirthLink()
{
	return placeOfBirthLink == null || placeOfBirthLink.getValue() == null;
}

/**
	The heavy weight setter method for field placeOfBirthLink
*/
public void hwSetPlaceOfBirthLink(ParsedURL placeOfBirthLink)
{
	this.placeOfBirthLink().setValue(placeOfBirthLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the placeOfBirthLink directly.
*/
public void setPlaceOfBirthLinkMetadata(MetadataParsedURL placeOfBirthLink)
{
	this.placeOfBirthLink = placeOfBirthLink;
}

/**
	Heavy Weight Direct setter method for placeOfBirthLink
*/
public void hwSetPlaceOfBirthLinkMetadata(MetadataParsedURL placeOfBirthLink)
{
	if (this.placeOfBirthLink != null && this.placeOfBirthLink.getValue() != null && hasTermVector())
		termVector().remove(this.placeOfBirthLink.termVector());
	this.placeOfBirthLink = placeOfBirthLink;
	rebuildCompositeTermVector();
}


}

