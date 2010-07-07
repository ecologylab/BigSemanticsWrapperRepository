package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;


/**
	
**/ 

@simpl_inherit

public class  Search
extends  Document
{

	@simpl_collection("search_result") @simpl_nowrap private ArrayList<SearchResult>	searchResults;

/**
	Constructor
**/ 

public Search()
{
 super();
}

/**
	Constructor
**/ 

public Search(MetaMetadata metaMetadata)
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

}

