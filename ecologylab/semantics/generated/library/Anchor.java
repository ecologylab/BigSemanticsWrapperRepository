package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
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

public class Anchor extends Metadata{

	@simpl_scalar private MetadataString	anchorText;
	@simpl_scalar private MetadataParsedURL	link;
	@simpl_scalar private MetadataString	targetTitle;

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

public Anchor(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
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
	Lazy Evaluation for targetTitle
**/ 

public MetadataString	targetTitle()
{
MetadataString	result	=this.targetTitle;
if(result == null)
{
result = new MetadataString();
this.targetTitle	=	 result;
}
return result;
}

/**
	Gets the value of the field targetTitle
**/ 

public String getTargetTitle(){
return targetTitle().getValue();
}

/**
	Sets the value of the field targetTitle
**/ 

public void setTargetTitle( String targetTitle )
{
this.targetTitle().setValue(targetTitle);
}

/**
	The heavy weight setter method for field targetTitle
**/ 

public void hwSetTargetTitle( String targetTitle )
{
this.targetTitle().setValue(targetTitle);
rebuildCompositeTermVector();
 }
/**
	 Sets the targetTitle directly
**/ 

public void setTargetTitleMetadata(MetadataString targetTitle)
{	this.targetTitle = targetTitle;
}
/**
	Heavy Weight Direct setter method for targetTitle
**/ 

public void hwSetTargetTitleMetadata(MetadataString targetTitle)
{	 if(this.targetTitle!=null && this.targetTitle.getValue()!=null && hasTermVector())
		 termVector().remove(this.targetTitle.termVector());
	 this.targetTitle = targetTitle;
	rebuildCompositeTermVector();
}}
