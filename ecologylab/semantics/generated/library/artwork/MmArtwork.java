package ecologylab.semantics.generated.library.artwork;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
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
	ACM Multimedia Interactive Artwork class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class MmArtwork
extends Artwork
{


/**
	Website of the work or group responsible.
*/
@simpl_scalar
private MetadataParsedURL	website;


/**
	Link the ACM Portal page.
*/
@simpl_scalar
private MetadataParsedURL	extendedAbstract;



/**
	Constructor
*/
public MmArtwork()
{
 super();
}

/**
	Constructor
*/
public MmArtwork(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for website
*/
public MetadataParsedURL	website()
{
	MetadataParsedURL	result = this.website;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.website = result;
	}
	return result;
}

/**
	Gets the value of the field website
*/
public ParsedURL getWebsite()
{
	return this.website().getValue();
}

/**
	Sets the value of the field website
*/
public void setWebsite(ParsedURL website)
{
	this.website().setValue(website);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: website
*/
public boolean isNullWebsite()
{
	return website == null || website.getValue() == null;
}

/**
	The heavy weight setter method for field website
*/
public void hwSetWebsite(ParsedURL website)
{
	this.website().setValue(website);
	rebuildCompositeTermVector();
}

/**
	 Sets the website directly.
*/
public void setWebsiteMetadata(MetadataParsedURL website)
{
	this.website = website;
}

/**
	Heavy Weight Direct setter method for website
*/
public void hwSetWebsiteMetadata(MetadataParsedURL website)
{
	if (this.website != null && this.website.getValue() != null && hasTermVector())
		termVector().remove(this.website.termVector());
	this.website = website;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for extendedAbstract
*/
public MetadataParsedURL	extendedAbstract()
{
	MetadataParsedURL	result = this.extendedAbstract;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.extendedAbstract = result;
	}
	return result;
}

/**
	Gets the value of the field extendedAbstract
*/
public ParsedURL getExtendedAbstract()
{
	return this.extendedAbstract().getValue();
}

/**
	Sets the value of the field extendedAbstract
*/
public void setExtendedAbstract(ParsedURL extendedAbstract)
{
	this.extendedAbstract().setValue(extendedAbstract);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: extendedAbstract
*/
public boolean isNullExtendedAbstract()
{
	return extendedAbstract == null || extendedAbstract.getValue() == null;
}

/**
	The heavy weight setter method for field extendedAbstract
*/
public void hwSetExtendedAbstract(ParsedURL extendedAbstract)
{
	this.extendedAbstract().setValue(extendedAbstract);
	rebuildCompositeTermVector();
}

/**
	 Sets the extendedAbstract directly.
*/
public void setExtendedAbstractMetadata(MetadataParsedURL extendedAbstract)
{
	this.extendedAbstract = extendedAbstract;
}

/**
	Heavy Weight Direct setter method for extendedAbstract
*/
public void hwSetExtendedAbstractMetadata(MetadataParsedURL extendedAbstract)
{
	if (this.extendedAbstract != null && this.extendedAbstract.getValue() != null && hasTermVector())
		termVector().remove(this.extendedAbstract.termVector());
	this.extendedAbstract = extendedAbstract;
	rebuildCompositeTermVector();
}


}

