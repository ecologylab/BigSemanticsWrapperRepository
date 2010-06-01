package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;


/**
	A Flickr Image
**/ 

@xml_inherit

public class  FlickrImage
extends  Image
{


/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	browsePurl;
	@xml_collection("flickr_tags") private ArrayList<FlickrTag>	flickrTags;

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
}
/**
	Lazy Evaluation for flickrTags
**/ 

public  ArrayList<FlickrTag>	flickrTags()
{
 ArrayList<FlickrTag>	result	=this.flickrTags;
if(result == null)
{
result = new  ArrayList<FlickrTag>();
this.flickrTags	=	 result;
}
return result;
}

/**
	Set the value of field flickrTags
**/ 

public void setFlickrTags(  ArrayList<FlickrTag> flickrTags )
{
this.flickrTags = flickrTags ;
}

/**
	Get the value of field flickrTags
**/ 

public  ArrayList<FlickrTag> getFlickrTags(){
return this.flickrTags;
}

}

