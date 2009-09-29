package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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


/**
	A Flickr Image
**/ 

@xml_inherit
@xml_tag("flickr_image")
public class  FlickrImage
extends  Image
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

	@xml_tag("browse_purl") @xml_nested private MetadataParsedURL	browsePurl;

/**
	Lazy Evaluation for browsePurl
**/ 

public MetadataParsedURL	browsePurl()
{
MetadataParsedURL	result	=this.browsePurl;
if(result == null)
{
result = new MetadataParsedURL();
this.browsePurl	=	 result;
}
return result;
}

/**
	Gets the value of the field browsePurl
**/ 

public ParsedURL getBrowsePurl(){
return browsePurl().getValue();
}

/**
	Sets the value of the field browsePurl
**/ 

public void setBrowsePurl( ParsedURL browsePurl )
{
this.browsePurl().setValue(browsePurl);
}

/**
	The heavy weight setter method for field browsePurl
**/ 

public void hwSetBrowsePurl( ParsedURL browsePurl )
{
this.browsePurl().setValue(browsePurl);
rebuildCompositeTermVector();
 }
/**
	 Sets the browsePurl directly
**/ 

public void setBrowsePurlMetadata(MetadataParsedURL browsePurl)
{	this.browsePurl = browsePurl;
}
/**
	Heavy Weight Direct setter method for browsePurl
**/ 

public void hwSetBrowsePurlMetadata(MetadataParsedURL browsePurl)
{	 if(this.browsePurl!=null && this.browsePurl.getValue()!=null && hasTermVector())
		 termVector().remove(this.browsePurl.termVector());
	 this.browsePurl = browsePurl;
	rebuildCompositeTermVector();
}	@xml_collection("tags") private ArrayList<FlickrTag>	tags;

/**
	Lazy Evaluation for tags
**/ 

public  ArrayList<FlickrTag>	tags()
{
 ArrayList<FlickrTag>	result	=this.tags;
if(result == null)
{
result = new  ArrayList<FlickrTag>();
this.tags	=	 result;
}
return result;
}

/**
	Set the value of field tags
**/ 

public void setTags(  ArrayList<FlickrTag> tags )
{
this.tags = tags ;
}

/**
	Get the value of field tags
**/ 

public  ArrayList<FlickrTag> getTags(){
return this.tags;
}

}

