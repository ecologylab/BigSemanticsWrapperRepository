package ecologylab.bigsemantics.generated.library.commodity.product;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.commodity.product.IkeaProduct;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class IkeaDepartment extends RichDocument
{
	@simpl_collection("ikea_product")
	@mm_name("products")
	private List<IkeaProduct> products;

	public IkeaDepartment()
	{ super(); }

	public IkeaDepartment(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<IkeaProduct> getProducts()
	{
		return products;
	}

  // lazy evaluation:
  public List<IkeaProduct> products()
  {
    if (products == null)
      products = new ArrayList<IkeaProduct>();
    return products;
  }

  // addTo:
  public void addToProducts(IkeaProduct element)
  {
    products().add(element);
  }

  // size:
  public int productsSize()
  {
    return products == null ? 0 : products.size();
  }

	public void setProducts(List<IkeaProduct> products)
	{
		this.products = products;
	}
}