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
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	An author of an article or creative work.
**/ 

@xml_inherit
@xml_tag("author")
public class  Author
extends  Document
{


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
	
**/ 

	@xml_tag("affiliation") @xml_nested private MetadataString	affiliation;

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
}

