package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  PdfMixin.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * For metadata fields extracted by the PDF parser
 */ 
@simpl_inherit
public class PdfMixin extends Metadata
{
	/** 
	 * The author of the pdf document
	 */ 
	@simpl_scalar	
	private MetadataString author;

	/** 
	 * Summary of the pdf document
	 */ 
	@simpl_scalar	
	private MetadataString summary;

	/** 
	 * Key Words of the document
	 */ 
	@simpl_scalar	
	private MetadataString pdfKeywordsString;

	/** 
	 * Subject of the document
	 */ 
	@simpl_scalar	
	private MetadataString subject;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString trapped;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString modified;

	/** 
	 * Contents of the document
	 */ 
	@simpl_scalar	
	private MetadataString contents;

	/** 
	 * Creation date of the document
	 */ 
	@simpl_scalar	
	private MetadataString creationdate;

	public PdfMixin()
	{ }

	public PdfMixin(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	author()
	{
		MetadataString	result = this.author;
		if (result == null)
		{
			result = new MetadataString();
			this.author = result;
		}
		return result;
	}

	public String getAuthor()
	{
		return this.author == null ? null : author().getValue();
	}

	public MetadataString getAuthorMetadata()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		if (author != null)
			this.author().setValue(author);
	}

	public void setAuthorMetadata(MetadataString author)
	{
		this.author = author;
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
		return this.summary == null ? null : summary().getValue();
	}

	public MetadataString getSummaryMetadata()
	{
		return summary;
	}

	public void setSummary(String summary)
	{
		if (summary != null)
			this.summary().setValue(summary);
	}

	public void setSummaryMetadata(MetadataString summary)
	{
		this.summary = summary;
	}

	public MetadataString	pdfKeywordsString()
	{
		MetadataString	result = this.pdfKeywordsString;
		if (result == null)
		{
			result = new MetadataString();
			this.pdfKeywordsString = result;
		}
		return result;
	}

	public String getPdfKeywordsString()
	{
		return this.pdfKeywordsString == null ? null : pdfKeywordsString().getValue();
	}

	public MetadataString getPdfKeywordsStringMetadata()
	{
		return pdfKeywordsString;
	}

	public void setPdfKeywordsString(String pdfKeywordsString)
	{
		if (pdfKeywordsString != null)
			this.pdfKeywordsString().setValue(pdfKeywordsString);
	}

	public void setPdfKeywordsStringMetadata(MetadataString pdfKeywordsString)
	{
		this.pdfKeywordsString = pdfKeywordsString;
	}

	public MetadataString	subject()
	{
		MetadataString	result = this.subject;
		if (result == null)
		{
			result = new MetadataString();
			this.subject = result;
		}
		return result;
	}

	public String getSubject()
	{
		return this.subject == null ? null : subject().getValue();
	}

	public MetadataString getSubjectMetadata()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		if (subject != null)
			this.subject().setValue(subject);
	}

	public void setSubjectMetadata(MetadataString subject)
	{
		this.subject = subject;
	}

	public MetadataString	trapped()
	{
		MetadataString	result = this.trapped;
		if (result == null)
		{
			result = new MetadataString();
			this.trapped = result;
		}
		return result;
	}

	public String getTrapped()
	{
		return this.trapped == null ? null : trapped().getValue();
	}

	public MetadataString getTrappedMetadata()
	{
		return trapped;
	}

	public void setTrapped(String trapped)
	{
		if (trapped != null)
			this.trapped().setValue(trapped);
	}

	public void setTrappedMetadata(MetadataString trapped)
	{
		this.trapped = trapped;
	}

	public MetadataString	modified()
	{
		MetadataString	result = this.modified;
		if (result == null)
		{
			result = new MetadataString();
			this.modified = result;
		}
		return result;
	}

	public String getModified()
	{
		return this.modified == null ? null : modified().getValue();
	}

	public MetadataString getModifiedMetadata()
	{
		return modified;
	}

	public void setModified(String modified)
	{
		if (modified != null)
			this.modified().setValue(modified);
	}

	public void setModifiedMetadata(MetadataString modified)
	{
		this.modified = modified;
	}

	public MetadataString	contents()
	{
		MetadataString	result = this.contents;
		if (result == null)
		{
			result = new MetadataString();
			this.contents = result;
		}
		return result;
	}

	public String getContents()
	{
		return this.contents == null ? null : contents().getValue();
	}

	public MetadataString getContentsMetadata()
	{
		return contents;
	}

	public void setContents(String contents)
	{
		if (contents != null)
			this.contents().setValue(contents);
	}

	public void setContentsMetadata(MetadataString contents)
	{
		this.contents = contents;
	}

	public MetadataString	creationdate()
	{
		MetadataString	result = this.creationdate;
		if (result == null)
		{
			result = new MetadataString();
			this.creationdate = result;
		}
		return result;
	}

	public String getCreationdate()
	{
		return this.creationdate == null ? null : creationdate().getValue();
	}

	public MetadataString getCreationdateMetadata()
	{
		return creationdate;
	}

	public void setCreationdate(String creationdate)
	{
		if (creationdate != null)
			this.creationdate().setValue(creationdate);
	}

	public void setCreationdateMetadata(MetadataString creationdate)
	{
		this.creationdate = creationdate;
	}
}
