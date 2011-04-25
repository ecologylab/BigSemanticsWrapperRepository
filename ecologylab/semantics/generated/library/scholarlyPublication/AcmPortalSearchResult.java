package ecologylab.semantics.generated.library.scholarlyPublication;


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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class AcmPortalSearchResult
extends SearchResult
{

@simpl_scalar
private MetadataString	authorList;

@simpl_scalar
private MetadataString	publication;



/**
	Constructor
*/
public AcmPortalSearchResult()
{
 super();
}

/**
	Constructor
*/
public AcmPortalSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for authorList
*/
public MetadataString	authorList()
{
	MetadataString	result = this.authorList;
	if (result == null)
	{
		result = new MetadataString();
		this.authorList = result;
	}
	return result;
}

/**
	Gets the value of the field authorList
*/
public String getAuthorList()
{
	return this.authorList().getValue();
}

/**
	Sets the value of the field authorList
*/
public void setAuthorList(String authorList)
{
	this.authorList().setValue(authorList);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: authorList
*/
public boolean isNullAuthorList()
{
	return authorList == null || authorList.getValue() == null;
}

/**
	The heavy weight setter method for field authorList
*/
public void hwSetAuthorList(String authorList)
{
	this.authorList().setValue(authorList);
	rebuildCompositeTermVector();
}

/**
	 Sets the authorList directly.
*/
public void setAuthorListMetadata(MetadataString authorList)
{
	this.authorList = authorList;
}

/**
	Heavy Weight Direct setter method for authorList
*/
public void hwSetAuthorListMetadata(MetadataString authorList)
{
	if (this.authorList != null && this.authorList.getValue() != null && hasTermVector())
		termVector().remove(this.authorList.termVector());
	this.authorList = authorList;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for publication
*/
public MetadataString	publication()
{
	MetadataString	result = this.publication;
	if (result == null)
	{
		result = new MetadataString();
		this.publication = result;
	}
	return result;
}

/**
	Gets the value of the field publication
*/
public String getPublication()
{
	return this.publication().getValue();
}

/**
	Sets the value of the field publication
*/
public void setPublication(String publication)
{
	this.publication().setValue(publication);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: publication
*/
public boolean isNullPublication()
{
	return publication == null || publication.getValue() == null;
}

/**
	The heavy weight setter method for field publication
*/
public void hwSetPublication(String publication)
{
	this.publication().setValue(publication);
	rebuildCompositeTermVector();
}

/**
	 Sets the publication directly.
*/
public void setPublicationMetadata(MetadataString publication)
{
	this.publication = publication;
}

/**
	Heavy Weight Direct setter method for publication
*/
public void hwSetPublicationMetadata(MetadataString publication)
{
	if (this.publication != null && this.publication.getValue() != null && hasTermVector())
		termVector().remove(this.publication.termVector());
	this.publication = publication;
	rebuildCompositeTermVector();
}


}

