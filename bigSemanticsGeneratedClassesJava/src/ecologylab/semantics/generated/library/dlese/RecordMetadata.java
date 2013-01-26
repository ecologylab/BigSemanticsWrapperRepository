package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.dlese.ItemRecord;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class RecordMetadata extends Metadata
{
	@simpl_composite
	@simpl_tag("itemRecord")
	@mm_name("item_record")
	private ItemRecord itemRecord;

	public RecordMetadata()
	{ super(); }

	public RecordMetadata(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ItemRecord getItemRecord()
	{
		return itemRecord;
	}

	public void setItemRecord(ItemRecord itemRecord)
	{
		this.itemRecord = itemRecord;
	}
}
