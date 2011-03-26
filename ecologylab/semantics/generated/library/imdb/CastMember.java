package ecologylab.semantics.generated.library.imdb;


import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class CastMember
extends Metadata
{

@simpl_composite @mm_name("actor")
private Entity<PersonDetails>	actor;

@simpl_composite @mm_name("character")
private Entity<PersonDetails>	character;



/**
	Constructor
*/
public CastMember()
{
 super();
}

/**
	Constructor
*/
public CastMember(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for actor
*/
public Entity<PersonDetails>	actor()
{
	Entity<PersonDetails>	result = this.actor;
	if (result == null)
	{
		result = new Entity<PersonDetails>();
		this.actor = result;
	}
	return result;
}

/**
	Get the value of field actor
*/
public Entity<PersonDetails> getActor()
{
	return this.actor;
}

/**
	Set the value of field actor
*/
public void setActor(Entity<PersonDetails> actor)
{
	this.actor = actor;
}

/**
	Lazy evaluation for character
*/
public Entity<PersonDetails>	character()
{
	Entity<PersonDetails>	result = this.character;
	if (result == null)
	{
		result = new Entity<PersonDetails>();
		this.character = result;
	}
	return result;
}

/**
	Get the value of field character
*/
public Entity<PersonDetails> getCharacter()
{
	return this.character;
}

/**
	Set the value of field character
*/
public void setCharacter(Entity<PersonDetails> character)
{
	this.character = character;
}


}

