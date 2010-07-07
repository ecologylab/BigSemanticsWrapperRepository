package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;


/**
	Delicious home page class
**/ 

@simpl_inherit

public class  DeliciousHomepage
extends  Document
{

	@simpl_collection("bookmark") private ArrayList<Bookmark>	bookmarks;

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

