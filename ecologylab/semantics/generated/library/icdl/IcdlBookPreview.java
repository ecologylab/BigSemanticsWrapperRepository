package ecologylab.semantics.generated.library.icdl;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.publication.Author;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  IcdlBookPreview.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * ICDL About This Book Page
 */ 
@simpl_inherit
public class IcdlBookPreview extends Metadata
{
	/** 
	 */ 
	@simpl_composite @mm_name("author")	private Author author;

	/** 
	 */ 
	@simpl_composite @mm_name("illustrator")	private Author illustrator;

	/** 
	 */ 
	@simpl_scalar	private MetadataString summary;

	/** 
	 */ 
	@simpl_scalar	private MetadataString year;

	/** 
	 */ 
	@simpl_scalar	private MetadataString languages;

	/** 
	 */ 
	@simpl_scalar	private MetadataString publisher;

	/** 
	 */ 
	@simpl_scalar	private MetadataString isbn;

	/** 
	 */ 
	@simpl_scalar	private MetadataString awards;

	public IcdlBookPreview()
	{ }

	public IcdlBookPreview(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Author getAuthor()
	{
		return author;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}

	public Author getIllustrator()
	{
		return illustrator;
	}

	public void setIllustrator(Author illustrator)
	{
		this.illustrator = illustrator;
	}
	public MetadataString	summary()
	{
		MetadataString	result = this.summary;
		if (result == null)
		{
			result = new MetadataString();
			this.summary = result;
		}
		return result;
	}

	public String getSummary()
	{
		return this.summary().getValue();
	}

	public void setSummary(String summary)
	{
		this.summary().setValue(summary);
	}

	public MetadataString	year()
	{
		MetadataString	result = this.year;
		if (result == null)
		{
			result = new MetadataString();
			this.year = result;
		}
		return result;
	}

	public String getYear()
	{
		return this.year().getValue();
	}

	public void setYear(String year)
	{
		this.year().setValue(year);
	}

	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages().getValue();
	}

	public void setLanguages(String languages)
	{
		this.languages().setValue(languages);
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
		return this.publisher().getValue();
	}

	public void setPublisher(String publisher)
	{
		this.publisher().setValue(publisher);
	}

	public MetadataString	isbn()
	{
		MetadataString	result = this.isbn;
		if (result == null)
		{
			result = new MetadataString();
			this.isbn = result;
		}
		return result;
	}

	public String getIsbn()
	{
		return this.isbn().getValue();
	}

	public void setIsbn(String isbn)
	{
		this.isbn().setValue(isbn);
	}

	public MetadataString	awards()
	{
		MetadataString	result = this.awards;
		if (result == null)
		{
			result = new MetadataString();
			this.awards = result;
		}
		return result;
	}

	public String getAwards()
	{
		return this.awards().getValue();
	}

	public void setAwards(String awards)
	{
		this.awards().setValue(awards);
	}

}
