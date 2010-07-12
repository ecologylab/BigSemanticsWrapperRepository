package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	A Flickr Image
**/ 

@simpl_inherit

public class  FlickrTwoImage
extends  Image
{


/**
	null
**/ 

	 @simpl_scalar private MetadataParsedURL	browsePurl;

/**
	null
**/ 

	 @simpl_scalar private MetadataString	describe;

/**
	Constructor
**/ 

public FlickrTwoImage()
{
 super();
}

/**
	Constructor
**/ 

public FlickrTwoImage(MetaMetadata metaMetadata)
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
	Lazy Evaluation for describe
**/ 

public MetadataString	describe()
{
MetadataString	result	=this.describe;
if(result == null)
{
result = new MetadataString();
this.describe	=	 result;
}
return result;
}

/**
	Gets the value of the field describe
**/ 

public String getDescribe(){
return describe().getValue();
}

/**
	Sets the value of the field describe
**/ 

public void setDescribe( String describe )
{
this.describe().setValue(describe);
}

/**
	The heavy weight setter method for field describe
**/ 

public void hwSetDescribe( String describe )
{
this.describe().setValue(describe);
rebuildCompositeTermVector();
 }
/**
	 Sets the describe directly
**/ 

public void setDescribeMetadata(MetadataString describe)
{	this.describe = describe;
}
/**
	Heavy Weight Direct setter method for describe
**/ 

public void hwSetDescribeMetadata(MetadataString describe)
{	 if(this.describe!=null && this.describe.getValue()!=null && hasTermVector())
		 termVector().remove(this.describe.termVector());
	 this.describe = describe;
	rebuildCompositeTermVector();
}
}

