package ecologylab.semantics.generated.library.publication;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Term
extends Metadata
{

@simpl_scalar
private MetadataParsedURL	location;

@simpl_scalar @simpl_composite_as_scalar
private MetadataString	term;

@simpl_scalar
private MetadataInteger	frequency;



/**
	Constructor
*/
public Term()
{
 super();
}

/**
	Constructor
*/
public Term(MetaMetadataCompositeField metaMetadata)
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
	Lazy evaluation for term
*/
public MetadataString	term()
{
	MetadataString	result = this.term;
	if (result == null)
	{
		result = new MetadataString();
		this.term = result;
	}
	return result;
}

/**
	Gets the value of the field term
*/
public String getTerm()
{
	return this.term().getValue();
}

/**
	Sets the value of the field term
*/
public void setTerm(String term)
{
	this.term().setValue(term);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: term
*/
public boolean isNullTerm()
{
	return term == null || term.getValue() == null;
}

/**
	The heavy weight setter method for field term
*/
public void hwSetTerm(String term)
{
	this.term().setValue(term);
	rebuildCompositeTermVector();
}

/**
	 Sets the term directly.
*/
public void setTermMetadata(MetadataString term)
{
	this.term = term;
}

/**
	Heavy Weight Direct setter method for term
*/
public void hwSetTermMetadata(MetadataString term)
{
	if (this.term != null && this.term.getValue() != null && hasTermVector())
		termVector().remove(this.term.termVector());
	this.term = term;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for frequency
*/
public MetadataInteger	frequency()
{
	MetadataInteger	result = this.frequency;
	if (result == null)
	{
		result = new MetadataInteger();
		this.frequency = result;
	}
	return result;
}

/**
	Gets the value of the field frequency
*/
public Integer getFrequency()
{
	return this.frequency().getValue();
}

/**
	Sets the value of the field frequency
*/
public void setFrequency(Integer frequency)
{
	this.frequency().setValue(frequency);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: frequency
*/
public boolean isNullFrequency()
{
	return frequency == null || frequency.getValue() == null;
}

/**
	The heavy weight setter method for field frequency
*/
public void hwSetFrequency(Integer frequency)
{
	this.frequency().setValue(frequency);
	rebuildCompositeTermVector();
}

/**
	 Sets the frequency directly.
*/
public void setFrequencyMetadata(MetadataInteger frequency)
{
	this.frequency = frequency;
}

/**
	Heavy Weight Direct setter method for frequency
*/
public void hwSetFrequencyMetadata(MetadataInteger frequency)
{
	if (this.frequency != null && this.frequency.getValue() != null && hasTermVector())
		termVector().remove(this.frequency.termVector());
	this.frequency = frequency;
	rebuildCompositeTermVector();
}


}

