package ecologylab.semantics.generated.library.slashdot;

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
@xml_tag("rdf:RDF")
public class  SlashdotRss
extends  Document
{

	 @simpl_collection("item") @simpl_nowrap @mm_name("items") private ArrayList<SlashdotItem>	items;

/**
	Constructor
**/ 

public SlashdotRss()
{
 super();
}

/**
	Constructor
**/ 

public SlashdotRss(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for items
**/ 

public  ArrayList<SlashdotItem>	items()
{
 ArrayList<SlashdotItem>	result	=this.items;
if(result == null)
{
result = new  ArrayList<SlashdotItem>();
this.items	=	 result;
}
return result;
}

/**
	Set the value of field items
**/ 

public void setItems(  ArrayList<SlashdotItem> items )
{
this.items = items ;
}

/**
	Get the value of field items
**/ 

public  ArrayList<SlashdotItem> getItems(){
return this.items;
}

}
