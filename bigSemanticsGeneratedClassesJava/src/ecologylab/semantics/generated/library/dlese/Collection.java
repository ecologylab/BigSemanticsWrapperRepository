package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Collection extends Metadata
{
	@simpl_scalar
	@simpl_tag("recordId")
	private MetadataString id;

	public Collection()
	{ super(); }

	public Collection(MetaMetadataCompositeField mmd) {
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
}
