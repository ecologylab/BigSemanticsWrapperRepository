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

