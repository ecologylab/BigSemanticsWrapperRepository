package ecologylab.semantics.generated.library.imdb;


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
public class Genre
extends Metadata
{

@simpl_scalar
private MetadataParsedURL	genreLink;

@simpl_scalar
private MetadataString	name;



/**
	Constructor
*/
public Genre()
{
 super();
}

/**
	Constructor
*/
public Genre(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for genreLink
*/
public MetadataParsedURL	genreLink()
{
	MetadataParsedURL	result = this.genreLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.genreLink = result;
	}
	return result;
}

/**
	Gets the value of the field genreLink
*/
public ParsedURL getGenreLink()
{
	return this.genreLink().getValue();
}

/**
	Sets the value of the field genreLink
*/
public void setGenreLink(ParsedURL genreLink)
{
	this.genreLink().setValue(genreLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: genreLink
*/
public boolean isNullGenreLink()
{
	return genreLink == null || genreLink.getValue() == null;
}

/**
	The heavy weight setter method for field genreLink
*/
public void hwSetGenreLink(ParsedURL genreLink)
{
	this.genreLink().setValue(genreLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the genreLink directly.
*/
public void setGenreLinkMetadata(MetadataParsedURL genreLink)
{
	this.genreLink = genreLink;
}

/**
	Heavy Weight Direct setter method for genreLink
*/
public void hwSetGenreLinkMetadata(MetadataParsedURL genreLink)
{
	if (this.genreLink != null && this.genreLink.getValue() != null && hasTermVector())
		termVector().remove(this.genreLink.termVector());
	this.genreLink = genreLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for name
*/
public MetadataString	name()
{
	MetadataString	result = this.name;
	if (result == null)
	{
		result = new MetadataString();
		this.name = result;
	}
	return result;
}

/**
	Gets the value of the field name
*/
public String getName()
{
	return this.name().getValue();
}

/**
	Sets the value of the field name
*/
public void setName(String name)
{
	this.name().setValue(name);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: name
*/
public boolean isNullName()
{
	return name == null || name.getValue() == null;
}

/**
	The heavy weight setter method for field name
*/
public void hwSetName(String name)
{
	this.name().setValue(name);
	rebuildCompositeTermVector();
}

/**
	 Sets the name directly.
*/
public void setNameMetadata(MetadataString name)
{
	this.name = name;
}

/**
	Heavy Weight Direct setter method for name
*/
public void hwSetNameMetadata(MetadataString name)
{
	if (this.name != null && this.name.getValue() != null && hasTermVector())
		termVector().remove(this.name.termVector());
	this.name = name;
	rebuildCompositeTermVector();
}


}

