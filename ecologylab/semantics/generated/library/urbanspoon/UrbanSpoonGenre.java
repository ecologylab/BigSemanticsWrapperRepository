package ecologylab.semantics.generated.library.urbanspoon;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
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

	 @simpl_collection("search_result") @xml_tag("search_results") @mm_name("search_results") private ArrayList<SearchResult>	searchResults;
	 @simpl_collection("search_result") @xml_tag("top_results") @mm_name("top_results") private ArrayList<SearchResult>	topResults;

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

public UrbanSpoonGenre(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for searchResults
**/ 

public  ArrayList<SearchResult>	searchResults()
{
 ArrayList<SearchResult>	result	=this.searchResults;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.searchResults	=	 result;
}
return result;
}

/**
	Set the value of field searchResults
**/ 

public void setSearchResults(  ArrayList<SearchResult> searchResults )
{
this.searchResults = searchResults ;
}

/**
	Get the value of field searchResults
**/ 

public  ArrayList<SearchResult> getSearchResults(){
return this.searchResults;
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

