package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class GettyArtistInfo extends RichDocument
{
	@simpl_scalar
	private MetadataString lifespan;

	@simpl_scalar
	private MetadataString professions;

	@simpl_scalar
	private MetadataString languages;

	public GettyArtistInfo()
	{ super(); }

	public GettyArtistInfo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	lifespan()
	{
		MetadataString	result = this.lifespan;
		if (result == null)
		{
			result = new MetadataString();
			this.lifespan = result;
		}
		return result;
	}

	public String getLifespan()
	{
		return this.lifespan == null ? null : lifespan().getValue();
	}

	public MetadataString getLifespanMetadata()
	{
		return lifespan;
	}

	public void setLifespan(String lifespan)
	{
		if (lifespan != null)
			this.lifespan().setValue(lifespan);
	}

	public void setLifespanMetadata(MetadataString lifespan)
	{
		this.lifespan = lifespan;
	}

	public MetadataString	professions()
	{
		MetadataString	result = this.professions;
		if (result == null)
		{
			result = new MetadataString();
			this.professions = result;
		}
		return result;
	}

	public String getProfessions()
	{
		return this.professions == null ? null : professions().getValue();
	}

	public MetadataString getProfessionsMetadata()
	{
		return professions;
	}

	public void setProfessions(String professions)
	{
		if (professions != null)
			this.professions().setValue(professions);
	}

	public void setProfessionsMetadata(MetadataString professions)
	{
		this.professions = professions;
	}

	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages == null ? null : languages().getValue();
	}

	public MetadataString getLanguagesMetadata()
	{
		return languages;
	}

	public void setLanguages(String languages)
	{
		if (languages != null)
			this.languages().setValue(languages);
	}

	public void setLanguagesMetadata(MetadataString languages)
	{
		this.languages = languages;
	}
}
