package ecologylab.semantics.library.imdb;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.builtins.Entity;

 import java.util.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.net.ParsedURL;
import ecologylab.generic.HashMapArrayList;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;

@xml_inherit
@xml_tag("cast_member")
public class CastMember extends Metadata{


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

private @xml_tag("actor") @xml_nested PersonDetails	actor;
/**
	Lazy Evaluation for actor
**/ 

public PersonDetails	actor()
{
PersonDetails	result	=this.actor;
if(result == null)
{
result = new PersonDetails();
this.actor	=	 result;
}
return result;
}

/**
	Set the value of field actor
**/ 

public void setActor( PersonDetails actor )
{
this.actor = actor ;
}

/**
	Get the value of field actor
**/ 

public PersonDetails getActor(){
return this.actor;
}

private @xml_tag("character") @xml_nested PersonDetails	character;
/**
	Lazy Evaluation for character
**/ 

public PersonDetails	character()
{
PersonDetails	result	=this.character;
if(result == null)
{
result = new PersonDetails();
this.character	=	 result;
}
return result;
}

/**
	Set the value of field character
**/ 

public void setCharacter( PersonDetails character )
{
this.character = character ;
}

/**
	Get the value of field character
**/ 

public PersonDetails getCharacter(){
return this.character;
}
}
