package ecologylab.semantics.generated.library.search;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
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
import ecologylab.semantics.metadata.builtins.CompoundDocument;
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
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
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
@xml_tag("SearchResponse")
public class BingSearch
extends CompoundDocument
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

