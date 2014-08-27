package ecologylab.bigsemantics.generated.library.asosPage;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.asosProduct.Asos;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
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
public class AsosPage extends CompoundDocument
{
	@simpl_collection("asos")
	@mm_name("products")
	private List<Asos> products;

	public AsosPage()
	{ super(); }

	public AsosPage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Asos> getProducts()
	{
		return products;
	}

  // lazy evaluation:
  public List<Asos> products()
  {
    if (products == null)
      products = new ArrayList<Asos>();
    return products;
  }

  // addTo:
  public void addToProducts(Asos element)
  {
    products().add(element);
  }

  // size:
  public int productsSize()
  {
    return products == null ? 0 : products.size();
  }

	public void setProducts(List<Asos> products)
	{
		this.products = products;
	}
}
