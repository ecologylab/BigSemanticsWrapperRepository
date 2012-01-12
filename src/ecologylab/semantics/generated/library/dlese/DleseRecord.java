package ecologylab.semantics.generated.library.dlese;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.dlese.DleseRecordHead;
import ecologylab.semantics.generated.library.dlese.RecordMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_tag;
import java.util.List;
import java.util.Map;

@simpl_inherit
@simpl_tag("record")
public class DleseRecord extends Document
{
	@simpl_composite
	@simpl_tag("head")
	@mm_name("dlese_record_head")
	private DleseRecordHead dleseRecordHead;

	@simpl_composite
	@simpl_tag("metadata")
	@mm_name("record_metadata")
	private RecordMetadata recordMetadata;

	public DleseRecord()
	{ }

	public DleseRecord(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public DleseRecordHead getDleseRecordHead()
	{
		return dleseRecordHead;
	}

	public void setDleseRecordHead(DleseRecordHead dleseRecordHead)
	{
		this.dleseRecordHead = dleseRecordHead;
	}

	public RecordMetadata getRecordMetadata()
	{
		return recordMetadata;
	}

	public void setRecordMetadata(RecordMetadata recordMetadata)
	{
		this.recordMetadata = recordMetadata;
	}
}
