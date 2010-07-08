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


/**
	UrbanSpoon Search Class
**/ 

@simpl_inherit

public class  UrbanSpoonGenre
extends  Search
{

	@simpl_collection("search_result") private ArrayList<SearchResult>	topResults;

/**
	Constructor
**/ 

public UrbanSpoonGenre()
{
 super();
}

/**
	Constructor
**/ 

public UrbanSpoonGenre(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for topResults
**/ 

public  ArrayList<SearchResult>	topResults()
{
 ArrayList<SearchResult>	result	=this.topResults;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.topResults	=	 result;
}
return result;
}

/**
	Set the value of field topResults
**/ 

public void setTopResults(  ArrayList<SearchResult> topResults )
{
this.topResults = topResults ;
}

/**
	Get the value of field topResults
**/ 

public  ArrayList<SearchResult> getTopResults(){
return this.topResults;
}

}

