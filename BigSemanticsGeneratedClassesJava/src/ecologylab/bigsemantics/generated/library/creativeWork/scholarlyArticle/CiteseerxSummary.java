package ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.CiteseerxRecord;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
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
	private RichDocument citedArticles;

	@simpl_composite
	@simpl_other_tags({"active_bibliography_records"})
	@mm_name("articles_that_cite_the_same_works")
	private RichDocument articlesThatCiteTheSameWorks;

	@simpl_composite
	@simpl_other_tags({"cocitation_records"})
	@mm_name("articles_cited_by_the_same_works")
	private RichDocument articlesCitedByTheSameWorks;

	public CiteseerxSummary()
	{ super(); }

	public CiteseerxSummary(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public RichDocument getCitedArticles()
	{
		return citedArticles;
	}

	public void setCitedArticles(RichDocument citedArticles)
	{
		this.citedArticles = citedArticles;
	}

	public RichDocument getArticlesThatCiteTheSameWorks()
	{
		return articlesThatCiteTheSameWorks;
	}

	public void setArticlesThatCiteTheSameWorks(RichDocument articlesThatCiteTheSameWorks)
	{
		this.articlesThatCiteTheSameWorks = articlesThatCiteTheSameWorks;
	}

	public RichDocument getArticlesCitedByTheSameWorks()
	{
		return articlesCitedByTheSameWorks;
	}

	public void setArticlesCitedByTheSameWorks(RichDocument articlesCitedByTheSameWorks)
	{
		this.articlesCitedByTheSameWorks = articlesCitedByTheSameWorks;
	}
}
