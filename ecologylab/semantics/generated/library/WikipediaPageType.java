package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.simpl_inherit;


/**
	An article on wikipedia
**/ 

@simpl_inherit

public class  WikipediaPageType
extends  Document
{

	@simpl_collection("paragraph") private ArrayList<Paragraph>	paragraphs;
	@simpl_collection("category") private ArrayList<Category>	categories;
	@simpl_collection("thumbinner") private ArrayList<Thumbinner>	thumbinners;

/**
	Constructor
**/ 

public WikipediaPageType()
{
 super();
}

/**
	Constructor
**/ 

public WikipediaPageType(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for paragraphs
**/ 

public  ArrayList<Paragraph>	paragraphs()
{
 ArrayList<Paragraph>	result	=this.paragraphs;
if(result == null)
{
result = new  ArrayList<Paragraph>();
this.paragraphs	=	 result;
}
return result;
}

/**
	Set the value of field paragraphs
**/ 

public void setParagraphs(  ArrayList<Paragraph> paragraphs )
{
this.paragraphs = paragraphs ;
}

/**
	Get the value of field paragraphs
**/ 

public  ArrayList<Paragraph> getParagraphs(){
return this.paragraphs;
}

/**
	Lazy Evaluation for categories
**/ 

public  ArrayList<Category>	categories()
{
 ArrayList<Category>	result	=this.categories;
if(result == null)
{
result = new  ArrayList<Category>();
this.categories	=	 result;
}
return result;
}

/**
	Set the value of field categories
**/ 

public void setCategories(  ArrayList<Category> categories )
{
this.categories = categories ;
}

/**
	Get the value of field categories
**/ 

public  ArrayList<Category> getCategories(){
return this.categories;
}

/**
	Lazy Evaluation for thumbinners
**/ 

public  ArrayList<Thumbinner>	thumbinners()
{
 ArrayList<Thumbinner>	result	=this.thumbinners;
if(result == null)
{
result = new  ArrayList<Thumbinner>();
this.thumbinners	=	 result;
}
return result;
}

/**
	Set the value of field thumbinners
**/ 

public void setThumbinners(  ArrayList<Thumbinner> thumbinners )
{
this.thumbinners = thumbinners ;
}

/**
	Get the value of field thumbinners
**/ 

public  ArrayList<Thumbinner> getThumbinners(){
return this.thumbinners;
}

}

