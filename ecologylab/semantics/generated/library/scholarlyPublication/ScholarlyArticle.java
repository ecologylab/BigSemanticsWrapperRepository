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
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
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
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class  ScholarlyArticle
extends  Pdf
{


/**
	citation.cfm
**/ 

	 @simpl_scalar private MetadataParsedURL	metadataPage;
	@xml_tag("abstract") @simpl_scalar private MetadataString	abstractField;

private  @simpl_composite Source	source;	@simpl_collection("author") private ArrayList<Author>	authors;
	@simpl_collection("reference") private ArrayList<Entity<ScholarlyArticle>>	references;
	@simpl_collection("citation") private ArrayList<Entity<ScholarlyArticle>>	citations;
	@simpl_collection("tag") private ArrayList<Tag>	classifications;
	@simpl_collection("tag") private ArrayList<Tag>	keywords;

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

public ScholarlyArticle(MetaMetadataCompositeField metaMetadata)
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

/**
	Lazy Evaluation for classifications
**/ 

public  ArrayList<Tag>	classifications()
{
 ArrayList<Tag>	result	=this.classifications;
if(result == null)
{
result = new  ArrayList<Tag>();
this.classifications	=	 result;
}
return result;
}

/**
	Set the value of field classifications
**/ 

public void setClassifications(  ArrayList<Tag> classifications )
{
this.classifications = classifications ;
}

/**
	Get the value of field classifications
**/ 

public  ArrayList<Tag> getClassifications(){
return this.classifications;
}

/**
	Lazy Evaluation for keywords
**/ 

public  ArrayList<Tag>	keywords()
{
 ArrayList<Tag>	result	=this.keywords;
if(result == null)
{
result = new  ArrayList<Tag>();
this.keywords	=	 result;
}
return result;
}

/**
	Set the value of field keywords
**/ 

public void setKeywords(  ArrayList<Tag> keywords )
{
this.keywords = keywords ;
}

/**
	Get the value of field keywords
**/ 

public  ArrayList<Tag> getKeywords(){
return this.keywords;
}

}

