package ecologylab.semantics.generated.library.scholarlyPublication;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
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
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Metadata related to where an article is published.
**/ 

@simpl_inherit

public class  Source
extends  Document
{

	 @simpl_scalar private MetadataInteger	yearOfPublication;

/**
	Archive of conference or journal.
**/ 

	 @simpl_scalar private MetadataParsedURL	archive;
	 @simpl_scalar private MetadataString	pages;
	 @simpl_scalar private MetadataString	isbn;

/**
	Constructor
**/ 

public Source()
{
 super();
}

/**
	Constructor
**/ 

public Source(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for yearOfPublication
**/ 

public MetadataInteger	yearOfPublication()
{
MetadataInteger	result	=this.yearOfPublication;
if(result == null)
{
result = new MetadataInteger();
this.yearOfPublication	=	 result;
}
return result;
}

/**
	Gets the value of the field yearOfPublication
**/ 

public Integer getYearOfPublication(){
return yearOfPublication().getValue();
}

/**
	Sets the value of the field yearOfPublication
**/ 

public void setYearOfPublication( Integer yearOfPublication )
{
this.yearOfPublication().setValue(yearOfPublication);
}

/**
	The heavy weight setter method for field yearOfPublication
**/ 

public void hwSetYearOfPublication( Integer yearOfPublication )
{
this.yearOfPublication().setValue(yearOfPublication);
rebuildCompositeTermVector();
 }
/**
	 Sets the yearOfPublication directly
**/ 

public void setYearOfPublicationMetadata(MetadataInteger yearOfPublication)
{	this.yearOfPublication = yearOfPublication;
}
/**
	Heavy Weight Direct setter method for yearOfPublication
**/ 

public void hwSetYearOfPublicationMetadata(MetadataInteger yearOfPublication)
{	 if(this.yearOfPublication!=null && this.yearOfPublication.getValue()!=null && hasTermVector())
		 termVector().remove(this.yearOfPublication.termVector());
	 this.yearOfPublication = yearOfPublication;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for archive
**/ 

public MetadataParsedURL	archive()
{
MetadataParsedURL	result	=this.archive;
if(result == null)
{
result = new MetadataParsedURL();
this.archive	=	 result;
}
return result;
}

/**
	Gets the value of the field archive
**/ 

public ParsedURL getArchive(){
return archive().getValue();
}

/**
	Sets the value of the field archive
**/ 

public void setArchive( ParsedURL archive )
{
this.archive().setValue(archive);
}

/**
	The heavy weight setter method for field archive
**/ 

public void hwSetArchive( ParsedURL archive )
{
this.archive().setValue(archive);
rebuildCompositeTermVector();
 }
/**
	 Sets the archive directly
**/ 

public void setArchiveMetadata(MetadataParsedURL archive)
{	this.archive = archive;
}
/**
	Heavy Weight Direct setter method for archive
**/ 

public void hwSetArchiveMetadata(MetadataParsedURL archive)
{	 if(this.archive!=null && this.archive.getValue()!=null && hasTermVector())
		 termVector().remove(this.archive.termVector());
	 this.archive = archive;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for pages
**/ 

public MetadataString	pages()
{
MetadataString	result	=this.pages;
if(result == null)
{
result = new MetadataString();
this.pages	=	 result;
}
return result;
}

/**
	Gets the value of the field pages
**/ 

public String getPages(){
return pages().getValue();
}

/**
	Sets the value of the field pages
**/ 

public void setPages( String pages )
{
this.pages().setValue(pages);
}

/**
	The heavy weight setter method for field pages
**/ 

public void hwSetPages( String pages )
{
this.pages().setValue(pages);
rebuildCompositeTermVector();
 }
/**
	 Sets the pages directly
**/ 

public void setPagesMetadata(MetadataString pages)
{	this.pages = pages;
}
/**
	Heavy Weight Direct setter method for pages
**/ 

public void hwSetPagesMetadata(MetadataString pages)
{	 if(this.pages!=null && this.pages.getValue()!=null && hasTermVector())
		 termVector().remove(this.pages.termVector());
	 this.pages = pages;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for isbn
**/ 

public MetadataString	isbn()
{
MetadataString	result	=this.isbn;
if(result == null)
{
result = new MetadataString();
this.isbn	=	 result;
}
return result;
}

/**
	Gets the value of the field isbn
**/ 

public String getIsbn(){
return isbn().getValue();
}

/**
	Sets the value of the field isbn
**/ 

public void setIsbn( String isbn )
{
this.isbn().setValue(isbn);
}

/**
	The heavy weight setter method for field isbn
**/ 

public void hwSetIsbn( String isbn )
{
this.isbn().setValue(isbn);
rebuildCompositeTermVector();
 }
/**
	 Sets the isbn directly
**/ 

public void setIsbnMetadata(MetadataString isbn)
{	this.isbn = isbn;
}
/**
	Heavy Weight Direct setter method for isbn
**/ 

public void hwSetIsbnMetadata(MetadataString isbn)
{	 if(this.isbn!=null && this.isbn.getValue()!=null && hasTermVector())
		 termVector().remove(this.isbn.termVector());
	 this.isbn = isbn;
	rebuildCompositeTermVector();
}
}

