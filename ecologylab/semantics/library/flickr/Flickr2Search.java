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

public class  Flickr2Search
extends  Document
{

	@simpl_collection("flickr_2_image") private ArrayList<Flickr2Image>	flickr2Results;

/**
	Constructor
**/ 

public Flickr2Search()
{
 super();
}

/**
	Constructor
**/ 

public Flickr2Search(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for flickr2Results
**/ 

public  ArrayList<Flickr2Image>	flickr2Results()
{
 ArrayList<Flickr2Image>	result	=this.flickr2Results;
if(result == null)
{
result = new  ArrayList<Flickr2Image>();
this.flickr2Results	=	 result;
}
return result;
}

/**
	Set the value of field flickr2Results
**/ 

public void setFlickr2Results(  ArrayList<Flickr2Image> flickr2Results )
{
this.flickr2Results = flickr2Results ;
}

/**
	Get the value of field flickr2Results
**/ 

public  ArrayList<Flickr2Image> getFlickr2Results(){
return this.flickr2Results;
}

}

