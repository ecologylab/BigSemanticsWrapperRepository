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
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
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
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Delicious home page class
**/ 

@simpl_inherit

public class  DeliciousHomepage
extends  Document
{

	@simpl_collection("bookmark") @mm_name("bookmarks") private ArrayList<Bookmark>	bookmarks;

/**
	Constructor
**/ 

public DeliciousHomepage()
{
 super();
}

/**
	Constructor
**/ 

public DeliciousHomepage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for bookmarks
**/ 

public  ArrayList<Bookmark>	bookmarks()
{
 ArrayList<Bookmark>	result	=this.bookmarks;
if(result == null)
{
result = new  ArrayList<Bookmark>();
this.bookmarks	=	 result;
}
return result;
}

/**
	Set the value of field bookmarks
**/ 

public void setBookmarks(  ArrayList<Bookmark> bookmarks )
{
this.bookmarks = bookmarks ;
}

/**
	Get the value of field bookmarks
**/ 

public  ArrayList<Bookmark> getBookmarks(){
return this.bookmarks;
}

}

