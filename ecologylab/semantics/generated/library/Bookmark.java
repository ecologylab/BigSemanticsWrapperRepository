package ecologylab.semantics.generated.library;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;

@simpl_inherit

public class Bookmark extends Metadata{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	title;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	link;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	pic;

/**
	Constructor
**/ 

public Bookmark()
{
 super();
}

/**
	Constructor
**/ 

public Bookmark(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for title
**/ 

public MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for link
**/ 

public MetadataParsedURL	link()
{
MetadataParsedURL	result	=this.link;
if(result == null)
{
result = new MetadataParsedURL();
this.link	=	 result;
}
return result;
}

/**
	Gets the value of the field link
**/ 

public ParsedURL getLink(){
return link().getValue();
}

/**
	Sets the value of the field link
**/ 

public void setLink( ParsedURL link )
{
this.link().setValue(link);
}

/**
	The heavy weight setter method for field link
**/ 

public void hwSetLink( ParsedURL link )
{
this.link().setValue(link);
rebuildCompositeTermVector();
 }
/**
	 Sets the link directly
**/ 

public void setLinkMetadata(MetadataParsedURL link)
{	this.link = link;
}
/**
	Heavy Weight Direct setter method for link
**/ 

public void hwSetLinkMetadata(MetadataParsedURL link)
{	 if(this.link!=null && this.link.getValue()!=null && hasTermVector())
		 termVector().remove(this.link.termVector());
	 this.link = link;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for pic
**/ 

public MetadataParsedURL	pic()
{
MetadataParsedURL	result	=this.pic;
if(result == null)
{
result = new MetadataParsedURL();
this.pic	=	 result;
}
return result;
}

/**
	Gets the value of the field pic
**/ 

public ParsedURL getPic(){
return pic().getValue();
}

/**
	Sets the value of the field pic
**/ 

public void setPic( ParsedURL pic )
{
this.pic().setValue(pic);
}

/**
	The heavy weight setter method for field pic
**/ 

public void hwSetPic( ParsedURL pic )
{
this.pic().setValue(pic);
rebuildCompositeTermVector();
 }
/**
	 Sets the pic directly
**/ 

public void setPicMetadata(MetadataParsedURL pic)
{	this.pic = pic;
}
/**
	Heavy Weight Direct setter method for pic
**/ 

public void hwSetPicMetadata(MetadataParsedURL pic)
{	 if(this.pic!=null && this.pic.getValue()!=null && hasTermVector())
		 termVector().remove(this.pic.termVector());
	 this.pic = pic;
	rebuildCompositeTermVector();
}}
