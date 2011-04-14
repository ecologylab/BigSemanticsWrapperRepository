package ecologylab.semantics.generated.library.misc;


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
	Image from The Interantional Children's digital library.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class IcdlImage
extends Image
{


/**
	The language of the library
*/
@simpl_scalar
private MetadataString	languages;



/**
	Constructor
*/
public IcdlImage()
{
 super();
}

/**
	Constructor
*/
public IcdlImage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for languages
*/
public MetadataString	languages()
{
	MetadataString	result = this.languages;
	if (result == null)
	{
		result = new MetadataString();
		this.languages = result;
	}
	return result;
}

/**
	Gets the value of the field languages
*/
public String getLanguages()
{
	return this.languages().getValue();
}

/**
	Sets the value of the field languages
*/
public void setLanguages(String languages)
{
	this.languages().setValue(languages);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: languages
*/
public boolean isNullLanguages()
{
	return languages == null || languages.getValue() == null;
}

/**
	The heavy weight setter method for field languages
*/
public void hwSetLanguages(String languages)
{
	this.languages().setValue(languages);
	rebuildCompositeTermVector();
}

/**
	 Sets the languages directly.
*/
public void setLanguagesMetadata(MetadataString languages)
{
	this.languages = languages;
}

/**
	Heavy Weight Direct setter method for languages
*/
public void hwSetLanguagesMetadata(MetadataString languages)
{
	if (this.languages != null && this.languages.getValue() != null && hasTermVector())
		termVector().remove(this.languages.termVector());
	this.languages = languages;
	rebuildCompositeTermVector();
}


}

