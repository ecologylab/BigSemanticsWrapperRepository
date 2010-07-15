package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class  AcmProceeding
extends  Document
{

	@simpl_collection("search_result") private ArrayList<SearchResult>	proceedings;
	@simpl_collection("search_result") private ArrayList<SearchResult>	papers;

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

public  ArrayList<SearchResult>	proceedings()
{
 ArrayList<SearchResult>	result	=this.proceedings;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.proceedings	=	 result;
}
return result;
}

/**
	Set the value of field proceedings
**/ 

public void setProceedings(  ArrayList<SearchResult> proceedings )
{
this.proceedings = proceedings ;
}

/**
	Get the value of field proceedings
**/ 

public  ArrayList<SearchResult> getProceedings(){
return this.proceedings;
}

/**
	Lazy Evaluation for papers
**/ 

public  ArrayList<SearchResult>	papers()
{
 ArrayList<SearchResult>	result	=this.papers;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.papers	=	 result;
}
return result;
}

/**
	Set the value of field papers
**/ 

public void setPapers(  ArrayList<SearchResult> papers )
{
this.papers = papers ;
}

/**
	Get the value of field papers
**/ 

public  ArrayList<SearchResult> getPapers(){
return this.papers;
}

}

