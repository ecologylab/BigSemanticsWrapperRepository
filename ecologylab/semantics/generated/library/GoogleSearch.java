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


/**
	The google Search class
**/ 

@xml_inherit
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
	@xml_collection("results") private ArrayList<Result>	results;

/**
	Lazy Evaluation for results
**/ 

ArrayList<Result>	results()
{
ArrayList<Result>	result	=this.results;
if(result == null)
{
result = new ArrayList<Result>();
this.results	=	 result;
}
return result;
}

/**
	Set the value of field results
**/ 

public void setResults( ArrayList<Result> results )
{
this.results = results ;
}

/**
	Get the value of field results
**/ 

public ArrayList<Result> getResults(){
return this.results;
}

}

