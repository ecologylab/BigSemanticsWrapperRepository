package ecologylab.semantics.generated.library;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;

@xml_inherit

public class Item extends Metadata{


/**
	null
**/ 

	 @xml_leaf private MetadataString	title;

/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	link;

/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	guid;

/**
	Constructor
**/ 

public Item()
{
 super();
}

/**
	Constructor
**/ 

public Item(MetaMetadata metaMetadata)
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
	Lazy Evaluation for guid
**/ 

public MetadataParsedURL	guid()
{
MetadataParsedURL	result	=this.guid;
if(result == null)
{
result = new MetadataParsedURL();
this.guid	=	 result;
}
return result;
}

/**
	Gets the value of the field guid
**/ 

public ParsedURL getGuid(){
return guid().getValue();
}

/**
	Sets the value of the field guid
**/ 

public void setGuid( ParsedURL guid )
{
this.guid().setValue(guid);
}

/**
	The heavy weight setter method for field guid
**/ 

public void hwSetGuid( ParsedURL guid )
{
this.guid().setValue(guid);
rebuildCompositeTermVector();
 }
/**
	 Sets the guid directly
**/ 

public void setGuidMetadata(MetadataParsedURL guid)
{	this.guid = guid;
}
/**
	Heavy Weight Direct setter method for guid
**/ 

public void hwSetGuidMetadata(MetadataParsedURL guid)
{	 if(this.guid!=null && this.guid.getValue()!=null && hasTermVector())
		 termVector().remove(this.guid.termVector());
	 this.guid = guid;
	rebuildCompositeTermVector();
}}
