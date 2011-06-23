package ecologylab.semantics.generated.library.publication;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.camera.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.gps.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.publication.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.ImageClipping;
import ecologylab.semantics.metadata.builtins.MediaClipping;
import ecologylab.semantics.metadata.builtins.TextClipping;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Book
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
public Book()
{
 super();
}

/**
	Constructor
*/
public Book(MetaMetadataCompositeField metaMetadata)
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

