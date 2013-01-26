package ecologylab.semantics.generated.library.googleBook;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Page extends Document
{
	@simpl_scalar
	private MetadataParsedURL pageThumbnail;

	@simpl_scalar
	private MetadataInteger pageNumber;

	public Page()
	{ super(); }

	public Page(MetaMetadataCompositeField mmd) {
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
		return this.pageThumbnail == null ? null : pageThumbnail().getValue();
	}

	public MetadataParsedURL getPageThumbnailMetadata()
	{
		return pageThumbnail;
	}

	public void setPageThumbnail(ParsedURL pageThumbnail)
	{
		if (pageThumbnail != null)
			this.pageThumbnail().setValue(pageThumbnail);
	}

	public void setPageThumbnailMetadata(MetadataParsedURL pageThumbnail)
	{
		this.pageThumbnail = pageThumbnail;
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

	public Integer getPageNumber()
	{
		return this.pageNumber == null ? 0 : pageNumber().getValue();
	}

	public MetadataInteger getPageNumberMetadata()
	{
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber)
	{
		if (pageNumber != 0)
			this.pageNumber().setValue(pageNumber);
	}

	public void setPageNumberMetadata(MetadataInteger pageNumber)
	{
		this.pageNumber = pageNumber;
	}
}
