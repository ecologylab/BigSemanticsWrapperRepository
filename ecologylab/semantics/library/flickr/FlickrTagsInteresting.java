package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.generated.library.Search;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;


/**
	Used for flickr search results
**/ 

@simpl_inherit

public class  FlickrTagsInteresting
extends  Search
{

	@simpl_collection("flickr_link") private ArrayList<FlickrLink>	flickrLinkSet;

/**
	Constructor
**/ 

public FlickrTagsInteresting()
{
 super();
}

/**
	Constructor
**/ 

public FlickrTagsInteresting(MetaMetadata metaMetadata)
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

