package ecologylab.semantics.generated.library;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;

@xml_inherit

public class Thumbinner extends Metadata{


/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	thumbImgSrc;

/**
	null
**/ 

	 @xml_leaf private MetadataString	thumbImgCaption;

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
}}
