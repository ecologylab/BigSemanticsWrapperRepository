package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.generated.library.publication.Author;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.publication.Publication;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  Book.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Book extends Publication
{
	/** 
	 */ 
	@simpl_collection("author") @mm_name("editors")	private ArrayList<Author> editors;

	/** 
	 */ 
	@simpl_scalar	private MetadataString edition;

	/** 
	 */ 
	@simpl_collection("publication") @mm_name("table_of_contents")	private ArrayList<Publication> tableOfContents;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL coverImage;

	public Book()
	{ }

	public Book(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<Author> getEditors()
	{
		return editors;
	}

	public void setEditors(ArrayList<Author> editors)
	{
		this.editors = editors;
	}
	public MetadataString	edition()
	{
		MetadataString	result = this.edition;
		if (result == null)
		{
			result = new MetadataString();
			this.edition = result;
		}
		return result;
	}

	public String getEdition()
	{
		return this.edition().getValue();
	}

	public void setEdition(String edition)
	{
		this.edition().setValue(edition);
	}


	public ArrayList<Publication> getTableOfContents()
	{
		return tableOfContents;
	}

	public void setTableOfContents(ArrayList<Publication> tableOfContents)
	{
		this.tableOfContents = tableOfContents;
	}
	public MetadataParsedURL	coverImage()
	{
		MetadataParsedURL	result = this.coverImage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.coverImage = result;
		}
		return result;
	}

	public ParsedURL getCoverImage()
	{
		return this.coverImage().getValue();
	}

	public void setCoverImage(ParsedURL coverImage)
	{
		this.coverImage().setValue(coverImage);
	}

}
