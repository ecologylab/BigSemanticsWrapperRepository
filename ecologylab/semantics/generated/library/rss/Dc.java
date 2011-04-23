package ecologylab.semantics.generated.library.rss;


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
	Dublin core fields.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Dc
extends CompoundDocument
{

@simpl_scalar @xml_tag("dc:creator") @simpl_hints(Hint.XML_LEAF)
private MetadataString	dcCreator;

@simpl_scalar @xml_tag("dc:subject") @simpl_hints(Hint.XML_LEAF)
private MetadataString	dcSubject;

@simpl_scalar @xml_tag("dc:description") @simpl_hints(Hint.XML_LEAF)
private MetadataString	dcDescription;

@simpl_scalar @xml_tag("dc:title") @simpl_hints(Hint.XML_LEAF)
private MetadataString	dcTitle;

@simpl_scalar @xml_tag("dc:date") @simpl_hints(Hint.XML_LEAF)
private MetadataDate	dcDate;



/**
	Constructor
*/
public Dc()
{
 super();
}

/**
	Constructor
*/
public Dc(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for dcCreator
*/
public MetadataString	dcCreator()
{
	MetadataString	result = this.dcCreator;
	if (result == null)
	{
		result = new MetadataString();
		this.dcCreator = result;
	}
	return result;
}

/**
	Gets the value of the field dcCreator
*/
public String getDcCreator()
{
	return this.dcCreator().getValue();
}

/**
	Sets the value of the field dcCreator
*/
public void setDcCreator(String dcCreator)
{
	this.dcCreator().setValue(dcCreator);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dcCreator
*/
public boolean isNullDcCreator()
{
	return dcCreator == null || dcCreator.getValue() == null;
}

/**
	The heavy weight setter method for field dcCreator
*/
public void hwSetDcCreator(String dcCreator)
{
	this.dcCreator().setValue(dcCreator);
	rebuildCompositeTermVector();
}

/**
	 Sets the dcCreator directly.
*/
public void setDcCreatorMetadata(MetadataString dcCreator)
{
	this.dcCreator = dcCreator;
}

/**
	Heavy Weight Direct setter method for dcCreator
*/
public void hwSetDcCreatorMetadata(MetadataString dcCreator)
{
	if (this.dcCreator != null && this.dcCreator.getValue() != null && hasTermVector())
		termVector().remove(this.dcCreator.termVector());
	this.dcCreator = dcCreator;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for dcSubject
*/
public MetadataString	dcSubject()
{
	MetadataString	result = this.dcSubject;
	if (result == null)
	{
		result = new MetadataString();
		this.dcSubject = result;
	}
	return result;
}

/**
	Gets the value of the field dcSubject
*/
public String getDcSubject()
{
	return this.dcSubject().getValue();
}

/**
	Sets the value of the field dcSubject
*/
public void setDcSubject(String dcSubject)
{
	this.dcSubject().setValue(dcSubject);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dcSubject
*/
public boolean isNullDcSubject()
{
	return dcSubject == null || dcSubject.getValue() == null;
}

/**
	The heavy weight setter method for field dcSubject
*/
public void hwSetDcSubject(String dcSubject)
{
	this.dcSubject().setValue(dcSubject);
	rebuildCompositeTermVector();
}

/**
	 Sets the dcSubject directly.
*/
public void setDcSubjectMetadata(MetadataString dcSubject)
{
	this.dcSubject = dcSubject;
}

/**
	Heavy Weight Direct setter method for dcSubject
*/
public void hwSetDcSubjectMetadata(MetadataString dcSubject)
{
	if (this.dcSubject != null && this.dcSubject.getValue() != null && hasTermVector())
		termVector().remove(this.dcSubject.termVector());
	this.dcSubject = dcSubject;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for dcDescription
*/
public MetadataString	dcDescription()
{
	MetadataString	result = this.dcDescription;
	if (result == null)
	{
		result = new MetadataString();
		this.dcDescription = result;
	}
	return result;
}

/**
	Gets the value of the field dcDescription
*/
public String getDcDescription()
{
	return this.dcDescription().getValue();
}

/**
	Sets the value of the field dcDescription
*/
public void setDcDescription(String dcDescription)
{
	this.dcDescription().setValue(dcDescription);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dcDescription
*/
public boolean isNullDcDescription()
{
	return dcDescription == null || dcDescription.getValue() == null;
}

/**
	The heavy weight setter method for field dcDescription
*/
public void hwSetDcDescription(String dcDescription)
{
	this.dcDescription().setValue(dcDescription);
	rebuildCompositeTermVector();
}

/**
	 Sets the dcDescription directly.
*/
public void setDcDescriptionMetadata(MetadataString dcDescription)
{
	this.dcDescription = dcDescription;
}

/**
	Heavy Weight Direct setter method for dcDescription
*/
public void hwSetDcDescriptionMetadata(MetadataString dcDescription)
{
	if (this.dcDescription != null && this.dcDescription.getValue() != null && hasTermVector())
		termVector().remove(this.dcDescription.termVector());
	this.dcDescription = dcDescription;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for dcTitle
*/
public MetadataString	dcTitle()
{
	MetadataString	result = this.dcTitle;
	if (result == null)
	{
		result = new MetadataString();
		this.dcTitle = result;
	}
	return result;
}

/**
	Gets the value of the field dcTitle
*/
public String getDcTitle()
{
	return this.dcTitle().getValue();
}

/**
	Sets the value of the field dcTitle
*/
public void setDcTitle(String dcTitle)
{
	this.dcTitle().setValue(dcTitle);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dcTitle
*/
public boolean isNullDcTitle()
{
	return dcTitle == null || dcTitle.getValue() == null;
}

/**
	The heavy weight setter method for field dcTitle
*/
public void hwSetDcTitle(String dcTitle)
{
	this.dcTitle().setValue(dcTitle);
	rebuildCompositeTermVector();
}

/**
	 Sets the dcTitle directly.
*/
public void setDcTitleMetadata(MetadataString dcTitle)
{
	this.dcTitle = dcTitle;
}

/**
	Heavy Weight Direct setter method for dcTitle
*/
public void hwSetDcTitleMetadata(MetadataString dcTitle)
{
	if (this.dcTitle != null && this.dcTitle.getValue() != null && hasTermVector())
		termVector().remove(this.dcTitle.termVector());
	this.dcTitle = dcTitle;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for dcDate
*/
public MetadataDate	dcDate()
{
	MetadataDate	result = this.dcDate;
	if (result == null)
	{
		result = new MetadataDate();
		this.dcDate = result;
	}
	return result;
}

/**
	Gets the value of the field dcDate
*/
public Date getDcDate()
{
	return this.dcDate().getValue();
}

/**
	Sets the value of the field dcDate
*/
public void setDcDate(Date dcDate)
{
	this.dcDate().setValue(dcDate);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dcDate
*/
public boolean isNullDcDate()
{
	return dcDate == null || dcDate.getValue() == null;
}

/**
	The heavy weight setter method for field dcDate
*/
public void hwSetDcDate(Date dcDate)
{
	this.dcDate().setValue(dcDate);
	rebuildCompositeTermVector();
}

/**
	 Sets the dcDate directly.
*/
public void setDcDateMetadata(MetadataDate dcDate)
{
	this.dcDate = dcDate;
}

/**
	Heavy Weight Direct setter method for dcDate
*/
public void hwSetDcDateMetadata(MetadataDate dcDate)
{
	if (this.dcDate != null && this.dcDate.getValue() != null && hasTermVector())
		termVector().remove(this.dcDate.termVector());
	this.dcDate = dcDate;
	rebuildCompositeTermVector();
}


}

