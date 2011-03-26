package ecologylab.semantics.generated.library.search;


import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Bing image search result.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class BingImageSearchResult
extends ImageInSearchResult
{

@simpl_composite @xml_tag("mms:Thumbnail") @mm_name("thumbnail")
private ImageInSearchResult	thumbnail;



/**
	Constructor
*/
public BingImageSearchResult()
{
 super();
}

/**
	Constructor
*/
public BingImageSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for thumbnail
*/
public ImageInSearchResult	thumbnail()
{
	ImageInSearchResult	result = this.thumbnail;
	if (result == null)
	{
		result = new ImageInSearchResult();
		this.thumbnail = result;
	}
	return result;
}

/**
	Get the value of field thumbnail
*/
public ImageInSearchResult getThumbnail()
{
	return this.thumbnail;
}

/**
	Set the value of field thumbnail
*/
public void setThumbnail(ImageInSearchResult thumbnail)
{
	this.thumbnail = thumbnail;
}


}

