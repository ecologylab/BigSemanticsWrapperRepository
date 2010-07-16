package ecologylab.semantics.generated.library.search;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.uva.*;
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


/**
	Yahoo Web Search Service
**/ 

@simpl_inherit
@xml_tag("ResultSet")
public class  YahooResultSet
extends  Document
{

	@simpl_collection("Result") @simpl_nowrap private ArrayList<Result>	results;

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

