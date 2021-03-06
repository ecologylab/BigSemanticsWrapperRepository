package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.Item;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_nowrap;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Channel extends Metadata
{
	@simpl_scalar
	private MetadataString title;

	@simpl_collection("item")
	@simpl_nowrap
	@mm_name("items")
	private List<Item> items;

	public Channel()
	{ super(); }

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
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}

	public List<Item> getItems()
	{
		return items;
	}

  // lazy evaluation:
  public List<Item> items()
  {
    if (items == null)
      items = new ArrayList<Item>();
    return items;
  }

  // addTo:
  public void addToItems(Item element)
  {
    items().add(element);
  }

  // size:
  public int itemsSize()
  {
    return items == null ? 0 : items.size();
  }

	public void setItems(List<Item> items)
	{
		this.items = items;
	}
}
