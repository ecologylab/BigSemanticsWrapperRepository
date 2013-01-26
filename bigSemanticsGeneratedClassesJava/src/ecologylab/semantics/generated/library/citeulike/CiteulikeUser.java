package ecologylab.semantics.generated.library.citeulike;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.citeulike.CiteulikePaper;
import ecologylab.semantics.generated.library.person.Person;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class CiteulikeUser extends Person
{
	@simpl_collection("citeulike_paper")
	@mm_name("collected_papers")
	private List<CiteulikePaper> collectedPapers;

	public CiteulikeUser()
	{ super(); }

	public CiteulikeUser(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<CiteulikePaper> getCollectedPapers()
	{
		return collectedPapers;
	}

  // lazy evaluation:
  public List<CiteulikePaper> collectedPapers()
  {
    if (collectedPapers == null)
      collectedPapers = new ArrayList<CiteulikePaper>();
    return collectedPapers;
  }

  // addTo:
  public void addToCollectedPapers(CiteulikePaper element)
  {
    collectedPapers().add(element);
  }

  // size:
  public int collectedPapersSize()
  {
    return collectedPapers == null ? 0 : collectedPapers.size();
  }

	public void setCollectedPapers(List<CiteulikePaper> collectedPapers)
	{
		this.collectedPapers = collectedPapers;
	}
}
