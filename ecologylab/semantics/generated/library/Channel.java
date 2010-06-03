package ecologylab.semantics.generated.library;

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
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;

@xml_inherit

public class Channel extends Metadata{

	@xml_collection("item") private ArrayList<Item>	item;

/**
	Constructor
**/ 

public Channel()
{
 super();
}

/**
	Constructor
**/ 

public Channel(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for item
**/ 

public  ArrayList<Item>	item()
{
 ArrayList<Item>	result	=this.item;
if(result == null)
{
result = new  ArrayList<Item>();
this.item	=	 result;
}
return result;
}

/**
	Set the value of field item
**/ 

public void setItem(  ArrayList<Item> item )
{
this.item = item ;
}

/**
	Get the value of field item
**/ 

public  ArrayList<Item> getItem(){
return this.item;
}
}
