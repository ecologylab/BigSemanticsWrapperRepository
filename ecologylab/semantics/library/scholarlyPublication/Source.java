package ecologylab.semantics.library.scholarlyPublication;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;

  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;

@xml_inherit
@xml_tag("null")
public class Source extends Metadata{


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
	
**/ 

	@xml_tag("img_purl") @xml_nested private MetadataParsedURL	imgPurl;

/**
	Lazy Evaluation for imgPurl
**/ 

public MetadataParsedURL	imgPurl()
{
MetadataParsedURL	result	=this.imgPurl;
if(result == null)
{
result = new MetadataParsedURL();
this.imgPurl	=	 result;
}
return result;
}

/**
	Gets the value of the field imgPurl
**/ 

public ParsedURL getImgPurl(){
return imgPurl().getValue();
}

/**
	Sets the value of the field imgPurl
**/ 

public void setImgPurl( ParsedURL imgPurl )
{
this.imgPurl().setValue(imgPurl);
}

/**
	The heavy weight setter method for field imgPurl
**/ 

public void hwSetImgPurl( ParsedURL imgPurl )
{
this.imgPurl().setValue(imgPurl);
rebuildCompositeTermVector();
 }
/**
	 Sets the imgPurl directly
**/ 

public void setImgPurlMetadata(MetadataParsedURL imgPurl)
{	this.imgPurl = imgPurl;
}
/**
	Heavy Weight Direct setter method for imgPurl
**/ 

public void hwSetImgPurlMetadata(MetadataParsedURL imgPurl)
{	 if(this.imgPurl!=null && this.imgPurl.getValue()!=null && hasTermVector())
		 termVector().remove(this.imgPurl.termVector());
	 this.imgPurl = imgPurl;
	rebuildCompositeTermVector();
}
/**
	Name where published.
**/ 

	@xml_tag("heading") @xml_nested private MetadataString	heading;

/**
	Lazy Evaluation for heading
**/ 

public MetadataString	heading()
{
MetadataString	result	=this.heading;
if(result == null)
{
result = new MetadataString();
this.heading	=	 result;
}
return result;
}

/**
	Gets the value of the field heading
**/ 

public String getHeading(){
return heading().getValue();
}

/**
	Sets the value of the field heading
**/ 

public void setHeading( String heading )
{
this.heading().setValue(heading);
}

/**
	The heavy weight setter method for field heading
**/ 

public void hwSetHeading( String heading )
{
this.heading().setValue(heading);
rebuildCompositeTermVector();
 }
/**
	 Sets the heading directly
**/ 

public void setHeadingMetadata(MetadataString heading)
{	this.heading = heading;
}
/**
	Heavy Weight Direct setter method for heading
**/ 

public void hwSetHeadingMetadata(MetadataString heading)
{	 if(this.heading!=null && this.heading.getValue()!=null && hasTermVector())
		 termVector().remove(this.heading.termVector());
	 this.heading = heading;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("archive") @xml_nested private MetadataParsedURL	archive;

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
	
**/ 

	@xml_tag("table_of_contents") @xml_nested private MetadataParsedURL	tableOfContents;

/**
	Lazy Evaluation for tableOfContents
**/ 

public MetadataParsedURL	tableOfContents()
{
MetadataParsedURL	result	=this.tableOfContents;
if(result == null)
{
result = new MetadataParsedURL();
this.tableOfContents	=	 result;
}
return result;
}

/**
	Gets the value of the field tableOfContents
**/ 

public ParsedURL getTableOfContents(){
return tableOfContents().getValue();
}

/**
	Sets the value of the field tableOfContents
**/ 

public void setTableOfContents( ParsedURL tableOfContents )
{
this.tableOfContents().setValue(tableOfContents);
}

/**
	The heavy weight setter method for field tableOfContents
**/ 

public void hwSetTableOfContents( ParsedURL tableOfContents )
{
this.tableOfContents().setValue(tableOfContents);
rebuildCompositeTermVector();
 }
/**
	 Sets the tableOfContents directly
**/ 

public void setTableOfContentsMetadata(MetadataParsedURL tableOfContents)
{	this.tableOfContents = tableOfContents;
}
/**
	Heavy Weight Direct setter method for tableOfContents
**/ 

public void hwSetTableOfContentsMetadata(MetadataParsedURL tableOfContents)
{	 if(this.tableOfContents!=null && this.tableOfContents.getValue()!=null && hasTermVector())
		 termVector().remove(this.tableOfContents.termVector());
	 this.tableOfContents = tableOfContents;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("pages") @xml_nested private MetadataString	pages;

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
	
**/ 

	@xml_tag("year_of_publication") @xml_nested private MetadataInteger	yearOfPublication;

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
	
**/ 

	@xml_tag("isbn") @xml_nested private MetadataString	isbn;

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
}}
