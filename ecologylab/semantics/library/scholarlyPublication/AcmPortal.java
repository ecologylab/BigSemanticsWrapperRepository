package ecologylab.semantics.library.scholarlyPublication;
/**
This is a generated code. Please do not edit or modify it.
 @author MetadataCompiler 

**/ 



 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;

/**
	
**/ 

public class  AcmPortal
extends  Pdf
{

/**
	Constructor
**/ 

public AcmPortal()
{
}
/**
	Constructor
**/ 

public AcmPortal(MetaMetadata metaMetadata)
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
 }/**
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
 }/**
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
 }/**
	
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
 }	@xml_collection HashMapArrayList<String , Author>	authorss;
/**
	Lazy Evaluation for authorss
**/ 

HashMapArrayList<String , Author>	authorss()
{
HashMapArrayList<String , Author>	result	=this.authorss;
if(result == null)
{
result = new HashMapArrayList<String , Author>();
this.authorss	=	 result;
}
return result;
}
/**
	Set the value of field authorss
**/ 

public void setAuthorss( HashMapArrayList<String , Author> authorss )
{
this.authorss = authorss ;
}
	@xml_collection HashMapArrayList<ParsedURL , Reference>	referencess;
/**
	Lazy Evaluation for referencess
**/ 

HashMapArrayList<ParsedURL , Reference>	referencess()
{
HashMapArrayList<ParsedURL , Reference>	result	=this.referencess;
if(result == null)
{
result = new HashMapArrayList<ParsedURL , Reference>();
this.referencess	=	 result;
}
return result;
}
/**
	Set the value of field referencess
**/ 

public void setReferencess( HashMapArrayList<ParsedURL , Reference> referencess )
{
this.referencess = referencess ;
}
	@xml_collection HashMapArrayList<ParsedURL , Reference>	citationss;
/**
	Lazy Evaluation for citationss
**/ 

HashMapArrayList<ParsedURL , Reference>	citationss()
{
HashMapArrayList<ParsedURL , Reference>	result	=this.citationss;
if(result == null)
{
result = new HashMapArrayList<ParsedURL , Reference>();
this.citationss	=	 result;
}
return result;
}
/**
	Set the value of field citationss
**/ 

public void setCitationss( HashMapArrayList<ParsedURL , Reference> citationss )
{
this.citationss = citationss ;
}

}

