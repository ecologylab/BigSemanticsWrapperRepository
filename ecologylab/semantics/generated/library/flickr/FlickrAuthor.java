package ecologylab.semantics.generated.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	All flickr photos of a particular user
**/ 

@simpl_inherit

public class  FlickrAuthor
extends  Document
{

	 @simpl_collection("flickr_link") @xml_tag("flickr_link_set") @mm_name("flickr_link_set") private ArrayList<FlickrLink>	flickrLinkSet;

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

public FlickrAuthor(MetaMetadataCompositeField metaMetadata)
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

