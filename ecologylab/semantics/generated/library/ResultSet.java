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
	Yahoo Web Search Class
**/ 

@xml_inherit
@xml_tag("ResultSet")
public class  ResultSet
extends  Search
{


/**
	Constructor
**/ 

public ResultSet()
{
 super();
}

/**
	Constructor
**/ 

public ResultSet(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
	@xml_collection("Result") private ArrayList<Result>	Result;

/**
	Lazy Evaluation for Result
**/ 

ArrayList<Result>	Result()
{
ArrayList<Result>	result	=this.Result;
if(result == null)
{
result = new ArrayList<Result>();
this.Result	=	 result;
}
return result;
}

/**
	Set the value of field Result
**/ 

public void setResult( ArrayList<Result> Result )
{
this.Result = Result ;
}

/**
	Get the value of field Result
**/ 

public ArrayList<Result> getResult(){
return this.Result;
}

}

