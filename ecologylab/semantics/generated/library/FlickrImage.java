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
 import ecologylab.semantics.metadata.Document;
import ecologylab.semantics.metadata.Media;

/**
	A Flickr Image
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
	null
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
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("location") @xml_nested private MetadataParsedURL	location;

/**
	Lazy Evaluation for location
**/ 

public MetadataParsedURL	location()
{
MetadataParsedURL	result	=this.location;
if(result == null)
{
result = new MetadataParsedURL();
this.location	=	 result;
}
return result;
}

/**
	Gets the value of the field location
**/ 

public ParsedURL getLocation(){
return location().getValue();
}

/**
	Sets the value of the field location
**/ 

public void setLocation( ParsedURL location )
{
this.location().setValue(location);
}

/**
	The heavy weight setter method for field location
**/ 

public void hwSetLocation( ParsedURL location )
{
this.location().setValue(location);
rebuildCompositeTermVector();
 }
/**
	 Sets the location directly
**/ 

public void setLocationMetadata(MetadataParsedURL location)
{	this.location = location;
}
/**
	Heavy Weight Direct setter method for location
**/ 

public void hwSetLocationMetadata(MetadataParsedURL location)
{	 if(this.location!=null && this.location.getValue()!=null && hasTermVector())
		 termVector().remove(this.location.termVector());
	 this.location = location;
	rebuildCompositeTermVector();
}
/**
	Not the title. An optional longer field, found only on the image detail page (flickr_image_detail).
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
	 Sets the description directly
**/ 

public void setDescriptionMetadata(MetadataString description)
{	this.description = description;
}
/**
	Heavy Weight Direct setter method for description
**/ 

public void hwSetDescriptionMetadata(MetadataString description)
{	 if(this.description!=null && this.description.getValue()!=null && hasTermVector())
		 termVector().remove(this.description.termVector());
	 this.description = description;
	rebuildCompositeTermVector();
}
/**
	null
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
/**
	 Sets the imagePurl directly
**/ 

public void setImagePurlMetadata(MetadataParsedURL imagePurl)
{	this.imagePurl = imagePurl;
}
/**
	Heavy Weight Direct setter method for imagePurl
**/ 

public void hwSetImagePurlMetadata(MetadataParsedURL imagePurl)
{	 if(this.imagePurl!=null && this.imagePurl.getValue()!=null && hasTermVector())
		 termVector().remove(this.imagePurl.termVector());
	 this.imagePurl = imagePurl;
	rebuildCompositeTermVector();
}	@xml_collection("tags") private ArrayList<FlickrTag>	tags;

/**
	Lazy Evaluation for tags
**/ 

public ArrayList<FlickrTag>	tags()
{
ArrayList<FlickrTag>	result	=this.tags;
if(result == null)
{
result = new ArrayList<FlickrTag>();
this.tags	=	 result;
}
return result;
}

/**
	Set the value of field tags
**/ 

public void setTags( ArrayList<FlickrTag> tags )
{
this.tags = tags ;
}

/**
	Get the value of field tags
**/ 

public ArrayList<FlickrTag> getTags(){
return this.tags;
}

}

