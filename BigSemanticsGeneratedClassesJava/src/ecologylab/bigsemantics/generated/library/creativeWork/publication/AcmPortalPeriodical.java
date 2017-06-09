package ecologylab.bigsemantics.generated.library.creativeWork.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.publication.Periodical;
import ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle.AcmPortal;
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
public class AcmPortalPeriodical extends Periodical
{
	@simpl_collection("acm_portal")
	@mm_name("articles")
	private List<AcmPortal> articles;

	public AcmPortalPeriodical()
	{ super(); }

	public AcmPortalPeriodical(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<AcmPortal> getArticles()
	{
		return articles;
	}

  // lazy evaluation:
  public List<AcmPortal> articles()
  {
    if (articles == null)
      articles = new ArrayList<AcmPortal>();
    return articles;
  }

  // addTo:
  public void addToArticles(AcmPortal element)
  {
    articles().add(element);
  }

  // size:
  public int articlesSize()
  {
    return articles == null ? 0 : articles.size();
  }

	public void setArticles(List<AcmPortal> articles)
	{
		this.articles = articles;
	}
}
