package ecologylab.semantics.generated.library.publication;


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
public class Subject
extends Metadata
{

@simpl_scalar
private MetadataParsedURL	location;

@simpl_scalar @simpl_composite_as_scalar
private MetadataString	subject;



/**
	Constructor
*/
public Subject()
{
 super();
}

/**
	Constructor
*/
public Subject(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for location
*/
public MetadataParsedURL	location()
{
	MetadataParsedURL	result = this.location;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.location = result;
	}
	return result;
}

/**
	Gets the value of the field location
*/
public ParsedURL getLocation()
{
	return this.location().getValue();
}

/**
	Sets the value of the field location
*/
public void setLocation(ParsedURL location)
{
	this.location().setValue(location);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: location
*/
public boolean isNullLocation()
{
	return location == null || location.getValue() == null;
}

/**
	The heavy weight setter method for field location
*/
public void hwSetLocation(ParsedURL location)
{
	this.location().setValue(location);
	rebuildCompositeTermVector();
}

/**
	 Sets the location directly.
*/
public void setLocationMetadata(MetadataParsedURL location)
{
	this.location = location;
}

/**
	Heavy Weight Direct setter method for location
*/
public void hwSetLocationMetadata(MetadataParsedURL location)
{
	if (this.location != null && this.location.getValue() != null && hasTermVector())
		termVector().remove(this.location.termVector());
	this.location = location;
	rebuildCompositeTermVector();
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

