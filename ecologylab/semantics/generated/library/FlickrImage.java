package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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


/**
	A Flickr Image result page
**/ 

@xml_inherit
@xml_tag("flickr_image")
public class  FlickrImage
extends  Document
{


/**
	Constructor
**/ 

public FlickrImage()
{
 super();
}

/**
	Constructor
**/ 

public FlickrImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
**/ 

	@xml_tag("title") @xml_nested private MetadataString	title;

/**
	Lazy Evaluation for title
**/ 

public MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("description") @xml_nested private MetadataString	description;

/**
	Lazy Evaluation for description
**/ 

public MetadataString	description()
{
MetadataString	result	=this.description;
if(result == null)
{
result = new MetadataString();
this.description	=	 result;
}
return result;
}

/**
	Gets the value of the field description
**/ 

public String getDescription(){
return description().getValue();
}

/**
	Sets the value of the field description
**/ 

public void setDescription( String description )
{
this.description().setValue(description);
}

/**
	The heavy weight setter method for field description
**/ 

public void hwSetDescription( String description )
{
this.description().setValue(description);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("href_purl") @xml_nested private MetadataParsedURL	hrefPurl;

/**
	Lazy Evaluation for hrefPurl
**/ 

public MetadataParsedURL	hrefPurl()
{
MetadataParsedURL	result	=this.hrefPurl;
if(result == null)
{
result = new MetadataParsedURL();
this.hrefPurl	=	 result;
}
return result;
}

/**
	Gets the value of the field hrefPurl
**/ 

public ParsedURL getHrefPurl(){
return hrefPurl().getValue();
}

/**
	Sets the value of the field hrefPurl
**/ 

public void setHrefPurl( ParsedURL hrefPurl )
{
this.hrefPurl().setValue(hrefPurl);
}

/**
	The heavy weight setter method for field hrefPurl
**/ 

public void hwSetHrefPurl( ParsedURL hrefPurl )
{
this.hrefPurl().setValue(hrefPurl);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("width") @xml_nested private MetadataInteger	width;

/**
	Lazy Evaluation for width
**/ 

public MetadataInteger	width()
{
MetadataInteger	result	=this.width;
if(result == null)
{
result = new MetadataInteger();
this.width	=	 result;
}
return result;
}

/**
	Gets the value of the field width
**/ 

public Integer getWidth(){
return width().getValue();
}

/**
	Sets the value of the field width
**/ 

public void setWidth( Integer width )
{
this.width().setValue(width);
}

/**
	The heavy weight setter method for field width
**/ 

public void hwSetWidth( Integer width )
{
this.width().setValue(width);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("height") @xml_nested private MetadataInteger	height;

/**
	Lazy Evaluation for height
**/ 

public MetadataInteger	height()
{
MetadataInteger	result	=this.height;
if(result == null)
{
result = new MetadataInteger();
this.height	=	 result;
}
return result;
}

/**
	Gets the value of the field height
**/ 

public Integer getHeight(){
return height().getValue();
}

/**
	Sets the value of the field height
**/ 

public void setHeight( Integer height )
{
this.height().setValue(height);
}

/**
	The heavy weight setter method for field height
**/ 

public void hwSetHeight( Integer height )
{
this.height().setValue(height);
rebuildCompositeTermVector();
 }
/**
	
**/ 

	@xml_tag("image_purl") @xml_nested private MetadataParsedURL	imagePurl;

/**
	Lazy Evaluation for imagePurl
**/ 

public MetadataParsedURL	imagePurl()
{
MetadataParsedURL	result	=this.imagePurl;
if(result == null)
{
result = new MetadataParsedURL();
this.imagePurl	=	 result;
}
return result;
}

/**
	Gets the value of the field imagePurl
**/ 

public ParsedURL getImagePurl(){
return imagePurl().getValue();
}

/**
	Sets the value of the field imagePurl
**/ 

public void setImagePurl( ParsedURL imagePurl )
{
this.imagePurl().setValue(imagePurl);
}

/**
	The heavy weight setter method for field imagePurl
**/ 

public void hwSetImagePurl( ParsedURL imagePurl )
{
this.imagePurl().setValue(imagePurl);
rebuildCompositeTermVector();
 }
}

