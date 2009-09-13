package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;


/**
	The PDF class.
**/ 

@xml_inherit
@xml_tag("pdf")
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

public MetadataString	author()
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
	 Sets the author directly
**/ 

public void setAuthorMetadata(MetadataString author)
{	this.author = author;
}
/**
	Heavy Weight Direct setter method for author
**/ 

public void hwSetAuthorMetadata(MetadataString author)
{	 if(this.author!=null && this.author.getValue()!=null && hasTermVector())
		 termVector().remove(this.author.termVector());
	 this.author = author;
	rebuildCompositeTermVector();
}
/**
	Summary of the pdf document
**/ 

	@xml_tag("summary") @xml_nested private MetadataString	summary;

/**
	Lazy Evaluation for summary
**/ 

public MetadataString	summary()
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
	 Sets the summary directly
**/ 

public void setSummaryMetadata(MetadataString summary)
{	this.summary = summary;
}
/**
	Heavy Weight Direct setter method for summary
**/ 

public void hwSetSummaryMetadata(MetadataString summary)
{	 if(this.summary!=null && this.summary.getValue()!=null && hasTermVector())
		 termVector().remove(this.summary.termVector());
	 this.summary = summary;
	rebuildCompositeTermVector();
}
/**
	Key Words of the document
**/ 

	@xml_tag("keywords") @xml_nested private MetadataString	keywords;

/**
	Lazy Evaluation for keywords
**/ 

public MetadataString	keywords()
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
	 Sets the keywords directly
**/ 

public void setKeywordsMetadata(MetadataString keywords)
{	this.keywords = keywords;
}
/**
	Heavy Weight Direct setter method for keywords
**/ 

public void hwSetKeywordsMetadata(MetadataString keywords)
{	 if(this.keywords!=null && this.keywords.getValue()!=null && hasTermVector())
		 termVector().remove(this.keywords.termVector());
	 this.keywords = keywords;
	rebuildCompositeTermVector();
}
/**
	Subject of the document
**/ 

	@xml_tag("subject") @xml_nested private MetadataString	subject;

/**
	Lazy Evaluation for subject
**/ 

public MetadataString	subject()
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
	 Sets the subject directly
**/ 

public void setSubjectMetadata(MetadataString subject)
{	this.subject = subject;
}
/**
	Heavy Weight Direct setter method for subject
**/ 

public void hwSetSubjectMetadata(MetadataString subject)
{	 if(this.subject!=null && this.subject.getValue()!=null && hasTermVector())
		 termVector().remove(this.subject.termVector());
	 this.subject = subject;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("trapped") @xml_nested private MetadataString	trapped;

/**
	Lazy Evaluation for trapped
**/ 

public MetadataString	trapped()
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
	 Sets the trapped directly
**/ 

public void setTrappedMetadata(MetadataString trapped)
{	this.trapped = trapped;
}
/**
	Heavy Weight Direct setter method for trapped
**/ 

public void hwSetTrappedMetadata(MetadataString trapped)
{	 if(this.trapped!=null && this.trapped.getValue()!=null && hasTermVector())
		 termVector().remove(this.trapped.termVector());
	 this.trapped = trapped;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("modified") @xml_nested private MetadataString	modified;

/**
	Lazy Evaluation for modified
**/ 

public MetadataString	modified()
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
	 Sets the modified directly
**/ 

public void setModifiedMetadata(MetadataString modified)
{	this.modified = modified;
}
/**
	Heavy Weight Direct setter method for modified
**/ 

public void hwSetModifiedMetadata(MetadataString modified)
{	 if(this.modified!=null && this.modified.getValue()!=null && hasTermVector())
		 termVector().remove(this.modified.termVector());
	 this.modified = modified;
	rebuildCompositeTermVector();
}
/**
	Contents of the document
**/ 

	@xml_tag("contents") @xml_nested private MetadataString	contents;

/**
	Lazy Evaluation for contents
**/ 

public MetadataString	contents()
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
	 Sets the contents directly
**/ 

public void setContentsMetadata(MetadataString contents)
{	this.contents = contents;
}
/**
	Heavy Weight Direct setter method for contents
**/ 

public void hwSetContentsMetadata(MetadataString contents)
{	 if(this.contents!=null && this.contents.getValue()!=null && hasTermVector())
		 termVector().remove(this.contents.termVector());
	 this.contents = contents;
	rebuildCompositeTermVector();
}
/**
	Creation date of the document
**/ 

	@xml_tag("creationdate") @xml_nested private MetadataString	creationdate;

/**
	Lazy Evaluation for creationdate
**/ 

public MetadataString	creationdate()
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
/**
	 Sets the creationdate directly
**/ 

public void setCreationdateMetadata(MetadataString creationdate)
{	this.creationdate = creationdate;
}
/**
	Heavy Weight Direct setter method for creationdate
**/ 

public void hwSetCreationdateMetadata(MetadataString creationdate)
{	 if(this.creationdate!=null && this.creationdate.getValue()!=null && hasTermVector())
		 termVector().remove(this.creationdate.termVector());
	 this.creationdate = creationdate;
	rebuildCompositeTermVector();
}
}

