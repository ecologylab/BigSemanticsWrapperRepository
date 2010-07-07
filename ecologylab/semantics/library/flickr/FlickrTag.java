package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.Hint;
import ecologylab.xml.simpl_inherit;


/**
	null
**/ 

@simpl_inherit

public class  FlickrTag
extends  Metadata
{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	tagName;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	tagLink;

/**
	Constructor
**/ 

public FlickrTag()
{
 super();
}

/**
	Constructor
**/ 

public FlickrTag(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for tagName
**/ 

public MetadataString	tagName()
{
MetadataString	result	=this.tagName;
if(result == null)
{
result = new MetadataString();
this.tagName	=	 result;
}
return result;
}

/**
	Gets the value of the field tagName
**/ 

public String getTagName(){
return tagName().getValue();
}

/**
	Sets the value of the field tagName
**/ 

public void setTagName( String tagName )
{
this.tagName().setValue(tagName);
}

/**
	The heavy weight setter method for field tagName
**/ 

public void hwSetTagName( String tagName )
{
this.tagName().setValue(tagName);
rebuildCompositeTermVector();
 }
/**
	 Sets the tagName directly
**/ 

public void setTagNameMetadata(MetadataString tagName)
{	this.tagName = tagName;
}
/**
	Heavy Weight Direct setter method for tagName
**/ 

public void hwSetTagNameMetadata(MetadataString tagName)
{	 if(this.tagName!=null && this.tagName.getValue()!=null && hasTermVector())
		 termVector().remove(this.tagName.termVector());
	 this.tagName = tagName;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for tagLink
**/ 

public MetadataParsedURL	tagLink()
{
MetadataParsedURL	result	=this.tagLink;
if(result == null)
{
result = new MetadataParsedURL();
this.tagLink	=	 result;
}
return result;
}

/**
	Gets the value of the field tagLink
**/ 

public ParsedURL getTagLink(){
return tagLink().getValue();
}

/**
	Sets the value of the field tagLink
**/ 

public void setTagLink( ParsedURL tagLink )
{
this.tagLink().setValue(tagLink);
}

/**
	The heavy weight setter method for field tagLink
**/ 

public void hwSetTagLink( ParsedURL tagLink )
{
this.tagLink().setValue(tagLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the tagLink directly
**/ 

public void setTagLinkMetadata(MetadataParsedURL tagLink)
{	this.tagLink = tagLink;
}
/**
	Heavy Weight Direct setter method for tagLink
**/ 

public void hwSetTagLinkMetadata(MetadataParsedURL tagLink)
{	 if(this.tagLink!=null && this.tagLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.tagLink.termVector());
	 this.tagLink = tagLink;
	rebuildCompositeTermVector();
}
}

