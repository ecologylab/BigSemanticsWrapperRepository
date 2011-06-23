package ecologylab.semantics.generated.library.camera;


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
	Mixin: Image description from EXIF image metadata.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class CameraSettings
extends Metadata
{

@simpl_scalar
private MetadataString	subjectDistance;

@simpl_scalar
private MetadataString	exposureTime;

@simpl_scalar
private MetadataString	aperture;

@simpl_scalar
private MetadataString	shutterSpeed;

@simpl_scalar
private MetadataString	model;

@simpl_scalar
private MetadataString	orientation;

@simpl_scalar
private MetadataString	resolution;



/**
	Constructor
*/
public CameraSettings()
{
 super();
}

/**
	Constructor
*/
public CameraSettings(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for subjectDistance
*/
public MetadataString	subjectDistance()
{
	MetadataString	result = this.subjectDistance;
	if (result == null)
	{
		result = new MetadataString();
		this.subjectDistance = result;
	}
	return result;
}

/**
	Gets the value of the field subjectDistance
*/
public String getSubjectDistance()
{
	return this.subjectDistance().getValue();
}

/**
	Sets the value of the field subjectDistance
*/
public void setSubjectDistance(String subjectDistance)
{
	this.subjectDistance().setValue(subjectDistance);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: subjectDistance
*/
public boolean isNullSubjectDistance()
{
	return subjectDistance == null || subjectDistance.getValue() == null;
}

/**
	The heavy weight setter method for field subjectDistance
*/
public void hwSetSubjectDistance(String subjectDistance)
{
	this.subjectDistance().setValue(subjectDistance);
	rebuildCompositeTermVector();
}

/**
	 Sets the subjectDistance directly.
*/
public void setSubjectDistanceMetadata(MetadataString subjectDistance)
{
	this.subjectDistance = subjectDistance;
}

/**
	Heavy Weight Direct setter method for subjectDistance
*/
public void hwSetSubjectDistanceMetadata(MetadataString subjectDistance)
{
	if (this.subjectDistance != null && this.subjectDistance.getValue() != null && hasTermVector())
		termVector().remove(this.subjectDistance.termVector());
	this.subjectDistance = subjectDistance;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for exposureTime
*/
public MetadataString	exposureTime()
{
	MetadataString	result = this.exposureTime;
	if (result == null)
	{
		result = new MetadataString();
		this.exposureTime = result;
	}
	return result;
}

/**
	Gets the value of the field exposureTime
*/
public String getExposureTime()
{
	return this.exposureTime().getValue();
}

/**
	Sets the value of the field exposureTime
*/
public void setExposureTime(String exposureTime)
{
	this.exposureTime().setValue(exposureTime);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: exposureTime
*/
public boolean isNullExposureTime()
{
	return exposureTime == null || exposureTime.getValue() == null;
}

/**
	The heavy weight setter method for field exposureTime
*/
public void hwSetExposureTime(String exposureTime)
{
	this.exposureTime().setValue(exposureTime);
	rebuildCompositeTermVector();
}

/**
	 Sets the exposureTime directly.
*/
public void setExposureTimeMetadata(MetadataString exposureTime)
{
	this.exposureTime = exposureTime;
}

/**
	Heavy Weight Direct setter method for exposureTime
*/
public void hwSetExposureTimeMetadata(MetadataString exposureTime)
{
	if (this.exposureTime != null && this.exposureTime.getValue() != null && hasTermVector())
		termVector().remove(this.exposureTime.termVector());
	this.exposureTime = exposureTime;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for aperture
*/
public MetadataString	aperture()
{
	MetadataString	result = this.aperture;
	if (result == null)
	{
		result = new MetadataString();
		this.aperture = result;
	}
	return result;
}

/**
	Gets the value of the field aperture
*/
public String getAperture()
{
	return this.aperture().getValue();
}

/**
	Sets the value of the field aperture
*/
public void setAperture(String aperture)
{
	this.aperture().setValue(aperture);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: aperture
*/
public boolean isNullAperture()
{
	return aperture == null || aperture.getValue() == null;
}

/**
	The heavy weight setter method for field aperture
*/
public void hwSetAperture(String aperture)
{
	this.aperture().setValue(aperture);
	rebuildCompositeTermVector();
}

/**
	 Sets the aperture directly.
*/
public void setApertureMetadata(MetadataString aperture)
{
	this.aperture = aperture;
}

/**
	Heavy Weight Direct setter method for aperture
*/
public void hwSetApertureMetadata(MetadataString aperture)
{
	if (this.aperture != null && this.aperture.getValue() != null && hasTermVector())
		termVector().remove(this.aperture.termVector());
	this.aperture = aperture;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for shutterSpeed
*/
public MetadataString	shutterSpeed()
{
	MetadataString	result = this.shutterSpeed;
	if (result == null)
	{
		result = new MetadataString();
		this.shutterSpeed = result;
	}
	return result;
}

/**
	Gets the value of the field shutterSpeed
*/
public String getShutterSpeed()
{
	return this.shutterSpeed().getValue();
}

/**
	Sets the value of the field shutterSpeed
*/
public void setShutterSpeed(String shutterSpeed)
{
	this.shutterSpeed().setValue(shutterSpeed);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: shutterSpeed
*/
public boolean isNullShutterSpeed()
{
	return shutterSpeed == null || shutterSpeed.getValue() == null;
}

/**
	The heavy weight setter method for field shutterSpeed
*/
public void hwSetShutterSpeed(String shutterSpeed)
{
	this.shutterSpeed().setValue(shutterSpeed);
	rebuildCompositeTermVector();
}

/**
	 Sets the shutterSpeed directly.
*/
public void setShutterSpeedMetadata(MetadataString shutterSpeed)
{
	this.shutterSpeed = shutterSpeed;
}

/**
	Heavy Weight Direct setter method for shutterSpeed
*/
public void hwSetShutterSpeedMetadata(MetadataString shutterSpeed)
{
	if (this.shutterSpeed != null && this.shutterSpeed.getValue() != null && hasTermVector())
		termVector().remove(this.shutterSpeed.termVector());
	this.shutterSpeed = shutterSpeed;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for model
*/
public MetadataString	model()
{
	MetadataString	result = this.model;
	if (result == null)
	{
		result = new MetadataString();
		this.model = result;
	}
	return result;
}

/**
	Gets the value of the field model
*/
public String getModel()
{
	return this.model().getValue();
}

/**
	Sets the value of the field model
*/
public void setModel(String model)
{
	this.model().setValue(model);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: model
*/
public boolean isNullModel()
{
	return model == null || model.getValue() == null;
}

/**
	The heavy weight setter method for field model
*/
public void hwSetModel(String model)
{
	this.model().setValue(model);
	rebuildCompositeTermVector();
}

/**
	 Sets the model directly.
*/
public void setModelMetadata(MetadataString model)
{
	this.model = model;
}

/**
	Heavy Weight Direct setter method for model
*/
public void hwSetModelMetadata(MetadataString model)
{
	if (this.model != null && this.model.getValue() != null && hasTermVector())
		termVector().remove(this.model.termVector());
	this.model = model;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for orientation
*/
public MetadataString	orientation()
{
	MetadataString	result = this.orientation;
	if (result == null)
	{
		result = new MetadataString();
		this.orientation = result;
	}
	return result;
}

/**
	Gets the value of the field orientation
*/
public String getOrientation()
{
	return this.orientation().getValue();
}

/**
	Sets the value of the field orientation
*/
public void setOrientation(String orientation)
{
	this.orientation().setValue(orientation);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: orientation
*/
public boolean isNullOrientation()
{
	return orientation == null || orientation.getValue() == null;
}

/**
	The heavy weight setter method for field orientation
*/
public void hwSetOrientation(String orientation)
{
	this.orientation().setValue(orientation);
	rebuildCompositeTermVector();
}

/**
	 Sets the orientation directly.
*/
public void setOrientationMetadata(MetadataString orientation)
{
	this.orientation = orientation;
}

/**
	Heavy Weight Direct setter method for orientation
*/
public void hwSetOrientationMetadata(MetadataString orientation)
{
	if (this.orientation != null && this.orientation.getValue() != null && hasTermVector())
		termVector().remove(this.orientation.termVector());
	this.orientation = orientation;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for resolution
*/
public MetadataString	resolution()
{
	MetadataString	result = this.resolution;
	if (result == null)
	{
		result = new MetadataString();
		this.resolution = result;
	}
	return result;
}

/**
	Gets the value of the field resolution
*/
public String getResolution()
{
	return this.resolution().getValue();
}

/**
	Sets the value of the field resolution
*/
public void setResolution(String resolution)
{
	this.resolution().setValue(resolution);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: resolution
*/
public boolean isNullResolution()
{
	return resolution == null || resolution.getValue() == null;
}

/**
	The heavy weight setter method for field resolution
*/
public void hwSetResolution(String resolution)
{
	this.resolution().setValue(resolution);
	rebuildCompositeTermVector();
}

/**
	 Sets the resolution directly.
*/
public void setResolutionMetadata(MetadataString resolution)
{
	this.resolution = resolution;
}

/**
	Heavy Weight Direct setter method for resolution
*/
public void hwSetResolutionMetadata(MetadataString resolution)
{
	if (this.resolution != null && this.resolution.getValue() != null && hasTermVector())
		termVector().remove(this.resolution.termVector());
	this.resolution = resolution;
	rebuildCompositeTermVector();
}


}

