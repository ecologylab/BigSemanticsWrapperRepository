package ecologylab.semantics.generated.library.opml;


import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Head
extends Metadata
{

@simpl_scalar
private MetadataString	title;



/**
	Constructor
*/
public Head()
{
 super();
}

/**
	Constructor
*/
public Head(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for title
*/
public MetadataString	title()
{
	MetadataString	result = this.title;
	if (result == null)
	{
		result = new MetadataString();
		this.title = result;
	}
	return result;
}

/**
	Gets the value of the field title
*/
public String getTitle()
{
	return this.title().getValue();
}

/**
	Sets the value of the field title
*/
public void setTitle(String title)
{
	this.title().setValue(title);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: title
*/
public boolean isNullTitle()
{
	return title == null || title.getValue() == null;
}

/**
	The heavy weight setter method for field title
*/
public void hwSetTitle(String title)
{
	this.title().setValue(title);
	rebuildCompositeTermVector();
}

/**
	 Sets the title directly.
*/
public void setTitleMetadata(MetadataString title)
{
	this.title = title;
}

/**
	Heavy Weight Direct setter method for title
*/
public void hwSetTitleMetadata(MetadataString title)
{
	if (this.title != null && this.title.getValue() != null && hasTermVector())
		termVector().remove(this.title.termVector());
	this.title = title;
	rebuildCompositeTermVector();
}


}

