package ecologylab.bigsemantics.generated.library.googleScholar;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.scholarlyArticle.ScholarlyArticle;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GoogleScholarArticle extends ScholarlyArticle
{
	@simpl_composite
	@mm_name("article_link")
	private CompoundDocument articleLink;

	@simpl_scalar
	private MetadataString journal;

	@simpl_scalar
	private MetadataString date;

	@simpl_scalar
	private MetadataString publisher;

	@simpl_scalar
	private MetadataString issue;

	@simpl_scalar
	private MetadataString volume;

	@simpl_composite
	@mm_name("citation_graph")
	private Image citationGraph;

	@simpl_scalar
	private MetadataString citationCount;

	@simpl_composite
	@mm_name("google_citations")
	private CompoundDocument googleCitations;

	public GoogleScholarArticle()
	{ super(); }

	public GoogleScholarArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public CompoundDocument getArticleLink()
	{
		return articleLink;
	}

	public void setArticleLink(CompoundDocument articleLink)
	{
		this.articleLink = articleLink;
	}

	public MetadataString	journal()
	{
		MetadataString	result = this.journal;
		if (result == null)
		{
			result = new MetadataString();
			this.journal = result;
		}
		return result;
	}

	public String getJournal()
	{
		return this.journal == null ? null : journal().getValue();
	}

	public MetadataString getJournalMetadata()
	{
		return journal;
	}

	public void setJournal(String journal)
	{
		if (journal != null)
			this.journal().setValue(journal);
	}

	public void setJournalMetadata(MetadataString journal)
	{
		this.journal = journal;
	}

	public MetadataString	date()
	{
		MetadataString	result = this.date;
		if (result == null)
		{
			result = new MetadataString();
			this.date = result;
		}
		return result;
	}

	public String getDate()
	{
		return this.date == null ? null : date().getValue();
	}

	public MetadataString getDateMetadata()
	{
		return date;
	}

	public void setDate(String date)
	{
		if (date != null)
			this.date().setValue(date);
	}

	public void setDateMetadata(MetadataString date)
	{
		this.date = date;
	}

	public MetadataString	publisher()
	{
		MetadataString	result = this.publisher;
		if (result == null)
		{
			result = new MetadataString();
			this.publisher = result;
		}
		return result;
	}

	public String getPublisher()
	{
		return this.publisher == null ? null : publisher().getValue();
	}

	public MetadataString getPublisherMetadata()
	{
		return publisher;
	}

	public void setPublisher(String publisher)
	{
		if (publisher != null)
			this.publisher().setValue(publisher);
	}

	public void setPublisherMetadata(MetadataString publisher)
	{
		this.publisher = publisher;
	}

	public MetadataString	issue()
	{
		MetadataString	result = this.issue;
		if (result == null)
		{
			result = new MetadataString();
			this.issue = result;
		}
		return result;
	}

	public String getIssue()
	{
		return this.issue == null ? null : issue().getValue();
	}

	public MetadataString getIssueMetadata()
	{
		return issue;
	}

	public void setIssue(String issue)
	{
		if (issue != null)
			this.issue().setValue(issue);
	}

	public void setIssueMetadata(MetadataString issue)
	{
		this.issue = issue;
	}

	public MetadataString	volume()
	{
		MetadataString	result = this.volume;
		if (result == null)
		{
			result = new MetadataString();
			this.volume = result;
		}
		return result;
	}

	public String getVolume()
	{
		return this.volume == null ? null : volume().getValue();
	}

	public MetadataString getVolumeMetadata()
	{
		return volume;
	}

	public void setVolume(String volume)
	{
		if (volume != null)
			this.volume().setValue(volume);
	}

	public void setVolumeMetadata(MetadataString volume)
	{
		this.volume = volume;
	}

	public Image getCitationGraph()
	{
		return citationGraph;
	}

	public void setCitationGraph(Image citationGraph)
	{
		this.citationGraph = citationGraph;
	}

	public MetadataString	citationCount()
	{
		MetadataString	result = this.citationCount;
		if (result == null)
		{
			result = new MetadataString();
			this.citationCount = result;
		}
		return result;
	}

	public String getCitationCount()
	{
		return this.citationCount == null ? null : citationCount().getValue();
	}

	public MetadataString getCitationCountMetadata()
	{
		return citationCount;
	}

	public void setCitationCount(String citationCount)
	{
		if (citationCount != null)
			this.citationCount().setValue(citationCount);
	}

	public void setCitationCountMetadata(MetadataString citationCount)
	{
		this.citationCount = citationCount;
	}

	public CompoundDocument getGoogleCitations()
	{
		return googleCitations;
	}

	public void setGoogleCitations(CompoundDocument googleCitations)
	{
		this.googleCitations = googleCitations;
	}
}