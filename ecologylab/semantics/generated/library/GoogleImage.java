package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
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
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Google images
**/ 

@simpl_inherit

public class  GoogleImage
extends  Document
{

	@simpl_collection("image_title") @simpl_nowrap private ArrayList<ImageTitle>	imageTitles;

/**
	Constructor
**/ 

public GoogleImage()
{
 super();
}

/**
	Constructor
**/ 

public GoogleImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for imageTitles
**/ 

public  ArrayList<ImageTitle>	imageTitles()
{
 ArrayList<ImageTitle>	result	=this.imageTitles;
if(result == null)
{
result = new  ArrayList<ImageTitle>();
this.imageTitles	=	 result;
}
return result;
}

/**
	Set the value of field imageTitles
**/ 

public void setImageTitles(  ArrayList<ImageTitle> imageTitles )
{
this.imageTitles = imageTitles ;
}

/**
	Get the value of field imageTitles
**/ 

public  ArrayList<ImageTitle> getImageTitles(){
return this.imageTitles;
}

}

