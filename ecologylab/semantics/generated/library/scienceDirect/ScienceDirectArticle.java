package ecologylab.semantics.generated.library.scienceDirect;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
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
	Information about the article

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class ScienceDirectArticle
extends ScholarlyArticle
{


/**
	The journal or other publication that the article comes from
*/
@simpl_scalar
private MetadataString	publicationName;

@simpl_scalar
private MetadataString	volume;

@simpl_scalar
private MetadataString	issue;


/**
	The digital object identifier of the article
*/
@simpl_scalar
private MetadataString	doi;



/**
	Constructor
*/
public ScienceDirectArticle()
{
 super();
}

/**
	Constructor
*/
public ScienceDirectArticle(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for publicationName
*/
public MetadataString	publicationName()
{
	MetadataString	result = this.publicationName;
	if (result == null)
	{
		result = new MetadataString();
		this.publicationName = result;
	}
	return result;
}

/**
	Gets the value of the field publicationName
*/
public String getPublicationName()
{
	return this.publicationName().getValue();
}

/**
	Sets the value of the field publicationName
*/
public void setPublicationName(String publicationName)
{
	this.publicationName().setValue(publicationName);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: publicationName
*/
public boolean isNullPublicationName()
{
	return publicationName == null || publicationName.getValue() == null;
}

/**
	The heavy weight setter method for field publicationName
*/
public void hwSetPublicationName(String publicationName)
{
	this.publicationName().setValue(publicationName);
	rebuildCompositeTermVector();
}

/**
	 Sets the publicationName directly.
*/
public void setPublicationNameMetadata(MetadataString publicationName)
{
	this.publicationName = publicationName;
}

/**
	Heavy Weight Direct setter method for publicationName
*/
public void hwSetPublicationNameMetadata(MetadataString publicationName)
{
	if (this.publicationName != null && this.publicationName.getValue() != null && hasTermVector())
		termVector().remove(this.publicationName.termVector());
	this.publicationName = publicationName;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for volume
*/
public MetadataString	volume()
{
	MetadataString	result = this.volume;
	if (result == null)
	{
		result = new MetadataString();
		this.volume = result;
	}
	return result;
}

/**
	Gets the value of the field volume
*/
public String getVolume()
{
	return this.volume().getValue();
}

/**
	Sets the value of the field volume
*/
public void setVolume(String volume)
{
	this.volume().setValue(volume);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: volume
*/
public boolean isNullVolume()
{
	return volume == null || volume.getValue() == null;
}

/**
	The heavy weight setter method for field volume
*/
public void hwSetVolume(String volume)
{
	this.volume().setValue(volume);
	rebuildCompositeTermVector();
}

/**
	 Sets the volume directly.
*/
public void setVolumeMetadata(MetadataString volume)
{
	this.volume = volume;
}

/**
	Heavy Weight Direct setter method for volume
*/
public void hwSetVolumeMetadata(MetadataString volume)
{
	if (this.volume != null && this.volume.getValue() != null && hasTermVector())
		termVector().remove(this.volume.termVector());
	this.volume = volume;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for issue
*/
public MetadataString	issue()
{
	MetadataString	result = this.issue;
	if (result == null)
	{
		result = new MetadataString();
		this.issue = result;
	}
	return result;
}

/**
	Gets the value of the field issue
*/
public String getIssue()
{
	return this.issue().getValue();
}

/**
	Sets the value of the field issue
*/
public void setIssue(String issue)
{
	this.issue().setValue(issue);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: issue
*/
public boolean isNullIssue()
{
	return issue == null || issue.getValue() == null;
}

/**
	The heavy weight setter method for field issue
*/
public void hwSetIssue(String issue)
{
	this.issue().setValue(issue);
	rebuildCompositeTermVector();
}

/**
	 Sets the issue directly.
*/
public void setIssueMetadata(MetadataString issue)
{
	this.issue = issue;
}

/**
	Heavy Weight Direct setter method for issue
*/
public void hwSetIssueMetadata(MetadataString issue)
{
	if (this.issue != null && this.issue.getValue() != null && hasTermVector())
		termVector().remove(this.issue.termVector());
	this.issue = issue;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for doi
*/
public MetadataString	doi()
{
	MetadataString	result = this.doi;
	if (result == null)
	{
		result = new MetadataString();
		this.doi = result;
	}
	return result;
}

/**
	Gets the value of the field doi
*/
public String getDoi()
{
	return this.doi().getValue();
}

/**
	Sets the value of the field doi
*/
public void setDoi(String doi)
{
	this.doi().setValue(doi);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: doi
*/
public boolean isNullDoi()
{
	return doi == null || doi.getValue() == null;
}

/**
	The heavy weight setter method for field doi
*/
public void hwSetDoi(String doi)
{
	this.doi().setValue(doi);
	rebuildCompositeTermVector();
}

/**
	 Sets the doi directly.
*/
public void setDoiMetadata(MetadataString doi)
{
	this.doi = doi;
}

/**
	Heavy Weight Direct setter method for doi
*/
public void hwSetDoiMetadata(MetadataString doi)
{
	if (this.doi != null && this.doi.getValue() != null && hasTermVector())
		termVector().remove(this.doi.termVector());
	this.doi = doi;
	rebuildCompositeTermVector();
}


}

