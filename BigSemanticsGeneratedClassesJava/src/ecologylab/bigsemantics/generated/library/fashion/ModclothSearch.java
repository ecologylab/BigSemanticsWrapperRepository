package ecologylab.bigsemantics.generated.library.fashion;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.fashion.Modcloth;
import ecologylab.bigsemantics.generated.library.product_and_service.Product;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class ModclothSearch extends Product
{
	@simpl_collection("modcloth")
	@mm_name("items")
	private List<Modcloth> items;

	public ModclothSearch()
	{ super(); }

	public ModclothSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Modcloth> getItems()
	{
		return items;
	}

  // lazy evaluation:
  public List<Modcloth> items()
  {
    if (items == null)
      items = new ArrayList<Modcloth>();
    return items;
  }

  // addTo:
  public void addToItems(Modcloth element)
  {
    items().add(element);
  }

  // size:
  public int itemsSize()
  {
    return items == null ? 0 : items.size();
  }

	public void setItems(List<Modcloth> items)
	{
		this.items = items;
	}
}
