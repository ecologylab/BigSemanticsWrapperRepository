package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
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
public class Head extends Metadata
{
	@simpl_scalar
	private MetadataString title;

	public Head()
	{ super(); }

	public Head(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}
}
