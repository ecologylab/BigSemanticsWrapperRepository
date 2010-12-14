package ecologylab.semantics.generated.library.icdl;


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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Book
extends Metadata
{

@simpl_scalar
private MetadataInteger	id;

@simpl_scalar
private MetadataString	languages;

@simpl_scalar
private MetadataParsedURL	cover;

@simpl_scalar
private MetadataInteger	height;

@simpl_scalar
private MetadataInteger	width;

@simpl_scalar
private MetadataString	booktitle;

@simpl_scalar
private MetadataParsedURL	bookurl;



/**
	Constructor
*/
public Book()
{
 super();
}

/**
	Constructor
*/
public Book(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for id
*/
public MetadataInteger	id()
{
	MetadataInteger	result = this.id;
	if (result == null)
	{
		result = new MetadataInteger();
		this.id = result;
	}
	return result;
}

/**
	Gets the value of the field id
*/
public Integer getId()
{
	return this.id().getValue();
}

/**
	Sets the value of the field id
*/
public void setId(Integer id)
{
	this.id().setValue(id);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: id
*/
public boolean isNullId()
{
	return id == null || id.getValue() == null;
}

/**
	The heavy weight setter method for field id
*/
public void hwSetId(Integer id)
{
	this.id().setValue(id);
	rebuildCompositeTermVector();
}

/**
	 Sets the id directly.
*/
public void setIdMetadata(MetadataInteger id)
{
	this.id = id;
}

/**
	Heavy Weight Direct setter method for id
*/
public void hwSetIdMetadata(MetadataInteger id)
{
	if (this.id != null && this.id.getValue() != null && hasTermVector())
		termVector().remove(this.id.termVector());
	this.id = id;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for languages
*/
public MetadataString	languages()
{
	MetadataString	result = this.languages;
	if (result == null)
	{
		result = new MetadataString();
		this.languages = result;
	}
	return result;
}

/**
	Gets the value of the field languages
*/
public String getLanguages()
{
	return this.languages().getValue();
}

/**
	Sets the value of the field languages
*/
public void setLanguages(String languages)
{
	this.languages().setValue(languages);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: languages
*/
public boolean isNullLanguages()
{
	return languages == null || languages.getValue() == null;
}

/**
	The heavy weight setter method for field languages
*/
public void hwSetLanguages(String languages)
{
	this.languages().setValue(languages);
	rebuildCompositeTermVector();
}

/**
	 Sets the languages directly.
*/
public void setLanguagesMetadata(MetadataString languages)
{
	this.languages = languages;
}

/**
	Heavy Weight Direct setter method for languages
*/
public void hwSetLanguagesMetadata(MetadataString languages)
{
	if (this.languages != null && this.languages.getValue() != null && hasTermVector())
		termVector().remove(this.languages.termVector());
	this.languages = languages;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for cover
*/
public MetadataParsedURL	cover()
{
	MetadataParsedURL	result = this.cover;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.cover = result;
	}
	return result;
}

/**
	Gets the value of the field cover
*/
public ParsedURL getCover()
{
	return this.cover().getValue();
}

/**
	Sets the value of the field cover
*/
public void setCover(ParsedURL cover)
{
	this.cover().setValue(cover);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: cover
*/
public boolean isNullCover()
{
	return cover == null || cover.getValue() == null;
}

/**
	The heavy weight setter method for field cover
*/
public void hwSetCover(ParsedURL cover)
{
	this.cover().setValue(cover);
	rebuildCompositeTermVector();
}

/**
	 Sets the cover directly.
*/
public void setCoverMetadata(MetadataParsedURL cover)
{
	this.cover = cover;
}

/**
	Heavy Weight Direct setter method for cover
*/
public void hwSetCoverMetadata(MetadataParsedURL cover)
{
	if (this.cover != null && this.cover.getValue() != null && hasTermVector())
		termVector().remove(this.cover.termVector());
	this.cover = cover;
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

/**
	Lazy evaluation for booktitle
*/
public MetadataString	booktitle()
{
	MetadataString	result = this.booktitle;
	if (result == null)
	{
		result = new MetadataString();
		this.booktitle = result;
	}
	return result;
}

/**
	Gets the value of the field booktitle
*/
public String getBooktitle()
{
	return this.booktitle().getValue();
}

/**
	Sets the value of the field booktitle
*/
public void setBooktitle(String booktitle)
{
	this.booktitle().setValue(booktitle);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: booktitle
*/
public boolean isNullBooktitle()
{
	return booktitle == null || booktitle.getValue() == null;
}

/**
	The heavy weight setter method for field booktitle
*/
public void hwSetBooktitle(String booktitle)
{
	this.booktitle().setValue(booktitle);
	rebuildCompositeTermVector();
}

/**
	 Sets the booktitle directly.
*/
public void setBooktitleMetadata(MetadataString booktitle)
{
	this.booktitle = booktitle;
}

/**
	Heavy Weight Direct setter method for booktitle
*/
public void hwSetBooktitleMetadata(MetadataString booktitle)
{
	if (this.booktitle != null && this.booktitle.getValue() != null && hasTermVector())
		termVector().remove(this.booktitle.termVector());
	this.booktitle = booktitle;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for bookurl
*/
public MetadataParsedURL	bookurl()
{
	MetadataParsedURL	result = this.bookurl;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.bookurl = result;
	}
	return result;
}

/**
	Gets the value of the field bookurl
*/
public ParsedURL getBookurl()
{
	return this.bookurl().getValue();
}

/**
	Sets the value of the field bookurl
*/
public void setBookurl(ParsedURL bookurl)
{
	this.bookurl().setValue(bookurl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: bookurl
*/
public boolean isNullBookurl()
{
	return bookurl == null || bookurl.getValue() == null;
}

/**
	The heavy weight setter method for field bookurl
*/
public void hwSetBookurl(ParsedURL bookurl)
{
	this.bookurl().setValue(bookurl);
	rebuildCompositeTermVector();
}

/**
	 Sets the bookurl directly.
*/
public void setBookurlMetadata(MetadataParsedURL bookurl)
{
	this.bookurl = bookurl;
}

/**
	Heavy Weight Direct setter method for bookurl
*/
public void hwSetBookurlMetadata(MetadataParsedURL bookurl)
{
	if (this.bookurl != null && this.bookurl.getValue() != null && hasTermVector())
		termVector().remove(this.bookurl.termVector());
	this.bookurl = bookurl;
	rebuildCompositeTermVector();
}


}

