package ecologylab.semantics.generated.library;

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
	Google trends
**/ 

@simpl_inherit

public class  GoogleTrends
extends  Document
{

	@simpl_collection("hot_search") @simpl_nowrap private ArrayList<HotSearch>	hotSearches;

/**
	Constructor
**/ 

public GoogleTrends()
{
 super();
}

/**
	Constructor
**/ 

public GoogleTrends(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for hotSearches
**/ 

public  ArrayList<HotSearch>	hotSearches()
{
 ArrayList<HotSearch>	result	=this.hotSearches;
if(result == null)
{
result = new  ArrayList<HotSearch>();
this.hotSearches	=	 result;
}
return result;
}

/**
	Set the value of field hotSearches
**/ 

public void setHotSearches(  ArrayList<HotSearch> hotSearches )
{
this.hotSearches = hotSearches ;
}

/**
	Get the value of field hotSearches
**/ 

public  ArrayList<HotSearch> getHotSearches(){
return this.hotSearches;
}

}

