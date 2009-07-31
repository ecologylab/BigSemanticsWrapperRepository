package ecologylab.semantics.library.scholarlyPublication;

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
 import ecologylab.semantics.metadata.Document;
import ecologylab.semantics.metadata.Media;
@xml_inherit
@xml_tag("author")
public class Author extends Metadata{


/**
	Constructor
**/ 

public Author()
{
 super();
}

/**
	Constructor
**/ 

public Author(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
**/ 

	@xml_tag("name") @xml_nested private MetadataString	name;

/**
	Lazy Evaluation for name
**/ 

public MetadataString	name()
{
MetadataString	result	=this.name;
if(result == null)
{
result = new MetadataString();
this.name	=	 result;
}
return result;
}

/**
	Gets the value of the field name
**/ 

public String getName(){
return name().getValue();
}

/**
	Sets the value of the field name
**/ 

public void setName( String name )
{
this.name().setValue(name);
}

/**
	The heavy weight setter method for field name
**/ 

public void hwSetName( String name )
{
this.name().setValue(name);
rebuildCompositeTermVector();
 }
/**
	 Sets the name directly
**/ 

public void setNameMetadata(MetadataString name)
{	this.name = name;
}
/**
	Heavy Weight Direct setter method for name
**/ 

public void hwSetNameMetadata(MetadataString name)
{	 if(this.name!=null && this.name.getValue()!=null && hasTermVector())
		 termVector().remove(this.name.termVector());
	 this.name = name;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("affiliation") @xml_nested private MetadataString	affiliation;

/**
	Lazy Evaluation for affiliation
**/ 

public MetadataString	affiliation()
{
MetadataString	result	=this.affiliation;
if(result == null)
{
result = new MetadataString();
this.affiliation	=	 result;
}
return result;
}

/**
	Gets the value of the field affiliation
**/ 

public String getAffiliation(){
return affiliation().getValue();
}

/**
	Sets the value of the field affiliation
**/ 

public void setAffiliation( String affiliation )
{
this.affiliation().setValue(affiliation);
}

/**
	The heavy weight setter method for field affiliation
**/ 

public void hwSetAffiliation( String affiliation )
{
this.affiliation().setValue(affiliation);
rebuildCompositeTermVector();
 }
/**
	 Sets the affiliation directly
**/ 

public void setAffiliationMetadata(MetadataString affiliation)
{	this.affiliation = affiliation;
}
/**
	Heavy Weight Direct setter method for affiliation
**/ 

public void hwSetAffiliationMetadata(MetadataString affiliation)
{	 if(this.affiliation!=null && this.affiliation.getValue()!=null && hasTermVector())
		 termVector().remove(this.affiliation.termVector());
	 this.affiliation = affiliation;
	rebuildCompositeTermVector();
}
/**
	
**/ 

	@xml_tag("results_page") @xml_nested private MetadataParsedURL	resultsPage;

/**
	Lazy Evaluation for resultsPage
**/ 

public MetadataParsedURL	resultsPage()
{
MetadataParsedURL	result	=this.resultsPage;
if(result == null)
{
result = new MetadataParsedURL();
this.resultsPage	=	 result;
}
return result;
}

/**
	Gets the value of the field resultsPage
**/ 

public ParsedURL getResultsPage(){
return resultsPage().getValue();
}

/**
	Sets the value of the field resultsPage
**/ 

public void setResultsPage( ParsedURL resultsPage )
{
this.resultsPage().setValue(resultsPage);
}

/**
	The heavy weight setter method for field resultsPage
**/ 

public void hwSetResultsPage( ParsedURL resultsPage )
{
this.resultsPage().setValue(resultsPage);
rebuildCompositeTermVector();
 }
/**
	 Sets the resultsPage directly
**/ 

public void setResultsPageMetadata(MetadataParsedURL resultsPage)
{	this.resultsPage = resultsPage;
}
/**
	Heavy Weight Direct setter method for resultsPage
**/ 

public void hwSetResultsPageMetadata(MetadataParsedURL resultsPage)
{	 if(this.resultsPage!=null && this.resultsPage.getValue()!=null && hasTermVector())
		 termVector().remove(this.resultsPage.termVector());
	 this.resultsPage = resultsPage;
	rebuildCompositeTermVector();
}}
