package ecologylab.semantics.generated.library.publication;


import java.util.ArrayList;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GeneralBook
extends Publication
{

@simpl_collection("author") @xml_tag("editors") @mm_name("editors")
private ArrayList<Author>	editors;

@simpl_scalar
private MetadataString	edition;

@simpl_collection("publication") @xml_tag("table_of_contents") @mm_name("table_of_contents")
private ArrayList<Publication>	tableOfContents;

@simpl_scalar
private MetadataParsedURL	coverImage;



/**
	Constructor
*/
public GeneralBook()
{
 super();
}

/**
	Constructor
*/
public GeneralBook(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for editors
*/
public ArrayList<Author>	editors()
{
	ArrayList<Author>	result = this.editors;
	if (result == null)
	{
		result = new ArrayList<Author>();
		this.editors = result;
	}
	return result;
}

/**
	Get the value of field editors
*/
public ArrayList<Author> getEditors()
{
	return this.editors;
}

/**
	Set the value of field editors
*/
public void setEditors(ArrayList<Author> editors)
{
	this.editors = editors;
}

/**
	Lazy evaluation for edition
*/
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

/**
	Gets the value of the field edition
*/
public String getEdition()
{
	return this.edition().getValue();
}

/**
	Sets the value of the field edition
*/
public void setEdition(String edition)
{
	this.edition().setValue(edition);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: edition
*/
public boolean isNullEdition()
{
	return edition == null || edition.getValue() == null;
}

/**
	The heavy weight setter method for field edition
*/
public void hwSetEdition(String edition)
{
	this.edition().setValue(edition);
	rebuildCompositeTermVector();
}

/**
	 Sets the edition directly.
*/
public void setEditionMetadata(MetadataString edition)
{
	this.edition = edition;
}

/**
	Heavy Weight Direct setter method for edition
*/
public void hwSetEditionMetadata(MetadataString edition)
{
	if (this.edition != null && this.edition.getValue() != null && hasTermVector())
		termVector().remove(this.edition.termVector());
	this.edition = edition;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for tableOfContents
*/
public ArrayList<Publication>	tableOfContents()
{
	ArrayList<Publication>	result = this.tableOfContents;
	if (result == null)
	{
		result = new ArrayList<Publication>();
		this.tableOfContents = result;
	}
	return result;
}

/**
	Get the value of field tableOfContents
*/
public ArrayList<Publication> getTableOfContents()
{
	return this.tableOfContents;
}

/**
	Set the value of field tableOfContents
*/
public void setTableOfContents(ArrayList<Publication> tableOfContents)
{
	this.tableOfContents = tableOfContents;
}

/**
	Lazy evaluation for coverImage
*/
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

/**
	Gets the value of the field coverImage
*/
public ParsedURL getCoverImage()
{
	return this.coverImage().getValue();
}

/**
	Sets the value of the field coverImage
*/
public void setCoverImage(ParsedURL coverImage)
{
	this.coverImage().setValue(coverImage);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: coverImage
*/
public boolean isNullCoverImage()
{
	return coverImage == null || coverImage.getValue() == null;
}

/**
	The heavy weight setter method for field coverImage
*/
public void hwSetCoverImage(ParsedURL coverImage)
{
	this.coverImage().setValue(coverImage);
	rebuildCompositeTermVector();
}

/**
	 Sets the coverImage directly.
*/
public void setCoverImageMetadata(MetadataParsedURL coverImage)
{
	this.coverImage = coverImage;
}

/**
	Heavy Weight Direct setter method for coverImage
*/
public void hwSetCoverImageMetadata(MetadataParsedURL coverImage)
{
	if (this.coverImage != null && this.coverImage.getValue() != null && hasTermVector())
		termVector().remove(this.coverImage.termVector());
	this.coverImage = coverImage;
	rebuildCompositeTermVector();
}


}

