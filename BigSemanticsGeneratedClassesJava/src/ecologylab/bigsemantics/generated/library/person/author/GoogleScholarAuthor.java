package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.person.author.CitationStats;
import ecologylab.bigsemantics.generated.library.person.author.Homepage;
import ecologylab.bigsemantics.generated.library.person.author.Papers;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
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
public class GoogleScholarAuthor extends Author
{
	@simpl_collection("rich_document")
	@mm_name("interests")
	private List<RichDocument> interests;

	@simpl_composite
	@mm_name("homepage")
	private Homepage homepage;

	@simpl_composite
	@mm_name("citation_stats")
	private CitationStats citationStats;

	@simpl_collection("rich_document")
	@mm_name("top_coauthors")
	private List<RichDocument> topCoauthors;

	@simpl_collection("papers")
	@mm_name("papers")
	private List<Papers> papers;

	public GoogleScholarAuthor()
	{ super(); }

	public GoogleScholarAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<RichDocument> getInterests()
	{
		return interests;
	}

  // lazy evaluation:
  public List<RichDocument> interests()
  {
    if (interests == null)
      interests = new ArrayList<RichDocument>();
    return interests;
  }

  // addTo:
  public void addToInterests(RichDocument element)
  {
    interests().add(element);
  }

  // size:
  public int interestsSize()
  {
    return interests == null ? 0 : interests.size();
  }

	public void setInterests(List<RichDocument> interests)
	{
		this.interests = interests;
	}

	public Homepage getHomepage()
	{
		return homepage;
	}

	public void setHomepage(Homepage homepage)
	{
		this.homepage = homepage;
	}

	public CitationStats getCitationStats()
	{
		return citationStats;
	}

	public void setCitationStats(CitationStats citationStats)
	{
		this.citationStats = citationStats;
	}

	public List<RichDocument> getTopCoauthors()
	{
		return topCoauthors;
	}

  // lazy evaluation:
  public List<RichDocument> topCoauthors()
  {
    if (topCoauthors == null)
      topCoauthors = new ArrayList<RichDocument>();
    return topCoauthors;
  }

  // addTo:
  public void addToTopCoauthors(RichDocument element)
  {
    topCoauthors().add(element);
  }

  // size:
  public int topCoauthorsSize()
  {
    return topCoauthors == null ? 0 : topCoauthors.size();
  }

	public void setTopCoauthors(List<RichDocument> topCoauthors)
	{
		this.topCoauthors = topCoauthors;
	}

	public List<Papers> getPapers()
	{
		return papers;
	}

  // lazy evaluation:
  public List<Papers> papers()
  {
    if (papers == null)
      papers = new ArrayList<Papers>();
    return papers;
  }

  // addTo:
  public void addToPapers(Papers element)
  {
    papers().add(element);
  }

  // size:
  public int papersSize()
  {
    return papers == null ? 0 : papers.size();
  }

	public void setPapers(List<Papers> papers)
	{
		this.papers = papers;
	}
}
