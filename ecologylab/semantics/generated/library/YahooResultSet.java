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
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;


/**
	Yahoo Web Search Service
**/ 

@xml_inherit
@xml_tag("ResultSet")
public class  YahooResultSet
extends  Document
{

	@xml_collection("Result") @xml_nowrap private ArrayList<Result>	results;

/**
	Constructor
**/ 

public YahooResultSet()
{
 super();
}

/**
	Constructor
**/ 

public YahooResultSet(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for results
**/ 

public  ArrayList<Result>	results()
{
 ArrayList<Result>	result	=this.results;
if(result == null)
{
result = new  ArrayList<Result>();
this.results	=	 result;
}
return result;
}

/**
	Set the value of field results
**/ 

public void setResults(  ArrayList<Result> results )
{
this.results = results ;
}

/**
	Get the value of field results
**/ 

public  ArrayList<Result> getResults(){
return this.results;
}

}

