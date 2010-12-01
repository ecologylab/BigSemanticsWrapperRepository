package ecologylab.semantics.generated.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
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
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class  FlickrTag
extends  Metadata
{

	@simpl_scalar private MetadataString	tagName;
	@simpl_scalar private MetadataParsedURL	tagLink;

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

public FlickrTag(MetaMetadataCompositeField metaMetadata)
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

public String getTagName()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: tagName
**/ 

public boolean isNullTagName()
{
	return tagName == null || tagName.getValue() == null;
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

public ParsedURL getTagLink()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: tagLink
**/ 

public boolean isNullTagLink()
{
	return tagLink == null || tagLink.getValue() == null;
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

