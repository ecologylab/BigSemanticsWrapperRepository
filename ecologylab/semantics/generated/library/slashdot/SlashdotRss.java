package ecologylab.semantics.generated.library.slashdot;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("rdf:RDF")
public class SlashdotRss
extends Document
{

@simpl_collection("item") @simpl_nowrap @mm_name("items")
private ArrayList<SlashdotItem>	items;



/**
	Constructor
*/
public SlashdotRss()
{
 super();
}

/**
	Constructor
*/
public SlashdotRss(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for items
*/
public ArrayList<SlashdotItem>	items()
{
	ArrayList<SlashdotItem>	result = this.items;
	if (result == null)
	{
		result = new ArrayList<SlashdotItem>();
		this.items = result;
	}
	return result;
}

/**
	Get the value of field items
*/
public ArrayList<SlashdotItem> getItems()
{
	return this.items;
}

/**
	Set the value of field items
*/
public void setItems(ArrayList<SlashdotItem> items)
{
	this.items = items;
}


}

