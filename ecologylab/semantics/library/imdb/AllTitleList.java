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
@xml_tag("AllTitleList")
public class AllTitleList extends Metadata{


/**
	Constructor
**/ 

public AllTitleList()
{
 super();
}

/**
	Constructor
**/ 

public AllTitleList(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
	@xml_collection("titles_for_soundtrack") private ArrayList<ImdbTitle>	titlesForSoundtrack;

/**
	Lazy Evaluation for titlesForSoundtrack
**/ 

public ArrayList<ImdbTitle>	titlesForSoundtrack()
{
ArrayList<ImdbTitle>	result	=this.titlesForSoundtrack;
if(result == null)
{
result = new ArrayList<ImdbTitle>();
this.titlesForSoundtrack	=	 result;
}
return result;
}

/**
	Set the value of field titlesForSoundtrack
**/ 

public void setTitlesForSoundtrack( ArrayList<ImdbTitle> titlesForSoundtrack )
{
this.titlesForSoundtrack = titlesForSoundtrack ;
}

/**
	Get the value of field titlesForSoundtrack
**/ 

public ArrayList<ImdbTitle> getTitlesForSoundtrack(){
return this.titlesForSoundtrack;
}
	@xml_collection("titles_as_producer") private ArrayList<ImdbTitle>	titlesAsProducer;

/**
	Lazy Evaluation for titlesAsProducer
**/ 

public ArrayList<ImdbTitle>	titlesAsProducer()
{
ArrayList<ImdbTitle>	result	=this.titlesAsProducer;
if(result == null)
{
result = new ArrayList<ImdbTitle>();
this.titlesAsProducer	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsProducer
**/ 

public void setTitlesAsProducer( ArrayList<ImdbTitle> titlesAsProducer )
{
this.titlesAsProducer = titlesAsProducer ;
}

/**
	Get the value of field titlesAsProducer
**/ 

public ArrayList<ImdbTitle> getTitlesAsProducer(){
return this.titlesAsProducer;
}
	@xml_collection("titles_thanked_in") private ArrayList<ImdbTitle>	titlesThankedIn;

/**
	Lazy Evaluation for titlesThankedIn
**/ 

public ArrayList<ImdbTitle>	titlesThankedIn()
{
ArrayList<ImdbTitle>	result	=this.titlesThankedIn;
if(result == null)
{
result = new ArrayList<ImdbTitle>();
this.titlesThankedIn	=	 result;
}
return result;
}

/**
	Set the value of field titlesThankedIn
**/ 

public void setTitlesThankedIn( ArrayList<ImdbTitle> titlesThankedIn )
{
this.titlesThankedIn = titlesThankedIn ;
}

/**
	Get the value of field titlesThankedIn
**/ 

public ArrayList<ImdbTitle> getTitlesThankedIn(){
return this.titlesThankedIn;
}
	@xml_collection("titles_as_self") private ArrayList<ImdbTitle>	titlesAsSelf;

/**
	Lazy Evaluation for titlesAsSelf
**/ 

public ArrayList<ImdbTitle>	titlesAsSelf()
{
ArrayList<ImdbTitle>	result	=this.titlesAsSelf;
if(result == null)
{
result = new ArrayList<ImdbTitle>();
this.titlesAsSelf	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsSelf
**/ 

public void setTitlesAsSelf( ArrayList<ImdbTitle> titlesAsSelf )
{
this.titlesAsSelf = titlesAsSelf ;
}

/**
	Get the value of field titlesAsSelf
**/ 

public ArrayList<ImdbTitle> getTitlesAsSelf(){
return this.titlesAsSelf;
}
	@xml_collection("titles_in_development") private ArrayList<ImdbTitle>	titlesInDevelopment;

/**
	Lazy Evaluation for titlesInDevelopment
**/ 

public ArrayList<ImdbTitle>	titlesInDevelopment()
{
ArrayList<ImdbTitle>	result	=this.titlesInDevelopment;
if(result == null)
{
result = new ArrayList<ImdbTitle>();
this.titlesInDevelopment	=	 result;
}
return result;
}

/**
	Set the value of field titlesInDevelopment
**/ 

public void setTitlesInDevelopment( ArrayList<ImdbTitle> titlesInDevelopment )
{
this.titlesInDevelopment = titlesInDevelopment ;
}

/**
	Get the value of field titlesInDevelopment
**/ 

public ArrayList<ImdbTitle> getTitlesInDevelopment(){
return this.titlesInDevelopment;
}
}
