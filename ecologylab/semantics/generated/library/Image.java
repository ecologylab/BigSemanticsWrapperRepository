package ecologylab.semantics.generated.library;
/**
This is a generated code. Please do not edit or modify it.
 @author MetadataCompiler 

**/ 



 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;

/**
	The Image Class
**/ 

public class  Image
extends  Media
{

/**
	Constructor
**/ 

public Image()
{
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

MetadataString	caption()
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
 }/**
	Location of the image.
**/ 

	@xml_tag("location") @xml_nested private MetadataParsedURL	location;
/**
	Lazy Evaluation for location
**/ 

MetadataParsedURL	location()
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
 }/**
	
**/ 

	@xml_tag("nav_location") @xml_nested private MetadataParsedURL	navLocation;
/**
	Lazy Evaluation for navLocation
**/ 

MetadataParsedURL	navLocation()
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
}

