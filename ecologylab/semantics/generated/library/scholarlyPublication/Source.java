package ecologylab.semantics.generated.library.scholarlyPublication;


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
	Metadata related to where an article is published.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Source
extends Document
{

@simpl_scalar
private MetadataInteger	yearOfPublication;


/**
	Archive of conference or journal.
*/
@simpl_scalar
private MetadataString	archiveName;


/**
	Url to the archive of conference or journal.
*/
@simpl_scalar
private MetadataParsedURL	archive;

@simpl_scalar
private MetadataString	isbn;

@simpl_scalar
private MetadataString	pages;



/**
	Constructor
*/
public Source()
{
 super();
}

/**
	Constructor
*/
public Source(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for yearOfPublication
*/
public MetadataInteger	yearOfPublication()
{
	MetadataInteger	result = this.yearOfPublication;
	if (result == null)
	{
		result = new MetadataInteger();
		this.yearOfPublication = result;
	}
	return result;
}

/**
	Gets the value of the field yearOfPublication
*/
public Integer getYearOfPublication()
{
	return this.yearOfPublication().getValue();
}

/**
	Sets the value of the field yearOfPublication
*/
public void setYearOfPublication(Integer yearOfPublication)
{
	this.yearOfPublication().setValue(yearOfPublication);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: yearOfPublication
*/
public boolean isNullYearOfPublication()
{
	return yearOfPublication == null || yearOfPublication.getValue() == null;
}

/**
	The heavy weight setter method for field yearOfPublication
*/
public void hwSetYearOfPublication(Integer yearOfPublication)
{
	this.yearOfPublication().setValue(yearOfPublication);
	rebuildCompositeTermVector();
}

/**
	 Sets the yearOfPublication directly.
*/
public void setYearOfPublicationMetadata(MetadataInteger yearOfPublication)
{
	this.yearOfPublication = yearOfPublication;
}

/**
	Heavy Weight Direct setter method for yearOfPublication
*/
public void hwSetYearOfPublicationMetadata(MetadataInteger yearOfPublication)
{
	if (this.yearOfPublication != null && this.yearOfPublication.getValue() != null && hasTermVector())
		termVector().remove(this.yearOfPublication.termVector());
	this.yearOfPublication = yearOfPublication;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for archiveName
*/
public MetadataString	archiveName()
{
	MetadataString	result = this.archiveName;
	if (result == null)
	{
		result = new MetadataString();
		this.archiveName = result;
	}
	return result;
}

/**
	Gets the value of the field archiveName
*/
public String getArchiveName()
{
	return this.archiveName().getValue();
}

/**
	Sets the value of the field archiveName
*/
public void setArchiveName(String archiveName)
{
	this.archiveName().setValue(archiveName);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: archiveName
*/
public boolean isNullArchiveName()
{
	return archiveName == null || archiveName.getValue() == null;
}

/**
	The heavy weight setter method for field archiveName
*/
public void hwSetArchiveName(String archiveName)
{
	this.archiveName().setValue(archiveName);
	rebuildCompositeTermVector();
}

/**
	 Sets the archiveName directly.
*/
public void setArchiveNameMetadata(MetadataString archiveName)
{
	this.archiveName = archiveName;
}

/**
	Heavy Weight Direct setter method for archiveName
*/
public void hwSetArchiveNameMetadata(MetadataString archiveName)
{
	if (this.archiveName != null && this.archiveName.getValue() != null && hasTermVector())
		termVector().remove(this.archiveName.termVector());
	this.archiveName = archiveName;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for archive
*/
public MetadataParsedURL	archive()
{
	MetadataParsedURL	result = this.archive;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.archive = result;
	}
	return result;
}

/**
	Gets the value of the field archive
*/
public ParsedURL getArchive()
{
	return this.archive().getValue();
}

/**
	Sets the value of the field archive
*/
public void setArchive(ParsedURL archive)
{
	this.archive().setValue(archive);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: archive
*/
public boolean isNullArchive()
{
	return archive == null || archive.getValue() == null;
}

/**
	The heavy weight setter method for field archive
*/
public void hwSetArchive(ParsedURL archive)
{
	this.archive().setValue(archive);
	rebuildCompositeTermVector();
}

/**
	 Sets the archive directly.
*/
public void setArchiveMetadata(MetadataParsedURL archive)
{
	this.archive = archive;
}

/**
	Heavy Weight Direct setter method for archive
*/
public void hwSetArchiveMetadata(MetadataParsedURL archive)
{
	if (this.archive != null && this.archive.getValue() != null && hasTermVector())
		termVector().remove(this.archive.termVector());
	this.archive = archive;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for isbn
*/
public MetadataString	isbn()
{
	MetadataString	result = this.isbn;
	if (result == null)
	{
		result = new MetadataString();
		this.isbn = result;
	}
	return result;
}

/**
	Gets the value of the field isbn
*/
public String getIsbn()
{
	return this.isbn().getValue();
}

/**
	Sets the value of the field isbn
*/
public void setIsbn(String isbn)
{
	this.isbn().setValue(isbn);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: isbn
*/
public boolean isNullIsbn()
{
	return isbn == null || isbn.getValue() == null;
}

/**
	The heavy weight setter method for field isbn
*/
public void hwSetIsbn(String isbn)
{
	this.isbn().setValue(isbn);
	rebuildCompositeTermVector();
}

/**
	 Sets the isbn directly.
*/
public void setIsbnMetadata(MetadataString isbn)
{
	this.isbn = isbn;
}

/**
	Heavy Weight Direct setter method for isbn
*/
public void hwSetIsbnMetadata(MetadataString isbn)
{
	if (this.isbn != null && this.isbn.getValue() != null && hasTermVector())
		termVector().remove(this.isbn.termVector());
	this.isbn = isbn;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for pages
*/
public MetadataString	pages()
{
	MetadataString	result = this.pages;
	if (result == null)
	{
		result = new MetadataString();
		this.pages = result;
	}
	return result;
}

/**
	Gets the value of the field pages
*/
public String getPages()
{
	return this.pages().getValue();
}

/**
	Sets the value of the field pages
*/
public void setPages(String pages)
{
	this.pages().setValue(pages);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pages
*/
public boolean isNullPages()
{
	return pages == null || pages.getValue() == null;
}

/**
	The heavy weight setter method for field pages
*/
public void hwSetPages(String pages)
{
	this.pages().setValue(pages);
	rebuildCompositeTermVector();
}

/**
	 Sets the pages directly.
*/
public void setPagesMetadata(MetadataString pages)
{
	this.pages = pages;
}

/**
	Heavy Weight Direct setter method for pages
*/
public void hwSetPagesMetadata(MetadataString pages)
{
	if (this.pages != null && this.pages.getValue() != null && hasTermVector())
		termVector().remove(this.pages.termVector());
	this.pages = pages;
	rebuildCompositeTermVector();
}


}

