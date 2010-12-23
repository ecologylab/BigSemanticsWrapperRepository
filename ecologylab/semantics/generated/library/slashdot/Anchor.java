package ecologylab.semantics.generated.library.slashdot;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
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
import ecologylab.semantics.metadata.builtins.Clipping;
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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Anchor
extends Metadata
{

@simpl_scalar
private MetadataString	anchorText;

@simpl_scalar
private MetadataParsedURL	link;



/**
	Constructor
*/
public Anchor()
{
 super();
}

/**
	Constructor
*/
public Anchor(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for anchorText
*/
public MetadataString	anchorText()
{
	MetadataString	result = this.anchorText;
	if (result == null)
	{
		result = new MetadataString();
		this.anchorText = result;
	}
	return result;
}

/**
	Gets the value of the field anchorText
*/
public String getAnchorText()
{
	return this.anchorText().getValue();
}

/**
	Sets the value of the field anchorText
*/
public void setAnchorText(String anchorText)
{
	this.anchorText().setValue(anchorText);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: anchorText
*/
public boolean isNullAnchorText()
{
	return anchorText == null || anchorText.getValue() == null;
}

/**
	The heavy weight setter method for field anchorText
*/
public void hwSetAnchorText(String anchorText)
{
	this.anchorText().setValue(anchorText);
	rebuildCompositeTermVector();
}

/**
	 Sets the anchorText directly.
*/
public void setAnchorTextMetadata(MetadataString anchorText)
{
	this.anchorText = anchorText;
}

/**
	Heavy Weight Direct setter method for anchorText
*/
public void hwSetAnchorTextMetadata(MetadataString anchorText)
{
	if (this.anchorText != null && this.anchorText.getValue() != null && hasTermVector())
		termVector().remove(this.anchorText.termVector());
	this.anchorText = anchorText;
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

