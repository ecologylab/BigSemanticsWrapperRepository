package ecologylab.semantics.generated.library.uva;


import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class KeywordSet
extends Metadata
{

@simpl_scalar
private MetadataString	type;



/**
	Constructor
*/
public KeywordSet()
{
 super();
}

/**
	Constructor
*/
public KeywordSet(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for type
*/
public MetadataString	type()
{
	MetadataString	result = this.type;
	if (result == null)
	{
		result = new MetadataString();
		this.type = result;
	}
	return result;
}

/**
	Gets the value of the field type
*/
public String getType()
{
	return this.type().getValue();
}

/**
	Sets the value of the field type
*/
public void setType(String type)
{
	this.type().setValue(type);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: type
*/
public boolean isNullType()
{
	return type == null || type.getValue() == null;
}

/**
	The heavy weight setter method for field type
*/
public void hwSetType(String type)
{
	this.type().setValue(type);
	rebuildCompositeTermVector();
}

/**
	 Sets the type directly.
*/
public void setTypeMetadata(MetadataString type)
{
	this.type = type;
}

/**
	Heavy Weight Direct setter method for type
*/
public void hwSetTypeMetadata(MetadataString type)
{
	if (this.type != null && this.type.getValue() != null && hasTermVector())
		termVector().remove(this.type.termVector());
	this.type = type;
	rebuildCompositeTermVector();
}


}

