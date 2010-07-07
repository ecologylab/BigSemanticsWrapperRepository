package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;


/**
	All flickr photos of a particular user
**/ 

@simpl_inherit

public class  FlickrAuthor
extends  Document
{

	@simpl_collection("flickr_link") private ArrayList<FlickrLink>	flickrLinkSet;

/**
	Constructor
**/ 

public FlickrAuthor()
{
 super();
}

/**
	Constructor
**/ 

public FlickrAuthor(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickrLinkSet
**/ 

public  ArrayList<FlickrLink>	flickrLinkSet()
{
 ArrayList<FlickrLink>	result	=this.flickrLinkSet;
if(result == null)
{
result = new  ArrayList<FlickrLink>();
this.flickrLinkSet	=	 result;
}
return result;
}

/**
	Set the value of field flickrLinkSet
**/ 

public void setFlickrLinkSet(  ArrayList<FlickrLink> flickrLinkSet )
{
this.flickrLinkSet = flickrLinkSet ;
}

/**
	Get the value of field flickrLinkSet
**/ 

public  ArrayList<FlickrLink> getFlickrLinkSet(){
return this.flickrLinkSet;
}

}

