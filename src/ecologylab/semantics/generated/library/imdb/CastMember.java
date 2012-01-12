package ecologylab.semantics.generated.library.imdb;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.imdb.PersonDetails;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class CastMember extends Metadata
{
	@simpl_composite
	@mm_name("actor")
	private PersonDetails actor;

	@simpl_composite
	@mm_name("character")
	private PersonDetails character;

	public CastMember()
	{ }

	public CastMember(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public PersonDetails getActor()
	{
		return actor;
	}

	public void setActor(PersonDetails actor)
	{
		this.actor = actor;
	}

	public PersonDetails getCharacter()
	{
		return character;
	}

	public void setCharacter(PersonDetails character)
	{
		this.character = character;
	}
}
