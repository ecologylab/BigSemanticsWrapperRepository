package ecologylab.semantics.generated.library.search;


import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("SearchResponse")
public class BingSearch
extends Document
{

@simpl_composite @xml_tag("web:Web") @mm_name("web_section")
private BingSearchWebSection	webSection;

@simpl_composite @xml_tag("mms:Image") @mm_name("image_section")
private BingSearchImageSection	imageSection;



/**
	Constructor
*/
public BingSearch()
{
 super();
}

/**
	Constructor
*/
public BingSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for webSection
*/
public BingSearchWebSection	webSection()
{
	BingSearchWebSection	result = this.webSection;
	if (result == null)
	{
		result = new BingSearchWebSection();
		this.webSection = result;
	}
	return result;
}

/**
	Get the value of field webSection
*/
public BingSearchWebSection getWebSection()
{
	return this.webSection;
}

/**
	Set the value of field webSection
*/
public void setWebSection(BingSearchWebSection webSection)
{
	this.webSection = webSection;
}

/**
	Lazy evaluation for imageSection
*/
public BingSearchImageSection	imageSection()
{
	BingSearchImageSection	result = this.imageSection;
	if (result == null)
	{
		result = new BingSearchImageSection();
		this.imageSection = result;
	}
	return result;
}

/**
	Get the value of field imageSection
*/
public BingSearchImageSection getImageSection()
{
	return this.imageSection;
}

/**
	Set the value of field imageSection
*/
public void setImageSection(BingSearchImageSection imageSection)
{
	this.imageSection = imageSection;
}


}

