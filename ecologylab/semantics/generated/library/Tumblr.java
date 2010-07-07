package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.Hint;
import ecologylab.xml.simpl_inherit;


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

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	post;

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

