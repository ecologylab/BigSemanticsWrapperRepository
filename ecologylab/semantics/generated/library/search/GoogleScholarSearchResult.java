package ecologylab.semantics.generated.library.search;


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
	A google scholar search result

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GoogleScholarSearchResult
extends SearchResult
{

@simpl_scalar
private MetadataParsedURL	documentLink;

@simpl_scalar
private MetadataInteger	citations;

@simpl_scalar
private MetadataParsedURL	citationsLink;

@simpl_scalar
private MetadataParsedURL	relatedArticlesLink;

@simpl_scalar
private MetadataInteger	versions;

@simpl_scalar
private MetadataParsedURL	versionsLink;



/**
	Constructor
*/
public GoogleScholarSearchResult()
{
 super();
}

/**
	Constructor
*/
public GoogleScholarSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for documentLink
*/
public MetadataParsedURL	documentLink()
{
	MetadataParsedURL	result = this.documentLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.documentLink = result;
	}
	return result;
}

/**
	Gets the value of the field documentLink
*/
public ParsedURL getDocumentLink()
{
	return this.documentLink().getValue();
}

/**
	Sets the value of the field documentLink
*/
public void setDocumentLink(ParsedURL documentLink)
{
	this.documentLink().setValue(documentLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: documentLink
*/
public boolean isNullDocumentLink()
{
	return documentLink == null || documentLink.getValue() == null;
}

/**
	The heavy weight setter method for field documentLink
*/
public void hwSetDocumentLink(ParsedURL documentLink)
{
	this.documentLink().setValue(documentLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the documentLink directly.
*/
public void setDocumentLinkMetadata(MetadataParsedURL documentLink)
{
	this.documentLink = documentLink;
}

/**
	Heavy Weight Direct setter method for documentLink
*/
public void hwSetDocumentLinkMetadata(MetadataParsedURL documentLink)
{
	if (this.documentLink != null && this.documentLink.getValue() != null && hasTermVector())
		termVector().remove(this.documentLink.termVector());
	this.documentLink = documentLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for citations
*/
public MetadataInteger	citations()
{
	MetadataInteger	result = this.citations;
	if (result == null)
	{
		result = new MetadataInteger();
		this.citations = result;
	}
	return result;
}

/**
	Gets the value of the field citations
*/
public Integer getCitations()
{
	return this.citations().getValue();
}

/**
	Sets the value of the field citations
*/
public void setCitations(Integer citations)
{
	this.citations().setValue(citations);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: citations
*/
public boolean isNullCitations()
{
	return citations == null || citations.getValue() == null;
}

/**
	The heavy weight setter method for field citations
*/
public void hwSetCitations(Integer citations)
{
	this.citations().setValue(citations);
	rebuildCompositeTermVector();
}

/**
	 Sets the citations directly.
*/
public void setCitationsMetadata(MetadataInteger citations)
{
	this.citations = citations;
}

/**
	Heavy Weight Direct setter method for citations
*/
public void hwSetCitationsMetadata(MetadataInteger citations)
{
	if (this.citations != null && this.citations.getValue() != null && hasTermVector())
		termVector().remove(this.citations.termVector());
	this.citations = citations;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for citationsLink
*/
public MetadataParsedURL	citationsLink()
{
	MetadataParsedURL	result = this.citationsLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.citationsLink = result;
	}
	return result;
}

/**
	Gets the value of the field citationsLink
*/
public ParsedURL getCitationsLink()
{
	return this.citationsLink().getValue();
}

/**
	Sets the value of the field citationsLink
*/
public void setCitationsLink(ParsedURL citationsLink)
{
	this.citationsLink().setValue(citationsLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: citationsLink
*/
public boolean isNullCitationsLink()
{
	return citationsLink == null || citationsLink.getValue() == null;
}

/**
	The heavy weight setter method for field citationsLink
*/
public void hwSetCitationsLink(ParsedURL citationsLink)
{
	this.citationsLink().setValue(citationsLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the citationsLink directly.
*/
public void setCitationsLinkMetadata(MetadataParsedURL citationsLink)
{
	this.citationsLink = citationsLink;
}

/**
	Heavy Weight Direct setter method for citationsLink
*/
public void hwSetCitationsLinkMetadata(MetadataParsedURL citationsLink)
{
	if (this.citationsLink != null && this.citationsLink.getValue() != null && hasTermVector())
		termVector().remove(this.citationsLink.termVector());
	this.citationsLink = citationsLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for relatedArticlesLink
*/
public MetadataParsedURL	relatedArticlesLink()
{
	MetadataParsedURL	result = this.relatedArticlesLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.relatedArticlesLink = result;
	}
	return result;
}

/**
	Gets the value of the field relatedArticlesLink
*/
public ParsedURL getRelatedArticlesLink()
{
	return this.relatedArticlesLink().getValue();
}

/**
	Sets the value of the field relatedArticlesLink
*/
public void setRelatedArticlesLink(ParsedURL relatedArticlesLink)
{
	this.relatedArticlesLink().setValue(relatedArticlesLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: relatedArticlesLink
*/
public boolean isNullRelatedArticlesLink()
{
	return relatedArticlesLink == null || relatedArticlesLink.getValue() == null;
}

/**
	The heavy weight setter method for field relatedArticlesLink
*/
public void hwSetRelatedArticlesLink(ParsedURL relatedArticlesLink)
{
	this.relatedArticlesLink().setValue(relatedArticlesLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the relatedArticlesLink directly.
*/
public void setRelatedArticlesLinkMetadata(MetadataParsedURL relatedArticlesLink)
{
	this.relatedArticlesLink = relatedArticlesLink;
}

/**
	Heavy Weight Direct setter method for relatedArticlesLink
*/
public void hwSetRelatedArticlesLinkMetadata(MetadataParsedURL relatedArticlesLink)
{
	if (this.relatedArticlesLink != null && this.relatedArticlesLink.getValue() != null && hasTermVector())
		termVector().remove(this.relatedArticlesLink.termVector());
	this.relatedArticlesLink = relatedArticlesLink;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for versions
*/
public MetadataInteger	versions()
{
	MetadataInteger	result = this.versions;
	if (result == null)
	{
		result = new MetadataInteger();
		this.versions = result;
	}
	return result;
}

/**
	Gets the value of the field versions
*/
public Integer getVersions()
{
	return this.versions().getValue();
}

/**
	Sets the value of the field versions
*/
public void setVersions(Integer versions)
{
	this.versions().setValue(versions);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: versions
*/
public boolean isNullVersions()
{
	return versions == null || versions.getValue() == null;
}

/**
	The heavy weight setter method for field versions
*/
public void hwSetVersions(Integer versions)
{
	this.versions().setValue(versions);
	rebuildCompositeTermVector();
}

/**
	 Sets the versions directly.
*/
public void setVersionsMetadata(MetadataInteger versions)
{
	this.versions = versions;
}

/**
	Heavy Weight Direct setter method for versions
*/
public void hwSetVersionsMetadata(MetadataInteger versions)
{
	if (this.versions != null && this.versions.getValue() != null && hasTermVector())
		termVector().remove(this.versions.termVector());
	this.versions = versions;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for versionsLink
*/
public MetadataParsedURL	versionsLink()
{
	MetadataParsedURL	result = this.versionsLink;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.versionsLink = result;
	}
	return result;
}

/**
	Gets the value of the field versionsLink
*/
public ParsedURL getVersionsLink()
{
	return this.versionsLink().getValue();
}

/**
	Sets the value of the field versionsLink
*/
public void setVersionsLink(ParsedURL versionsLink)
{
	this.versionsLink().setValue(versionsLink);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: versionsLink
*/
public boolean isNullVersionsLink()
{
	return versionsLink == null || versionsLink.getValue() == null;
}

/**
	The heavy weight setter method for field versionsLink
*/
public void hwSetVersionsLink(ParsedURL versionsLink)
{
	this.versionsLink().setValue(versionsLink);
	rebuildCompositeTermVector();
}

/**
	 Sets the versionsLink directly.
*/
public void setVersionsLinkMetadata(MetadataParsedURL versionsLink)
{
	this.versionsLink = versionsLink;
}

/**
	Heavy Weight Direct setter method for versionsLink
*/
public void hwSetVersionsLinkMetadata(MetadataParsedURL versionsLink)
{
	if (this.versionsLink != null && this.versionsLink.getValue() != null && hasTermVector())
		termVector().remove(this.versionsLink.termVector());
	this.versionsLink = versionsLink;
	rebuildCompositeTermVector();
}


}

