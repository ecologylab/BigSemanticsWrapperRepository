package ecologylab.semantics.generated.library.nsdl;


import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	this_should_be_document

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class NsdlDocument
extends Metadata
{

@simpl_composite @mm_name("header")
private Header	header;



/**
	Constructor
*/
public NsdlDocument()
{
 super();
}

/**
	Constructor
*/
public NsdlDocument(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for header
*/
public Header	header()
{
	Header	result = this.header;
	if (result == null)
	{
		result = new Header();
		this.header = result;
	}
	return result;
}

/**
	Get the value of field header
*/
public Header getHeader()
{
	return this.header;
}

/**
	Set the value of field header
*/
public void setHeader(Header header)
{
	this.header = header;
}


}

