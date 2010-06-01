package ecologylab.semantics.library.scholarlyPublication;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.Pdf;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;


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

	 @xml_leaf private MetadataParsedURL	metadataPage;

/**
	
**/ 

	@xml_tag("abstract") @xml_leaf private MetadataString	abstractField;

private  @xml_nested Source	source;	@xml_collection("authors") private ArrayList<Author>	authors;
	@xml_collection("reference") private ArrayList<Entity<ScholarlyArticle>>	references;
	@xml_collection("citation") private ArrayList<Entity<ScholarlyArticle>>	citations;
	@xml_collection("classifications") private ArrayList<Link>	classifications;
	@xml_collection("key_terms") private ArrayList<Link>	keyTerms;

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

public  ArrayList<Link>	classifications()
{
 ArrayList<Link>	result	=this.classifications;
if(result == null)
{
result = new  ArrayList<Link>();
this.classifications	=	 result;
}
return result;
}

/**
	Set the value of field classifications
**/ 

public void setClassifications(  ArrayList<Link> classifications )
{
this.classifications = classifications ;
}

/**
	Get the value of field classifications
**/ 

public  ArrayList<Link> getClassifications(){
return this.classifications;
}

/**
	Lazy Evaluation for keyTerms
**/ 

public  ArrayList<Link>	keyTerms()
{
 ArrayList<Link>	result	=this.keyTerms;
if(result == null)
{
result = new  ArrayList<Link>();
this.keyTerms	=	 result;
}
return result;
}

/**
	Set the value of field keyTerms
**/ 

public void setKeyTerms(  ArrayList<Link> keyTerms )
{
this.keyTerms = keyTerms ;
}

/**
	Get the value of field keyTerms
**/ 

public  ArrayList<Link> getKeyTerms(){
return this.keyTerms;
}

}

