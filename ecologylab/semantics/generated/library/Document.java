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
	The Document Class
**/ 

@xml_inherit
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
	
**/ 

	@xml_tag("description") @xml_nested private MetadataString	description;

/**
	Lazy Evaluation for description
**/ 

MetadataString	description()
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
	
**/ 

	@xml_tag("anchor_text") @xml_nested private MetadataStringBuilder	anchorText;

/**
	Lazy Evaluation for anchorText
**/ 

MetadataStringBuilder	anchorText()
{
MetadataStringBuilder	result	=this.anchorText;
if(result == null)
{
result = new MetadataStringBuilder();
this.anchorText	=	 result;
}
return result;
}

/**
	Gets the value of the field anchorText
**/ 

public StringBuilder getAnchorText(){
return anchorText().getValue();
}

/**
	Sets the value of the field anchorText
**/ 

public void setAnchorText( StringBuilder anchorText )
{
this.anchorText().setValue(anchorText);
}

/**
	The heavy weight setter method for field anchorText
**/ 

public void hwSetAnchorText( StringBuilder anchorText )
{
this.anchorText().setValue(anchorText);
rebuildCompositeTermVector();
 }
/**
	 Appends the value to the field anchorText
**/ 

public void appendAnchorText( String anchorText )
{
this.anchorText().setValue(anchorText);
}

/**
	The heavy weight Append method for field anchorText
**/ 

public void hwAppendAnchorText( StringBuilder anchorText )
{
this.anchorText().setValue(anchorText);
rebuildCompositeTermVector();
 }
/**
	The heavy weight Append method for field anchorText
**/ 

public void hwAppendAnchorText( String anchorText )
{
this.anchorText().setValue(anchorText);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("anchor_context_string") @xml_nested private MetadataStringBuilder	anchorContextString;

/**
	Lazy Evaluation for anchorContextString
**/ 

MetadataStringBuilder	anchorContextString()
{
MetadataStringBuilder	result	=this.anchorContextString;
if(result == null)
{
result = new MetadataStringBuilder();
this.anchorContextString	=	 result;
}
return result;
}

/**
	Gets the value of the field anchorContextString
**/ 

public StringBuilder getAnchorContextString(){
return anchorContextString().getValue();
}

/**
	Sets the value of the field anchorContextString
**/ 

public void setAnchorContextString( StringBuilder anchorContextString )
{
this.anchorContextString().setValue(anchorContextString);
}

/**
	The heavy weight setter method for field anchorContextString
**/ 

public void hwSetAnchorContextString( StringBuilder anchorContextString )
{
this.anchorContextString().setValue(anchorContextString);
rebuildCompositeTermVector();
 }
/**
	 Appends the value to the field anchorContextString
**/ 

public void appendAnchorContextString( String anchorContextString )
{
this.anchorContextString().setValue(anchorContextString);
}

/**
	The heavy weight Append method for field anchorContextString
**/ 

public void hwAppendAnchorContextString( StringBuilder anchorContextString )
{
this.anchorContextString().setValue(anchorContextString);
rebuildCompositeTermVector();
 }
/**
	The heavy weight Append method for field anchorContextString
**/ 

public void hwAppendAnchorContextString( String anchorContextString )
{
this.anchorContextString().setValue(anchorContextString);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("context") @xml_nested private MetadataString	context;

/**
	Lazy Evaluation for context
**/ 

MetadataString	context()
{
MetadataString	result	=this.context;
if(result == null)
{
result = new MetadataString();
this.context	=	 result;
}
return result;
}

/**
	Gets the value of the field context
**/ 

public String getContext(){
return context().getValue();
}

/**
	Sets the value of the field context
**/ 

public void setContext( String context )
{
this.context().setValue(context);
}

/**
	The heavy weight setter method for field context
**/ 

public void hwSetContext( String context )
{
this.context().setValue(context);
rebuildCompositeTermVector();
 }
/**
	The document's actual location.
**/ 

	@xml_tag("location") @xml_nested private MetadataParsedURL	location;

/**
	Lazy Evaluation for location
**/ 

MetadataParsedURL	location()
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
	
**/ 

	@xml_tag("navlocation") @xml_nested private MetadataParsedURL	navlocation;

/**
	Lazy Evaluation for navlocation
**/ 

MetadataParsedURL	navlocation()
{
MetadataParsedURL	result	=this.navlocation;
if(result == null)
{
result = new MetadataParsedURL();
this.navlocation	=	 result;
}
return result;
}

/**
	Gets the value of the field navlocation
**/ 

public ParsedURL getNavlocation(){
return navlocation().getValue();
}

/**
	Sets the value of the field navlocation
**/ 

public void setNavlocation( ParsedURL navlocation )
{
this.navlocation().setValue(navlocation);
}

/**
	The heavy weight setter method for field navlocation
**/ 

public void hwSetNavlocation( ParsedURL navlocation )
{
this.navlocation().setValue(navlocation);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("generation") @xml_nested private MetadataInteger	generation;

/**
	Lazy Evaluation for generation
**/ 

MetadataInteger	generation()
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
	For debugging. Type of the structure recognized by information extraction.
**/ 

	@xml_tag("page_structure") @xml_nested private MetadataString	pageStructure;

/**
	Lazy Evaluation for pageStructure
**/ 

MetadataString	pageStructure()
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
}

