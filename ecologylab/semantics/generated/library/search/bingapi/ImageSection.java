package ecologylab.semantics.generated.library.search.bingapi;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.search.bingapi.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class  ImageSection
extends  Document
{

	 @simpl_collection("mms:ImageResult") @xml_tag("mms:Results") @mm_name("image_search_results") private ArrayList<ImageSearchResult>	imageSearchResults;

/**
	Constructor
**/ 

public ImageSection()
{
 super();
}

/**
	Constructor
**/ 

public ImageSection(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for imageSearchResults
**/ 

public  ArrayList<ImageSearchResult>	imageSearchResults()
{
 ArrayList<ImageSearchResult>	result	=this.imageSearchResults;
if(result == null)
{
result = new  ArrayList<ImageSearchResult>();
this.imageSearchResults	=	 result;
}
return result;
}

/**
	Set the value of field imageSearchResults
**/ 

public void setImageSearchResults(  ArrayList<ImageSearchResult> imageSearchResults )
{
this.imageSearchResults = imageSearchResults ;
}

/**
	Get the value of field imageSearchResults
**/ 

public  ArrayList<ImageSearchResult> getImageSearchResults(){
return this.imageSearchResults;
}

}

