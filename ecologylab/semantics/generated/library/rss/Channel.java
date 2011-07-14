package ecologylab.semantics.generated.library.rss;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.library.rss.Item;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Channel.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Channel extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString title;

	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("item") @mm_name("items")	private ArrayList<Item> items;

	public Channel()
	{ }

	public Channel(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

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

	public String getTitle()
	{
		return this.title().getValue();
	}

	public void setTitle(String title)
	{
		this.title().setValue(title);
	}


	public ArrayList<Item> getItems()
	{
		return items;
	}

	public void setItems(ArrayList<Item> items)
	{
		this.items = items;
	}
}
