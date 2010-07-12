package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	The flickr search class
**/ 

@simpl_inherit

public class  FlickrTwoSearch
extends  Document
{

	@simpl_collection("flickr_two_image") private ArrayList<FlickrTwoImage>	flickrTwoResults;

/**
	Constructor
**/ 

public FlickrTwoSearch()
{
 super();
}

/**
	Constructor
**/ 

public FlickrTwoSearch(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickrTwoResults
**/ 

public  ArrayList<FlickrTwoImage>	flickrTwoResults()
{
 ArrayList<FlickrTwoImage>	result	=this.flickrTwoResults;
if(result == null)
{
result = new  ArrayList<FlickrTwoImage>();
this.flickrTwoResults	=	 result;
}
return result;
}

/**
	Set the value of field flickrTwoResults
**/ 

public void setFlickrTwoResults(  ArrayList<FlickrTwoImage> flickrTwoResults )
{
this.flickrTwoResults = flickrTwoResults ;
}

/**
	Get the value of field flickrTwoResults
**/ 

public  ArrayList<FlickrTwoImage> getFlickrTwoResults(){
return this.flickrTwoResults;
}

}

