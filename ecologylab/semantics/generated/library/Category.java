package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
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
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;

@xml_inherit

public class Category extends Metadata{


/**
	null
**/ 

	 @xml_leaf private MetadataString	name;

/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	catLink;

/**
	Constructor
**/ 

public Category()
{
 super();
}

/**
	Constructor
**/ 

public Category(MetaMetadata metaMetadata)
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
	Lazy Evaluation for catLink
**/ 

public MetadataParsedURL	catLink()
{
MetadataParsedURL	result	=this.catLink;
if(result == null)
{
result = new MetadataParsedURL();
this.catLink	=	 result;
}
return result;
}

/**
	Gets the value of the field catLink
**/ 

public ParsedURL getCatLink(){
return catLink().getValue();
}

/**
	Sets the value of the field catLink
**/ 

public void setCatLink( ParsedURL catLink )
{
this.catLink().setValue(catLink);
}

/**
	The heavy weight setter method for field catLink
**/ 

public void hwSetCatLink( ParsedURL catLink )
{
this.catLink().setValue(catLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the catLink directly
**/ 

public void setCatLinkMetadata(MetadataParsedURL catLink)
{	this.catLink = catLink;
}
/**
	Heavy Weight Direct setter method for catLink
**/ 

public void hwSetCatLinkMetadata(MetadataParsedURL catLink)
{	 if(this.catLink!=null && this.catLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.catLink.termVector());
	 this.catLink = catLink;
	rebuildCompositeTermVector();
}}
