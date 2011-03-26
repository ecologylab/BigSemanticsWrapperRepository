package ecologylab.semantics.generated.library.icdl;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.simpl_inherit;


/**
	Thumbnail Image

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
@xml_tag("response")
public class IcdlImageResult
extends Document
{

@simpl_collection("book") @simpl_nowrap @mm_name("books")
private ArrayList<IcdlBook>	books;



/**
	Constructor
*/
public IcdlImageResult()
{
 super();
}

/**
	Constructor
*/
public IcdlImageResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for books
*/
public ArrayList<IcdlBook>	books()
{
	ArrayList<IcdlBook>	result = this.books;
	if (result == null)
	{
		result = new ArrayList<IcdlBook>();
		this.books = result;
	}
	return result;
}

/**
	Get the value of field books
*/
public ArrayList<IcdlBook> getBooks()
{
	return this.books;
}

/**
	Set the value of field books
*/
public void setBooks(ArrayList<IcdlBook> books)
{
	this.books = books;
}


}

