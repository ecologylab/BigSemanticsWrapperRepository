package ecologylab.bigsemantics.generated.library.fashionReviewer;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.person.Person;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class FashionReviewer extends Person
{
	@simpl_scalar
	private MetadataString height;

	public FashionReviewer()
	{ super(); }

	public FashionReviewer(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	height()
	{
		MetadataString	result = this.height;
		if (result == null)
		{
			result = new MetadataString();
			this.height = result;
		}
		return result;
	}

	public String getHeight()
	{
		return this.height == null ? null : height().getValue();
	}

	public MetadataString getHeightMetadata()
	{
		return height;
	}

	public void setHeight(String height)
	{
		if (height != null)
			this.height().setValue(height);
	}

	public void setHeightMetadata(MetadataString height)
	{
		this.height = height;
	}
}
