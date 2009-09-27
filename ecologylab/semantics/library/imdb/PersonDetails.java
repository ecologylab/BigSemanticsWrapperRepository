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


/**
	IMDB metadata
**/ 

@xml_inherit
@xml_tag("person_details")
public class  PersonDetails
extends  Document
{


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
	null
**/ 

	@xml_tag("title") @xml_nested private MetadataString	title;

/**
	Lazy Evaluation for title
**/ 

public MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("person_img") @xml_nested private MetadataParsedURL	personImg;

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
private @xml_tag("birth_detail") @xml_nested BirthDetail	birth_detail;
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
	null
**/ 

	@xml_tag("mini_biography") @xml_nested private MetadataString	miniBiography;

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
	null
**/ 

	@xml_tag("biography_link") @xml_nested private MetadataParsedURL	biographyLink;

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
	null
**/ 

	@xml_tag("trivia") @xml_nested private MetadataString	trivia;

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
	null
**/ 

	@xml_tag("trivia_link") @xml_nested private MetadataParsedURL	triviaLink;

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
	null
**/ 

	@xml_tag("awards") @xml_nested private MetadataString	awards;

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
	null
**/ 

	@xml_tag("awards_link") @xml_nested private MetadataParsedURL	awardsLink;

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
	null
**/ 

	@xml_tag("alternate_names") @xml_nested private MetadataString	alternateNames;

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
}	@xml_collection("titles_as_actor") private ArrayList<ImdbTitle>	titlesAsActor;

/**
	Lazy Evaluation for titlesAsActor
**/ 

public  ArrayList<ImdbTitle>	titlesAsActor()
{
 ArrayList<ImdbTitle>	result	=this.titlesAsActor;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.titlesAsActor	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsActor
**/ 

public void setTitlesAsActor(  ArrayList<ImdbTitle> titlesAsActor )
{
this.titlesAsActor = titlesAsActor ;
}

/**
	Get the value of field titlesAsActor
**/ 

public  ArrayList<ImdbTitle> getTitlesAsActor(){
return this.titlesAsActor;
}
	@xml_collection("titles_as_director") private ArrayList<ImdbTitle>	titlesAsDirector;

/**
	Lazy Evaluation for titlesAsDirector
**/ 

public  ArrayList<ImdbTitle>	titlesAsDirector()
{
 ArrayList<ImdbTitle>	result	=this.titlesAsDirector;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.titlesAsDirector	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsDirector
**/ 

public void setTitlesAsDirector(  ArrayList<ImdbTitle> titlesAsDirector )
{
this.titlesAsDirector = titlesAsDirector ;
}

/**
	Get the value of field titlesAsDirector
**/ 

public  ArrayList<ImdbTitle> getTitlesAsDirector(){
return this.titlesAsDirector;
}
	@xml_collection("titles_for_soundtrack") private ArrayList<ImdbTitle>	titlesForSoundtrack;

/**
	Lazy Evaluation for titlesForSoundtrack
**/ 

public  ArrayList<ImdbTitle>	titlesForSoundtrack()
{
 ArrayList<ImdbTitle>	result	=this.titlesForSoundtrack;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.titlesForSoundtrack	=	 result;
}
return result;
}

/**
	Set the value of field titlesForSoundtrack
**/ 

public void setTitlesForSoundtrack(  ArrayList<ImdbTitle> titlesForSoundtrack )
{
this.titlesForSoundtrack = titlesForSoundtrack ;
}

/**
	Get the value of field titlesForSoundtrack
**/ 

public  ArrayList<ImdbTitle> getTitlesForSoundtrack(){
return this.titlesForSoundtrack;
}
	@xml_collection("titles_as_producer") private ArrayList<ImdbTitle>	titlesAsProducer;

/**
	Lazy Evaluation for titlesAsProducer
**/ 

public  ArrayList<ImdbTitle>	titlesAsProducer()
{
 ArrayList<ImdbTitle>	result	=this.titlesAsProducer;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.titlesAsProducer	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsProducer
**/ 

public void setTitlesAsProducer(  ArrayList<ImdbTitle> titlesAsProducer )
{
this.titlesAsProducer = titlesAsProducer ;
}

/**
	Get the value of field titlesAsProducer
**/ 

public  ArrayList<ImdbTitle> getTitlesAsProducer(){
return this.titlesAsProducer;
}
	@xml_collection("titles_thanked_in") private ArrayList<ImdbTitle>	titlesThankedIn;

/**
	Lazy Evaluation for titlesThankedIn
**/ 

public  ArrayList<ImdbTitle>	titlesThankedIn()
{
 ArrayList<ImdbTitle>	result	=this.titlesThankedIn;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.titlesThankedIn	=	 result;
}
return result;
}

/**
	Set the value of field titlesThankedIn
**/ 

public void setTitlesThankedIn(  ArrayList<ImdbTitle> titlesThankedIn )
{
this.titlesThankedIn = titlesThankedIn ;
}

/**
	Get the value of field titlesThankedIn
**/ 

public  ArrayList<ImdbTitle> getTitlesThankedIn(){
return this.titlesThankedIn;
}
	@xml_collection("titles_as_self") private ArrayList<ImdbTitle>	titlesAsSelf;

/**
	Lazy Evaluation for titlesAsSelf
**/ 

public  ArrayList<ImdbTitle>	titlesAsSelf()
{
 ArrayList<ImdbTitle>	result	=this.titlesAsSelf;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.titlesAsSelf	=	 result;
}
return result;
}

/**
	Set the value of field titlesAsSelf
**/ 

public void setTitlesAsSelf(  ArrayList<ImdbTitle> titlesAsSelf )
{
this.titlesAsSelf = titlesAsSelf ;
}

/**
	Get the value of field titlesAsSelf
**/ 

public  ArrayList<ImdbTitle> getTitlesAsSelf(){
return this.titlesAsSelf;
}
	@xml_collection("titles_in_development") private ArrayList<ImdbTitle>	titlesInDevelopment;

/**
	Lazy Evaluation for titlesInDevelopment
**/ 

public  ArrayList<ImdbTitle>	titlesInDevelopment()
{
 ArrayList<ImdbTitle>	result	=this.titlesInDevelopment;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.titlesInDevelopment	=	 result;
}
return result;
}

/**
	Set the value of field titlesInDevelopment
**/ 

public void setTitlesInDevelopment(  ArrayList<ImdbTitle> titlesInDevelopment )
{
this.titlesInDevelopment = titlesInDevelopment ;
}

/**
	Get the value of field titlesInDevelopment
**/ 

public  ArrayList<ImdbTitle> getTitlesInDevelopment(){
return this.titlesInDevelopment;
}

}

