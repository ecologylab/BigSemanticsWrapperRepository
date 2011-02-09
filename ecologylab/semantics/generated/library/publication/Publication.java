package ecologylab.semantics.generated.library.publication;


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
	A publication.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Publication
extends Document
{

@simpl_scalar
private MetadataString	title;

@simpl_collection("author") @xml_tag("authors") @mm_name("authors")
private ArrayList<Author>	authors;

@simpl_scalar
private MetadataString	publisher;

@simpl_scalar
private MetadataString	pages;

@simpl_scalar
private MetadataString	isbn;

@simpl_scalar
private MetadataInteger	year;

@simpl_collection("subject") @xml_tag("subjects") @mm_name("subjects")
private ArrayList<Subject>	subjects;

@simpl_scalar
private MetadataString	aboutTheAuthors;

@simpl_collection("term") @xml_tag("common_terms") @mm_name("common_terms")
private ArrayList<Term>	commonTerms;



/**
	Constructor
*/
public Publication()
{
 super();
}

/**
	Constructor
*/
public Publication(MetaMetadataCompositeField metaMetadata)
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
	Lazy evaluation for authors
*/
public ArrayList<Author>	authors()
{
	ArrayList<Author>	result = this.authors;
	if (result == null)
	{
		result = new ArrayList<Author>();
		this.authors = result;
	}
	return result;
}

/**
	Get the value of field authors
*/
public ArrayList<Author> getAuthors()
{
	return this.authors;
}

/**
	Set the value of field authors
*/
public void setAuthors(ArrayList<Author> authors)
{
	this.authors = authors;
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
	Lazy evaluation for pages
*/
public MetadataString	pages()
{
	MetadataString	result = this.pages;
	if (result == null)
	{
		result = new MetadataString();
		this.pages = result;
	}
	return result;
}

/**
	Gets the value of the field pages
*/
public String getPages()
{
	return this.pages().getValue();
}

/**
	Sets the value of the field pages
*/
public void setPages(String pages)
{
	this.pages().setValue(pages);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pages
*/
public boolean isNullPages()
{
	return pages == null || pages.getValue() == null;
}

/**
	The heavy weight setter method for field pages
*/
public void hwSetPages(String pages)
{
	this.pages().setValue(pages);
	rebuildCompositeTermVector();
}

/**
	 Sets the pages directly.
*/
public void setPagesMetadata(MetadataString pages)
{
	this.pages = pages;
}

/**
	Heavy Weight Direct setter method for pages
*/
public void hwSetPagesMetadata(MetadataString pages)
{
	if (this.pages != null && this.pages.getValue() != null && hasTermVector())
		termVector().remove(this.pages.termVector());
	this.pages = pages;
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
	Lazy evaluation for year
*/
public MetadataInteger	year()
{
	MetadataInteger	result = this.year;
	if (result == null)
	{
		result = new MetadataInteger();
		this.year = result;
	}
	return result;
}

/**
	Gets the value of the field year
*/
public Integer getYear()
{
	return this.year().getValue();
}

/**
	Sets the value of the field year
*/
public void setYear(Integer year)
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
public void hwSetYear(Integer year)
{
	this.year().setValue(year);
	rebuildCompositeTermVector();
}

/**
	 Sets the year directly.
*/
public void setYearMetadata(MetadataInteger year)
{
	this.year = year;
}

/**
	Heavy Weight Direct setter method for year
*/
public void hwSetYearMetadata(MetadataInteger year)
{
	if (this.year != null && this.year.getValue() != null && hasTermVector())
		termVector().remove(this.year.termVector());
	this.year = year;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for subjects
*/
public ArrayList<Subject>	subjects()
{
	ArrayList<Subject>	result = this.subjects;
	if (result == null)
	{
		result = new ArrayList<Subject>();
		this.subjects = result;
	}
	return result;
}

/**
	Get the value of field subjects
*/
public ArrayList<Subject> getSubjects()
{
	return this.subjects;
}

/**
	Set the value of field subjects
*/
public void setSubjects(ArrayList<Subject> subjects)
{
	this.subjects = subjects;
}

/**
	Lazy evaluation for aboutTheAuthors
*/
public MetadataString	aboutTheAuthors()
{
	MetadataString	result = this.aboutTheAuthors;
	if (result == null)
	{
		result = new MetadataString();
		this.aboutTheAuthors = result;
	}
	return result;
}

/**
	Gets the value of the field aboutTheAuthors
*/
public String getAboutTheAuthors()
{
	return this.aboutTheAuthors().getValue();
}

/**
	Sets the value of the field aboutTheAuthors
*/
public void setAboutTheAuthors(String aboutTheAuthors)
{
	this.aboutTheAuthors().setValue(aboutTheAuthors);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: aboutTheAuthors
*/
public boolean isNullAboutTheAuthors()
{
	return aboutTheAuthors == null || aboutTheAuthors.getValue() == null;
}

/**
	The heavy weight setter method for field aboutTheAuthors
*/
public void hwSetAboutTheAuthors(String aboutTheAuthors)
{
	this.aboutTheAuthors().setValue(aboutTheAuthors);
	rebuildCompositeTermVector();
}

/**
	 Sets the aboutTheAuthors directly.
*/
public void setAboutTheAuthorsMetadata(MetadataString aboutTheAuthors)
{
	this.aboutTheAuthors = aboutTheAuthors;
}

/**
	Heavy Weight Direct setter method for aboutTheAuthors
*/
public void hwSetAboutTheAuthorsMetadata(MetadataString aboutTheAuthors)
{
	if (this.aboutTheAuthors != null && this.aboutTheAuthors.getValue() != null && hasTermVector())
		termVector().remove(this.aboutTheAuthors.termVector());
	this.aboutTheAuthors = aboutTheAuthors;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for commonTerms
*/
public ArrayList<Term>	commonTerms()
{
	ArrayList<Term>	result = this.commonTerms;
	if (result == null)
	{
		result = new ArrayList<Term>();
		this.commonTerms = result;
	}
	return result;
}

/**
	Get the value of field commonTerms
*/
public ArrayList<Term> getCommonTerms()
{
	return this.commonTerms;
}

/**
	Set the value of field commonTerms
*/
public void setCommonTerms(ArrayList<Term> commonTerms)
{
	this.commonTerms = commonTerms;
}


}

