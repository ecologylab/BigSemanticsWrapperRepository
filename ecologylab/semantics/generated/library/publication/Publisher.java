package ecologylab.semantics.generated.library.publication;


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
	A publishing company.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Publisher
extends Metadata
{

@simpl_scalar @simpl_composite_as_scalar
private MetadataString	name;

@simpl_scalar
private MetadataString	city;



/**
	Constructor
*/
public Publisher()
{
 super();
}

/**
	Constructor
*/
public Publisher(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for name
*/
public MetadataString	name()
{
	MetadataString	result = this.name;
	if (result == null)
	{
		result = new MetadataString();
		this.name = result;
	}
	return result;
}

/**
	Gets the value of the field name
*/
public String getName()
{
	return this.name().getValue();
}

/**
	Sets the value of the field name
*/
public void setName(String name)
{
	this.name().setValue(name);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: name
*/
public boolean isNullName()
{
	return name == null || name.getValue() == null;
}

/**
	The heavy weight setter method for field name
*/
public void hwSetName(String name)
{
	this.name().setValue(name);
	rebuildCompositeTermVector();
}

/**
	 Sets the name directly.
*/
public void setNameMetadata(MetadataString name)
{
	this.name = name;
}

/**
	Heavy Weight Direct setter method for name
*/
public void hwSetNameMetadata(MetadataString name)
{
	if (this.name != null && this.name.getValue() != null && hasTermVector())
		termVector().remove(this.name.termVector());
	this.name = name;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for city
*/
public MetadataString	city()
{
	MetadataString	result = this.city;
	if (result == null)
	{
		result = new MetadataString();
		this.city = result;
	}
	return result;
}

/**
	Gets the value of the field city
*/
public String getCity()
{
	return this.city().getValue();
}

/**
	Sets the value of the field city
*/
public void setCity(String city)
{
	this.city().setValue(city);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: city
*/
public boolean isNullCity()
{
	return city == null || city.getValue() == null;
}

/**
	The heavy weight setter method for field city
*/
public void hwSetCity(String city)
{
	this.city().setValue(city);
	rebuildCompositeTermVector();
}

/**
	 Sets the city directly.
*/
public void setCityMetadata(MetadataString city)
{
	this.city = city;
}

/**
	Heavy Weight Direct setter method for city
*/
public void hwSetCityMetadata(MetadataString city)
{
	if (this.city != null && this.city.getValue() != null && hasTermVector())
		termVector().remove(this.city.termVector());
	this.city = city;
	rebuildCompositeTermVector();
}


}

