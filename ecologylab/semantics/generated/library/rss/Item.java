package ecologylab.semantics.generated.library.rss;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;


/**
	One item in a news feed.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Item
extends YahooMediaRss
{

@simpl_scalar @simpl_hints(Hint.XML_LEAF)
private MetadataParsedURL	link;

@simpl_scalar @xml_tag("guid") @simpl_hints(Hint.XML_LEAF)
private MetadataParsedURL	location;



/**
	Constructor
*/
public Item()
{
 super();
}

/**
	Constructor
*/
public Item(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for link
*/
public MetadataParsedURL	link()
{
	MetadataParsedURL	result = this.link;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.link = result;
	}
	return result;
}

/**
	Gets the value of the field link
*/
public ParsedURL getLink()
{
	return this.link().getValue();
}

/**
	Sets the value of the field link
*/
public void setLink(ParsedURL link)
{
	this.link().setValue(link);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: link
*/
public boolean isNullLink()
{
	return link == null || link.getValue() == null;
}

/**
	The heavy weight setter method for field link
*/
public void hwSetLink(ParsedURL link)
{
	this.link().setValue(link);
	rebuildCompositeTermVector();
}

/**
	 Sets the link directly.
*/
public void setLinkMetadata(MetadataParsedURL link)
{
	this.link = link;
}

/**
	Heavy Weight Direct setter method for link
*/
public void hwSetLinkMetadata(MetadataParsedURL link)
{
	if (this.link != null && this.link.getValue() != null && hasTermVector())
		termVector().remove(this.link.termVector());
	this.link = link;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for location
*/
public MetadataParsedURL	location()
{
	MetadataParsedURL	result = this.location;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.location = result;
	}
	return result;
}

/**
	Gets the value of the field location
*/
public ParsedURL getLocation()
{
	return this.location().getValue();
}

/**
	Sets the value of the field location
*/
public void setLocation(ParsedURL location)
{
	this.location().setValue(location);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: location
*/
public boolean isNullLocation()
{
	return location == null || location.getValue() == null;
}

/**
	The heavy weight setter method for field location
*/
public void hwSetLocation(ParsedURL location)
{
	this.location().setValue(location);
	rebuildCompositeTermVector();
}

/**
	 Sets the location directly.
*/
public void setLocationMetadata(MetadataParsedURL location)
{
	this.location = location;
}

/**
	Heavy Weight Direct setter method for location
*/
public void hwSetLocationMetadata(MetadataParsedURL location)
{
	if (this.location != null && this.location.getValue() != null && hasTermVector())
		termVector().remove(this.location.termVector());
	this.location = location;
	rebuildCompositeTermVector();
}


}

