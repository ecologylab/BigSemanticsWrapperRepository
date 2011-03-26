package ecologylab.semantics.generated.library.misc;


import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	The NSDL class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Nsdl
extends Document
{

@simpl_scalar
private MetadataString	subject;



/**
	Constructor
*/
public Nsdl()
{
 super();
}

/**
	Constructor
*/
public Nsdl(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for subject
*/
public MetadataString	subject()
{
	MetadataString	result = this.subject;
	if (result == null)
	{
		result = new MetadataString();
		this.subject = result;
	}
	return result;
}

/**
	Gets the value of the field subject
*/
public String getSubject()
{
	return this.subject().getValue();
}

/**
	Sets the value of the field subject
*/
public void setSubject(String subject)
{
	this.subject().setValue(subject);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: subject
*/
public boolean isNullSubject()
{
	return subject == null || subject.getValue() == null;
}

/**
	The heavy weight setter method for field subject
*/
public void hwSetSubject(String subject)
{
	this.subject().setValue(subject);
	rebuildCompositeTermVector();
}

/**
	 Sets the subject directly.
*/
public void setSubjectMetadata(MetadataString subject)
{
	this.subject = subject;
}

/**
	Heavy Weight Direct setter method for subject
*/
public void hwSetSubjectMetadata(MetadataString subject)
{
	if (this.subject != null && this.subject.getValue() != null && hasTermVector())
		termVector().remove(this.subject.termVector());
	this.subject = subject;
	rebuildCompositeTermVector();
}


}

