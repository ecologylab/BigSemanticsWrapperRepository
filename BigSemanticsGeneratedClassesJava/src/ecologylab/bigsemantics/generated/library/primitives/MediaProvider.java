package ecologylab.bigsemantics.generated.library.primitives;

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
public class MediaProvider extends Metadata
{
	@simpl_scalar
	private MetadataString provider;

	@simpl_scalar
	private MetadataString providerId;

	public MediaProvider()
	{ super(); }

	public MediaProvider(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	provider()
	{
		MetadataString	result = this.provider;
		if (result == null)
		{
			result = new MetadataString();
			this.provider = result;
		}
		return result;
	}

	public String getProvider()
	{
		return this.provider == null ? null : provider().getValue();
	}

	public MetadataString getProviderMetadata()
	{
		return provider;
	}

	public void setProvider(String provider)
	{
		if (provider != null)
			this.provider().setValue(provider);
	}

	public void setProviderMetadata(MetadataString provider)
	{
		this.provider = provider;
	}

	public MetadataString	providerId()
	{
		MetadataString	result = this.providerId;
		if (result == null)
		{
			result = new MetadataString();
			this.providerId = result;
		}
		return result;
	}

	public String getProviderId()
	{
		return this.providerId == null ? null : providerId().getValue();
	}

	public MetadataString getProviderIdMetadata()
	{
		return providerId;
	}

	public void setProviderId(String providerId)
	{
		if (providerId != null)
			this.providerId().setValue(providerId);
	}

	public void setProviderIdMetadata(MetadataString providerId)
	{
		this.providerId = providerId;
	}
}
