package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.search.GoogleScholarSearch;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *A google scholar search result
 */ 
@simpl_inherit
public class GoogleScholarSearchResult extends RichDocument
{
	@simpl_composite
	@mm_name("destination_page")
	private RichDocument destinationPage;

	@simpl_scalar
	private MetadataString destinationType;

	@simpl_scalar
	private MetadataString sourceInfo;

	@simpl_collection("rich_document")
	@mm_name("google_authors")
	private List<RichDocument> googleAuthors;

	@simpl_scalar
	private MetadataInteger citationCount;

	@simpl_composite
	@mm_name("citations_page")
	private GoogleScholarSearch citationsPage;

	@simpl_composite
	@mm_name("related_articles_page")
	private GoogleScholarSearch relatedArticlesPage;

	@simpl_scalar
	private MetadataInteger versionCount;

	@simpl_composite
	@mm_name("versions_page")
	private GoogleScholarSearch versionsPage;

	@simpl_collection("rich_document")
	@mm_name("access_links")
	private List<RichDocument> accessLinks;

	public GoogleScholarSearchResult()
	{ super(); }

	public GoogleScholarSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public RichDocument getDestinationPage()
	{
		return destinationPage;
	}

	public void setDestinationPage(RichDocument destinationPage)
	{
		this.destinationPage = destinationPage;
	}

	public MetadataString	destinationType()
	{
		MetadataString	result = this.destinationType;
		if (result == null)
		{
			result = new MetadataString();
			this.destinationType = result;
		}
		return result;
	}

	public String getDestinationType()
	{
		return this.destinationType == null ? null : destinationType().getValue();
	}

	public MetadataString getDestinationTypeMetadata()
	{
		return destinationType;
	}

	public void setDestinationType(String destinationType)
	{
		if (destinationType != null)
			this.destinationType().setValue(destinationType);
	}

	public void setDestinationTypeMetadata(MetadataString destinationType)
	{
		this.destinationType = destinationType;
	}

	public MetadataString	sourceInfo()
	{
		MetadataString	result = this.sourceInfo;
		if (result == null)
		{
			result = new MetadataString();
			this.sourceInfo = result;
		}
		return result;
	}

	public String getSourceInfo()
	{
		return this.sourceInfo == null ? null : sourceInfo().getValue();
	}

	public MetadataString getSourceInfoMetadata()
	{
		return sourceInfo;
	}

	public void setSourceInfo(String sourceInfo)
	{
		if (sourceInfo != null)
			this.sourceInfo().setValue(sourceInfo);
	}

	public void setSourceInfoMetadata(MetadataString sourceInfo)
	{
		this.sourceInfo = sourceInfo;
	}

	public List<RichDocument> getGoogleAuthors()
	{
		return googleAuthors;
	}

  // lazy evaluation:
  public List<RichDocument> googleAuthors()
  {
    if (googleAuthors == null)
      googleAuthors = new ArrayList<RichDocument>();
    return googleAuthors;
  }

  // addTo:
  public void addToGoogleAuthors(RichDocument element)
  {
    googleAuthors().add(element);
  }

  // size:
  public int googleAuthorsSize()
  {
    return googleAuthors == null ? 0 : googleAuthors.size();
  }

	public void setGoogleAuthors(List<RichDocument> googleAuthors)
	{
		this.googleAuthors = googleAuthors;
	}

	public MetadataInteger	citationCount()
	{
		MetadataInteger	result = this.citationCount;
		if (result == null)
		{
			result = new MetadataInteger();
			this.citationCount = result;
		}
		return result;
	}

	public Integer getCitationCount()
	{
		return this.citationCount == null ? 0 : citationCount().getValue();
	}

	public MetadataInteger getCitationCountMetadata()
	{
		return citationCount;
	}

	public void setCitationCount(Integer citationCount)
	{
		if (citationCount != 0)
			this.citationCount().setValue(citationCount);
	}

	public void setCitationCountMetadata(MetadataInteger citationCount)
	{
		this.citationCount = citationCount;
	}

	public GoogleScholarSearch getCitationsPage()
	{
		return citationsPage;
	}

	public void setCitationsPage(GoogleScholarSearch citationsPage)
	{
		this.citationsPage = citationsPage;
	}

	public GoogleScholarSearch getRelatedArticlesPage()
	{
		return relatedArticlesPage;
	}

	public void setRelatedArticlesPage(GoogleScholarSearch relatedArticlesPage)
	{
		this.relatedArticlesPage = relatedArticlesPage;
	}

	public MetadataInteger	versionCount()
	{
		MetadataInteger	result = this.versionCount;
		if (result == null)
		{
			result = new MetadataInteger();
			this.versionCount = result;
		}
		return result;
	}

	public Integer getVersionCount()
	{
		return this.versionCount == null ? 0 : versionCount().getValue();
	}

	public MetadataInteger getVersionCountMetadata()
	{
		return versionCount;
	}

	public void setVersionCount(Integer versionCount)
	{
		if (versionCount != 0)
			this.versionCount().setValue(versionCount);
	}

	public void setVersionCountMetadata(MetadataInteger versionCount)
	{
		this.versionCount = versionCount;
	}

	public GoogleScholarSearch getVersionsPage()
	{
		return versionsPage;
	}

	public void setVersionsPage(GoogleScholarSearch versionsPage)
	{
		this.versionsPage = versionsPage;
	}

	public List<RichDocument> getAccessLinks()
	{
		return accessLinks;
	}

  // lazy evaluation:
  public List<RichDocument> accessLinks()
  {
    if (accessLinks == null)
      accessLinks = new ArrayList<RichDocument>();
    return accessLinks;
  }

  // addTo:
  public void addToAccessLinks(RichDocument element)
  {
    accessLinks().add(element);
  }

  // size:
  public int accessLinksSize()
  {
    return accessLinks == null ? 0 : accessLinks.size();
  }

	public void setAccessLinks(List<RichDocument> accessLinks)
	{
		this.accessLinks = accessLinks;
	}
}
