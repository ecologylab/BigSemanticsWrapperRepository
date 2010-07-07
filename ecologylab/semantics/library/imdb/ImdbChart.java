package ecologylab.semantics.library.imdb;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.simpl_inherit;


/**
	IMDB chart
**/ 

@simpl_inherit

public class  ImdbChart
extends  Document
{

	@simpl_collection("imdb_title") private ArrayList<ImdbTitle>	results;

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

