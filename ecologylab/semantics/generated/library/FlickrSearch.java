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
 import ecologylab.semantics.metadata.Document;
import ecologylab.semantics.metadata.Media;

/**
	The flickr search class
**/ 

@xml_inherit
@xml_tag("flickr_search")
public class  FlickrSearch
extends  Search
{


/**
	Constructor
**/ 

public FlickrSearch()
{
 super();
}

/**
	Constructor
**/ 

public FlickrSearch(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
	@xml_collection("flickrResults") private ArrayList<FlickrImage>	flickrResults;

/**
	Lazy Evaluation for flickrResults
**/ 

public ArrayList<FlickrImage>	flickrResults()
{
ArrayList<FlickrImage>	result	=this.flickrResults;
if(result == null)
{
result = new ArrayList<FlickrImage>();
this.flickrResults	=	 result;
}
return result;
}

/**
	Set the value of field flickrResults
**/ 

public void setFlickrResults( ArrayList<FlickrImage> flickrResults )
{
this.flickrResults = flickrResults ;
}

/**
	Get the value of field flickrResults
**/ 

public ArrayList<FlickrImage> getFlickrResults(){
return this.flickrResults;
}

}

