package ecologylab.semantics.generated.library.uva;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Topic.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * For Collabartion with UVA's Cluster formation project.
 */ 
@simpl_inherit
public class Topic extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private MetadataStringBuilder contentKeywords;

	/** 
	 */ 
	@simpl_scalar	private MetadataStringBuilder anchorKeywords;

	/** 
	 */ 
	@simpl_scalar	private MetadataStringBuilder urlKeywords;

	/** 
	 */ 
	@simpl_scalar	private MetadataStringBuilder titleKeywords;

	/** 
	 */ 
	@simpl_scalar	private MetadataInteger id;

	public Topic()
	{ }

	public Topic(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataStringBuilder	contentKeywords()
	{
		MetadataStringBuilder	result = this.contentKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.contentKeywords = result;
		}
		return result;
	}

	public StringBuilder getContentKeywords()
	{
		return this.contentKeywords().getValue();
	}

	public void setContentKeywords(StringBuilder contentKeywords)
	{
		this.contentKeywords().setValue(contentKeywords);
	}

	public MetadataStringBuilder	anchorKeywords()
	{
		MetadataStringBuilder	result = this.anchorKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.anchorKeywords = result;
		}
		return result;
	}

	public StringBuilder getAnchorKeywords()
	{
		return this.anchorKeywords().getValue();
	}

	public void setAnchorKeywords(StringBuilder anchorKeywords)
	{
		this.anchorKeywords().setValue(anchorKeywords);
	}

	public MetadataStringBuilder	urlKeywords()
	{
		MetadataStringBuilder	result = this.urlKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.urlKeywords = result;
		}
		return result;
	}

	public StringBuilder getUrlKeywords()
	{
		return this.urlKeywords().getValue();
	}

	public void setUrlKeywords(StringBuilder urlKeywords)
	{
		this.urlKeywords().setValue(urlKeywords);
	}

	public MetadataStringBuilder	titleKeywords()
	{
		MetadataStringBuilder	result = this.titleKeywords;
		if (result == null)
		{
			result = new MetadataStringBuilder();
			this.titleKeywords = result;
		}
		return result;
	}

	public StringBuilder getTitleKeywords()
	{
		return this.titleKeywords().getValue();
	}

	public void setTitleKeywords(StringBuilder titleKeywords)
	{
		this.titleKeywords().setValue(titleKeywords);
	}

	public MetadataInteger	id()
	{
		MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public int getId()
	{
		return this.id().getValue();
	}

	public void setId(int id)
	{
		this.id().setValue(id);
	}

}
