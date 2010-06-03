package ecologylab.semantics.generated.library;

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
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;


/**
	Tumblr blog class
**/ 

@xml_inherit

public class  Tumblr
extends  Document
{


/**
	Phone number of the restaurant
**/ 

	 @xml_leaf private MetadataString	post;

/**
	Constructor
**/ 

public Tumblr()
{
 super();
}

/**
	Constructor
**/ 

public Tumblr(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for post
**/ 

public MetadataString	post()
{
MetadataString	result	=this.post;
if(result == null)
{
result = new MetadataString();
this.post	=	 result;
}
return result;
}

/**
	Gets the value of the field post
**/ 

public String getPost(){
return post().getValue();
}

/**
	Sets the value of the field post
**/ 

public void setPost( String post )
{
this.post().setValue(post);
}

/**
	The heavy weight setter method for field post
**/ 

public void hwSetPost( String post )
{
this.post().setValue(post);
rebuildCompositeTermVector();
 }
/**
	 Sets the post directly
**/ 

public void setPostMetadata(MetadataString post)
{	this.post = post;
}
/**
	Heavy Weight Direct setter method for post
**/ 

public void hwSetPostMetadata(MetadataString post)
{	 if(this.post!=null && this.post.getValue()!=null && hasTermVector())
		 termVector().remove(this.post.termVector());
	 this.post = post;
	rebuildCompositeTermVector();
}
}

