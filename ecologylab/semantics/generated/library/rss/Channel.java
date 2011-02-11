package ecologylab.semantics.generated.library.rss;


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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Channel
extends Metadata
{

@simpl_scalar
private MetadataString	title;

@simpl_collection("item") @simpl_nowrap @mm_name("items")
private ArrayList<Item>	items;



/**
	Constructor
*/
public Channel()
{
 super();
}

/**
	Constructor
*/
public Channel(MetaMetadataCompositeField metaMetadata)
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
	Lazy evaluation for items
*/
public ArrayList<Item>	items()
{
	ArrayList<Item>	result = this.items;
	if (result == null)
	{
		result = new ArrayList<Item>();
		this.items = result;
	}
	return result;
}

/**
	Get the value of field items
*/
public ArrayList<Item> getItems()
{
	return this.items;
}

/**
	Set the value of field items
*/
public void setItems(ArrayList<Item> items)
{
	this.items = items;
}


}

