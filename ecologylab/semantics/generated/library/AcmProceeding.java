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
	null
**/ 

@simpl_inherit

public class  AcmProceeding
extends  Document
{

	@simpl_collection("search_result") private ArrayList<SearchResult>	proceedings;
	@simpl_collection("search_result") private ArrayList<SearchResult>	papers;

/**
	Constructor
**/ 

public AcmProceeding()
{
 super();
}

/**
	Constructor
**/ 

public AcmProceeding(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for proceedings
**/ 

public  ArrayList<SearchResult>	proceedings()
{
 ArrayList<SearchResult>	result	=this.proceedings;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.proceedings	=	 result;
}
return result;
}

/**
	Set the value of field proceedings
**/ 

public void setProceedings(  ArrayList<SearchResult> proceedings )
{
this.proceedings = proceedings ;
}

/**
	Get the value of field proceedings
**/ 

public  ArrayList<SearchResult> getProceedings(){
return this.proceedings;
}

/**
	Lazy Evaluation for papers
**/ 

public  ArrayList<SearchResult>	papers()
{
 ArrayList<SearchResult>	result	=this.papers;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.papers	=	 result;
}
return result;
}

/**
	Set the value of field papers
**/ 

public void setPapers(  ArrayList<SearchResult> papers )
{
this.papers = papers ;
}

/**
	Get the value of field papers
**/ 

public  ArrayList<SearchResult> getPapers(){
return this.papers;
}

}

