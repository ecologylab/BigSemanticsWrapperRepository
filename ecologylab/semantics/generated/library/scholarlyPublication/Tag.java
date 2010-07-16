package ecologylab.semantics.generated.library.scholarlyPublication;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
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
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class Tag extends Metadata{

	 @simpl_scalar private MetadataString	tagName;
	 @simpl_scalar private MetadataParsedURL	link;

/**
	Constructor
**/ 

public Tag()
{
 super();
}

/**
	Constructor
**/ 

public Tag(MetaMetadata metaMetadata)
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
	Lazy Evaluation for link
**/ 

public MetadataParsedURL	link()
{
MetadataParsedURL	result	=this.link;
if(result == null)
{
result = new MetadataParsedURL();
this.link	=	 result;
}
return result;
}

/**
	Gets the value of the field link
**/ 

public ParsedURL getLink(){
return link().getValue();
}

/**
	Sets the value of the field link
**/ 

public void setLink( ParsedURL link )
{
this.link().setValue(link);
}

/**
	The heavy weight setter method for field link
**/ 

public void hwSetLink( ParsedURL link )
{
this.link().setValue(link);
rebuildCompositeTermVector();
 }
/**
	 Sets the link directly
**/ 

public void setLinkMetadata(MetadataParsedURL link)
{	this.link = link;
}
/**
	Heavy Weight Direct setter method for link
**/ 

public void hwSetLinkMetadata(MetadataParsedURL link)
{	 if(this.link!=null && this.link.getValue()!=null && hasTermVector())
		 termVector().remove(this.link.termVector());
	 this.link = link;
	rebuildCompositeTermVector();
}}
