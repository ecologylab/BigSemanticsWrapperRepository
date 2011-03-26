package ecologylab.semantics.generated.library;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	An article on wikipedia (used in cF)

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class WikipediaPage
extends WikipediaPageType
{

@simpl_scalar
private MetadataParsedURL	mainImageSrc;



/**
	Constructor
*/
public WikipediaPage()
{
 super();
}

/**
	Constructor
*/
public WikipediaPage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for mainImageSrc
*/
public MetadataParsedURL	mainImageSrc()
{
	MetadataParsedURL	result = this.mainImageSrc;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.mainImageSrc = result;
	}
	return result;
}

/**
	Gets the value of the field mainImageSrc
*/
public ParsedURL getMainImageSrc()
{
	return this.mainImageSrc().getValue();
}

/**
	Sets the value of the field mainImageSrc
*/
public void setMainImageSrc(ParsedURL mainImageSrc)
{
	this.mainImageSrc().setValue(mainImageSrc);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: mainImageSrc
*/
public boolean isNullMainImageSrc()
{
	return mainImageSrc == null || mainImageSrc.getValue() == null;
}

/**
	The heavy weight setter method for field mainImageSrc
*/
public void hwSetMainImageSrc(ParsedURL mainImageSrc)
{
	this.mainImageSrc().setValue(mainImageSrc);
	rebuildCompositeTermVector();
}

/**
	 Sets the mainImageSrc directly.
*/
public void setMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{
	this.mainImageSrc = mainImageSrc;
}

/**
	Heavy Weight Direct setter method for mainImageSrc
*/
public void hwSetMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{
	if (this.mainImageSrc != null && this.mainImageSrc.getValue() != null && hasTermVector())
		termVector().remove(this.mainImageSrc.termVector());
	this.mainImageSrc = mainImageSrc;
	rebuildCompositeTermVector();
}


}

