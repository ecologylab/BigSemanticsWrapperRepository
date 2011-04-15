package ecologylab.semantics.generated.library;


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
	Paragraphs in the article.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Paragraph
extends Metadata
{


/**
	Anchors (links) in the paragraph, typically links to another Wikipedia article.
*/
@simpl_collection("anchor") @xml_tag("anchors") @mm_name("anchors")
private ArrayList<Anchor>	anchors;

@simpl_scalar
private MetadataString	paragraphText;



/**
	Constructor
*/
public Paragraph()
{
 super();
}

/**
	Constructor
*/
public Paragraph(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for anchors
*/
public ArrayList<Anchor>	anchors()
{
	ArrayList<Anchor>	result = this.anchors;
	if (result == null)
	{
		result = new ArrayList<Anchor>();
		this.anchors = result;
	}
	return result;
}

/**
	Get the value of field anchors
*/
public ArrayList<Anchor> getAnchors()
{
	return this.anchors;
}

/**
	Set the value of field anchors
*/
public void setAnchors(ArrayList<Anchor> anchors)
{
	this.anchors = anchors;
}

/**
	Lazy evaluation for paragraphText
*/
public MetadataString	paragraphText()
{
	MetadataString	result = this.paragraphText;
	if (result == null)
	{
		result = new MetadataString();
		this.paragraphText = result;
	}
	return result;
}

/**
	Gets the value of the field paragraphText
*/
public String getParagraphText()
{
	return this.paragraphText().getValue();
}

/**
	Sets the value of the field paragraphText
*/
public void setParagraphText(String paragraphText)
{
	this.paragraphText().setValue(paragraphText);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: paragraphText
*/
public boolean isNullParagraphText()
{
	return paragraphText == null || paragraphText.getValue() == null;
}

/**
	The heavy weight setter method for field paragraphText
*/
public void hwSetParagraphText(String paragraphText)
{
	this.paragraphText().setValue(paragraphText);
	rebuildCompositeTermVector();
}

/**
	 Sets the paragraphText directly.
*/
public void setParagraphTextMetadata(MetadataString paragraphText)
{
	this.paragraphText = paragraphText;
}

/**
	Heavy Weight Direct setter method for paragraphText
*/
public void hwSetParagraphTextMetadata(MetadataString paragraphText)
{
	if (this.paragraphText != null && this.paragraphText.getValue() != null && hasTermVector())
		termVector().remove(this.paragraphText.termVector());
	this.paragraphText = paragraphText;
	rebuildCompositeTermVector();
}


}

