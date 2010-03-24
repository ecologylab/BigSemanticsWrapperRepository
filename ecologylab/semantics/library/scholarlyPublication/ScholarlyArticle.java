package ecologylab.semantics.library.scholarlyPublication;

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
import ecologylab.semantics.metadata.builtins.Entity;

 import java.util.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.net.ParsedURL;
import ecologylab.generic.HashMapArrayList;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.metadata.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.*;


/**
	null
**/ 

@xml_inherit

public class  ScholarlyArticle
extends  Pdf
{


/**
	citation.cfm
**/ 

	 @xml_nested private MetadataParsedURL	metadataPage;

/**
	null
**/ 

	 @xml_nested private MetadataString	timeStamp;

/**
	
**/ 

	@xml_tag("abstract") @xml_nested private MetadataString	abstractField;

private  @xml_nested Source	source;	@xml_collection("authors") private ArrayList<Author>	authors;
	@xml_collection("reference") private ArrayList<Entity<ScholarlyArticle>>	references;
	@xml_collection("citation") private ArrayList<Entity<ScholarlyArticle>>	citations;

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
	Lazy Evaluation for metadataPage
**/ 

public MetadataParsedURL	metadataPage()
{
MetadataParsedURL	result	=this.metadataPage;
if(result == null)
{
result = new MetadataParsedURL();
this.metadataPage	=	 result;
}
return result;
}

/**
	Gets the value of the field metadataPage
**/ 

public ParsedURL getMetadataPage(){
return metadataPage().getValue();
}

/**
	Sets the value of the field metadataPage
**/ 

public void setMetadataPage( ParsedURL metadataPage )
{
this.metadataPage().setValue(metadataPage);
}

/**
	The heavy weight setter method for field metadataPage
**/ 

public void hwSetMetadataPage( ParsedURL metadataPage )
{
this.metadataPage().setValue(metadataPage);
rebuildCompositeTermVector();
 }
/**
	 Sets the metadataPage directly
**/ 

public void setMetadataPageMetadata(MetadataParsedURL metadataPage)
{	this.metadataPage = metadataPage;
}
/**
	Heavy Weight Direct setter method for metadataPage
**/ 

public void hwSetMetadataPageMetadata(MetadataParsedURL metadataPage)
{	 if(this.metadataPage!=null && this.metadataPage.getValue()!=null && hasTermVector())
		 termVector().remove(this.metadataPage.termVector());
	 this.metadataPage = metadataPage;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for timeStamp
**/ 

public MetadataString	timeStamp()
{
MetadataString	result	=this.timeStamp;
if(result == null)
{
result = new MetadataString();
this.timeStamp	=	 result;
}
return result;
}

/**
	Gets the value of the field timeStamp
**/ 

public String getTimeStamp(){
return timeStamp().getValue();
}

/**
	Sets the value of the field timeStamp
**/ 

public void setTimeStamp( String timeStamp )
{
this.timeStamp().setValue(timeStamp);
}

/**
	The heavy weight setter method for field timeStamp
**/ 

public void hwSetTimeStamp( String timeStamp )
{
this.timeStamp().setValue(timeStamp);
rebuildCompositeTermVector();
 }
/**
	 Sets the timeStamp directly
**/ 

public void setTimeStampMetadata(MetadataString timeStamp)
{	this.timeStamp = timeStamp;
}
/**
	Heavy Weight Direct setter method for timeStamp
**/ 

public void hwSetTimeStampMetadata(MetadataString timeStamp)
{	 if(this.timeStamp!=null && this.timeStamp.getValue()!=null && hasTermVector())
		 termVector().remove(this.timeStamp.termVector());
	 this.timeStamp = timeStamp;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for abstractField
**/ 

public MetadataString	abstractField()
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
/**
	 Sets the abstractField directly
**/ 

public void setAbstractFieldMetadata(MetadataString abstractField)
{	this.abstractField = abstractField;
}
/**
	Heavy Weight Direct setter method for abstractField
**/ 

public void hwSetAbstractFieldMetadata(MetadataString abstractField)
{	 if(this.abstractField!=null && this.abstractField.getValue()!=null && hasTermVector())
		 termVector().remove(this.abstractField.termVector());
	 this.abstractField = abstractField;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for source
**/ 

public Source	source()
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

/**
	Lazy Evaluation for authors
**/ 

public  ArrayList<Author>	authors()
{
 ArrayList<Author>	result	=this.authors;
if(result == null)
{
result = new  ArrayList<Author>();
this.authors	=	 result;
}
return result;
}

/**
	Set the value of field authors
**/ 

public void setAuthors(  ArrayList<Author> authors )
{
this.authors = authors ;
}

/**
	Get the value of field authors
**/ 

public  ArrayList<Author> getAuthors(){
return this.authors;
}

/**
	Lazy Evaluation for references
**/ 

public  ArrayList<Entity<ScholarlyArticle>>	references()
{
 ArrayList<Entity<ScholarlyArticle>>	result	=this.references;
if(result == null)
{
result = new  ArrayList<Entity<ScholarlyArticle>>();
this.references	=	 result;
}
return result;
}

/**
	Set the value of field references
**/ 

public void setReferences(  ArrayList<Entity<ScholarlyArticle>> references )
{
this.references = references ;
}

/**
	Get the value of field references
**/ 

public  ArrayList<Entity<ScholarlyArticle>> getReferences(){
return this.references;
}

/**
	Lazy Evaluation for citations
**/ 

public  ArrayList<Entity<ScholarlyArticle>>	citations()
{
 ArrayList<Entity<ScholarlyArticle>>	result	=this.citations;
if(result == null)
{
result = new  ArrayList<Entity<ScholarlyArticle>>();
this.citations	=	 result;
}
return result;
}

/**
	Set the value of field citations
**/ 

public void setCitations(  ArrayList<Entity<ScholarlyArticle>> citations )
{
this.citations = citations ;
}

/**
	Get the value of field citations
**/ 

public  ArrayList<Entity<ScholarlyArticle>> getCitations(){
return this.citations;
}

}

