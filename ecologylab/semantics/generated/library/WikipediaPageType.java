package ecologylab.semantics.generated.library;


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
	An article on wikipedia

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class WikipediaPageType
extends Document
{


/**
	Paragraphs in the article.
*/
@simpl_collection("paragraph") @xml_tag("paragraphs") @mm_name("paragraphs")
private ArrayList<Paragraph>	paragraphs;


/**
	Wikipedia Categories
*/
@simpl_collection("category") @xml_tag("categories") @mm_name("categories")
private ArrayList<Category>	categories;

@simpl_collection("thumbinner") @xml_tag("thumbinners") @mm_name("thumbinners")
private ArrayList<Thumbinner>	thumbinners;



/**
	Constructor
*/
public WikipediaPageType()
{
 super();
}

/**
	Constructor
*/
public WikipediaPageType(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for paragraphs
*/
public ArrayList<Paragraph>	paragraphs()
{
	ArrayList<Paragraph>	result = this.paragraphs;
	if (result == null)
	{
		result = new ArrayList<Paragraph>();
		this.paragraphs = result;
	}
	return result;
}

/**
	Get the value of field paragraphs
*/
public ArrayList<Paragraph> getParagraphs()
{
	return this.paragraphs;
}

/**
	Set the value of field paragraphs
*/
public void setParagraphs(ArrayList<Paragraph> paragraphs)
{
	this.paragraphs = paragraphs;
}

/**
	Lazy evaluation for categories
*/
public ArrayList<Category>	categories()
{
	ArrayList<Category>	result = this.categories;
	if (result == null)
	{
		result = new ArrayList<Category>();
		this.categories = result;
	}
	return result;
}

/**
	Get the value of field categories
*/
public ArrayList<Category> getCategories()
{
	return this.categories;
}

/**
	Set the value of field categories
*/
public void setCategories(ArrayList<Category> categories)
{
	this.categories = categories;
}

/**
	Lazy evaluation for thumbinners
*/
public ArrayList<Thumbinner>	thumbinners()
{
	ArrayList<Thumbinner>	result = this.thumbinners;
	if (result == null)
	{
		result = new ArrayList<Thumbinner>();
		this.thumbinners = result;
	}
	return result;
}

/**
	Get the value of field thumbinners
*/
public ArrayList<Thumbinner> getThumbinners()
{
	return this.thumbinners;
}

/**
	Set the value of field thumbinners
*/
public void setThumbinners(ArrayList<Thumbinner> thumbinners)
{
	this.thumbinners = thumbinners;
}


}

