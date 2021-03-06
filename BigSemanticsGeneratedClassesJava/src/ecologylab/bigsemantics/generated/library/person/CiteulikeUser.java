package ecologylab.bigsemantics.generated.library.person;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.CiteulikePaper;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.Person;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
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
