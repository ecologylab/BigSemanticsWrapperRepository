package ecologylab.semantics.generated.library.rss;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;


/**
	A news feed, yucky style.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("rss_2_2")
public class Rss22
extends Document
{

@simpl_collection("item") @simpl_nowrap @mm_name("items")
private ArrayList<Item>	items;



/**
	Constructor
*/
public Rss22()
{
 super();
}

/**
	Constructor
*/
public Rss22(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
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

