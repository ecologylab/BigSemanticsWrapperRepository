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
	The Image Class
**/ 

@xml_inherit
@xml_tag("image")
public class  Image
extends  Media
{


/**
	Constructor
**/ 

public Image()
{
 super();
}

/**
	Constructor
**/ 

public Image(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	The caption of the image.
**/ 

	@xml_tag("caption") @xml_nested private MetadataString	caption;

/**
	Lazy Evaluation for caption
**/ 

public MetadataString	caption()
{
MetadataString	result	=this.caption;
if(result == null)
{
result = new MetadataString();
this.caption	=	 result;
}
return result;
}

/**
	Gets the value of the field caption
**/ 

public String getCaption(){
return caption().getValue();
}

/**
	Sets the value of the field caption
**/ 

public void setCaption( String caption )
{
this.caption().setValue(caption);
}

/**
	The heavy weight setter method for field caption
**/ 

public void hwSetCaption( String caption )
{
this.caption().setValue(caption);
rebuildCompositeTermVector();
 }
/**
	 Sets the caption directly
**/ 

public void setCaptionMetadata(MetadataString caption)
{	this.caption = caption;
}
/**
	Heavy Weight Direct setter method for caption
**/ 

public void hwSetCaptionMetadata(MetadataString caption)
{	 if(this.caption!=null && this.caption.getValue()!=null && hasTermVector())
		 termVector().remove(this.caption.termVector());
	 this.caption = caption;
	rebuildCompositeTermVector();
}
/**
	Location of the image.
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
	
**/ 

	@xml_tag("nav_location") @xml_nested private MetadataParsedURL	navLocation;

/**
	Lazy Evaluation for navLocation
**/ 

public MetadataParsedURL	navLocation()
{
MetadataParsedURL	result	=this.navLocation;
if(result == null)
{
result = new MetadataParsedURL();
this.navLocation	=	 result;
}
return result;
}

/**
	Gets the value of the field navLocation
**/ 

public ParsedURL getNavLocation(){
return navLocation().getValue();
}

/**
	Sets the value of the field navLocation
**/ 

public void setNavLocation( ParsedURL navLocation )
{
this.navLocation().setValue(navLocation);
}

/**
	The heavy weight setter method for field navLocation
**/ 

public void hwSetNavLocation( ParsedURL navLocation )
{
this.navLocation().setValue(navLocation);
rebuildCompositeTermVector();
 }
/**
	 Sets the navLocation directly
**/ 

public void setNavLocationMetadata(MetadataParsedURL navLocation)
{	this.navLocation = navLocation;
}
/**
	Heavy Weight Direct setter method for navLocation
**/ 

public void hwSetNavLocationMetadata(MetadataParsedURL navLocation)
{	 if(this.navLocation!=null && this.navLocation.getValue()!=null && hasTermVector())
		 termVector().remove(this.navLocation.termVector());
	 this.navLocation = navLocation;
	rebuildCompositeTermVector();
}
/**
	Relative location of local copy of image.
**/ 

	@xml_tag("local_location") @xml_nested private MetadataString	localLocation;

/**
	Lazy Evaluation for localLocation
**/ 

public MetadataString	localLocation()
{
MetadataString	result	=this.localLocation;
if(result == null)
{
result = new MetadataString();
this.localLocation	=	 result;
}
return result;
}

/**
	Gets the value of the field localLocation
**/ 

public String getLocalLocation(){
return localLocation().getValue();
}

/**
	Sets the value of the field localLocation
**/ 

public void setLocalLocation( String localLocation )
{
this.localLocation().setValue(localLocation);
}

/**
	The heavy weight setter method for field localLocation
**/ 

public void hwSetLocalLocation( String localLocation )
{
this.localLocation().setValue(localLocation);
rebuildCompositeTermVector();
 }
/**
	 Sets the localLocation directly
**/ 

public void setLocalLocationMetadata(MetadataString localLocation)
{	this.localLocation = localLocation;
}
/**
	Heavy Weight Direct setter method for localLocation
**/ 

public void hwSetLocalLocationMetadata(MetadataString localLocation)
{	 if(this.localLocation!=null && this.localLocation.getValue()!=null && hasTermVector())
		 termVector().remove(this.localLocation.termVector());
	 this.localLocation = localLocation;
	rebuildCompositeTermVector();
}
}

