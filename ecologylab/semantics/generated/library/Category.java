package ecologylab.semantics.generated.library;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Wikipedia Categories

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Category
extends Metadata
{

@simpl_scalar
private MetadataString	name;

@simpl_scalar
private MetadataParsedURL	catLink;



/**
	Constructor
*/
public Category()
{
 super();
}

/**
	Constructor
*/
public Category(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for name
*/
public MetadataString	name()
{
	MetadataString	result = this.name;
	if (result == null)
	{
		result = new MetadataString();
		this.name = result;
	}
	return result;
}

/**
	Gets the value of the field name
*/
public String getName()
{
	return this.name().getValue();
}

/**
	Sets the value of the field name
*/
public void setName(String name)
{
	this.name().setValue(name);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: name
*/
public boolean isNullName()
{
	return name == null || name.getValue() == null;
}

/**
	The heavy weight setter method for field name
*/
public void hwSetName(String name)
{
	this.name().setValue(name);
	rebuildCompositeTermVector();
}

/**
	 Sets the name directly.
*/
public void setNameMetadata(MetadataString name)
{
	this.name = name;
}

/**
	Heavy Weight Direct setter method for name
*/
public void hwSetNameMetadata(MetadataString name)
{
	if (this.name != null && this.name.getValue() != null && hasTermVector())
		termVector().remove(this.name.termVector());
	this.name = name;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for catLink
*/
public MetadataParsedURL	catLink()
{
	MetadataParsedURL	result = this.catLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.catLink = result;
	}
	return result;
}

/**
	Gets the value of the field catLink
*/
public ParsedURL getCatLink()
{
	return this.catLink().getValue();
}

/**
	Sets the value of the field catLink
*/
public void setCatLink(ParsedURL catLink)
{
	this.catLink().setValue(catLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: catLink
*/
public boolean isNullCatLink()
{
	return catLink == null || catLink.getValue() == null;
}

/**
	The heavy weight setter method for field catLink
*/
public void hwSetCatLink(ParsedURL catLink)
{
	this.catLink().setValue(catLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the catLink directly.
*/
public void setCatLinkMetadata(MetadataParsedURL catLink)
{
	this.catLink = catLink;
}

/**
	Heavy Weight Direct setter method for catLink
*/
public void hwSetCatLinkMetadata(MetadataParsedURL catLink)
{
	if (this.catLink != null && this.catLink.getValue() != null && hasTermVector())
		termVector().remove(this.catLink.termVector());
	this.catLink = catLink;
	rebuildCompositeTermVector();
}


}

