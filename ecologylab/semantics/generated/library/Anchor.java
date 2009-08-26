package ecologylab.semantics.generated.library;

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
@xml_tag("anchor")
public class Anchor extends Metadata{


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
	
**/ 

	@xml_tag("link") @xml_nested private MetadataParsedURL	link;

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
	null
**/ 

	@xml_tag("anchor_text") @xml_nested private MetadataString	anchorText;

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
