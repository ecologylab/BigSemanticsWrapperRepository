package ecologylab.semantics.library.imdb;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.Metadata;

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
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.*;


/**
	IMDB chart
**/ 

@xml_inherit

public class  ImdbChart
extends  Document
{

	@xml_collection("results") private ArrayList<ImdbTitle>	results;

/**
	Constructor
**/ 

public ImdbChart()
{
 super();
}

/**
	Constructor
**/ 

public ImdbChart(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for results
**/ 

public  ArrayList<ImdbTitle>	results()
{
 ArrayList<ImdbTitle>	result	=this.results;
if(result == null)
{
result = new  ArrayList<ImdbTitle>();
this.results	=	 result;
}
return result;
}

/**
	Set the value of field results
**/ 

public void setResults(  ArrayList<ImdbTitle> results )
{
this.results = results ;
}

/**
	Get the value of field results
**/ 

public  ArrayList<ImdbTitle> getResults(){
return this.results;
}

}

