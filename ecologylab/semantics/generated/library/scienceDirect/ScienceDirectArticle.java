package ecologylab.semantics.generated.library.scienceDirect;


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

@simpl_scalar
private MetadataString	recieved;

@simpl_scalar
private MetadataString	accepted;

@simpl_scalar
private MetadataString	online;


/**
	The pages on which the article occurs in the publication
*/
@simpl_scalar
private MetadataString	pages;


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
	Lazy evaluation for recieved
*/
public MetadataString	recieved()
{
	MetadataString	result = this.recieved;
	if (result == null)
	{
		result = new MetadataString();
		this.recieved = result;
	}
	return result;
}

/**
	Gets the value of the field recieved
*/
public String getRecieved()
{
	return this.recieved().getValue();
}

/**
	Sets the value of the field recieved
*/
public void setRecieved(String recieved)
{
	this.recieved().setValue(recieved);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: recieved
*/
public boolean isNullRecieved()
{
	return recieved == null || recieved.getValue() == null;
}

/**
	The heavy weight setter method for field recieved
*/
public void hwSetRecieved(String recieved)
{
	this.recieved().setValue(recieved);
	rebuildCompositeTermVector();
}

/**
	 Sets the recieved directly.
*/
public void setRecievedMetadata(MetadataString recieved)
{
	this.recieved = recieved;
}

/**
	Heavy Weight Direct setter method for recieved
*/
public void hwSetRecievedMetadata(MetadataString recieved)
{
	if (this.recieved != null && this.recieved.getValue() != null && hasTermVector())
		termVector().remove(this.recieved.termVector());
	this.recieved = recieved;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for accepted
*/
public MetadataString	accepted()
{
	MetadataString	result = this.accepted;
	if (result == null)
	{
		result = new MetadataString();
		this.accepted = result;
	}
	return result;
}

/**
	Gets the value of the field accepted
*/
public String getAccepted()
{
	return this.accepted().getValue();
}

/**
	Sets the value of the field accepted
*/
public void setAccepted(String accepted)
{
	this.accepted().setValue(accepted);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: accepted
*/
public boolean isNullAccepted()
{
	return accepted == null || accepted.getValue() == null;
}

/**
	The heavy weight setter method for field accepted
*/
public void hwSetAccepted(String accepted)
{
	this.accepted().setValue(accepted);
	rebuildCompositeTermVector();
}

/**
	 Sets the accepted directly.
*/
public void setAcceptedMetadata(MetadataString accepted)
{
	this.accepted = accepted;
}

/**
	Heavy Weight Direct setter method for accepted
*/
public void hwSetAcceptedMetadata(MetadataString accepted)
{
	if (this.accepted != null && this.accepted.getValue() != null && hasTermVector())
		termVector().remove(this.accepted.termVector());
	this.accepted = accepted;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for online
*/
public MetadataString	online()
{
	MetadataString	result = this.online;
	if (result == null)
	{
		result = new MetadataString();
		this.online = result;
	}
	return result;
}

/**
	Gets the value of the field online
*/
public String getOnline()
{
	return this.online().getValue();
}

/**
	Sets the value of the field online
*/
public void setOnline(String online)
{
	this.online().setValue(online);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: online
*/
public boolean isNullOnline()
{
	return online == null || online.getValue() == null;
}

/**
	The heavy weight setter method for field online
*/
public void hwSetOnline(String online)
{
	this.online().setValue(online);
	rebuildCompositeTermVector();
}

/**
	 Sets the online directly.
*/
public void setOnlineMetadata(MetadataString online)
{
	this.online = online;
}

/**
	Heavy Weight Direct setter method for online
*/
public void hwSetOnlineMetadata(MetadataString online)
{
	if (this.online != null && this.online.getValue() != null && hasTermVector())
		termVector().remove(this.online.termVector());
	this.online = online;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for pages
*/
public MetadataString	pages()
{
	MetadataString	result = this.pages;
	if (result == null)
	{
		result = new MetadataString();
		this.pages = result;
	}
	return result;
}

/**
	Gets the value of the field pages
*/
public String getPages()
{
	return this.pages().getValue();
}

/**
	Sets the value of the field pages
*/
public void setPages(String pages)
{
	this.pages().setValue(pages);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pages
*/
public boolean isNullPages()
{
	return pages == null || pages.getValue() == null;
}

/**
	The heavy weight setter method for field pages
*/
public void hwSetPages(String pages)
{
	this.pages().setValue(pages);
	rebuildCompositeTermVector();
}

/**
	 Sets the pages directly.
*/
public void setPagesMetadata(MetadataString pages)
{
	this.pages = pages;
}

/**
	Heavy Weight Direct setter method for pages
*/
public void hwSetPagesMetadata(MetadataString pages)
{
	if (this.pages != null && this.pages.getValue() != null && hasTermVector())
		termVector().remove(this.pages.termVector());
	this.pages = pages;
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

