package ecologylab.semantics.generated.library.dlese;

import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.dlese.Collection;
import ecologylab.semantics.generated.library.dlese.AdditionalMetadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.Date;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;

/**
*  DleseRecordHead.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class DleseRecordHead extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString id;

	/** 
	 */ 
	@simpl_scalar	@simpl_tag("fileLastModified")	
	private MetadataDate lastModified;

	/** 
	 */ 
	@simpl_scalar	@simpl_tag("xmlFormat")	
	private MetadataString xmlFormat;

	/** 
	 */ 
	@simpl_composite	@mm_name("collection")
	private Collection collection;

	/** 
	 */ 
	@simpl_composite	@simpl_tag("additionalMetadata")	@mm_name("additional_metadata")
	private AdditionalMetadata additionalMetadata;

	public DleseRecordHead()
	{ }

	public DleseRecordHead(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	id()
	{
		MetadataString	result = this.id;
		if (result == null)
		{
			result = new MetadataString();
			this.id = result;
		}
		return result;
	}

	public String getId()
	{
		return this.id == null ? null : id().getValue();
	}

	public MetadataString getIdMetadata()
	{
		return id;
	}

	public void setId(String id)
	{
		if (id != null)
			this.id().setValue(id);
	}

	public void setIdMetadata(MetadataString id)
	{
		this.id = id;
	}

	public MetadataDate	lastModified()
	{
		MetadataDate	result = this.lastModified;
		if (result == null)
		{
			result = new MetadataDate();
			this.lastModified = result;
		}
		return result;
	}

	public Date getLastModified()
	{
		return this.lastModified == null ? null : lastModified().getValue();
	}

	public MetadataDate getLastModifiedMetadata()
	{
		return lastModified;
	}

	public void setLastModified(Date lastModified)
	{
		if (lastModified != null)
			this.lastModified().setValue(lastModified);
	}

	public void setLastModifiedMetadata(MetadataDate lastModified)
	{
		this.lastModified = lastModified;
	}

	public MetadataString	xmlFormat()
	{
		MetadataString	result = this.xmlFormat;
		if (result == null)
		{
			result = new MetadataString();
			this.xmlFormat = result;
		}
		return result;
	}

	public String getXmlFormat()
	{
		return this.xmlFormat == null ? null : xmlFormat().getValue();
	}

	public MetadataString getXmlFormatMetadata()
	{
		return xmlFormat;
	}

	public void setXmlFormat(String xmlFormat)
	{
		if (xmlFormat != null)
			this.xmlFormat().setValue(xmlFormat);
	}

	public void setXmlFormatMetadata(MetadataString xmlFormat)
	{
		this.xmlFormat = xmlFormat;
	}

	public Collection getCollection()
	{
		return collection;
	}

	public void setCollection(Collection collection)
	{
		this.collection = collection;
	}

	public AdditionalMetadata getAdditionalMetadata()
	{
		return additionalMetadata;
	}

	public void setAdditionalMetadata(AdditionalMetadata additionalMetadata)
	{
		this.additionalMetadata = additionalMetadata;
	}
}
