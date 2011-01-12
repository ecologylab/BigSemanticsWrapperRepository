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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GoogleBook
extends Document
{

@simpl_scalar
private MetadataString	title;

@simpl_collection("author") @xml_tag("authors") @mm_name("authors")
private ArrayList<Author>	authors;

@simpl_scalar
private MetadataString	publisher;

@simpl_scalar
private MetadataString	category;

@simpl_scalar
private MetadataString	pages;

@simpl_scalar
private MetadataString	description;

@simpl_collection("document") @xml_tag("related_books") @mm_name("related_books")
private ArrayList<Document>	relatedBooks;

@simpl_collection("chapter") @xml_tag("contents") @mm_name("contents")
private ArrayList<Chapter>	contents;

@simpl_collection("term") @xml_tag("common_terms") @mm_name("common_terms")
private ArrayList<Term>	commonTerms;

@simpl_scalar
private MetadataString	aboutTheAuthor;

@simpl_collection("scholarly_article") @xml_tag("references_from_books") @mm_name("references_from_books")
private ArrayList<ScholarlyArticle>	referencesFromBooks;

@simpl_collection("scholarly_article") @xml_tag("references_from_google_scholar") @mm_name("references_from_google_scholar")
private ArrayList<ScholarlyArticle>	referencesFromGoogleScholar;

@simpl_scalar
private MetadataString	isbn;

@simpl_collection("subject") @xml_tag("subjects") @mm_name("subjects")
private ArrayList<Subject>	subjects;



/**
	Constructor
*/
public GoogleBook()
{
 super();
}

/**
	Constructor
*/
public GoogleBook(MetaMetadataCompositeField metaMetadata)
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
	Lazy evaluation for category
*/
public MetadataString	category()
{
	MetadataString	result = this.category;
	if (result == null)
	{
		result = new MetadataString();
		this.category = result;
	}
	return result;
}

/**
	Gets the value of the field category
*/
public String getCategory()
{
	return this.category().getValue();
}

/**
	Sets the value of the field category
*/
public void setCategory(String category)
{
	this.category().setValue(category);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: category
*/
public boolean isNullCategory()
{
	return category == null || category.getValue() == null;
}

/**
	The heavy weight setter method for field category
*/
public void hwSetCategory(String category)
{
	this.category().setValue(category);
	rebuildCompositeTermVector();
}

/**
	 Sets the category directly.
*/
public void setCategoryMetadata(MetadataString category)
{
	this.category = category;
}

/**
	Heavy Weight Direct setter method for category
*/
public void hwSetCategoryMetadata(MetadataString category)
{
	if (this.category != null && this.category.getValue() != null && hasTermVector())
		termVector().remove(this.category.termVector());
	this.category = category;
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
	Lazy evaluation for description
*/
public MetadataString	description()
{
	MetadataString	result = this.description;
	if (result == null)
	{
		result = new MetadataString();
		this.description = result;
	}
	return result;
}

/**
	Gets the value of the field description
*/
public String getDescription()
{
	return this.description().getValue();
}

/**
	Sets the value of the field description
*/
public void setDescription(String description)
{
	this.description().setValue(description);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: description
*/
public boolean isNullDescription()
{
	return description == null || description.getValue() == null;
}

/**
	The heavy weight setter method for field description
*/
public void hwSetDescription(String description)
{
	this.description().setValue(description);
	rebuildCompositeTermVector();
}

/**
	 Sets the description directly.
*/
public void setDescriptionMetadata(MetadataString description)
{
	this.description = description;
}

/**
	Heavy Weight Direct setter method for description
*/
public void hwSetDescriptionMetadata(MetadataString description)
{
	if (this.description != null && this.description.getValue() != null && hasTermVector())
		termVector().remove(this.description.termVector());
	this.description = description;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for relatedBooks
*/
public ArrayList<Document>	relatedBooks()
{
	ArrayList<Document>	result = this.relatedBooks;
	if (result == null)
	{
		result = new ArrayList<Document>();
		this.relatedBooks = result;
	}
	return result;
}

/**
	Get the value of field relatedBooks
*/
public ArrayList<Document> getRelatedBooks()
{
	return this.relatedBooks;
}

/**
	Set the value of field relatedBooks
*/
public void setRelatedBooks(ArrayList<Document> relatedBooks)
{
	this.relatedBooks = relatedBooks;
}

/**
	Lazy evaluation for contents
*/
public ArrayList<Chapter>	contents()
{
	ArrayList<Chapter>	result = this.contents;
	if (result == null)
	{
		result = new ArrayList<Chapter>();
		this.contents = result;
	}
	return result;
}

/**
	Get the value of field contents
*/
public ArrayList<Chapter> getContents()
{
	return this.contents;
}

/**
	Set the value of field contents
*/
public void setContents(ArrayList<Chapter> contents)
{
	this.contents = contents;
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

/**
	Lazy evaluation for aboutTheAuthor
*/
public MetadataString	aboutTheAuthor()
{
	MetadataString	result = this.aboutTheAuthor;
	if (result == null)
	{
		result = new MetadataString();
		this.aboutTheAuthor = result;
	}
	return result;
}

/**
	Gets the value of the field aboutTheAuthor
*/
public String getAboutTheAuthor()
{
	return this.aboutTheAuthor().getValue();
}

/**
	Sets the value of the field aboutTheAuthor
*/
public void setAboutTheAuthor(String aboutTheAuthor)
{
	this.aboutTheAuthor().setValue(aboutTheAuthor);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: aboutTheAuthor
*/
public boolean isNullAboutTheAuthor()
{
	return aboutTheAuthor == null || aboutTheAuthor.getValue() == null;
}

/**
	The heavy weight setter method for field aboutTheAuthor
*/
public void hwSetAboutTheAuthor(String aboutTheAuthor)
{
	this.aboutTheAuthor().setValue(aboutTheAuthor);
	rebuildCompositeTermVector();
}

/**
	 Sets the aboutTheAuthor directly.
*/
public void setAboutTheAuthorMetadata(MetadataString aboutTheAuthor)
{
	this.aboutTheAuthor = aboutTheAuthor;
}

/**
	Heavy Weight Direct setter method for aboutTheAuthor
*/
public void hwSetAboutTheAuthorMetadata(MetadataString aboutTheAuthor)
{
	if (this.aboutTheAuthor != null && this.aboutTheAuthor.getValue() != null && hasTermVector())
		termVector().remove(this.aboutTheAuthor.termVector());
	this.aboutTheAuthor = aboutTheAuthor;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for referencesFromBooks
*/
public ArrayList<ScholarlyArticle>	referencesFromBooks()
{
	ArrayList<ScholarlyArticle>	result = this.referencesFromBooks;
	if (result == null)
	{
		result = new ArrayList<ScholarlyArticle>();
		this.referencesFromBooks = result;
	}
	return result;
}

/**
	Get the value of field referencesFromBooks
*/
public ArrayList<ScholarlyArticle> getReferencesFromBooks()
{
	return this.referencesFromBooks;
}

/**
	Set the value of field referencesFromBooks
*/
public void setReferencesFromBooks(ArrayList<ScholarlyArticle> referencesFromBooks)
{
	this.referencesFromBooks = referencesFromBooks;
}

/**
	Lazy evaluation for referencesFromGoogleScholar
*/
public ArrayList<ScholarlyArticle>	referencesFromGoogleScholar()
{
	ArrayList<ScholarlyArticle>	result = this.referencesFromGoogleScholar;
	if (result == null)
	{
		result = new ArrayList<ScholarlyArticle>();
		this.referencesFromGoogleScholar = result;
	}
	return result;
}

/**
	Get the value of field referencesFromGoogleScholar
*/
public ArrayList<ScholarlyArticle> getReferencesFromGoogleScholar()
{
	return this.referencesFromGoogleScholar;
}

/**
	Set the value of field referencesFromGoogleScholar
*/
public void setReferencesFromGoogleScholar(ArrayList<ScholarlyArticle> referencesFromGoogleScholar)
{
	this.referencesFromGoogleScholar = referencesFromGoogleScholar;
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


}

