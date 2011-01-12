package ecologylab.semantics.generated.library;


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
import ecologylab.semantics.metadata.builtins.ClippableMetadata;
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
	Artwork class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Artwork
extends Document
{


/**
	Set of artists.
*/
@simpl_collection("author") @xml_tag("artists") @mm_name("artists")
private ArrayList<Author>	artists;


/**
	Abstract of the work.
*/
@simpl_scalar @xml_tag("abstract")
private MetadataString	abstractField;


/**
	Medium on which the work is done.
*/
@simpl_scalar
private MetadataString	medium;


/**
	Year the work was created.
*/
@simpl_scalar
private MetadataString	year;


/**
	Website of the work or group responsible.
*/
@simpl_scalar
private MetadataParsedURL	website;



/**
	Constructor
*/
public Artwork()
{
 super();
}

/**
	Constructor
*/
public Artwork(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for artists
*/
public ArrayList<Author>	artists()
{
	ArrayList<Author>	result = this.artists;
	if (result == null)
	{
		result = new ArrayList<Author>();
		this.artists = result;
	}
	return result;
}

/**
	Get the value of field artists
*/
public ArrayList<Author> getArtists()
{
	return this.artists;
}

/**
	Set the value of field artists
*/
public void setArtists(ArrayList<Author> artists)
{
	this.artists = artists;
}

/**
	Lazy evaluation for abstractField
*/
public MetadataString	abstractField()
{
	MetadataString	result = this.abstractField;
	if (result == null)
	{
		result = new MetadataString();
		this.abstractField = result;
	}
	return result;
}

/**
	Gets the value of the field abstractField
*/
public String getAbstractField()
{
	return this.abstractField().getValue();
}

/**
	Sets the value of the field abstractField
*/
public void setAbstractField(String abstractField)
{
	this.abstractField().setValue(abstractField);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: abstractField
*/
public boolean isNullAbstractField()
{
	return abstractField == null || abstractField.getValue() == null;
}

/**
	The heavy weight setter method for field abstractField
*/
public void hwSetAbstractField(String abstractField)
{
	this.abstractField().setValue(abstractField);
	rebuildCompositeTermVector();
}

/**
	 Sets the abstractField directly.
*/
public void setAbstractFieldMetadata(MetadataString abstractField)
{
	this.abstractField = abstractField;
}

/**
	Heavy Weight Direct setter method for abstractField
*/
public void hwSetAbstractFieldMetadata(MetadataString abstractField)
{
	if (this.abstractField != null && this.abstractField.getValue() != null && hasTermVector())
		termVector().remove(this.abstractField.termVector());
	this.abstractField = abstractField;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for medium
*/
public MetadataString	medium()
{
	MetadataString	result = this.medium;
	if (result == null)
	{
		result = new MetadataString();
		this.medium = result;
	}
	return result;
}

/**
	Gets the value of the field medium
*/
public String getMedium()
{
	return this.medium().getValue();
}

/**
	Sets the value of the field medium
*/
public void setMedium(String medium)
{
	this.medium().setValue(medium);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: medium
*/
public boolean isNullMedium()
{
	return medium == null || medium.getValue() == null;
}

/**
	The heavy weight setter method for field medium
*/
public void hwSetMedium(String medium)
{
	this.medium().setValue(medium);
	rebuildCompositeTermVector();
}

/**
	 Sets the medium directly.
*/
public void setMediumMetadata(MetadataString medium)
{
	this.medium = medium;
}

/**
	Heavy Weight Direct setter method for medium
*/
public void hwSetMediumMetadata(MetadataString medium)
{
	if (this.medium != null && this.medium.getValue() != null && hasTermVector())
		termVector().remove(this.medium.termVector());
	this.medium = medium;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for year
*/
public MetadataString	year()
{
	MetadataString	result = this.year;
	if (result == null)
	{
		result = new MetadataString();
		this.year = result;
	}
	return result;
}

/**
	Gets the value of the field year
*/
public String getYear()
{
	return this.year().getValue();
}

/**
	Sets the value of the field year
*/
public void setYear(String year)
{
	this.year().setValue(year);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: year
*/
public boolean isNullYear()
{
	return year == null || year.getValue() == null;
}

/**
	The heavy weight setter method for field year
*/
public void hwSetYear(String year)
{
	this.year().setValue(year);
	rebuildCompositeTermVector();
}

/**
	 Sets the year directly.
*/
public void setYearMetadata(MetadataString year)
{
	this.year = year;
}

/**
	Heavy Weight Direct setter method for year
*/
public void hwSetYearMetadata(MetadataString year)
{
	if (this.year != null && this.year.getValue() != null && hasTermVector())
		termVector().remove(this.year.termVector());
	this.year = year;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for website
*/
public MetadataParsedURL	website()
{
	MetadataParsedURL	result = this.website;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.website = result;
	}
	return result;
}

/**
	Gets the value of the field website
*/
public ParsedURL getWebsite()
{
	return this.website().getValue();
}

/**
	Sets the value of the field website
*/
public void setWebsite(ParsedURL website)
{
	this.website().setValue(website);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: website
*/
public boolean isNullWebsite()
{
	return website == null || website.getValue() == null;
}

/**
	The heavy weight setter method for field website
*/
public void hwSetWebsite(ParsedURL website)
{
	this.website().setValue(website);
	rebuildCompositeTermVector();
}

/**
	 Sets the website directly.
*/
public void setWebsiteMetadata(MetadataParsedURL website)
{
	this.website = website;
}

/**
	Heavy Weight Direct setter method for website
*/
public void hwSetWebsiteMetadata(MetadataParsedURL website)
{
	if (this.website != null && this.website.getValue() != null && hasTermVector())
		termVector().remove(this.website.termVector());
	this.website = website;
	rebuildCompositeTermVector();
}


}

