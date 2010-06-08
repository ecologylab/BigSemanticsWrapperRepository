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

public class Anchor extends Metadata{


/**
	
**/ 

	 @xml_leaf private MetadataParsedURL	link;

/**
	null
**/ 

	 @xml_leaf private MetadataString	anchorText;

/**
	Constructor
**/ 

public Anchor()
{
 super();
}

/**
	Constructor
**/ 

public Anchor(MetaMetadata metaMetadata)
{
super(metaMetadata);
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
/**
	Lazy Evaluation for anchorText
**/ 

public MetadataString	anchorText()
{
MetadataString	result	=this.anchorText;
if(result == null)
{
result = new MetadataString();
this.anchorText	=	 result;
}
return result;
}

/**
	Gets the value of the field anchorText
**/ 

public String getAnchorText(){
return anchorText().getValue();
}

/**
	Sets the value of the field anchorText
**/ 

public void setAnchorText( String anchorText )
{
this.anchorText().setValue(anchorText);
}

/**
	The heavy weight setter method for field anchorText
**/ 

public void hwSetAnchorText( String anchorText )
{
this.anchorText().setValue(anchorText);
rebuildCompositeTermVector();
 }
/**
	 Sets the anchorText directly
**/ 

public void setAnchorTextMetadata(MetadataString anchorText)
{	this.anchorText = anchorText;
}
/**
	Heavy Weight Direct setter method for anchorText
**/ 

public void hwSetAnchorTextMetadata(MetadataString anchorText)
{	 if(this.anchorText!=null && this.anchorText.getValue()!=null && hasTermVector())
		 termVector().remove(this.anchorText.termVector());
	 this.anchorText = anchorText;
	rebuildCompositeTermVector();
}}
