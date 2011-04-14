package ecologylab.semantics.generated.library.googleBooks;


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
public class Page
extends Metadata
{

@simpl_scalar
private MetadataParsedURL	pageThumbnail;

@simpl_scalar
private MetadataParsedURL	location;

@simpl_scalar
private MetadataInteger	pageNumber;



/**
	Constructor
*/
public Page()
{
 super();
}

/**
	Constructor
*/
public Page(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for pageThumbnail
*/
public MetadataParsedURL	pageThumbnail()
{
	MetadataParsedURL	result = this.pageThumbnail;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.pageThumbnail = result;
	}
	return result;
}

/**
	Gets the value of the field pageThumbnail
*/
public ParsedURL getPageThumbnail()
{
	return this.pageThumbnail().getValue();
}

/**
	Sets the value of the field pageThumbnail
*/
public void setPageThumbnail(ParsedURL pageThumbnail)
{
	this.pageThumbnail().setValue(pageThumbnail);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pageThumbnail
*/
public boolean isNullPageThumbnail()
{
	return pageThumbnail == null || pageThumbnail.getValue() == null;
}

/**
	The heavy weight setter method for field pageThumbnail
*/
public void hwSetPageThumbnail(ParsedURL pageThumbnail)
{
	this.pageThumbnail().setValue(pageThumbnail);
	rebuildCompositeTermVector();
}

/**
	 Sets the pageThumbnail directly.
*/
public void setPageThumbnailMetadata(MetadataParsedURL pageThumbnail)
{
	this.pageThumbnail = pageThumbnail;
}

/**
	Heavy Weight Direct setter method for pageThumbnail
*/
public void hwSetPageThumbnailMetadata(MetadataParsedURL pageThumbnail)
{
	if (this.pageThumbnail != null && this.pageThumbnail.getValue() != null && hasTermVector())
		termVector().remove(this.pageThumbnail.termVector());
	this.pageThumbnail = pageThumbnail;
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

/**
	Lazy evaluation for pageNumber
*/
public MetadataInteger	pageNumber()
{
	MetadataInteger	result = this.pageNumber;
	if (result == null)
	{
		result = new MetadataInteger();
		this.pageNumber = result;
	}
	return result;
}

/**
	Gets the value of the field pageNumber
*/
public Integer getPageNumber()
{
	return this.pageNumber().getValue();
}

/**
	Sets the value of the field pageNumber
*/
public void setPageNumber(Integer pageNumber)
{
	this.pageNumber().setValue(pageNumber);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pageNumber
*/
public boolean isNullPageNumber()
{
	return pageNumber == null || pageNumber.getValue() == null;
}

/**
	The heavy weight setter method for field pageNumber
*/
public void hwSetPageNumber(Integer pageNumber)
{
	this.pageNumber().setValue(pageNumber);
	rebuildCompositeTermVector();
}

/**
	 Sets the pageNumber directly.
*/
public void setPageNumberMetadata(MetadataInteger pageNumber)
{
	this.pageNumber = pageNumber;
}

/**
	Heavy Weight Direct setter method for pageNumber
*/
public void hwSetPageNumberMetadata(MetadataInteger pageNumber)
{
	if (this.pageNumber != null && this.pageNumber.getValue() != null && hasTermVector())
		termVector().remove(this.pageNumber.termVector());
	this.pageNumber = pageNumber;
	rebuildCompositeTermVector();
}


}

