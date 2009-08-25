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
	All flcikr photos of a particular user
**/ 

@xml_inherit
@xml_tag("flickr_all_user_image")
public class  FlickrAllUserImage
extends  Document
{


/**
	Constructor
**/ 

public FlickrAllUserImage()
{
 super();
}

/**
	Constructor
**/ 

public FlickrAllUserImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
	@xml_collection("allUserImage") private ArrayList<FlickrUserImage>	allUserImage;

/**
	Lazy Evaluation for allUserImage
**/ 

public ArrayList<FlickrUserImage>	allUserImage()
{
ArrayList<FlickrUserImage>	result	=this.allUserImage;
if(result == null)
{
result = new ArrayList<FlickrUserImage>();
this.allUserImage	=	 result;
}
return result;
}

/**
	Set the value of field allUserImage
**/ 

public void setAllUserImage( ArrayList<FlickrUserImage> allUserImage )
{
this.allUserImage = allUserImage ;
}

/**
	Get the value of field allUserImage
**/ 

public ArrayList<FlickrUserImage> getAllUserImage(){
return this.allUserImage;
}

}

