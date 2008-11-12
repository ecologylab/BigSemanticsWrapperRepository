package ecologylab.semantics.generated.library;
/**
This is a generated code. Please do not edit or modify it.
 @author MetadataCompiler 

**/ 



 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;

/**
	
**/ 

public class  Search
extends  Document
{

/**
	Constructor
**/ 

public Search()
{
}
/**
	Constructor
**/ 

public Search(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
/**
	The search query.
**/ 

	@xml_tag("query") @xml_nested private MetadataString	query;
/**
	Lazy Evaluation for query
**/ 

MetadataString	query()
{
MetadataString	result	=this.query;
if(result == null)
{
result = new MetadataString();
this.query	=	 result;
}
return result;
}
/**
	Gets the value of the field query
**/ 

public String getQuery(){
return query().getValue();
}
/**
	Sets the value of the field query
**/ 

public void setQuery( String query )
{
this.query().setValue(query);
}
/**
	The heavy weight setter method for field query
**/ 

public void hwSetQuery( String query )
{
this.query().setValue(query);
rebuildCompositeTermVector();
 }/**
	The snippet of the returned results.
**/ 

	@xml_tag("snippet") @xml_nested private MetadataString	snippet;
/**
	Lazy Evaluation for snippet
**/ 

MetadataString	snippet()
{
MetadataString	result	=this.snippet;
if(result == null)
{
result = new MetadataString();
this.snippet	=	 result;
}
return result;
}
/**
	Gets the value of the field snippet
**/ 

public String getSnippet(){
return snippet().getValue();
}
/**
	Sets the value of the field snippet
**/ 

public void setSnippet( String snippet )
{
this.snippet().setValue(snippet);
}
/**
	The heavy weight setter method for field snippet
**/ 

public void hwSetSnippet( String snippet )
{
this.snippet().setValue(snippet);
rebuildCompositeTermVector();
 }
}

