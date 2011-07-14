package ecologylab.semantics.generated.library.icdl;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.generated.library.icdl.MmdInlineIcdlBookInBooksInIcdlImageResult;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  IcdlImageResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * Thumbnail Image
 */ 
@simpl_inherit
public class IcdlImageResult extends Document
{
	/** 
	 */ 
	@simpl_nowrap	@simpl_collection("icdl_book") @mm_name("books")	private ArrayList<MmdInlineIcdlBookInBooksInIcdlImageResult> books;

	public IcdlImageResult()
	{ }

	public IcdlImageResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<MmdInlineIcdlBookInBooksInIcdlImageResult> getBooks()
	{
		return books;
	}

	public void setBooks(ArrayList<MmdInlineIcdlBookInBooksInIcdlImageResult> books)
	{
		this.books = books;
	}
}
