package ecologylab.semantics.generated.library.search;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.publication.*;
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
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.ImageClipping;
import ecologylab.semantics.metadata.builtins.MediaClipping;
import ecologylab.semantics.metadata.builtins.TextClipping;
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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class SearchResult
extends Metadata
{


/**
	The heading of search result
*/
@simpl_scalar
private MetadataString	heading;


/**
	The snippet of search result
*/
@simpl_scalar
private MetadataString	snippet;


/**
	The link of the search result
*/
@simpl_scalar
private MetadataParsedURL	link;


/**
	Alternate link in search results
*/
@simpl_scalar
private MetadataParsedURL	linkOther;



/**
	Constructor
*/
public SearchResult()
{
 super();
}

/**
	Constructor
*/
public SearchResult(MetaMetadataCompositeField metaMetadata)
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

/**
	Lazy evaluation for linkOther
*/
public MetadataParsedURL	linkOther()
{
	MetadataParsedURL	result = this.linkOther;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.linkOther = result;
	}
	return result;
}

/**
	Gets the value of the field linkOther
*/
public ParsedURL getLinkOther()
{
	return this.linkOther().getValue();
}

/**
	Sets the value of the field linkOther
*/
public void setLinkOther(ParsedURL linkOther)
{
	this.linkOther().setValue(linkOther);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: linkOther
*/
public boolean isNullLinkOther()
{
	return linkOther == null || linkOther.getValue() == null;
}

/**
	The heavy weight setter method for field linkOther
*/
public void hwSetLinkOther(ParsedURL linkOther)
{
	this.linkOther().setValue(linkOther);
	rebuildCompositeTermVector();
}

/**
	 Sets the linkOther directly.
*/
public void setLinkOtherMetadata(MetadataParsedURL linkOther)
{
	this.linkOther = linkOther;
}

/**
	Heavy Weight Direct setter method for linkOther
*/
public void hwSetLinkOtherMetadata(MetadataParsedURL linkOther)
{
	if (this.linkOther != null && this.linkOther.getValue() != null && hasTermVector())
		termVector().remove(this.linkOther.termVector());
	this.linkOther = linkOther;
	rebuildCompositeTermVector();
}


}

