package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;


/**
	The google Search class
**/ 

@xml_inherit
@xml_tag("google_search")
public class  GoogleSearch
extends  Search
{


/**
	Constructor
**/ 

public GoogleSearch()
{
 super();
}

/**
	Constructor
**/ 

public GoogleSearch(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
	@xml_collection("searchResults") private ArrayList<SearchResult>	searchResults;

/**
	Lazy Evaluation for searchResults
**/ 

ArrayList<SearchResult>	searchResults()
{
ArrayList<SearchResult>	result	=this.searchResults;
if(result == null)
{
result = new ArrayList<SearchResult>();
this.searchResults	=	 result;
}
return result;
}

/**
	Set the value of field searchResults
**/ 

public void setSearchResults( ArrayList<SearchResult> searchResults )
{
this.searchResults = searchResults ;
}

/**
	Get the value of field searchResults
**/ 

public ArrayList<SearchResult> getSearchResults(){
return this.searchResults;
}

}

