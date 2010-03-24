package ecologylab.semantics.library.imdb;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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
import ecologylab.semantics.metadata.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.*;


/**
	IMDB metadata
**/ 

@xml_inherit

public class  PersonDetails
extends  Document
{


/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	personImg;

private  @xml_nested BirthDetail	birth_detail;
/**
	null
**/ 

	 @xml_nested private MetadataString	miniBiography;

/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	biographyLink;

/**
	null
**/ 

	 @xml_nested private MetadataString	trivia;

/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	triviaLink;

/**
	null
**/ 

	 @xml_nested private MetadataString	awards;

/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	awardsLink;

/**
	null
**/ 

	 @xml_nested private MetadataString	alternateNames;
	@xml_collection("titles_as_actor") private ArrayList<Entity<ImdbTitle>>	titlesAsActor;
	@xml_collection("titles_as_director") private ArrayList<Entity<ImdbTitle>>	titlesAsDirector;
	@xml_collection("titles_for_soundtrack") private ArrayList<Entity<ImdbTitle>>	titlesForSoundtrack;
	@xml_collection("titles_as_producer") private ArrayList<Entity<ImdbTitle>>	titlesAsProducer;
	@xml_collection("titles_thanked_in") private ArrayList<Entity<ImdbTitle>>	titlesThankedIn;
	@xml_collection("titles_as_self") private ArrayList<Entity<ImdbTitle>>	titlesAsSelf;
	@xml_collection("titles_in_development") private ArrayList<Entity<ImdbTitle>>	titlesInDevelopment;

/**
	Constructor
**/ 

public PersonDetails()
{
 super();
}

/**
	Constructor
**/ 

public PersonDetails(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for personImg
**/ 

public MetadataParsedURL	personImg()
{
MetadataParsedURL	result	=this.personImg;
if(result == null)
{
result = new MetadataParsedURL();
this.personImg	=	 result;
}
return result;
}

/**
	Gets the value of the field personImg
**/ 

public ParsedURL getPersonImg(){
return personImg().getValue();
}

/**
	Sets the value of the field personImg
**/ 

public void setPersonImg( ParsedURL personImg )
{
this.personImg().setValue(personImg);
}

/**
	The heavy weight setter method for field personImg
**/ 

public void hwSetPersonImg( ParsedURL personImg )
{
this.personImg().setValue(personImg);
rebuildCompositeTermVector();
 }
/**
	 Sets the personImg directly
**/ 

public void setPersonImgMetadata(MetadataParsedURL personImg)
{	this.personImg = personImg;
}
/**
	Heavy Weight Direct setter method for personImg
**/ 

public void hwSetPersonImgMetadata(MetadataParsedURL personImg)
{	 if(this.personImg!=null && this.personImg.getValue()!=null && hasTermVector())
		 termVector().remove(this.personImg.termVector());
	 this.personImg = personImg;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for birth_detail
**/ 

public BirthDetail	birth_detail()
{
BirthDetail	result	=this.birth_detail;
if(result == null)
{
result = new BirthDetail();
this.birth_detail	=	 result;
}
return result;
}

/**
	Set the value of field birth_detail
**/ 

public void setBirthDetail( BirthDetail birth_detail )
{
this.birth_detail = birth_detail ;
}

/**
	Get the value of field birth_detail
**/ 

public BirthDetail getBirthDetail(){
return this.birth_detail;
}

/**
	Lazy Evaluation for miniBiography
**/ 

public MetadataString	miniBiography()
{
MetadataString	result	=this.miniBiography;
if(result == null)
{
result = new MetadataString();
this.miniBiography	=	 result;
}
return result;
}

/**
	Gets the value of the field miniBiography
**/ 

public String getMiniBiography(){
return miniBiography().getValue();
}

/**
	Sets the value of the field miniBiography
**/ 

public void setMiniBiography( String miniBiography )
{
this.miniBiography().setValue(miniBiography);
}

/**
	The heavy weight setter method for field miniBiography
**/ 

public void hwSetMiniBiography( String miniBiography )
{
this.miniBiography().setValue(miniBiography);
rebuildCompositeTermVector();
 }
/**
	 Sets the miniBiography directly
**/ 

public void setMiniBiographyMetadata(MetadataString miniBiography)
{	this.miniBiography = miniBiography;
}
/**
	Heavy Weight Direct setter method for miniBiography
**/ 

public void hwSetMiniBiographyMetadata(MetadataString miniBiography)
{	 if(this.miniBiography!=null && this.miniBiography.getValue()!=null && hasTermVector())
		 termVector().remove(this.miniBiography.termVector());
	 this.miniBiography = miniBiography;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for biographyLink
**/ 

public MetadataParsedURL	biographyLink()
{
MetadataParsedURL	result	=this.biographyLink;
if(result == null)
{
result = new MetadataParsedURL();
this.biographyLink	=	 result;
}
return result;
}

/**
	Gets the value of the field biographyLink
**/ 

public ParsedURL getBiographyLink(){
return biographyLink().getValue();
}

/**
	Sets the value of the field biographyLink
**/ 

public void setBiographyLink( ParsedURL biographyLink )
{
this.biographyLink().setValue(biographyLink);
}

/**
	The heavy weight setter method for field biographyLink
**/ 

public void hwSetBiographyLink( ParsedURL biographyLink )
{
this.biographyLink().setValue(biographyLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the biographyLink directly
**/ 

public void setBiographyLinkMetadata(MetadataParsedURL biographyLink)
{	this.biographyLink = biographyLink;
}
/**
	Heavy Weight Direct setter method for biographyLink
**/ 

public void hwSetBiographyLinkMetadata(MetadataParsedURL biographyLink)
{	 if(this.biographyLink!=null && this.biographyLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.biographyLink.termVector());
	 this.biographyLink = biographyLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for trivia
**/ 

public MetadataString	trivia()
{
MetadataString	result	=this.trivia;
if(result == null)
{
result = new MetadataString();
this.trivia	=	 result;
}
return result;
}

/**
	Gets the value of the field trivia
**/ 

public String getTrivia(){
return trivia().getValue();
}

/**
	Sets the value of the field trivia
**/ 

public void setTrivia( String trivia )
{
this.trivia().setValue(trivia);
}

/**
	The heavy weight setter method for field trivia
**/ 

public void hwSetTrivia( String trivia )
{
this.trivia().setValue(trivia);
rebuildCompositeTermVector();
 }
/**
	 Sets the trivia directly
**/ 

public void setTriviaMetadata(MetadataString trivia)
{	this.trivia = trivia;
}
/**
	Heavy Weight Direct setter method for trivia
**/ 

public void hwSetTriviaMetadata(MetadataString trivia)
{	 if(this.trivia!=null && this.trivia.getValue()!=null && hasTermVector())
		 termVector().remove(this.trivia.termVector());
	 this.trivia = trivia;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for triviaLink
**/ 

public MetadataParsedURL	triviaLink()
{
MetadataParsedURL	result	=this.triviaLink;
if(result == null)
{
result = new MetadataParsedURL();
this.triviaLink	=	 result;
}
return result;
}

/**
	Gets the value of the field triviaLink
**/ 

public ParsedURL getTriviaLink(){
return triviaLink().getValue();
}

/**
	Sets the value of the field triviaLink
**/ 

public void setTriviaLink( ParsedURL triviaLink )
{
this.triviaLink().setValue(triviaLink);
}

/**
	The heavy weight setter method for field triviaLink
**/ 

public void hwSetTriviaLink( ParsedURL triviaLink )
{
this.triviaLink().setValue(triviaLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the triviaLink directly
**/ 

public void setTriviaLinkMetadata(MetadataParsedURL triviaLink)
{	this.triviaLink = triviaLink;
}
/**
	Heavy Weight Direct setter method for triviaLink
**/ 

public void hwSetTriviaLinkMetadata(MetadataParsedURL triviaLink)
{	 if(this.triviaLink!=null && this.triviaLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.triviaLink.termVector());
	 this.triviaLink = triviaLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for awards
**/ 

public MetadataString	awards()
{
MetadataString	result	=this.awards;
if(result == null)
{
result = new MetadataString();
this.awards	=	 result;
}
return result;
}

/**
	Gets the value of the field awards
**/ 

public String getAwards(){
return awards().getValue();
}

/**
	Sets the value of the field awards
**/ 

public void setAwards( String awards )
{
this.awards().setValue(awards);
}

/**
	The heavy weight setter method for field awards
**/ 

public void hwSetAwards( String awards )
{
this.awards().setValue(awards);
rebuildCompositeTermVector();
 }
/**
	 Sets the awards directly
**/ 

public void setAwardsMetadata(MetadataString awards)
{	this.awards = awards;
}
/**
	Heavy Weight Direct setter method for awards
**/ 

public void hwSetAwardsMetadata(MetadataString awards)
{	 if(this.awards!=null && this.awards.getValue()!=null && hasTermVector())
		 termVector().remove(this.awards.termVector());
	 this.awards = awards;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for awardsLink
**/ 

public MetadataParsedURL	awardsLink()
{
MetadataParsedURL	result	=this.awardsLink;
if(result == null)
{
result = new MetadataParsedURL();
this.awardsLink	=	 result;
}
return result;
}

/**
	Gets the value of the field awardsLink
**/ 

public ParsedURL getAwardsLink(){
return awardsLink().getValue();
}

/**
	Sets the value of the field awardsLink
**/ 

public void setAwardsLink( ParsedURL awardsLink )
{
this.awardsLink().setValue(awardsLink);
}

/**
	The heavy weight setter method for field awardsLink
**/ 

public void hwSetAwardsLink( ParsedURL awardsLink )
{
this.awardsLink().setValue(awardsLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the awardsLink directly
**/ 

public void setAwardsLinkMetadata(MetadataParsedURL awardsLink)
{	this.awardsLink = awardsLink;
}
/**
	Heavy Weight Direct setter method for awardsLink
**/ 

public void hwSetAwardsLinkMetadata(MetadataParsedURL awardsLink)
{	 if(this.awardsLink!=null && this.awardsLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.awardsLink.termVector());
	 this.awardsLink = awardsLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for alternateNames
**/ 

public MetadataString	alternateNames()
{
MetadataString	result	=this.alternateNames;
if(result == null)
{
result = new MetadataString();
this.alternateNames	=	 result;
}
return result;
}

/**
	Gets the value of the field alternateNames
**/ 

public String getAlternateNames(){
return alternateNames().getValue();
}

/**
	Sets the value of the field alternateNames
**/ 

public void setAlternateNames( String alternateNames )
{
this.alternateNames().setValue(alternateNames);
}

/**
	The heavy weight setter method for field alternateNames
**/ 

public void hwSetAlternateNames( String alternateNames )
{
this.alternateNames().setValue(alternateNames);
rebuildCompositeTermVector();
 }
/**
	 Sets the alternateNames directly
**/ 

public void setAlternateNamesMetadata(MetadataString alternateNames)
{	this.alternateNames = alternateNames;
}
/**
	Heavy Weight Direct setter method for alternateNames
**/ 

public void hwSetAlternateNamesMetadata(MetadataString alternateNames)
{	 if(this.alternateNames!=null && this.alternateNames.getValue()!=null && hasTermVector())
		 termVector().remove(this.alternateNames.termVector());
	 this.alternateNames = alternateNames;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for titlesAsActor
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsActor()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsActor;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsActor	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsActor
**/ 

public void setTitlesAsActor(  ArrayList<Entity<ImdbTitle>> titlesAsActor )
{
this.titlesAsActor = titlesAsActor ;
}

/**
	Get the value of field titlesAsActor
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsActor(){
return this.titlesAsActor;
}

/**
	Lazy Evaluation for titlesAsDirector
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsDirector()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsDirector;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsDirector	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsDirector
**/ 

public void setTitlesAsDirector(  ArrayList<Entity<ImdbTitle>> titlesAsDirector )
{
this.titlesAsDirector = titlesAsDirector ;
}

/**
	Get the value of field titlesAsDirector
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsDirector(){
return this.titlesAsDirector;
}

/**
	Lazy Evaluation for titlesForSoundtrack
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesForSoundtrack()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesForSoundtrack;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesForSoundtrack	=	 result;
}
return result;
}

/**
	Set the value of field titlesForSoundtrack
**/ 

public void setTitlesForSoundtrack(  ArrayList<Entity<ImdbTitle>> titlesForSoundtrack )
{
this.titlesForSoundtrack = titlesForSoundtrack ;
}

/**
	Get the value of field titlesForSoundtrack
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesForSoundtrack(){
return this.titlesForSoundtrack;
}

/**
	Lazy Evaluation for titlesAsProducer
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsProducer()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsProducer;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsProducer	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsProducer
**/ 

public void setTitlesAsProducer(  ArrayList<Entity<ImdbTitle>> titlesAsProducer )
{
this.titlesAsProducer = titlesAsProducer ;
}

/**
	Get the value of field titlesAsProducer
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsProducer(){
return this.titlesAsProducer;
}

/**
	Lazy Evaluation for titlesThankedIn
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesThankedIn()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesThankedIn;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesThankedIn	=	 result;
}
return result;
}

/**
	Set the value of field titlesThankedIn
**/ 

public void setTitlesThankedIn(  ArrayList<Entity<ImdbTitle>> titlesThankedIn )
{
this.titlesThankedIn = titlesThankedIn ;
}

/**
	Get the value of field titlesThankedIn
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesThankedIn(){
return this.titlesThankedIn;
}

/**
	Lazy Evaluation for titlesAsSelf
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesAsSelf()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesAsSelf;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesAsSelf	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsSelf
**/ 

public void setTitlesAsSelf(  ArrayList<Entity<ImdbTitle>> titlesAsSelf )
{
this.titlesAsSelf = titlesAsSelf ;
}

/**
	Get the value of field titlesAsSelf
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesAsSelf(){
return this.titlesAsSelf;
}

/**
	Lazy Evaluation for titlesInDevelopment
**/ 

public  ArrayList<Entity<ImdbTitle>>	titlesInDevelopment()
{
 ArrayList<Entity<ImdbTitle>>	result	=this.titlesInDevelopment;
if(result == null)
{
result = new  ArrayList<Entity<ImdbTitle>>();
this.titlesInDevelopment	=	 result;
}
return result;
}

/**
	Set the value of field titlesInDevelopment
**/ 

public void setTitlesInDevelopment(  ArrayList<Entity<ImdbTitle>> titlesInDevelopment )
{
this.titlesInDevelopment = titlesInDevelopment ;
}

/**
	Get the value of field titlesInDevelopment
**/ 

public  ArrayList<Entity<ImdbTitle>> getTitlesInDevelopment(){
return this.titlesInDevelopment;
}

}

