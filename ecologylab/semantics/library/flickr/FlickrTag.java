package ecologylab.semantics.library.flickr;

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
import ecologylab.semantics.metadata.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.*;


/**
	null
**/ 

@xml_inherit

public class  FlickrTag
extends  Metadata
{


/**
	null
**/ 

	 @xml_nested private MetadataString	tagName;

/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	tagLink;

/**
	Constructor
**/ 

public FlickrTag()
{
 super();
}

/**
	Constructor
**/ 

public FlickrTag(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for tagName
**/ 

public MetadataString	tagName()
{
MetadataString	result	=this.tagName;
if(result == null)
{
result = new MetadataString();
this.tagName	=	 result;
}
return result;
}

/**
	Gets the value of the field tagName
**/ 

public String getTagName(){
return tagName().getValue();
}

/**
	Sets the value of the field tagName
**/ 

public void setTagName( String tagName )
{
this.tagName().setValue(tagName);
}

/**
	The heavy weight setter method for field tagName
**/ 

public void hwSetTagName( String tagName )
{
this.tagName().setValue(tagName);
rebuildCompositeTermVector();
 }
/**
	 Sets the tagName directly
**/ 

public void setTagNameMetadata(MetadataString tagName)
{	this.tagName = tagName;
}
/**
	Heavy Weight Direct setter method for tagName
**/ 

public void hwSetTagNameMetadata(MetadataString tagName)
{	 if(this.tagName!=null && this.tagName.getValue()!=null && hasTermVector())
		 termVector().remove(this.tagName.termVector());
	 this.tagName = tagName;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for tagLink
**/ 

public MetadataParsedURL	tagLink()
{
MetadataParsedURL	result	=this.tagLink;
if(result == null)
{
result = new MetadataParsedURL();
this.tagLink	=	 result;
}
return result;
}

/**
	Gets the value of the field tagLink
**/ 

public ParsedURL getTagLink(){
return tagLink().getValue();
}

/**
	Sets the value of the field tagLink
**/ 

public void setTagLink( ParsedURL tagLink )
{
this.tagLink().setValue(tagLink);
}

/**
	The heavy weight setter method for field tagLink
**/ 

public void hwSetTagLink( ParsedURL tagLink )
{
this.tagLink().setValue(tagLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the tagLink directly
**/ 

public void setTagLinkMetadata(MetadataParsedURL tagLink)
{	this.tagLink = tagLink;
}
/**
	Heavy Weight Direct setter method for tagLink
**/ 

public void hwSetTagLinkMetadata(MetadataParsedURL tagLink)
{	 if(this.tagLink!=null && this.tagLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.tagLink.termVector());
	 this.tagLink = tagLink;
	rebuildCompositeTermVector();
}
}

