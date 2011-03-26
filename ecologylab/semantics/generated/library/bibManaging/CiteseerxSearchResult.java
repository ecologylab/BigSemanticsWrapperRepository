package ecologylab.semantics.generated.library.bibManaging;


import ecologylab.semantics.generated.library.search.SearchResult;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class CiteseerxSearchResult
extends SearchResult
{

@simpl_scalar
private MetadataString	citationInfo;



/**
	Constructor
*/
public CiteseerxSearchResult()
{
 super();
}

/**
	Constructor
*/
public CiteseerxSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for citationInfo
*/
public MetadataString	citationInfo()
{
	MetadataString	result = this.citationInfo;
	if (result == null)
	{
		result = new MetadataString();
		this.citationInfo = result;
	}
	return result;
}

/**
	Gets the value of the field citationInfo
*/
public String getCitationInfo()
{
	return this.citationInfo().getValue();
}

/**
	Sets the value of the field citationInfo
*/
public void setCitationInfo(String citationInfo)
{
	this.citationInfo().setValue(citationInfo);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: citationInfo
*/
public boolean isNullCitationInfo()
{
	return citationInfo == null || citationInfo.getValue() == null;
}

/**
	The heavy weight setter method for field citationInfo
*/
public void hwSetCitationInfo(String citationInfo)
{
	this.citationInfo().setValue(citationInfo);
	rebuildCompositeTermVector();
}

/**
	 Sets the citationInfo directly.
*/
public void setCitationInfoMetadata(MetadataString citationInfo)
{
	this.citationInfo = citationInfo;
}

/**
	Heavy Weight Direct setter method for citationInfo
*/
public void hwSetCitationInfoMetadata(MetadataString citationInfo)
{
	if (this.citationInfo != null && this.citationInfo.getValue() != null && hasTermVector())
		termVector().remove(this.citationInfo.termVector());
	this.citationInfo = citationInfo;
	rebuildCompositeTermVector();
}


}

