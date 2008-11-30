package ecologylab.semantics.generated.library;

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
	The PDF class.
**/ 

@xml_inherit
public class  Pdf
extends  Document
{


/**
	Constructor
**/ 

public Pdf()
{
 super();
}

/**
	Constructor
**/ 

public Pdf(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	The author of the pdf document
**/ 

	@xml_tag("author") @xml_nested private MetadataString	author;

/**
	Lazy Evaluation for author
**/ 

MetadataString	author()
{
MetadataString	result	=this.author;
if(result == null)
{
result = new MetadataString();
this.author	=	 result;
}
return result;
}

/**
	Gets the value of the field author
**/ 

public String getAuthor(){
return author().getValue();
}

/**
	Sets the value of the field author
**/ 

public void setAuthor( String author )
{
this.author().setValue(author);
}

/**
	The heavy weight setter method for field author
**/ 

public void hwSetAuthor( String author )
{
this.author().setValue(author);
rebuildCompositeTermVector();
 }
/**
	Summary of the pdf document
**/ 

	@xml_tag("summary") @xml_nested private MetadataString	summary;

/**
	Lazy Evaluation for summary
**/ 

MetadataString	summary()
{
MetadataString	result	=this.summary;
if(result == null)
{
result = new MetadataString();
this.summary	=	 result;
}
return result;
}

/**
	Gets the value of the field summary
**/ 

public String getSummary(){
return summary().getValue();
}

/**
	Sets the value of the field summary
**/ 

public void setSummary( String summary )
{
this.summary().setValue(summary);
}

/**
	The heavy weight setter method for field summary
**/ 

public void hwSetSummary( String summary )
{
this.summary().setValue(summary);
rebuildCompositeTermVector();
 }
/**
	Key Words of the document
**/ 

	@xml_tag("keywords") @xml_nested private MetadataString	keywords;

/**
	Lazy Evaluation for keywords
**/ 

MetadataString	keywords()
{
MetadataString	result	=this.keywords;
if(result == null)
{
result = new MetadataString();
this.keywords	=	 result;
}
return result;
}

/**
	Gets the value of the field keywords
**/ 

public String getKeywords(){
return keywords().getValue();
}

/**
	Sets the value of the field keywords
**/ 

public void setKeywords( String keywords )
{
this.keywords().setValue(keywords);
}

/**
	The heavy weight setter method for field keywords
**/ 

public void hwSetKeywords( String keywords )
{
this.keywords().setValue(keywords);
rebuildCompositeTermVector();
 }
/**
	Subject of the document
**/ 

	@xml_tag("subject") @xml_nested private MetadataString	subject;

/**
	Lazy Evaluation for subject
**/ 

MetadataString	subject()
{
MetadataString	result	=this.subject;
if(result == null)
{
result = new MetadataString();
this.subject	=	 result;
}
return result;
}

/**
	Gets the value of the field subject
**/ 

public String getSubject(){
return subject().getValue();
}

/**
	Sets the value of the field subject
**/ 

public void setSubject( String subject )
{
this.subject().setValue(subject);
}

/**
	The heavy weight setter method for field subject
**/ 

public void hwSetSubject( String subject )
{
this.subject().setValue(subject);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("trapped") @xml_nested private MetadataString	trapped;

/**
	Lazy Evaluation for trapped
**/ 

MetadataString	trapped()
{
MetadataString	result	=this.trapped;
if(result == null)
{
result = new MetadataString();
this.trapped	=	 result;
}
return result;
}

/**
	Gets the value of the field trapped
**/ 

public String getTrapped(){
return trapped().getValue();
}

/**
	Sets the value of the field trapped
**/ 

public void setTrapped( String trapped )
{
this.trapped().setValue(trapped);
}

/**
	The heavy weight setter method for field trapped
**/ 

public void hwSetTrapped( String trapped )
{
this.trapped().setValue(trapped);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("modified") @xml_nested private MetadataString	modified;

/**
	Lazy Evaluation for modified
**/ 

MetadataString	modified()
{
MetadataString	result	=this.modified;
if(result == null)
{
result = new MetadataString();
this.modified	=	 result;
}
return result;
}

/**
	Gets the value of the field modified
**/ 

public String getModified(){
return modified().getValue();
}

/**
	Sets the value of the field modified
**/ 

public void setModified( String modified )
{
this.modified().setValue(modified);
}

/**
	The heavy weight setter method for field modified
**/ 

public void hwSetModified( String modified )
{
this.modified().setValue(modified);
rebuildCompositeTermVector();
 }
/**
	Contents of the document
**/ 

	@xml_tag("contents") @xml_nested private MetadataString	contents;

/**
	Lazy Evaluation for contents
**/ 

MetadataString	contents()
{
MetadataString	result	=this.contents;
if(result == null)
{
result = new MetadataString();
this.contents	=	 result;
}
return result;
}

/**
	Gets the value of the field contents
**/ 

public String getContents(){
return contents().getValue();
}

/**
	Sets the value of the field contents
**/ 

public void setContents( String contents )
{
this.contents().setValue(contents);
}

/**
	The heavy weight setter method for field contents
**/ 

public void hwSetContents( String contents )
{
this.contents().setValue(contents);
rebuildCompositeTermVector();
 }
/**
	Creation date of the document
**/ 

	@xml_tag("creationdate") @xml_nested private MetadataString	creationdate;

/**
	Lazy Evaluation for creationdate
**/ 

MetadataString	creationdate()
{
MetadataString	result	=this.creationdate;
if(result == null)
{
result = new MetadataString();
this.creationdate	=	 result;
}
return result;
}

/**
	Gets the value of the field creationdate
**/ 

public String getCreationdate(){
return creationdate().getValue();
}

/**
	Sets the value of the field creationdate
**/ 

public void setCreationdate( String creationdate )
{
this.creationdate().setValue(creationdate);
}

/**
	The heavy weight setter method for field creationdate
**/ 

public void hwSetCreationdate( String creationdate )
{
this.creationdate().setValue(creationdate);
rebuildCompositeTermVector();
 }
}

