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


/**
	Delicious home page class
**/ 

@xml_inherit

public class  DeliciousHomepage
extends  Document
{

	@xml_collection("bookmarks") private ArrayList<Bookmark>	bookmarks;

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

public DeliciousHomepage(MetaMetadata metaMetadata)
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

