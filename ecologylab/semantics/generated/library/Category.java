package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class Category extends Metadata{

	@simpl_scalar private MetadataString	name;
	@simpl_scalar private MetadataParsedURL	catLink;

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

public Category(MetaMetadataCompositeField metaMetadata)
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

public String getName()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: name
**/ 

public boolean isNullName()
{
	return name == null || name.getValue() == null;
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

public ParsedURL getCatLink()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: catLink
**/ 

public boolean isNullCatLink()
{
	return catLink == null || catLink.getValue() == null;
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
