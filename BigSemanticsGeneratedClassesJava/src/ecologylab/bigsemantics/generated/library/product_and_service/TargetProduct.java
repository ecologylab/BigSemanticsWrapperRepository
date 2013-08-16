package ecologylab.bigsemantics.generated.library.product_and_service;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.product_and_service.Product;
import ecologylab.bigsemantics.generated.library.product_and_service.TargetProduct;
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
public class TargetProduct extends Product
{
	@simpl_collection("target_product")
	@mm_name("people_also_viewed")
	private List<TargetProduct> peopleAlsoViewed;

	public TargetProduct()
	{ super(); }

	public TargetProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<TargetProduct> getPeopleAlsoViewed()
	{
		return peopleAlsoViewed;
	}

  // lazy evaluation:
  public List<TargetProduct> peopleAlsoViewed()
  {
    if (peopleAlsoViewed == null)
      peopleAlsoViewed = new ArrayList<TargetProduct>();
    return peopleAlsoViewed;
  }

  // addTo:
  public void addToPeopleAlsoViewed(TargetProduct element)
  {
    peopleAlsoViewed().add(element);
  }

  // size:
  public int peopleAlsoViewedSize()
  {
    return peopleAlsoViewed == null ? 0 : peopleAlsoViewed.size();
  }

	public void setPeopleAlsoViewed(List<TargetProduct> peopleAlsoViewed)
	{
		this.peopleAlsoViewed = peopleAlsoViewed;
	}
}