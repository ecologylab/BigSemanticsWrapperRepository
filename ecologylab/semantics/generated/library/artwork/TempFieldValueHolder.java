package ecologylab.semantics.generated.library.artwork;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  TempFieldValueHolder.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/06/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class TempFieldValueHolder extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString tempDimensions;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString tempYear;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString tempMedium;

	public TempFieldValueHolder()
	{ }

	public TempFieldValueHolder(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	tempDimensions()
	{
		MetadataString	result = this.tempDimensions;
		if (result == null)
		{
			result = new MetadataString();
			this.tempDimensions = result;
		}
		return result;
	}

	public String getTempDimensions()
	{
		return this.tempDimensions == null ? null : tempDimensions().getValue();
	}

	public MetadataString getTempDimensionsMetadata()
	{
		return tempDimensions;
	}

	public void setTempDimensions(String tempDimensions)
	{
		if (tempDimensions != null)
			this.tempDimensions().setValue(tempDimensions);
	}

	public void setTempDimensionsMetadata(MetadataString tempDimensions)
	{
		this.tempDimensions = tempDimensions;
	}

	public MetadataString	tempYear()
	{
		MetadataString	result = this.tempYear;
		if (result == null)
		{
			result = new MetadataString();
			this.tempYear = result;
		}
		return result;
	}

	public String getTempYear()
	{
		return this.tempYear == null ? null : tempYear().getValue();
	}

	public MetadataString getTempYearMetadata()
	{
		return tempYear;
	}

	public void setTempYear(String tempYear)
	{
		if (tempYear != null)
			this.tempYear().setValue(tempYear);
	}

	public void setTempYearMetadata(MetadataString tempYear)
	{
		this.tempYear = tempYear;
	}

	public MetadataString	tempMedium()
	{
		MetadataString	result = this.tempMedium;
		if (result == null)
		{
			result = new MetadataString();
			this.tempMedium = result;
		}
		return result;
	}

	public String getTempMedium()
	{
		return this.tempMedium == null ? null : tempMedium().getValue();
	}

	public MetadataString getTempMediumMetadata()
	{
		return tempMedium;
	}

	public void setTempMedium(String tempMedium)
	{
		if (tempMedium != null)
			this.tempMedium().setValue(tempMedium);
	}

	public void setTempMediumMetadata(MetadataString tempMedium)
	{
		this.tempMedium = tempMedium;
	}
}
