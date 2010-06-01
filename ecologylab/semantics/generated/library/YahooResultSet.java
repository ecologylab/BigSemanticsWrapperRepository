package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.ElementState.xml_tag;


/**
	Yahoo Web Search Service
**/ 

@xml_inherit
@xml_tag("ResultSet")
public class  YahooResultSet
extends  Search
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

