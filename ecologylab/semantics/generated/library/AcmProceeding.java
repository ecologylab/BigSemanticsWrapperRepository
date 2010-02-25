package ecologylab.semantics.generated.library;

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
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	null
**/ 

@xml_inherit

public class  AcmProceeding
extends  Document
{

	@xml_collection("proceedings") private ArrayList<AcmProceedingPage>	proceedings;
	@xml_collection("papers") private ArrayList<ScholarlyArticle>	papers;

/**
	Constructor
**/ 

public AcmProceeding()
{
 super();
}

/**
	Constructor
**/ 

public AcmProceeding(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for proceedings
**/ 

public  ArrayList<AcmProceedingPage>	proceedings()
{
 ArrayList<AcmProceedingPage>	result	=this.proceedings;
if(result == null)
{
result = new  ArrayList<AcmProceedingPage>();
this.proceedings	=	 result;
}
return result;
}

/**
	Set the value of field proceedings
**/ 

public void setProceedings(  ArrayList<AcmProceedingPage> proceedings )
{
this.proceedings = proceedings ;
}

/**
	Get the value of field proceedings
**/ 

public  ArrayList<AcmProceedingPage> getProceedings(){
return this.proceedings;
}

/**
	Lazy Evaluation for papers
**/ 

public  ArrayList<ScholarlyArticle>	papers()
{
 ArrayList<ScholarlyArticle>	result	=this.papers;
if(result == null)
{
result = new  ArrayList<ScholarlyArticle>();
this.papers	=	 result;
}
return result;
}

/**
	Set the value of field papers
**/ 

public void setPapers(  ArrayList<ScholarlyArticle> papers )
{
this.papers = papers ;
}

/**
	Get the value of field papers
**/ 

public  ArrayList<ScholarlyArticle> getPapers(){
return this.papers;
}

}

