package ecologylab.semantics.library.imdb;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;

@xml_inherit

public class CastMember extends Metadata{


private  @xml_nested Entity<PersonDetails>	actor;
private  @xml_nested Entity<PersonDetails>	character;
/**
	Constructor
**/ 

public CastMember()
{
 super();
}

/**
	Constructor
**/ 

public CastMember(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for actor
**/ 

public Entity<PersonDetails>	actor()
{
Entity<PersonDetails>	result	=this.actor;
if(result == null)
{
result = new Entity<PersonDetails>();
this.actor	=	 result;
}
return result;
}

/**
	Set the value of field actor
**/ 

public void setActor( Entity<PersonDetails> actor )
{
this.actor = actor ;
}

/**
	Get the value of field actor
**/ 

public Entity<PersonDetails> getActor(){
return this.actor;
}

/**
	Lazy Evaluation for character
**/ 

public Entity<PersonDetails>	character()
{
Entity<PersonDetails>	result	=this.character;
if(result == null)
{
result = new Entity<PersonDetails>();
this.character	=	 result;
}
return result;
}

/**
	Set the value of field character
**/ 

public void setCharacter( Entity<PersonDetails> character )
{
this.character = character ;
}

/**
	Get the value of field character
**/ 

public Entity<PersonDetails> getCharacter(){
return this.character;
}
}
