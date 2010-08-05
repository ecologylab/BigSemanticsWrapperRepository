package ecologylab.semantics.generated.library;

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


/**
	Used to parse wikipedia pages for concept mapping project.
**/ 

@simpl_inherit

public class  WikipediaPageForParsing
extends  WikipediaPageType
{

	 @simpl_collection("paragraph") @xml_tag("paragraphs") @mm_name("paragraphs") private ArrayList<Paragraph>	paragraphs;
	 @simpl_collection("category") @xml_tag("categories") @mm_name("categories") private ArrayList<Category>	categories;

/**
	Constructor
**/ 

public WikipediaPageForParsing()
{
 super();
}

/**
	Constructor
**/ 

public WikipediaPageForParsing(MetaMetadataCompositeField metaMetadata)
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

}

