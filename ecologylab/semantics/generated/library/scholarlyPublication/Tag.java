package ecologylab.semantics.generated.library.scholarlyPublication;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Tag
extends Metadata
{

@simpl_scalar
private MetadataString	tagName;

@simpl_scalar
private MetadataParsedURL	link;



/**
	Constructor
*/
public Tag()
{
 super();
}

/**
	Constructor
*/
public Tag(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for tagName
*/
public MetadataString	tagName()
{
	MetadataString	result = this.tagName;
	if (result == null)
	{
		result = new MetadataString();
		this.tagName = result;
	}
	return result;
}

/**
	Gets the value of the field tagName
*/
public String getTagName()
{
	return this.tagName().getValue();
}

/**
	Sets the value of the field tagName
*/
public void setTagName(String tagName)
{
	this.tagName().setValue(tagName);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: tagName
*/
public boolean isNullTagName()
{
	return tagName == null || tagName.getValue() == null;
}

/**
	The heavy weight setter method for field tagName
*/
public void hwSetTagName(String tagName)
{
	this.tagName().setValue(tagName);
	rebuildCompositeTermVector();
}

/**
	 Sets the tagName directly.
*/
public void setTagNameMetadata(MetadataString tagName)
{
	this.tagName = tagName;
}

/**
	Heavy Weight Direct setter method for tagName
*/
public void hwSetTagNameMetadata(MetadataString tagName)
{
	if (this.tagName != null && this.tagName.getValue() != null && hasTermVector())
		termVector().remove(this.tagName.termVector());
	this.tagName = tagName;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for link
*/
public MetadataParsedURL	link()
{
	MetadataParsedURL	result = this.link;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.link = result;
	}
	return result;
}

/**
	Gets the value of the field link
*/
public ParsedURL getLink()
{
	return this.link().getValue();
}

/**
	Sets the value of the field link
*/
public void setLink(ParsedURL link)
{
	this.link().setValue(link);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: link
*/
public boolean isNullLink()
{
	return link == null || link.getValue() == null;
}

/**
	The heavy weight setter method for field link
*/
public void hwSetLink(ParsedURL link)
{
	this.link().setValue(link);
	rebuildCompositeTermVector();
}

/**
	 Sets the link directly.
*/
public void setLinkMetadata(MetadataParsedURL link)
{
	this.link = link;
}

/**
	Heavy Weight Direct setter method for link
*/
public void hwSetLinkMetadata(MetadataParsedURL link)
{
	if (this.link != null && this.link.getValue() != null && hasTermVector())
		termVector().remove(this.link.termVector());
	this.link = link;
	rebuildCompositeTermVector();
}


}

