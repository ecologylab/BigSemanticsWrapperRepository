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
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	An author of an article or creative work.
**/ 

@simpl_inherit

public class  Author
extends  Document
{

	 @simpl_scalar private MetadataString	name;
	 @simpl_scalar private MetadataString	affiliation;
	 @simpl_scalar private MetadataString	city;

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
	Lazy Evaluation for city
**/ 

public MetadataString	city()
{
MetadataString	result	=this.city;
if(result == null)
{
result = new MetadataString();
this.city	=	 result;
}
return result;
}

/**
	Gets the value of the field city
**/ 

public String getCity(){
return city().getValue();
}

/**
	Sets the value of the field city
**/ 

public void setCity( String city )
{
this.city().setValue(city);
}

/**
	The heavy weight setter method for field city
**/ 

public void hwSetCity( String city )
{
this.city().setValue(city);
rebuildCompositeTermVector();
 }
/**
	 Sets the city directly
**/ 

public void setCityMetadata(MetadataString city)
{	this.city = city;
}
/**
	Heavy Weight Direct setter method for city
**/ 

public void hwSetCityMetadata(MetadataString city)
{	 if(this.city!=null && this.city.getValue()!=null && hasTermVector())
		 termVector().remove(this.city.termVector());
	 this.city = city;
	rebuildCompositeTermVector();
}
}

