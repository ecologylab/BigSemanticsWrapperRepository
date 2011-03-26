package ecologylab.semantics.generated.library.nsdl;


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
public class Header
extends Metadata
{

@simpl_scalar @xml_tag("resourceIdentifier")
private MetadataParsedURL	resourceIdentifier;



/**
	Constructor
*/
public Header()
{
 super();
}

/**
	Constructor
*/
public Header(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for resourceIdentifier
*/
public MetadataParsedURL	resourceIdentifier()
{
	MetadataParsedURL	result = this.resourceIdentifier;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.resourceIdentifier = result;
	}
	return result;
}

/**
	Gets the value of the field resourceIdentifier
*/
public ParsedURL getResourceIdentifier()
{
	return this.resourceIdentifier().getValue();
}

/**
	Sets the value of the field resourceIdentifier
*/
public void setResourceIdentifier(ParsedURL resourceIdentifier)
{
	this.resourceIdentifier().setValue(resourceIdentifier);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: resourceIdentifier
*/
public boolean isNullResourceIdentifier()
{
	return resourceIdentifier == null || resourceIdentifier.getValue() == null;
}

/**
	The heavy weight setter method for field resourceIdentifier
*/
public void hwSetResourceIdentifier(ParsedURL resourceIdentifier)
{
	this.resourceIdentifier().setValue(resourceIdentifier);
	rebuildCompositeTermVector();
}

/**
	 Sets the resourceIdentifier directly.
*/
public void setResourceIdentifierMetadata(MetadataParsedURL resourceIdentifier)
{
	this.resourceIdentifier = resourceIdentifier;
}

/**
	Heavy Weight Direct setter method for resourceIdentifier
*/
public void hwSetResourceIdentifierMetadata(MetadataParsedURL resourceIdentifier)
{
	if (this.resourceIdentifier != null && this.resourceIdentifier.getValue() != null && hasTermVector())
		termVector().remove(this.resourceIdentifier.termVector());
	this.resourceIdentifier = resourceIdentifier;
	rebuildCompositeTermVector();
}


}

