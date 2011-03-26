package ecologylab.semantics.generated.library.bibManaging;


import ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	CiteSeerX record for an article.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class CiteseerxRecord
extends ScholarlyArticle
{

@simpl_composite @mm_name("citation_info")
private CitationInfo	citationInfo;



/**
	Constructor
*/
public CiteseerxRecord()
{
 super();
}

/**
	Constructor
*/
public CiteseerxRecord(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for citationInfo
*/
public CitationInfo	citationInfo()
{
	CitationInfo	result = this.citationInfo;
	if (result == null)
	{
		result = new CitationInfo();
		this.citationInfo = result;
	}
	return result;
}

/**
	Get the value of field citationInfo
*/
public CitationInfo getCitationInfo()
{
	return this.citationInfo;
}

/**
	Set the value of field citationInfo
*/
public void setCitationInfo(CitationInfo citationInfo)
{
	this.citationInfo = citationInfo;
}


}

