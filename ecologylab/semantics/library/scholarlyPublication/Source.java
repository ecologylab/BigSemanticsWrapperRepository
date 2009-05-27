package ecologylab.semantics.library.scholarlyPublication;

 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;

@xml_inherit
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

MetadataParsedURL	imgPurl()
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
	Name where published.
**/ 

	@xml_tag("heading") @xml_nested private MetadataString	heading;

/**
	Lazy Evaluation for heading
**/ 

MetadataString	heading()
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
	
**/ 

	@xml_tag("archive") @xml_nested private MetadataParsedURL	archive;

/**
	Lazy Evaluation for archive
**/ 

MetadataParsedURL	archive()
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
	
**/ 

	@xml_tag("table_of_contents") @xml_nested private MetadataParsedURL	tableOfContents;

/**
	Lazy Evaluation for tableOfContents
**/ 

MetadataParsedURL	tableOfContents()
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
	
**/ 

	@xml_tag("pages") @xml_nested private MetadataString	pages;

/**
	Lazy Evaluation for pages
**/ 

MetadataString	pages()
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
	
**/ 

	@xml_tag("year_of_publication") @xml_nested private MetadataInteger	yearOfPublication;

/**
	Lazy Evaluation for yearOfPublication
**/ 

MetadataInteger	yearOfPublication()
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
	
**/ 

	@xml_tag("isbn") @xml_nested private MetadataString	isbn;

/**
	Lazy Evaluation for isbn
**/ 

MetadataString	isbn()
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
 }}
