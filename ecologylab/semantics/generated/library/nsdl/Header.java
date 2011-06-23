package ecologylab.semantics.generated.library.nsdl;


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
public class Header
extends Metadata
{

@simpl_scalar @xml_tag("resourceIdentifier")
private MetadataParsedURL	resourceIdentifier;



/**
	Constructor
*/
public Header()
{
 super();
}

/**
	Constructor
*/
public Header(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for resourceIdentifier
*/
public MetadataParsedURL	resourceIdentifier()
{
	MetadataParsedURL	result = this.resourceIdentifier;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.resourceIdentifier = result;
	}
	return result;
}

/**
	Gets the value of the field resourceIdentifier
*/
public ParsedURL getResourceIdentifier()
{
	return this.resourceIdentifier().getValue();
}

/**
	Sets the value of the field resourceIdentifier
*/
public void setResourceIdentifier(ParsedURL resourceIdentifier)
{
	this.resourceIdentifier().setValue(resourceIdentifier);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: resourceIdentifier
*/
public boolean isNullResourceIdentifier()
{
	return resourceIdentifier == null || resourceIdentifier.getValue() == null;
}

/**
	The heavy weight setter method for field resourceIdentifier
*/
public void hwSetResourceIdentifier(ParsedURL resourceIdentifier)
{
	this.resourceIdentifier().setValue(resourceIdentifier);
	rebuildCompositeTermVector();
}

/**
	 Sets the resourceIdentifier directly.
*/
public void setResourceIdentifierMetadata(MetadataParsedURL resourceIdentifier)
{
	this.resourceIdentifier = resourceIdentifier;
}

/**
	Heavy Weight Direct setter method for resourceIdentifier
*/
public void hwSetResourceIdentifierMetadata(MetadataParsedURL resourceIdentifier)
{
	if (this.resourceIdentifier != null && this.resourceIdentifier.getValue() != null && hasTermVector())
		termVector().remove(this.resourceIdentifier.termVector());
	this.resourceIdentifier = resourceIdentifier;
	rebuildCompositeTermVector();
}


}

