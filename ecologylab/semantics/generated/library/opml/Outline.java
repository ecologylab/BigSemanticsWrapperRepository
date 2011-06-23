package ecologylab.semantics.generated.library.opml;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.camera.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.gps.*;
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
import ecologylab.semantics.metadata.builtins.CompoundDocument;
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
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
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
public class Outline
extends Metadata
{

@simpl_scalar @xml_tag("htmlUrl")
private MetadataParsedURL	htmlUrl;

@simpl_scalar
private MetadataString	title;

@simpl_scalar
private MetadataString	text;

@simpl_collection("outline") @simpl_nowrap @mm_name("outlines")
private ArrayList<Outline>	outlines;

@simpl_scalar @xml_tag("xmlUrl")
private MetadataParsedURL	xmlUrl;

@simpl_scalar
private MetadataString	type;



/**
	Constructor
*/
public Outline()
{
 super();
}

/**
	Constructor
*/
public Outline(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for htmlUrl
*/
public MetadataParsedURL	htmlUrl()
{
	MetadataParsedURL	result = this.htmlUrl;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.htmlUrl = result;
	}
	return result;
}

/**
	Gets the value of the field htmlUrl
*/
public ParsedURL getHtmlUrl()
{
	return this.htmlUrl().getValue();
}

/**
	Sets the value of the field htmlUrl
*/
public void setHtmlUrl(ParsedURL htmlUrl)
{
	this.htmlUrl().setValue(htmlUrl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: htmlUrl
*/
public boolean isNullHtmlUrl()
{
	return htmlUrl == null || htmlUrl.getValue() == null;
}

/**
	The heavy weight setter method for field htmlUrl
*/
public void hwSetHtmlUrl(ParsedURL htmlUrl)
{
	this.htmlUrl().setValue(htmlUrl);
	rebuildCompositeTermVector();
}

/**
	 Sets the htmlUrl directly.
*/
public void setHtmlUrlMetadata(MetadataParsedURL htmlUrl)
{
	this.htmlUrl = htmlUrl;
}

/**
	Heavy Weight Direct setter method for htmlUrl
*/
public void hwSetHtmlUrlMetadata(MetadataParsedURL htmlUrl)
{
	if (this.htmlUrl != null && this.htmlUrl.getValue() != null && hasTermVector())
		termVector().remove(this.htmlUrl.termVector());
	this.htmlUrl = htmlUrl;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for title
*/
public MetadataString	title()
{
	MetadataString	result = this.title;
	if (result == null)
	{
		result = new MetadataString();
		this.title = result;
	}
	return result;
}

/**
	Gets the value of the field title
*/
public String getTitle()
{
	return this.title().getValue();
}

/**
	Sets the value of the field title
*/
public void setTitle(String title)
{
	this.title().setValue(title);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: title
*/
public boolean isNullTitle()
{
	return title == null || title.getValue() == null;
}

/**
	The heavy weight setter method for field title
*/
public void hwSetTitle(String title)
{
	this.title().setValue(title);
	rebuildCompositeTermVector();
}

/**
	 Sets the title directly.
*/
public void setTitleMetadata(MetadataString title)
{
	this.title = title;
}

/**
	Heavy Weight Direct setter method for title
*/
public void hwSetTitleMetadata(MetadataString title)
{
	if (this.title != null && this.title.getValue() != null && hasTermVector())
		termVector().remove(this.title.termVector());
	this.title = title;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for text
*/
public MetadataString	text()
{
	MetadataString	result = this.text;
	if (result == null)
	{
		result = new MetadataString();
		this.text = result;
	}
	return result;
}

/**
	Gets the value of the field text
*/
public String getText()
{
	return this.text().getValue();
}

/**
	Sets the value of the field text
*/
public void setText(String text)
{
	this.text().setValue(text);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: text
*/
public boolean isNullText()
{
	return text == null || text.getValue() == null;
}

/**
	The heavy weight setter method for field text
*/
public void hwSetText(String text)
{
	this.text().setValue(text);
	rebuildCompositeTermVector();
}

/**
	 Sets the text directly.
*/
public void setTextMetadata(MetadataString text)
{
	this.text = text;
}

/**
	Heavy Weight Direct setter method for text
*/
public void hwSetTextMetadata(MetadataString text)
{
	if (this.text != null && this.text.getValue() != null && hasTermVector())
		termVector().remove(this.text.termVector());
	this.text = text;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for outlines
*/
public ArrayList<Outline>	outlines()
{
	ArrayList<Outline>	result = this.outlines;
	if (result == null)
	{
		result = new ArrayList<Outline>();
		this.outlines = result;
	}
	return result;
}

/**
	Get the value of field outlines
*/
public ArrayList<Outline> getOutlines()
{
	return this.outlines;
}

/**
	Set the value of field outlines
*/
public void setOutlines(ArrayList<Outline> outlines)
{
	this.outlines = outlines;
}

/**
	Lazy evaluation for xmlUrl
*/
public MetadataParsedURL	xmlUrl()
{
	MetadataParsedURL	result = this.xmlUrl;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.xmlUrl = result;
	}
	return result;
}

/**
	Gets the value of the field xmlUrl
*/
public ParsedURL getXmlUrl()
{
	return this.xmlUrl().getValue();
}

/**
	Sets the value of the field xmlUrl
*/
public void setXmlUrl(ParsedURL xmlUrl)
{
	this.xmlUrl().setValue(xmlUrl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: xmlUrl
*/
public boolean isNullXmlUrl()
{
	return xmlUrl == null || xmlUrl.getValue() == null;
}

/**
	The heavy weight setter method for field xmlUrl
*/
public void hwSetXmlUrl(ParsedURL xmlUrl)
{
	this.xmlUrl().setValue(xmlUrl);
	rebuildCompositeTermVector();
}

/**
	 Sets the xmlUrl directly.
*/
public void setXmlUrlMetadata(MetadataParsedURL xmlUrl)
{
	this.xmlUrl = xmlUrl;
}

/**
	Heavy Weight Direct setter method for xmlUrl
*/
public void hwSetXmlUrlMetadata(MetadataParsedURL xmlUrl)
{
	if (this.xmlUrl != null && this.xmlUrl.getValue() != null && hasTermVector())
		termVector().remove(this.xmlUrl.termVector());
	this.xmlUrl = xmlUrl;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for type
*/
public MetadataString	type()
{
	MetadataString	result = this.type;
	if (result == null)
	{
		result = new MetadataString();
		this.type = result;
	}
	return result;
}

/**
	Gets the value of the field type
*/
public String getType()
{
	return this.type().getValue();
}

/**
	Sets the value of the field type
*/
public void setType(String type)
{
	this.type().setValue(type);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: type
*/
public boolean isNullType()
{
	return type == null || type.getValue() == null;
}

/**
	The heavy weight setter method for field type
*/
public void hwSetType(String type)
{
	this.type().setValue(type);
	rebuildCompositeTermVector();
}

/**
	 Sets the type directly.
*/
public void setTypeMetadata(MetadataString type)
{
	this.type = type;
}

/**
	Heavy Weight Direct setter method for type
*/
public void hwSetTypeMetadata(MetadataString type)
{
	if (this.type != null && this.type.getValue() != null && hasTermVector())
		termVector().remove(this.type.termVector());
	this.type = type;
	rebuildCompositeTermVector();
}


}

