package ecologylab.semantics.generated.library.slashdot;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
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

public class  SlashdotTag
extends  Metadata
{

	@simpl_scalar private MetadataString	name;
	@simpl_scalar private MetadataParsedURL	link;

/**
	Constructor
**/ 

public SlashdotTag()
{
 super();
}

/**
	Constructor
**/ 

public SlashdotTag(MetaMetadataCompositeField metaMetadata)
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
}
}

