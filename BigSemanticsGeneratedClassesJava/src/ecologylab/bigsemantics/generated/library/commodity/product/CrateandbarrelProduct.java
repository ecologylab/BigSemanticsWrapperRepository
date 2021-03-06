package ecologylab.bigsemantics.generated.library.commodity.product;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.commodity.product.CrateandbarrelProduct;
import ecologylab.bigsemantics.generated.library.commodity.product.Product;
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
public class CrateandbarrelProduct extends Product
{
	@simpl_collection("crateandbarrel_product")
	@mm_name("customer_also_viewed")
	private List<CrateandbarrelProduct> customerAlsoViewed;

	public CrateandbarrelProduct()
	{ super(); }

	public CrateandbarrelProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<CrateandbarrelProduct> getCustomerAlsoViewed()
	{
		return customerAlsoViewed;
	}

  // lazy evaluation:
  public List<CrateandbarrelProduct> customerAlsoViewed()
  {
    if (customerAlsoViewed == null)
      customerAlsoViewed = new ArrayList<CrateandbarrelProduct>();
    return customerAlsoViewed;
  }

  // addTo:
  public void addToCustomerAlsoViewed(CrateandbarrelProduct element)
  {
    customerAlsoViewed().add(element);
  }

  // size:
  public int customerAlsoViewedSize()
  {
    return customerAlsoViewed == null ? 0 : customerAlsoViewed.size();
  }

	public void setCustomerAlsoViewed(List<CrateandbarrelProduct> customerAlsoViewed)
	{
		this.customerAlsoViewed = customerAlsoViewed;
	}
}
