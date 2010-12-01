package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Tumblr blog class
**/ 

@simpl_inherit

public class  Tumblr
extends  Document
{


/**
	Phone number of the restaurant
**/ 

	@simpl_scalar private MetadataString	post;

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

public Tumblr(MetaMetadataCompositeField metaMetadata)
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

public String getPost()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: post
**/ 

public boolean isNullPost()
{
	return post == null || post.getValue() == null;
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

