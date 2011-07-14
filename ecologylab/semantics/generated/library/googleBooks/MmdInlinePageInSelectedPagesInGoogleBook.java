package ecologylab.semantics.generated.library.googleBooks;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlinePageInSelectedPagesInGoogleBook.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlinePageInSelectedPagesInGoogleBook extends Document
{
	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL pageThumbnail;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger pageNumber;

	public MmdInlinePageInSelectedPagesInGoogleBook()
	{ }

	public MmdInlinePageInSelectedPagesInGoogleBook(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	pageThumbnail()
	{
		MetadataParsedURL	result = this.pageThumbnail;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pageThumbnail = result;
		}
		return result;
	}

	public ParsedURL getPageThumbnail()
	{
		return this.pageThumbnail().getValue();
	}

	public void setPageThumbnail(ParsedURL pageThumbnail)
	{
		this.pageThumbnail().setValue(pageThumbnail);
	}

	public MetadataInteger	pageNumber()
	{
		MetadataInteger	result = this.pageNumber;
		if (result == null)
		{
			result = new MetadataInteger();
			this.pageNumber = result;
		}
		return result;
	}

	public int getPageNumber()
	{
		return this.pageNumber().getValue();
	}

	public void setPageNumber(int pageNumber)
	{
		this.pageNumber().setValue(pageNumber);
	}

}
