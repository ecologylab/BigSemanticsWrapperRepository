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
	A Flickr Image result page
**/ 

@simpl_inherit

public class  Flickr2ImageDetail
extends  Document
{

	@simpl_collection("flickr_2_tag") private ArrayList<Flickr2Tag>	flickr2Tags;

/**
	Constructor
**/ 

public Flickr2ImageDetail()
{
 super();
}

/**
	Constructor
**/ 

public Flickr2ImageDetail(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickr2Tags
**/ 

public  ArrayList<Flickr2Tag>	flickr2Tags()
{
 ArrayList<Flickr2Tag>	result	=this.flickr2Tags;
if(result == null)
{
result = new  ArrayList<Flickr2Tag>();
this.flickr2Tags	=	 result;
}
return result;
}

/**
	Set the value of field flickr2Tags
**/ 

public void setFlickr2Tags(  ArrayList<Flickr2Tag> flickr2Tags )
{
this.flickr2Tags = flickr2Tags ;
}

/**
	Get the value of field flickr2Tags
**/ 

public  ArrayList<Flickr2Tag> getFlickr2Tags(){
return this.flickr2Tags;
}

}

