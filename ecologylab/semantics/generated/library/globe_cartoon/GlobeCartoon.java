package ecologylab.semantics.generated.library.globe_cartoon;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.Date;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  GlobeCartoon.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * This MMD was initially generated by the browser authoring tool
 */ 
@simpl_inherit
public class GlobeCartoon extends Document
{
	/** 
	 * 
	 */ 
	@simpl_scalar	
	private MetadataDate datePublished;

	/** 
	 * 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL imgLocation;

	public GlobeCartoon()
	{ }

	public GlobeCartoon(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataDate	datePublished()
	{
		MetadataDate	result = this.datePublished;
		if (result == null)
		{
			result = new MetadataDate();
			this.datePublished = result;
		}
		return result;
	}

	public Date getDatePublished()
	{
		return this.datePublished == null ? null : datePublished().getValue();
	}

	public MetadataDate getDatePublishedMetadata()
	{
		return datePublished;
	}

	public void setDatePublished(Date datePublished)
	{
		if (datePublished != null)
			this.datePublished().setValue(datePublished);
	}

	public void setDatePublishedMetadata(MetadataDate datePublished)
	{
		this.datePublished = datePublished;
	}

	public MetadataParsedURL	imgLocation()
	{
		MetadataParsedURL	result = this.imgLocation;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imgLocation = result;
		}
		return result;
	}

	public ParsedURL getImgLocation()
	{
		return this.imgLocation == null ? null : imgLocation().getValue();
	}

	public MetadataParsedURL getImgLocationMetadata()
	{
		return imgLocation;
	}

	public void setImgLocation(ParsedURL imgLocation)
	{
		if (imgLocation != null)
			this.imgLocation().setValue(imgLocation);
	}

	public void setImgLocationMetadata(MetadataParsedURL imgLocation)
	{
		this.imgLocation = imgLocation;
	}
}
