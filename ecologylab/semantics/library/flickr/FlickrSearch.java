package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;


/**
	The flickr search class
**/ 

@xml_inherit

public class  FlickrSearch
extends  Document
{

	@xml_collection("flickr_results") private ArrayList<FlickrImage>	flickrResults;

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

/**
	Lazy Evaluation for flickrResults
**/ 

public  ArrayList<FlickrImage>	flickrResults()
{
 ArrayList<FlickrImage>	result	=this.flickrResults;
if(result == null)
{
result = new  ArrayList<FlickrImage>();
this.flickrResults	=	 result;
}
return result;
}

/**
	Set the value of field flickrResults
**/ 

public void setFlickrResults(  ArrayList<FlickrImage> flickrResults )
{
this.flickrResults = flickrResults ;
}

/**
	Get the value of field flickrResults
**/ 

public  ArrayList<FlickrImage> getFlickrResults(){
return this.flickrResults;
}

}

