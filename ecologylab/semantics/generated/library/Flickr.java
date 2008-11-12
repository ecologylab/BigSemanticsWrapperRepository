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
	
**/ 

public class  Flickr
extends  Image
{

/**
	Constructor
**/ 

public Flickr()
{
}
/**
	Constructor
**/ 

public Flickr(MetaMetadata metaMetadata)
{
super(metaMetadata);
}
/**
	Tags on the image.
**/ 

	@xml_tag("tags") @xml_nested private MetadataString	tags;
/**
	Lazy Evaluation for tags
**/ 

MetadataString	tags()
{
MetadataString	result	=this.tags;
if(result == null)
{
result = new MetadataString();
this.tags	=	 result;
}
return result;
}
/**
	Gets the value of the field tags
**/ 

public String getTags(){
return tags().getValue();
}
/**
	Sets the value of the field tags
**/ 

public void setTags( String tags )
{
this.tags().setValue(tags);
}
/**
	The heavy weight setter method for field tags
**/ 

public void hwSetTags( String tags )
{
this.tags().setValue(tags);
rebuildCompositeTermVector();
 }/**
	The user who posted the image on flicker.
**/ 

	@xml_tag("author") @xml_nested private MetadataString	author;
/**
	Lazy Evaluation for author
**/ 

MetadataString	author()
{
MetadataString	result	=this.author;
if(result == null)
{
result = new MetadataString();
this.author	=	 result;
}
return result;
}
/**
	Gets the value of the field author
**/ 

public String getAuthor(){
return author().getValue();
}
/**
	Sets the value of the field author
**/ 

public void setAuthor( String author )
{
this.author().setValue(author);
}
/**
	The heavy weight setter method for field author
**/ 

public void hwSetAuthor( String author )
{
this.author().setValue(author);
rebuildCompositeTermVector();
 }
}

