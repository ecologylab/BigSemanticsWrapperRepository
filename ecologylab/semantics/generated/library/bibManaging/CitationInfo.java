package ecologylab.semantics.generated.library.bibManaging;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  CitationInfo.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Citation numbers.
 */ 
@simpl_inherit
public class CitationInfo extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataInteger totalCitation;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger selfCitation;

	public CitationInfo()
	{ }

	public CitationInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataInteger	totalCitation()
	{
		MetadataInteger	result = this.totalCitation;
		if (result == null)
		{
			result = new MetadataInteger();
			this.totalCitation = result;
		}
		return result;
	}

	public int getTotalCitation()
	{
		return this.totalCitation().getValue();
	}

	public void setTotalCitation(int totalCitation)
	{
		this.totalCitation().setValue(totalCitation);
	}

	public MetadataInteger	selfCitation()
	{
		MetadataInteger	result = this.selfCitation;
		if (result == null)
		{
			result = new MetadataInteger();
			this.selfCitation = result;
		}
		return result;
	}

	public int getSelfCitation()
	{
		return this.selfCitation().getValue();
	}

	public void setSelfCitation(int selfCitation)
	{
		this.selfCitation().setValue(selfCitation);
	}

}
