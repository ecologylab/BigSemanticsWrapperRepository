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
	ICDL About This Book Page

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class IcdlBookPreview
extends Document
{

@simpl_composite @mm_name("author")
private Author	author;

@simpl_composite @mm_name("illustrator")
private Author	illustrator;

@simpl_scalar
private MetadataString	summary;

@simpl_scalar
private MetadataString	year;

@simpl_scalar
private MetadataString	languages;

@simpl_scalar
private MetadataString	publisher;

@simpl_scalar
private MetadataString	isbn;

@simpl_scalar
private MetadataString	awards;



/**
	Constructor
*/
public IcdlBookPreview()
{
 super();
}

/**
	Constructor
*/
public IcdlBookPreview(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for author
*/
public Author	author()
{
	Author	result = this.author;
	if (result == null)
	{
		result = new Author();
		this.author = result;
	}
	return result;
}

/**
	Get the value of field author
*/
public Author getAuthor()
{
	return this.author;
}

/**
	Set the value of field author
*/
public void setAuthor(Author author)
{
	this.author = author;
}

/**
	Lazy evaluation for illustrator
*/
public Author	illustrator()
{
	Author	result = this.illustrator;
	if (result == null)
	{
		result = new Author();
		this.illustrator = result;
	}
	return result;
}

/**
	Get the value of field illustrator
*/
public Author getIllustrator()
{
	return this.illustrator;
}

/**
	Set the value of field illustrator
*/
public void setIllustrator(Author illustrator)
{
	this.illustrator = illustrator;
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
	Lazy evaluation for publisher
*/
public MetadataString	publisher()
{
	MetadataString	result = this.publisher;
	if (result == null)
	{
		result = new MetadataString();
		this.publisher = result;
	}
	return result;
}

/**
	Gets the value of the field publisher
*/
public String getPublisher()
{
	return this.publisher().getValue();
}

/**
	Sets the value of the field publisher
*/
public void setPublisher(String publisher)
{
	this.publisher().setValue(publisher);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: publisher
*/
public boolean isNullPublisher()
{
	return publisher == null || publisher.getValue() == null;
}

/**
	The heavy weight setter method for field publisher
*/
public void hwSetPublisher(String publisher)
{
	this.publisher().setValue(publisher);
	rebuildCompositeTermVector();
}

/**
	 Sets the publisher directly.
*/
public void setPublisherMetadata(MetadataString publisher)
{
	this.publisher = publisher;
}

/**
	Heavy Weight Direct setter method for publisher
*/
public void hwSetPublisherMetadata(MetadataString publisher)
{
	if (this.publisher != null && this.publisher.getValue() != null && hasTermVector())
		termVector().remove(this.publisher.termVector());
	this.publisher = publisher;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for isbn
*/
public MetadataString	isbn()
{
	MetadataString	result = this.isbn;
	if (result == null)
	{
		result = new MetadataString();
		this.isbn = result;
	}
	return result;
}

/**
	Gets the value of the field isbn
*/
public String getIsbn()
{
	return this.isbn().getValue();
}

/**
	Sets the value of the field isbn
*/
public void setIsbn(String isbn)
{
	this.isbn().setValue(isbn);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: isbn
*/
public boolean isNullIsbn()
{
	return isbn == null || isbn.getValue() == null;
}

/**
	The heavy weight setter method for field isbn
*/
public void hwSetIsbn(String isbn)
{
	this.isbn().setValue(isbn);
	rebuildCompositeTermVector();
}

/**
	 Sets the isbn directly.
*/
public void setIsbnMetadata(MetadataString isbn)
{
	this.isbn = isbn;
}

/**
	Heavy Weight Direct setter method for isbn
*/
public void hwSetIsbnMetadata(MetadataString isbn)
{
	if (this.isbn != null && this.isbn.getValue() != null && hasTermVector())
		termVector().remove(this.isbn.termVector());
	this.isbn = isbn;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for awards
*/
public MetadataString	awards()
{
	MetadataString	result = this.awards;
	if (result == null)
	{
		result = new MetadataString();
		this.awards = result;
	}
	return result;
}

/**
	Gets the value of the field awards
*/
public String getAwards()
{
	return this.awards().getValue();
}

/**
	Sets the value of the field awards
*/
public void setAwards(String awards)
{
	this.awards().setValue(awards);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: awards
*/
public boolean isNullAwards()
{
	return awards == null || awards.getValue() == null;
}

/**
	The heavy weight setter method for field awards
*/
public void hwSetAwards(String awards)
{
	this.awards().setValue(awards);
	rebuildCompositeTermVector();
}

/**
	 Sets the awards directly.
*/
public void setAwardsMetadata(MetadataString awards)
{
	this.awards = awards;
}

/**
	Heavy Weight Direct setter method for awards
*/
public void hwSetAwardsMetadata(MetadataString awards)
{
	if (this.awards != null && this.awards.getValue() != null && hasTermVector())
		termVector().remove(this.awards.termVector());
	this.awards = awards;
	rebuildCompositeTermVector();
}


}

