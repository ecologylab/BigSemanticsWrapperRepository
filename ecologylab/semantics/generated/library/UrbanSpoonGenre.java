package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;


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

