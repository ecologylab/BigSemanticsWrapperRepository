package ecologylab.semantics.generated.library;

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
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;

@xml_inherit
@xml_tag("Thumbinner")
public class Thumbinner extends Metadata{


/**
	Constructor
**/ 

public Thumbinner()
{
 super();
}

/**
	Constructor
**/ 

public Thumbinner(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("thumb_img_src") @xml_nested private MetadataParsedURL	thumbImgSrc;

/**
	Lazy Evaluation for thumbImgSrc
**/ 

public MetadataParsedURL	thumbImgSrc()
{
MetadataParsedURL	result	=this.thumbImgSrc;
if(result == null)
{
result = new MetadataParsedURL();
this.thumbImgSrc	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbImgSrc
**/ 

public ParsedURL getThumbImgSrc(){
return thumbImgSrc().getValue();
}

/**
	Sets the value of the field thumbImgSrc
**/ 

public void setThumbImgSrc( ParsedURL thumbImgSrc )
{
this.thumbImgSrc().setValue(thumbImgSrc);
}

/**
	The heavy weight setter method for field thumbImgSrc
**/ 

public void hwSetThumbImgSrc( ParsedURL thumbImgSrc )
{
this.thumbImgSrc().setValue(thumbImgSrc);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbImgSrc directly
**/ 

public void setThumbImgSrcMetadata(MetadataParsedURL thumbImgSrc)
{	this.thumbImgSrc = thumbImgSrc;
}
/**
	Heavy Weight Direct setter method for thumbImgSrc
**/ 

public void hwSetThumbImgSrcMetadata(MetadataParsedURL thumbImgSrc)
{	 if(this.thumbImgSrc!=null && this.thumbImgSrc.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbImgSrc.termVector());
	 this.thumbImgSrc = thumbImgSrc;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("thumb_img_width") @xml_nested private MetadataInteger	thumbImgWidth;

/**
	Lazy Evaluation for thumbImgWidth
**/ 

public MetadataInteger	thumbImgWidth()
{
MetadataInteger	result	=this.thumbImgWidth;
if(result == null)
{
result = new MetadataInteger();
this.thumbImgWidth	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbImgWidth
**/ 

public Integer getThumbImgWidth(){
return thumbImgWidth().getValue();
}

/**
	Sets the value of the field thumbImgWidth
**/ 

public void setThumbImgWidth( Integer thumbImgWidth )
{
this.thumbImgWidth().setValue(thumbImgWidth);
}

/**
	The heavy weight setter method for field thumbImgWidth
**/ 

public void hwSetThumbImgWidth( Integer thumbImgWidth )
{
this.thumbImgWidth().setValue(thumbImgWidth);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbImgWidth directly
**/ 

public void setThumbImgWidthMetadata(MetadataInteger thumbImgWidth)
{	this.thumbImgWidth = thumbImgWidth;
}
/**
	Heavy Weight Direct setter method for thumbImgWidth
**/ 

public void hwSetThumbImgWidthMetadata(MetadataInteger thumbImgWidth)
{	 if(this.thumbImgWidth!=null && this.thumbImgWidth.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbImgWidth.termVector());
	 this.thumbImgWidth = thumbImgWidth;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("thumb_img_height") @xml_nested private MetadataInteger	thumbImgHeight;

/**
	Lazy Evaluation for thumbImgHeight
**/ 

public MetadataInteger	thumbImgHeight()
{
MetadataInteger	result	=this.thumbImgHeight;
if(result == null)
{
result = new MetadataInteger();
this.thumbImgHeight	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbImgHeight
**/ 

public Integer getThumbImgHeight(){
return thumbImgHeight().getValue();
}

/**
	Sets the value of the field thumbImgHeight
**/ 

public void setThumbImgHeight( Integer thumbImgHeight )
{
this.thumbImgHeight().setValue(thumbImgHeight);
}

/**
	The heavy weight setter method for field thumbImgHeight
**/ 

public void hwSetThumbImgHeight( Integer thumbImgHeight )
{
this.thumbImgHeight().setValue(thumbImgHeight);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbImgHeight directly
**/ 

public void setThumbImgHeightMetadata(MetadataInteger thumbImgHeight)
{	this.thumbImgHeight = thumbImgHeight;
}
/**
	Heavy Weight Direct setter method for thumbImgHeight
**/ 

public void hwSetThumbImgHeightMetadata(MetadataInteger thumbImgHeight)
{	 if(this.thumbImgHeight!=null && this.thumbImgHeight.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbImgHeight.termVector());
	 this.thumbImgHeight = thumbImgHeight;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("thumb_img_caption") @xml_nested private MetadataString	thumbImgCaption;

/**
	Lazy Evaluation for thumbImgCaption
**/ 

public MetadataString	thumbImgCaption()
{
MetadataString	result	=this.thumbImgCaption;
if(result == null)
{
result = new MetadataString();
this.thumbImgCaption	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbImgCaption
**/ 

public String getThumbImgCaption(){
return thumbImgCaption().getValue();
}

/**
	Sets the value of the field thumbImgCaption
**/ 

public void setThumbImgCaption( String thumbImgCaption )
{
this.thumbImgCaption().setValue(thumbImgCaption);
}

/**
	The heavy weight setter method for field thumbImgCaption
**/ 

public void hwSetThumbImgCaption( String thumbImgCaption )
{
this.thumbImgCaption().setValue(thumbImgCaption);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbImgCaption directly
**/ 

public void setThumbImgCaptionMetadata(MetadataString thumbImgCaption)
{	this.thumbImgCaption = thumbImgCaption;
}
/**
	Heavy Weight Direct setter method for thumbImgCaption
**/ 

public void hwSetThumbImgCaptionMetadata(MetadataString thumbImgCaption)
{	 if(this.thumbImgCaption!=null && this.thumbImgCaption.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbImgCaption.termVector());
	 this.thumbImgCaption = thumbImgCaption;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("thumb_img_link") @xml_nested private MetadataParsedURL	thumbImgLink;

/**
	Lazy Evaluation for thumbImgLink
**/ 

public MetadataParsedURL	thumbImgLink()
{
MetadataParsedURL	result	=this.thumbImgLink;
if(result == null)
{
result = new MetadataParsedURL();
this.thumbImgLink	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbImgLink
**/ 

public ParsedURL getThumbImgLink(){
return thumbImgLink().getValue();
}

/**
	Sets the value of the field thumbImgLink
**/ 

public void setThumbImgLink( ParsedURL thumbImgLink )
{
this.thumbImgLink().setValue(thumbImgLink);
}

/**
	The heavy weight setter method for field thumbImgLink
**/ 

public void hwSetThumbImgLink( ParsedURL thumbImgLink )
{
this.thumbImgLink().setValue(thumbImgLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbImgLink directly
**/ 

public void setThumbImgLinkMetadata(MetadataParsedURL thumbImgLink)
{	this.thumbImgLink = thumbImgLink;
}
/**
	Heavy Weight Direct setter method for thumbImgLink
**/ 

public void hwSetThumbImgLinkMetadata(MetadataParsedURL thumbImgLink)
{	 if(this.thumbImgLink!=null && this.thumbImgLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbImgLink.termVector());
	 this.thumbImgLink = thumbImgLink;
	rebuildCompositeTermVector();
}}
