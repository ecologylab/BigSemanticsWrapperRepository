package ecologylab.semantics.generated.library.misc;


import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Image from The Interantional Children's digital library.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class IcdlImage
extends Image
{


/**
	The language of the library
*/
@simpl_scalar
private MetadataString	languages;



/**
	Constructor
*/
public IcdlImage()
{
 super();
}

/**
	Constructor
*/
public IcdlImage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for languages
*/
public MetadataString	languages()
{
	MetadataString	result = this.languages;
	if (result == null)
	{
		result = new MetadataString();
		this.languages = result;
	}
	return result;
}

/**
	Gets the value of the field languages
*/
public String getLanguages()
{
	return this.languages().getValue();
}

/**
	Sets the value of the field languages
*/
public void setLanguages(String languages)
{
	this.languages().setValue(languages);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: languages
*/
public boolean isNullLanguages()
{
	return languages == null || languages.getValue() == null;
}

/**
	The heavy weight setter method for field languages
*/
public void hwSetLanguages(String languages)
{
	this.languages().setValue(languages);
	rebuildCompositeTermVector();
}

/**
	 Sets the languages directly.
*/
public void setLanguagesMetadata(MetadataString languages)
{
	this.languages = languages;
}

/**
	Heavy Weight Direct setter method for languages
*/
public void hwSetLanguagesMetadata(MetadataString languages)
{
	if (this.languages != null && this.languages.getValue() != null && hasTermVector())
		termVector().remove(this.languages.termVector());
	this.languages = languages;
	rebuildCompositeTermVector();
}


}

