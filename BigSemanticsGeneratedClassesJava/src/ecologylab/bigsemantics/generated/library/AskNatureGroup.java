package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.AskNatureSubgroup;
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
public class AskNatureGroup extends RichDocument
{
	@simpl_collection("ask_nature_subgroup")
	@mm_name("subgroups")
	private List<AskNatureSubgroup> subgroups;

	public AskNatureGroup()
	{ super(); }

	public AskNatureGroup(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<AskNatureSubgroup> getSubgroups()
	{
		return subgroups;
	}

  // lazy evaluation:
  public List<AskNatureSubgroup> subgroups()
  {
    if (subgroups == null)
      subgroups = new ArrayList<AskNatureSubgroup>();
    return subgroups;
  }

  // addTo:
  public void addToSubgroups(AskNatureSubgroup element)
  {
    subgroups().add(element);
  }

  // size:
  public int subgroupsSize()
  {
    return subgroups == null ? 0 : subgroups.size();
  }

	public void setSubgroups(List<AskNatureSubgroup> subgroups)
	{
		this.subgroups = subgroups;
	}
}
