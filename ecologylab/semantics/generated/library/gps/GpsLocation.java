package ecologylab.semantics.generated.library.gps;


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
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class GpsLocation
extends Metadata
{

@simpl_scalar
private MetadataString	latitude;

@simpl_scalar
private MetadataString	longitude;



/**
	Constructor
*/
public GpsLocation()
{
 super();
}

/**
	Constructor
*/
public GpsLocation(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for latitude
*/
public MetadataString	latitude()
{
	MetadataString	result = this.latitude;
	if (result == null)
	{
		result = new MetadataString();
		this.latitude = result;
	}
	return result;
}

/**
	Gets the value of the field latitude
*/
public String getLatitude()
{
	return this.latitude().getValue();
}

/**
	Sets the value of the field latitude
*/
public void setLatitude(String latitude)
{
	this.latitude().setValue(latitude);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: latitude
*/
public boolean isNullLatitude()
{
	return latitude == null || latitude.getValue() == null;
}

/**
	The heavy weight setter method for field latitude
*/
public void hwSetLatitude(String latitude)
{
	this.latitude().setValue(latitude);
	rebuildCompositeTermVector();
}

/**
	 Sets the latitude directly.
*/
public void setLatitudeMetadata(MetadataString latitude)
{
	this.latitude = latitude;
}

/**
	Heavy Weight Direct setter method for latitude
*/
public void hwSetLatitudeMetadata(MetadataString latitude)
{
	if (this.latitude != null && this.latitude.getValue() != null && hasTermVector())
		termVector().remove(this.latitude.termVector());
	this.latitude = latitude;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for longitude
*/
public MetadataString	longitude()
{
	MetadataString	result = this.longitude;
	if (result == null)
	{
		result = new MetadataString();
		this.longitude = result;
	}
	return result;
}

/**
	Gets the value of the field longitude
*/
public String getLongitude()
{
	return this.longitude().getValue();
}

/**
	Sets the value of the field longitude
*/
public void setLongitude(String longitude)
{
	this.longitude().setValue(longitude);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: longitude
*/
public boolean isNullLongitude()
{
	return longitude == null || longitude.getValue() == null;
}

/**
	The heavy weight setter method for field longitude
*/
public void hwSetLongitude(String longitude)
{
	this.longitude().setValue(longitude);
	rebuildCompositeTermVector();
}

/**
	 Sets the longitude directly.
*/
public void setLongitudeMetadata(MetadataString longitude)
{
	this.longitude = longitude;
}

/**
	Heavy Weight Direct setter method for longitude
*/
public void hwSetLongitudeMetadata(MetadataString longitude)
{
	if (this.longitude != null && this.longitude.getValue() != null && hasTermVector())
		termVector().remove(this.longitude.termVector());
	this.longitude = longitude;
	rebuildCompositeTermVector();
}


}

