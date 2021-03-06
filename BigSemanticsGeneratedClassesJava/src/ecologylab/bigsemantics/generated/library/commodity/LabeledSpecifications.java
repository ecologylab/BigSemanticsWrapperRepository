package ecologylab.bigsemantics.generated.library.commodity;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.commodity.Specification;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class LabeledSpecifications extends Metadata
{
	@simpl_scalar
	private MetadataString title;

	@simpl_collection("specification")
	@mm_name("specifications")
	private List<Specification> specifications;

	public LabeledSpecifications()
	{ super(); }

	public LabeledSpecifications(MetaMetadataCompositeField mmd) {
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

	public List<Specification> getSpecifications()
	{
		return specifications;
	}

  // lazy evaluation:
  public List<Specification> specifications()
  {
    if (specifications == null)
      specifications = new ArrayList<Specification>();
    return specifications;
  }

  // addTo:
  public void addToSpecifications(Specification element)
  {
    specifications().add(element);
  }

  // size:
  public int specificationsSize()
  {
    return specifications == null ? 0 : specifications.size();
  }

	public void setSpecifications(List<Specification> specifications)
	{
		this.specifications = specifications;
	}
}
