package ecologylab.semantics.generated.library.opml;


import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Opml
extends Document
{

@simpl_composite @mm_name("head")
private Head	head;

@simpl_composite @mm_name("body")
private Body	body;



/**
	Constructor
*/
public Opml()
{
 super();
}

/**
	Constructor
*/
public Opml(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for head
*/
public Head	head()
{
	Head	result = this.head;
	if (result == null)
	{
		result = new Head();
		this.head = result;
	}
	return result;
}

/**
	Get the value of field head
*/
public Head getHead()
{
	return this.head;
}

/**
	Set the value of field head
*/
public void setHead(Head head)
{
	this.head = head;
}

/**
	Lazy evaluation for body
*/
public Body	body()
{
	Body	result = this.body;
	if (result == null)
	{
		result = new Body();
		this.body = result;
	}
	return result;
}

/**
	Get the value of field body
*/
public Body getBody()
{
	return this.body;
}

/**
	Set the value of field body
*/
public void setBody(Body body)
{
	this.body = body;
}


}

