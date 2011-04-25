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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class TempFieldValueHolder
extends Metadata
{

@simpl_scalar
private MetadataString	tempMedium;

@simpl_scalar
private MetadataString	tempDimensions;



/**
	Constructor
*/
public TempFieldValueHolder()
{
 super();
}

/**
	Constructor
*/
public TempFieldValueHolder(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for tempMedium
*/
public MetadataString	tempMedium()
{
	MetadataString	result = this.tempMedium;
	if (result == null)
	{
		result = new MetadataString();
		this.tempMedium = result;
	}
	return result;
}

/**
	Gets the value of the field tempMedium
*/
public String getTempMedium()
{
	return this.tempMedium().getValue();
}

/**
	Sets the value of the field tempMedium
*/
public void setTempMedium(String tempMedium)
{
	this.tempMedium().setValue(tempMedium);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: tempMedium
*/
public boolean isNullTempMedium()
{
	return tempMedium == null || tempMedium.getValue() == null;
}

/**
	The heavy weight setter method for field tempMedium
*/
public void hwSetTempMedium(String tempMedium)
{
	this.tempMedium().setValue(tempMedium);
	rebuildCompositeTermVector();
}

/**
	 Sets the tempMedium directly.
*/
public void setTempMediumMetadata(MetadataString tempMedium)
{
	this.tempMedium = tempMedium;
}

/**
	Heavy Weight Direct setter method for tempMedium
*/
public void hwSetTempMediumMetadata(MetadataString tempMedium)
{
	if (this.tempMedium != null && this.tempMedium.getValue() != null && hasTermVector())
		termVector().remove(this.tempMedium.termVector());
	this.tempMedium = tempMedium;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for tempDimensions
*/
public MetadataString	tempDimensions()
{
	MetadataString	result = this.tempDimensions;
	if (result == null)
	{
		result = new MetadataString();
		this.tempDimensions = result;
	}
	return result;
}

/**
	Gets the value of the field tempDimensions
*/
public String getTempDimensions()
{
	return this.tempDimensions().getValue();
}

/**
	Sets the value of the field tempDimensions
*/
public void setTempDimensions(String tempDimensions)
{
	this.tempDimensions().setValue(tempDimensions);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: tempDimensions
*/
public boolean isNullTempDimensions()
{
	return tempDimensions == null || tempDimensions.getValue() == null;
}

/**
	The heavy weight setter method for field tempDimensions
*/
public void hwSetTempDimensions(String tempDimensions)
{
	this.tempDimensions().setValue(tempDimensions);
	rebuildCompositeTermVector();
}

/**
	 Sets the tempDimensions directly.
*/
public void setTempDimensionsMetadata(MetadataString tempDimensions)
{
	this.tempDimensions = tempDimensions;
}

/**
	Heavy Weight Direct setter method for tempDimensions
*/
public void hwSetTempDimensionsMetadata(MetadataString tempDimensions)
{
	if (this.tempDimensions != null && this.tempDimensions.getValue() != null && hasTermVector())
		termVector().remove(this.tempDimensions.termVector());
	this.tempDimensions = tempDimensions;
	rebuildCompositeTermVector();
}


}

