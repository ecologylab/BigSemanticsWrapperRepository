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
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Thumbnail extends Metadata
{
	@simpl_scalar
	private MetadataParsedURL pic;

	public Thumbnail()
	{ super(); }

	public Thumbnail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	pic()
	{
		MetadataParsedURL	result = this.pic;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pic = result;
		}
		return result;
	}

	public ParsedURL getPic()
	{
		return this.pic == null ? null : pic().getValue();
	}

	public MetadataParsedURL getPicMetadata()
	{
		return pic;
	}

	public void setPic(ParsedURL pic)
	{
		if (pic != null)
			this.pic().setValue(pic);
	}

	public void setPicMetadata(MetadataParsedURL pic)
	{
		this.pic = pic;
	}
}
