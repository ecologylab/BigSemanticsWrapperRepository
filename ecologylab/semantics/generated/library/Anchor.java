package ecologylab.semantics.generated.library;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;

@simpl_inherit

public class Anchor extends Metadata{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	link;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	anchorText;

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
