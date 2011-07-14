package ecologylab.semantics.generated.library.slashdot;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.library.slashdot.SlashdotItem;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  SlashdotRss.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class SlashdotRss extends CompoundDocument
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("item") @mm_name("items")	private ArrayList<SlashdotItem> items;

	public SlashdotRss()
	{ }

	public SlashdotRss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<SlashdotItem> getItems()
	{
		return items;
	}

	public void setItems(ArrayList<SlashdotItem> items)
	{
		this.items = items;
	}
}
