package ecologylab.semantics.generated.library;


import java.util.ArrayList;

import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Google Patents Image Class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GooglePatentImage
extends Document
{

@simpl_scalar
private MetadataString	inventor;

@simpl_collection("search_result") @xml_tag("pic_urls") @mm_name("pic_urls")
private ArrayList<SearchResult>	picUrls;



/**
	Constructor
*/
public GooglePatentImage()
{
 super();
}

/**
	Constructor
*/
public GooglePatentImage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for inventor
*/
public MetadataString	inventor()
{
	MetadataString	result = this.inventor;
	if (result == null)
	{
		result = new MetadataString();
		this.inventor = result;
	}
	return result;
}

/**
	Gets the value of the field inventor
*/
public String getInventor()
{
	return this.inventor().getValue();
}

/**
	Sets the value of the field inventor
*/
public void setInventor(String inventor)
{
	this.inventor().setValue(inventor);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: inventor
*/
public boolean isNullInventor()
{
	return inventor == null || inventor.getValue() == null;
}

/**
	The heavy weight setter method for field inventor
*/
public void hwSetInventor(String inventor)
{
	this.inventor().setValue(inventor);
	rebuildCompositeTermVector();
}

/**
	 Sets the inventor directly.
*/
public void setInventorMetadata(MetadataString inventor)
{
	this.inventor = inventor;
}

/**
	Heavy Weight Direct setter method for inventor
*/
public void hwSetInventorMetadata(MetadataString inventor)
{
	if (this.inventor != null && this.inventor.getValue() != null && hasTermVector())
		termVector().remove(this.inventor.termVector());
	this.inventor = inventor;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for picUrls
*/
public ArrayList<SearchResult>	picUrls()
{
	ArrayList<SearchResult>	result = this.picUrls;
	if (result == null)
	{
		result = new ArrayList<SearchResult>();
		this.picUrls = result;
	}
	return result;
}

/**
	Get the value of field picUrls
*/
public ArrayList<SearchResult> getPicUrls()
{
	return this.picUrls;
}

/**
	Set the value of field picUrls
*/
public void setPicUrls(ArrayList<SearchResult> picUrls)
{
	this.picUrls = picUrls;
}


}

