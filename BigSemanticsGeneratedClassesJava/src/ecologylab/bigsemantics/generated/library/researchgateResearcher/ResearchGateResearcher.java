package ecologylab.bigsemantics.generated.library.researchgateResearcher;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.researchgateAuthor.ResearchGateAuthor;
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
public class ResearchGateResearcher extends ResearchGateAuthor
{
	@simpl_collection("compound_document")
	@mm_name("researcher_stats")
	private List<CompoundDocument> researcherStats;

	public ResearchGateResearcher()
	{ super(); }

	public ResearchGateResearcher(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<CompoundDocument> getResearcherStats()
	{
		return researcherStats;
	}

  // lazy evaluation:
  public List<CompoundDocument> researcherStats()
  {
    if (researcherStats == null)
      researcherStats = new ArrayList<CompoundDocument>();
    return researcherStats;
  }

  // addTo:
  public void addToResearcherStats(CompoundDocument element)
  {
    researcherStats().add(element);
  }

  // size:
  public int researcherStatsSize()
  {
    return researcherStats == null ? 0 : researcherStats.size();
  }

	public void setResearcherStats(List<CompoundDocument> researcherStats)
	{
		this.researcherStats = researcherStats;
	}
}
