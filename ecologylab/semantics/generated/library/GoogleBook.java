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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GoogleBook
extends GeneralBook
{

@simpl_scalar
private MetadataString	category;

@simpl_scalar
private MetadataString	description;

@simpl_scalar
private MetadataParsedURL	placesMentionedKml;

@simpl_collection("page") @xml_tag("selected_pages") @mm_name("selected_pages")
private ArrayList<Page>	selectedPages;

@simpl_collection("google_book") @xml_tag("related_books") @mm_name("related_books")
private ArrayList<GoogleBook>	relatedBooks;

@simpl_collection("scholarly_article") @xml_tag("references_from_books") @mm_name("references_from_books")
private ArrayList<ScholarlyArticle>	referencesFromBooks;



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
	Lazy evaluation for placesMentionedKml
*/
public MetadataParsedURL	placesMentionedKml()
{
	MetadataParsedURL	result = this.placesMentionedKml;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.placesMentionedKml = result;
	}
	return result;
}

/**
	Gets the value of the field placesMentionedKml
*/
public ParsedURL getPlacesMentionedKml()
{
	return this.placesMentionedKml().getValue();
}

/**
	Sets the value of the field placesMentionedKml
*/
public void setPlacesMentionedKml(ParsedURL placesMentionedKml)
{
	this.placesMentionedKml().setValue(placesMentionedKml);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: placesMentionedKml
*/
public boolean isNullPlacesMentionedKml()
{
	return placesMentionedKml == null || placesMentionedKml.getValue() == null;
}

/**
	The heavy weight setter method for field placesMentionedKml
*/
public void hwSetPlacesMentionedKml(ParsedURL placesMentionedKml)
{
	this.placesMentionedKml().setValue(placesMentionedKml);
	rebuildCompositeTermVector();
}

/**
	 Sets the placesMentionedKml directly.
*/
public void setPlacesMentionedKmlMetadata(MetadataParsedURL placesMentionedKml)
{
	this.placesMentionedKml = placesMentionedKml;
}

/**
	Heavy Weight Direct setter method for placesMentionedKml
*/
public void hwSetPlacesMentionedKmlMetadata(MetadataParsedURL placesMentionedKml)
{
	if (this.placesMentionedKml != null && this.placesMentionedKml.getValue() != null && hasTermVector())
		termVector().remove(this.placesMentionedKml.termVector());
	this.placesMentionedKml = placesMentionedKml;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for selectedPages
*/
public ArrayList<Page>	selectedPages()
{
	ArrayList<Page>	result = this.selectedPages;
	if (result == null)
	{
		result = new ArrayList<Page>();
		this.selectedPages = result;
	}
	return result;
}

/**
	Get the value of field selectedPages
*/
public ArrayList<Page> getSelectedPages()
{
	return this.selectedPages;
}

/**
	Set the value of field selectedPages
*/
public void setSelectedPages(ArrayList<Page> selectedPages)
{
	this.selectedPages = selectedPages;
}

/**
	Lazy evaluation for relatedBooks
*/
public ArrayList<GoogleBook>	relatedBooks()
{
	ArrayList<GoogleBook>	result = this.relatedBooks;
	if (result == null)
	{
		result = new ArrayList<GoogleBook>();
		this.relatedBooks = result;
	}
	return result;
}

/**
	Get the value of field relatedBooks
*/
public ArrayList<GoogleBook> getRelatedBooks()
{
	return this.relatedBooks;
}

/**
	Set the value of field relatedBooks
*/
public void setRelatedBooks(ArrayList<GoogleBook> relatedBooks)
{
	this.relatedBooks = relatedBooks;
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


}

