package ecologylab.semantics.generated.library.fastflip;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Thumbnail
extends Metadata
{

@simpl_scalar
private MetadataParsedURL	pic;



/**
	Constructor
*/
public Thumbnail()
{
 super();
}

/**
	Constructor
*/
public Thumbnail(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for pic
*/
public MetadataParsedURL	pic()
{
	MetadataParsedURL	result = this.pic;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.pic = result;
	}
	return result;
}

/**
	Gets the value of the field pic
*/
public ParsedURL getPic()
{
	return this.pic().getValue();
}

/**
	Sets the value of the field pic
*/
public void setPic(ParsedURL pic)
{
	this.pic().setValue(pic);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pic
*/
public boolean isNullPic()
{
	return pic == null || pic.getValue() == null;
}

/**
	The heavy weight setter method for field pic
*/
public void hwSetPic(ParsedURL pic)
{
	this.pic().setValue(pic);
	rebuildCompositeTermVector();
}

/**
	 Sets the pic directly.
*/
public void setPicMetadata(MetadataParsedURL pic)
{
	this.pic = pic;
}

/**
	Heavy Weight Direct setter method for pic
*/
public void hwSetPicMetadata(MetadataParsedURL pic)
{
	if (this.pic != null && this.pic.getValue() != null && hasTermVector())
		termVector().remove(this.pic.termVector());
	this.pic = pic;
	rebuildCompositeTermVector();
}


}

