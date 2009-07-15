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
import ecologylab.xml.ElementState.xml_tag;


/**
	The Document Class
**/ 

@xml_inherit
@xml_tag("document")
public class  Document
extends  Metadata
{


/**
	Constructor
**/ 

public Document()
{
 super();
}

/**
	Constructor
**/ 

public Document(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	The Title of the Document
**/ 

	@xml_tag("title") @xml_nested private MetadataString	title;

/**
	Lazy Evaluation for title
**/ 

public MetadataString	title()
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
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("description") @xml_nested private MetadataString	description;

/**
	Lazy Evaluation for description
**/ 

public MetadataString	description()
{
MetadataString	result	=this.description;
if(result == null)
{
result = new MetadataString();
this.description	=	 result;
}
return result;
}

/**
	Gets the value of the field description
**/ 

public String getDescription(){
return description().getValue();
}

/**
	Sets the value of the field description
**/ 

public void setDescription( String description )
{
this.description().setValue(description);
}

/**
	The heavy weight setter method for field description
**/ 

public void hwSetDescription( String description )
{
this.description().setValue(description);
rebuildCompositeTermVector();
 }
/**
	 Sets the description directly
**/ 

public void setDescriptionMetadata(MetadataString description)
{	this.description = description;
}
/**
	Heavy Weight Direct setter method for description
**/ 

public void hwSetDescriptionMetadata(MetadataString description)
{	 if(this.description!=null && this.description.getValue()!=null && hasTermVector())
		 termVector().remove(this.description.termVector());
	 this.description = description;
	rebuildCompositeTermVector();
}
/**
	The document's actual location.
**/ 

	@xml_tag("location") @xml_nested private MetadataParsedURL	location;

/**
	Lazy Evaluation for location
**/ 

public MetadataParsedURL	location()
{
MetadataParsedURL	result	=this.location;
if(result == null)
{
result = new MetadataParsedURL();
this.location	=	 result;
}
return result;
}

/**
	Gets the value of the field location
**/ 

public ParsedURL getLocation(){
return location().getValue();
}

/**
	Sets the value of the field location
**/ 

public void setLocation( ParsedURL location )
{
this.location().setValue(location);
}

/**
	The heavy weight setter method for field location
**/ 

public void hwSetLocation( ParsedURL location )
{
this.location().setValue(location);
rebuildCompositeTermVector();
 }
/**
	 Sets the location directly
**/ 

public void setLocationMetadata(MetadataParsedURL location)
{	this.location = location;
}
/**
	Heavy Weight Direct setter method for location
**/ 

public void hwSetLocationMetadata(MetadataParsedURL location)
{	 if(this.location!=null && this.location.getValue()!=null && hasTermVector())
		 termVector().remove(this.location.termVector());
	 this.location = location;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("generation") @xml_nested private MetadataInteger	generation;

/**
	Lazy Evaluation for generation
**/ 

public MetadataInteger	generation()
{
MetadataInteger	result	=this.generation;
if(result == null)
{
result = new MetadataInteger();
this.generation	=	 result;
}
return result;
}

/**
	Gets the value of the field generation
**/ 

public Integer getGeneration(){
return generation().getValue();
}

/**
	Sets the value of the field generation
**/ 

public void setGeneration( Integer generation )
{
this.generation().setValue(generation);
}

/**
	The heavy weight setter method for field generation
**/ 

public void hwSetGeneration( Integer generation )
{
this.generation().setValue(generation);
rebuildCompositeTermVector();
 }
/**
	 Sets the generation directly
**/ 

public void setGenerationMetadata(MetadataInteger generation)
{	this.generation = generation;
}
/**
	Heavy Weight Direct setter method for generation
**/ 

public void hwSetGenerationMetadata(MetadataInteger generation)
{	 if(this.generation!=null && this.generation.getValue()!=null && hasTermVector())
		 termVector().remove(this.generation.termVector());
	 this.generation = generation;
	rebuildCompositeTermVector();
}
/**
	For debugging. Type of the structure recognized by information extraction.
**/ 

	@xml_tag("page_structure") @xml_nested private MetadataString	pageStructure;

/**
	Lazy Evaluation for pageStructure
**/ 

public MetadataString	pageStructure()
{
MetadataString	result	=this.pageStructure;
if(result == null)
{
result = new MetadataString();
this.pageStructure	=	 result;
}
return result;
}

/**
	Gets the value of the field pageStructure
**/ 

public String getPageStructure(){
return pageStructure().getValue();
}

/**
	Sets the value of the field pageStructure
**/ 

public void setPageStructure( String pageStructure )
{
this.pageStructure().setValue(pageStructure);
}

/**
	The heavy weight setter method for field pageStructure
**/ 

public void hwSetPageStructure( String pageStructure )
{
this.pageStructure().setValue(pageStructure);
rebuildCompositeTermVector();
 }
/**
	 Sets the pageStructure directly
**/ 

public void setPageStructureMetadata(MetadataString pageStructure)
{	this.pageStructure = pageStructure;
}
/**
	Heavy Weight Direct setter method for pageStructure
**/ 

public void hwSetPageStructureMetadata(MetadataString pageStructure)
{	 if(this.pageStructure!=null && this.pageStructure.getValue()!=null && hasTermVector())
		 termVector().remove(this.pageStructure.termVector());
	 this.pageStructure = pageStructure;
	rebuildCompositeTermVector();
}
/**
	The search query
**/ 

	@xml_tag("query") @xml_nested private MetadataString	query;

/**
	Lazy Evaluation for query
**/ 

public MetadataString	query()
{
MetadataString	result	=this.query;
if(result == null)
{
result = new MetadataString();
this.query	=	 result;
}
return result;
}

/**
	Gets the value of the field query
**/ 

public String getQuery(){
return query().getValue();
}

/**
	Sets the value of the field query
**/ 

public void setQuery( String query )
{
this.query().setValue(query);
}

/**
	The heavy weight setter method for field query
**/ 

public void hwSetQuery( String query )
{
this.query().setValue(query);
rebuildCompositeTermVector();
 }
/**
	 Sets the query directly
**/ 

public void setQueryMetadata(MetadataString query)
{	this.query = query;
}
/**
	Heavy Weight Direct setter method for query
**/ 

public void hwSetQueryMetadata(MetadataString query)
{	 if(this.query!=null && this.query.getValue()!=null && hasTermVector())
		 termVector().remove(this.query.termVector());
	 this.query = query;
	rebuildCompositeTermVector();
}
}

