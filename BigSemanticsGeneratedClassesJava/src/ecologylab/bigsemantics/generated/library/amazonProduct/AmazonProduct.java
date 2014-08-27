package ecologylab.bigsemantics.generated.library.amazonProduct;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.amazonList.AmazonList;
import ecologylab.bigsemantics.generated.library.product.Product;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class AmazonProduct extends Product
{
	@simpl_composite
	@mm_name("department")
	private CompoundDocument department;

	@simpl_composite
	@mm_name("bestseller_list_rank")
	private AmazonList bestsellerListRank;

	@simpl_collection("compound_document")
	@mm_name("list_mania")
	private List<CompoundDocument> listMania;

	public AmazonProduct()
	{ super(); }

	public AmazonProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public CompoundDocument getDepartment()
	{
		return department;
	}

	public void setDepartment(CompoundDocument department)
	{
		this.department = department;
	}

	public AmazonList getBestsellerListRank()
	{
		return bestsellerListRank;
	}

	public void setBestsellerListRank(AmazonList bestsellerListRank)
	{
		this.bestsellerListRank = bestsellerListRank;
	}

	public List<CompoundDocument> getListMania()
	{
		return listMania;
	}

  // lazy evaluation:
  public List<CompoundDocument> listMania()
  {
    if (listMania == null)
      listMania = new ArrayList<CompoundDocument>();
    return listMania;
  }

  // addTo:
  public void addToListMania(CompoundDocument element)
  {
    listMania().add(element);
  }

  // size:
  public int listManiaSize()
  {
    return listMania == null ? 0 : listMania.size();
  }

	public void setListMania(List<CompoundDocument> listMania)
	{
		this.listMania = listMania;
	}
}
