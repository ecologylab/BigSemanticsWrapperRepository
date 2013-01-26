package ecologylab.semantics.generated.library.bibManaging;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.bibManaging.CiteseerxRecord;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import java.util.List;
import java.util.Map;

/** 
 *Summary page from CiteSeerX.
 */ 
@simpl_inherit
public class CiteseerxSummary extends CiteseerxRecord
{
	@simpl_composite
	@simpl_other_tags({"citation_records"})
	@mm_name("cited_articles")
	private Document citedArticles;

	@simpl_composite
	@simpl_other_tags({"active_bibliography_records"})
	@mm_name("articles_that_cite_the_same_works")
	private Document articlesThatCiteTheSameWorks;

	@simpl_composite
	@simpl_other_tags({"cocitation_records"})
	@mm_name("articles_cited_by_the_same_works")
	private Document articlesCitedByTheSameWorks;

	public CiteseerxSummary()
	{ super(); }

	public CiteseerxSummary(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Document getCitedArticles()
	{
		return citedArticles;
	}

	public void setCitedArticles(Document citedArticles)
	{
		this.citedArticles = citedArticles;
	}

	public Document getArticlesThatCiteTheSameWorks()
	{
		return articlesThatCiteTheSameWorks;
	}

	public void setArticlesThatCiteTheSameWorks(Document articlesThatCiteTheSameWorks)
	{
		this.articlesThatCiteTheSameWorks = articlesThatCiteTheSameWorks;
	}

	public Document getArticlesCitedByTheSameWorks()
	{
		return articlesCitedByTheSameWorks;
	}

	public void setArticlesCitedByTheSameWorks(Document articlesCitedByTheSameWorks)
	{
		this.articlesCitedByTheSameWorks = articlesCitedByTheSameWorks;
	}
}
