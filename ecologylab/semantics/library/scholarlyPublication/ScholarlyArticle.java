package ecologylab.semantics.library.scholarlyPublication;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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


/**
	
**/ 

@xml_inherit
public class  ScholarlyArticle
extends  Pdf
{


/**
	Constructor
**/ 

public ScholarlyArticle()
{
 super();
}

/**
	Constructor
**/ 

public ScholarlyArticle(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
**/ 

	@xml_tag("title") @xml_nested private MetadataString	title;

/**
	Lazy Evaluation for title
**/ 

MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	The Linked PDF
**/ 

	@xml_tag("full_text") @xml_nested private MetadataParsedURL	fullText;

/**
	Lazy Evaluation for fullText
**/ 

MetadataParsedURL	fullText()
{
MetadataParsedURL	result	=this.fullText;
if(result == null)
{
result = new MetadataParsedURL();
this.fullText	=	 result;
}
return result;
}

/**
	Gets the value of the field fullText
**/ 

public ParsedURL getFullText(){
return fullText().getValue();
}

/**
	Sets the value of the field fullText
**/ 

public void setFullText( ParsedURL fullText )
{
this.fullText().setValue(fullText);
}

/**
	The heavy weight setter method for field fullText
**/ 

public void hwSetFullText( ParsedURL fullText )
{
this.fullText().setValue(fullText);
rebuildCompositeTermVector();
 }
/**
	ALT TEXT FOR THE IMAGE
**/ 

	@xml_tag("alt") @xml_nested private MetadataString	alt;

/**
	Lazy Evaluation for alt
**/ 

MetadataString	alt()
{
MetadataString	result	=this.alt;
if(result == null)
{
result = new MetadataString();
this.alt	=	 result;
}
return result;
}

/**
	Gets the value of the field alt
**/ 

public String getAlt(){
return alt().getValue();
}

/**
	Sets the value of the field alt
**/ 

public void setAlt( String alt )
{
this.alt().setValue(alt);
}

/**
	The heavy weight setter method for field alt
**/ 

public void hwSetAlt( String alt )
{
this.alt().setValue(alt);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("abstract") @xml_nested private MetadataString	abstractField;

/**
	Lazy Evaluation for abstractField
**/ 

MetadataString	abstractField()
{
MetadataString	result	=this.abstractField;
if(result == null)
{
result = new MetadataString();
this.abstractField	=	 result;
}
return result;
}

/**
	Gets the value of the field abstractField
**/ 

public String getAbstractField(){
return abstractField().getValue();
}

/**
	Sets the value of the field abstractField
**/ 

public void setAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
}

/**
	The heavy weight setter method for field abstractField
**/ 

public void hwSetAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
rebuildCompositeTermVector();
 }
private @xml_nested Source	source;
/**
	Lazy Evaluation for source
**/ 

Source	source()
{
Source	result	=this.source;
if(result == null)
{
result = new Source();
this.source	=	 result;
}
return result;
}

/**
	Set the value of field source
**/ 

public void setSource( Source source )
{
this.source = source ;
}

/**
	Get the value of field source
**/ 

public Source getSource(){
return this.source;
}
	@xml_collection("authors") private ArrayList<Author>	authors;

/**
	Lazy Evaluation for authors
**/ 

ArrayList<Author>	authors()
{
ArrayList<Author>	result	=this.authors;
if(result == null)
{
result = new ArrayList<Author>();
this.authors	=	 result;
}
return result;
}

/**
	Set the value of field authors
**/ 

public void setAuthors( ArrayList<Author> authors )
{
this.authors = authors ;
}

/**
	Get the value of field authors
**/ 

public ArrayList<Author> getAuthors(){
return this.authors;
}
	@xml_collection("references") private ArrayList<Reference>	references;

/**
	Lazy Evaluation for references
**/ 

ArrayList<Reference>	references()
{
ArrayList<Reference>	result	=this.references;
if(result == null)
{
result = new ArrayList<Reference>();
this.references	=	 result;
}
return result;
}

/**
	Set the value of field references
**/ 

public void setReferences( ArrayList<Reference> references )
{
this.references = references ;
}

/**
	Get the value of field references
**/ 

public ArrayList<Reference> getReferences(){
return this.references;
}
	@xml_collection("citations") private ArrayList<Reference>	citations;

/**
	Lazy Evaluation for citations
**/ 

ArrayList<Reference>	citations()
{
ArrayList<Reference>	result	=this.citations;
if(result == null)
{
result = new ArrayList<Reference>();
this.citations	=	 result;
}
return result;
}

/**
	Set the value of field citations
**/ 

public void setCitations( ArrayList<Reference> citations )
{
this.citations = citations ;
}

/**
	Get the value of field citations
**/ 

public ArrayList<Reference> getCitations(){
return this.citations;
}

}

