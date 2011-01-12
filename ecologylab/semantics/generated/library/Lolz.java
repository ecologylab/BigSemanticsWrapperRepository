package ecologylab.semantics.generated.library;


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
import ecologylab.semantics.metadata.builtins.ClippableMetadata;
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
	The LOLZ class

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Lolz
extends Document
{

@simpl_scalar
private MetadataString	caption;

@simpl_scalar
private MetadataParsedURL	picture;

@simpl_scalar
private MetadataParsedURL	mightLike;



/**
	Constructor
*/
public Lolz()
{
 super();
}

/**
	Constructor
*/
public Lolz(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for caption
*/
public MetadataString	caption()
{
	MetadataString	result = this.caption;
	if (result == null)
	{
		result = new MetadataString();
		this.caption = result;
	}
	return result;
}

/**
	Gets the value of the field caption
*/
public String getCaption()
{
	return this.caption().getValue();
}

/**
	Sets the value of the field caption
*/
public void setCaption(String caption)
{
	this.caption().setValue(caption);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: caption
*/
public boolean isNullCaption()
{
	return caption == null || caption.getValue() == null;
}

/**
	The heavy weight setter method for field caption
*/
public void hwSetCaption(String caption)
{
	this.caption().setValue(caption);
	rebuildCompositeTermVector();
}

/**
	 Sets the caption directly.
*/
public void setCaptionMetadata(MetadataString caption)
{
	this.caption = caption;
}

/**
	Heavy Weight Direct setter method for caption
*/
public void hwSetCaptionMetadata(MetadataString caption)
{
	if (this.caption != null && this.caption.getValue() != null && hasTermVector())
		termVector().remove(this.caption.termVector());
	this.caption = caption;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for picture
*/
public MetadataParsedURL	picture()
{
	MetadataParsedURL	result = this.picture;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.picture = result;
	}
	return result;
}

/**
	Gets the value of the field picture
*/
public ParsedURL getPicture()
{
	return this.picture().getValue();
}

/**
	Sets the value of the field picture
*/
public void setPicture(ParsedURL picture)
{
	this.picture().setValue(picture);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: picture
*/
public boolean isNullPicture()
{
	return picture == null || picture.getValue() == null;
}

/**
	The heavy weight setter method for field picture
*/
public void hwSetPicture(ParsedURL picture)
{
	this.picture().setValue(picture);
	rebuildCompositeTermVector();
}

/**
	 Sets the picture directly.
*/
public void setPictureMetadata(MetadataParsedURL picture)
{
	this.picture = picture;
}

/**
	Heavy Weight Direct setter method for picture
*/
public void hwSetPictureMetadata(MetadataParsedURL picture)
{
	if (this.picture != null && this.picture.getValue() != null && hasTermVector())
		termVector().remove(this.picture.termVector());
	this.picture = picture;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for mightLike
*/
public MetadataParsedURL	mightLike()
{
	MetadataParsedURL	result = this.mightLike;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.mightLike = result;
	}
	return result;
}

/**
	Gets the value of the field mightLike
*/
public ParsedURL getMightLike()
{
	return this.mightLike().getValue();
}

/**
	Sets the value of the field mightLike
*/
public void setMightLike(ParsedURL mightLike)
{
	this.mightLike().setValue(mightLike);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: mightLike
*/
public boolean isNullMightLike()
{
	return mightLike == null || mightLike.getValue() == null;
}

/**
	The heavy weight setter method for field mightLike
*/
public void hwSetMightLike(ParsedURL mightLike)
{
	this.mightLike().setValue(mightLike);
	rebuildCompositeTermVector();
}

/**
	 Sets the mightLike directly.
*/
public void setMightLikeMetadata(MetadataParsedURL mightLike)
{
	this.mightLike = mightLike;
}

/**
	Heavy Weight Direct setter method for mightLike
*/
public void hwSetMightLikeMetadata(MetadataParsedURL mightLike)
{
	if (this.mightLike != null && this.mightLike.getValue() != null && hasTermVector())
		termVector().remove(this.mightLike.termVector());
	this.mightLike = mightLike;
	rebuildCompositeTermVector();
}


}

