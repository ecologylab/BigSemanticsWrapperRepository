package ecologylab.semantics.generated.library.bibManaging;


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
	Citation numbers.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class CitationInfo
extends Document
{

@simpl_scalar
private MetadataInteger	totalCitation;

@simpl_scalar
private MetadataInteger	selfCitation;



/**
	Constructor
*/
public CitationInfo()
{
 super();
}

/**
	Constructor
*/
public CitationInfo(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for totalCitation
*/
public MetadataInteger	totalCitation()
{
	MetadataInteger	result = this.totalCitation;
	if (result == null)
	{
		result = new MetadataInteger();
		this.totalCitation = result;
	}
	return result;
}

/**
	Gets the value of the field totalCitation
*/
public Integer getTotalCitation()
{
	return this.totalCitation().getValue();
}

/**
	Sets the value of the field totalCitation
*/
public void setTotalCitation(Integer totalCitation)
{
	this.totalCitation().setValue(totalCitation);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: totalCitation
*/
public boolean isNullTotalCitation()
{
	return totalCitation == null || totalCitation.getValue() == null;
}

/**
	The heavy weight setter method for field totalCitation
*/
public void hwSetTotalCitation(Integer totalCitation)
{
	this.totalCitation().setValue(totalCitation);
	rebuildCompositeTermVector();
}

/**
	 Sets the totalCitation directly.
*/
public void setTotalCitationMetadata(MetadataInteger totalCitation)
{
	this.totalCitation = totalCitation;
}

/**
	Heavy Weight Direct setter method for totalCitation
*/
public void hwSetTotalCitationMetadata(MetadataInteger totalCitation)
{
	if (this.totalCitation != null && this.totalCitation.getValue() != null && hasTermVector())
		termVector().remove(this.totalCitation.termVector());
	this.totalCitation = totalCitation;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for selfCitation
*/
public MetadataInteger	selfCitation()
{
	MetadataInteger	result = this.selfCitation;
	if (result == null)
	{
		result = new MetadataInteger();
		this.selfCitation = result;
	}
	return result;
}

/**
	Gets the value of the field selfCitation
*/
public Integer getSelfCitation()
{
	return this.selfCitation().getValue();
}

/**
	Sets the value of the field selfCitation
*/
public void setSelfCitation(Integer selfCitation)
{
	this.selfCitation().setValue(selfCitation);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: selfCitation
*/
public boolean isNullSelfCitation()
{
	return selfCitation == null || selfCitation.getValue() == null;
}

/**
	The heavy weight setter method for field selfCitation
*/
public void hwSetSelfCitation(Integer selfCitation)
{
	this.selfCitation().setValue(selfCitation);
	rebuildCompositeTermVector();
}

/**
	 Sets the selfCitation directly.
*/
public void setSelfCitationMetadata(MetadataInteger selfCitation)
{
	this.selfCitation = selfCitation;
}

/**
	Heavy Weight Direct setter method for selfCitation
*/
public void hwSetSelfCitationMetadata(MetadataInteger selfCitation)
{
	if (this.selfCitation != null && this.selfCitation.getValue() != null && hasTermVector())
		termVector().remove(this.selfCitation.termVector());
	this.selfCitation = selfCitation;
	rebuildCompositeTermVector();
}


}

