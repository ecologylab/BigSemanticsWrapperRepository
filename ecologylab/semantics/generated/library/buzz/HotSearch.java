package ecologylab.semantics.generated.library.buzz;


import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class HotSearch
extends Metadata
{

@simpl_scalar
private MetadataString	search;



/**
	Constructor
*/
public HotSearch()
{
 super();
}

/**
	Constructor
*/
public HotSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for search
*/
public MetadataString	search()
{
	MetadataString	result = this.search;
	if (result == null)
	{
		result = new MetadataString();
		this.search = result;
	}
	return result;
}

/**
	Gets the value of the field search
*/
public String getSearch()
{
	return this.search().getValue();
}

/**
	Sets the value of the field search
*/
public void setSearch(String search)
{
	this.search().setValue(search);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: search
*/
public boolean isNullSearch()
{
	return search == null || search.getValue() == null;
}

/**
	The heavy weight setter method for field search
*/
public void hwSetSearch(String search)
{
	this.search().setValue(search);
	rebuildCompositeTermVector();
}

/**
	 Sets the search directly.
*/
public void setSearchMetadata(MetadataString search)
{
	this.search = search;
}

/**
	Heavy Weight Direct setter method for search
*/
public void hwSetSearchMetadata(MetadataString search)
{
	if (this.search != null && this.search.getValue() != null && hasTermVector())
		termVector().remove(this.search.termVector());
	this.search = search;
	rebuildCompositeTermVector();
}


}

