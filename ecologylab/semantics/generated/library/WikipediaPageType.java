package ecologylab.semantics.generated.library;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


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

