package ecologylab.semantics.generated.library.scholarlyPublication;


import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class AcmPortalSearchResult
extends SearchResult
{

@simpl_scalar
private MetadataString	authorList;

@simpl_scalar
private MetadataString	publication;



/**
	Constructor
*/
public AcmPortalSearchResult()
{
 super();
}

/**
	Constructor
*/
public AcmPortalSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for authorList
*/
public MetadataString	authorList()
{
	MetadataString	result = this.authorList;
	if (result == null)
	{
		result = new MetadataString();
		this.authorList = result;
	}
	return result;
}

/**
	Gets the value of the field authorList
*/
public String getAuthorList()
{
	return this.authorList().getValue();
}

/**
	Sets the value of the field authorList
*/
public void setAuthorList(String authorList)
{
	this.authorList().setValue(authorList);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: authorList
*/
public boolean isNullAuthorList()
{
	return authorList == null || authorList.getValue() == null;
}

/**
	The heavy weight setter method for field authorList
*/
public void hwSetAuthorList(String authorList)
{
	this.authorList().setValue(authorList);
	rebuildCompositeTermVector();
}

/**
	 Sets the authorList directly.
*/
public void setAuthorListMetadata(MetadataString authorList)
{
	this.authorList = authorList;
}

/**
	Heavy Weight Direct setter method for authorList
*/
public void hwSetAuthorListMetadata(MetadataString authorList)
{
	if (this.authorList != null && this.authorList.getValue() != null && hasTermVector())
		termVector().remove(this.authorList.termVector());
	this.authorList = authorList;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for publication
*/
public MetadataString	publication()
{
	MetadataString	result = this.publication;
	if (result == null)
	{
		result = new MetadataString();
		this.publication = result;
	}
	return result;
}

/**
	Gets the value of the field publication
*/
public String getPublication()
{
	return this.publication().getValue();
}

/**
	Sets the value of the field publication
*/
public void setPublication(String publication)
{
	this.publication().setValue(publication);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: publication
*/
public boolean isNullPublication()
{
	return publication == null || publication.getValue() == null;
}

/**
	The heavy weight setter method for field publication
*/
public void hwSetPublication(String publication)
{
	this.publication().setValue(publication);
	rebuildCompositeTermVector();
}

/**
	 Sets the publication directly.
*/
public void setPublicationMetadata(MetadataString publication)
{
	this.publication = publication;
}

/**
	Heavy Weight Direct setter method for publication
*/
public void hwSetPublicationMetadata(MetadataString publication)
{
	if (this.publication != null && this.publication.getValue() != null && hasTermVector())
		termVector().remove(this.publication.termVector());
	this.publication = publication;
	rebuildCompositeTermVector();
}


}

