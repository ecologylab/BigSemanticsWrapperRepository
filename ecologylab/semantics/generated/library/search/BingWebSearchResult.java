package ecologylab.semantics.generated.library.search;


import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Bing web search result.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class BingWebSearchResult
extends SearchResult
{

@simpl_scalar @xml_tag("web:Title")
private MetadataString	heading;

@simpl_scalar @xml_tag("web:Description")
private MetadataString	snippet;

@simpl_scalar @xml_tag("web:Url")
private MetadataParsedURL	link;



/**
	Constructor
*/
public BingWebSearchResult()
{
 super();
}

/**
	Constructor
*/
public BingWebSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for heading
*/
public MetadataString	heading()
{
	MetadataString	result = this.heading;
	if (result == null)
	{
		result = new MetadataString();
		this.heading = result;
	}
	return result;
}

/**
	Gets the value of the field heading
*/
public String getHeading()
{
	return this.heading().getValue();
}

/**
	Sets the value of the field heading
*/
public void setHeading(String heading)
{
	this.heading().setValue(heading);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: heading
*/
public boolean isNullHeading()
{
	return heading == null || heading.getValue() == null;
}

/**
	The heavy weight setter method for field heading
*/
public void hwSetHeading(String heading)
{
	this.heading().setValue(heading);
	rebuildCompositeTermVector();
}

/**
	 Sets the heading directly.
*/
public void setHeadingMetadata(MetadataString heading)
{
	this.heading = heading;
}

/**
	Heavy Weight Direct setter method for heading
*/
public void hwSetHeadingMetadata(MetadataString heading)
{
	if (this.heading != null && this.heading.getValue() != null && hasTermVector())
		termVector().remove(this.heading.termVector());
	this.heading = heading;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for snippet
*/
public MetadataString	snippet()
{
	MetadataString	result = this.snippet;
	if (result == null)
	{
		result = new MetadataString();
		this.snippet = result;
	}
	return result;
}

/**
	Gets the value of the field snippet
*/
public String getSnippet()
{
	return this.snippet().getValue();
}

/**
	Sets the value of the field snippet
*/
public void setSnippet(String snippet)
{
	this.snippet().setValue(snippet);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: snippet
*/
public boolean isNullSnippet()
{
	return snippet == null || snippet.getValue() == null;
}

/**
	The heavy weight setter method for field snippet
*/
public void hwSetSnippet(String snippet)
{
	this.snippet().setValue(snippet);
	rebuildCompositeTermVector();
}

/**
	 Sets the snippet directly.
*/
public void setSnippetMetadata(MetadataString snippet)
{
	this.snippet = snippet;
}

/**
	Heavy Weight Direct setter method for snippet
*/
public void hwSetSnippetMetadata(MetadataString snippet)
{
	if (this.snippet != null && this.snippet.getValue() != null && hasTermVector())
		termVector().remove(this.snippet.termVector());
	this.snippet = snippet;
	rebuildCompositeTermVector();
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


}

