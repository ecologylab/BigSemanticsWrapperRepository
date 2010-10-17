package ecologylab.semantics.generated.library.search;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
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
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Def of an image in a Bing image search result.
**/ 

@simpl_inherit

public class  ImageInSearchResult
extends  Image
{

	@xml_tag("mms:Title")@simpl_scalar private MetadataString	caption;
	@xml_tag("mms:Url")@simpl_scalar private MetadataParsedURL	location;
	@xml_tag("mms:ContentType")@simpl_scalar private MetadataString	contentType;
	@simpl_scalar private MetadataParsedURL	referrerUrl;
	@xml_tag("mms:Width")@simpl_scalar private MetadataInteger	width;
	@xml_tag("mms:Height")@simpl_scalar private MetadataInteger	height;
	@xml_tag("mms:FileSize")@simpl_scalar private MetadataInteger	fileSize;

/**
	Constructor
**/ 

public ImageInSearchResult()
{
 super();
}

/**
	Constructor
**/ 

public ImageInSearchResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for caption
**/ 

public MetadataString	caption()
{
MetadataString	result	=this.caption;
if(result == null)
{
result = new MetadataString();
this.caption	=	 result;
}
return result;
}

/**
	Gets the value of the field caption
**/ 

public String getCaption()
{
	return caption().getValue();
}

/**
	Sets the value of the field caption
**/ 

public void setCaption( String caption )
{
	this.caption().setValue(caption);
}

/**
	The heavy weight setter method for field caption
**/ 

public void hwSetCaption( String caption )
{
	this.caption().setValue(caption);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: caption
**/ 

public boolean isNullCaption()
{
	return caption == null || caption.getValue() == null;
}

/**
	 Sets the caption directly
**/ 

public void setCaptionMetadata(MetadataString caption)
{	this.caption = caption;
}
/**
	Heavy Weight Direct setter method for caption
**/ 

public void hwSetCaptionMetadata(MetadataString caption)
{	 if(this.caption!=null && this.caption.getValue()!=null && hasTermVector())
		 termVector().remove(this.caption.termVector());
	 this.caption = caption;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for location
**/ 

public MetadataParsedURL	location()
{
MetadataParsedURL	result	=this.location;
if(result == null)
{
result = new MetadataParsedURL();
this.location	=	 result;
}
return result;
}

/**
	Gets the value of the field location
**/ 

public ParsedURL getLocation()
{
	return location().getValue();
}

/**
	Sets the value of the field location
**/ 

public void setLocation( ParsedURL location )
{
	this.location().setValue(location);
}

/**
	The heavy weight setter method for field location
**/ 

public void hwSetLocation( ParsedURL location )
{
	this.location().setValue(location);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: location
**/ 

public boolean isNullLocation()
{
	return location == null || location.getValue() == null;
}

/**
	 Sets the location directly
**/ 

public void setLocationMetadata(MetadataParsedURL location)
{	this.location = location;
}
/**
	Heavy Weight Direct setter method for location
**/ 

public void hwSetLocationMetadata(MetadataParsedURL location)
{	 if(this.location!=null && this.location.getValue()!=null && hasTermVector())
		 termVector().remove(this.location.termVector());
	 this.location = location;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for contentType
**/ 

public MetadataString	contentType()
{
MetadataString	result	=this.contentType;
if(result == null)
{
result = new MetadataString();
this.contentType	=	 result;
}
return result;
}

/**
	Gets the value of the field contentType
**/ 

public String getContentType()
{
	return contentType().getValue();
}

/**
	Sets the value of the field contentType
**/ 

public void setContentType( String contentType )
{
	this.contentType().setValue(contentType);
}

/**
	The heavy weight setter method for field contentType
**/ 

public void hwSetContentType( String contentType )
{
	this.contentType().setValue(contentType);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: contentType
**/ 

public boolean isNullContentType()
{
	return contentType == null || contentType.getValue() == null;
}

/**
	 Sets the contentType directly
**/ 

public void setContentTypeMetadata(MetadataString contentType)
{	this.contentType = contentType;
}
/**
	Heavy Weight Direct setter method for contentType
**/ 

public void hwSetContentTypeMetadata(MetadataString contentType)
{	 if(this.contentType!=null && this.contentType.getValue()!=null && hasTermVector())
		 termVector().remove(this.contentType.termVector());
	 this.contentType = contentType;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for referrerUrl
**/ 

public MetadataParsedURL	referrerUrl()
{
MetadataParsedURL	result	=this.referrerUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.referrerUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field referrerUrl
**/ 

public ParsedURL getReferrerUrl()
{
	return referrerUrl().getValue();
}

/**
	Sets the value of the field referrerUrl
**/ 

public void setReferrerUrl( ParsedURL referrerUrl )
{
	this.referrerUrl().setValue(referrerUrl);
}

/**
	The heavy weight setter method for field referrerUrl
**/ 

public void hwSetReferrerUrl( ParsedURL referrerUrl )
{
	this.referrerUrl().setValue(referrerUrl);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: referrerUrl
**/ 

public boolean isNullReferrerUrl()
{
	return referrerUrl == null || referrerUrl.getValue() == null;
}

/**
	 Sets the referrerUrl directly
**/ 

public void setReferrerUrlMetadata(MetadataParsedURL referrerUrl)
{	this.referrerUrl = referrerUrl;
}
/**
	Heavy Weight Direct setter method for referrerUrl
**/ 

public void hwSetReferrerUrlMetadata(MetadataParsedURL referrerUrl)
{	 if(this.referrerUrl!=null && this.referrerUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.referrerUrl.termVector());
	 this.referrerUrl = referrerUrl;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for width
**/ 

public MetadataInteger	width()
{
MetadataInteger	result	=this.width;
if(result == null)
{
result = new MetadataInteger();
this.width	=	 result;
}
return result;
}

/**
	Gets the value of the field width
**/ 

public Integer getWidth()
{
	return width().getValue();
}

/**
	Sets the value of the field width
**/ 

public void setWidth( Integer width )
{
	this.width().setValue(width);
}

/**
	The heavy weight setter method for field width
**/ 

public void hwSetWidth( Integer width )
{
	this.width().setValue(width);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: width
**/ 

public boolean isNullWidth()
{
	return width == null || width.getValue() == null;
}

/**
	 Sets the width directly
**/ 

public void setWidthMetadata(MetadataInteger width)
{	this.width = width;
}
/**
	Heavy Weight Direct setter method for width
**/ 

public void hwSetWidthMetadata(MetadataInteger width)
{	 if(this.width!=null && this.width.getValue()!=null && hasTermVector())
		 termVector().remove(this.width.termVector());
	 this.width = width;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for height
**/ 

public MetadataInteger	height()
{
MetadataInteger	result	=this.height;
if(result == null)
{
result = new MetadataInteger();
this.height	=	 result;
}
return result;
}

/**
	Gets the value of the field height
**/ 

public Integer getHeight()
{
	return height().getValue();
}

/**
	Sets the value of the field height
**/ 

public void setHeight( Integer height )
{
	this.height().setValue(height);
}

/**
	The heavy weight setter method for field height
**/ 

public void hwSetHeight( Integer height )
{
	this.height().setValue(height);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: height
**/ 

public boolean isNullHeight()
{
	return height == null || height.getValue() == null;
}

/**
	 Sets the height directly
**/ 

public void setHeightMetadata(MetadataInteger height)
{	this.height = height;
}
/**
	Heavy Weight Direct setter method for height
**/ 

public void hwSetHeightMetadata(MetadataInteger height)
{	 if(this.height!=null && this.height.getValue()!=null && hasTermVector())
		 termVector().remove(this.height.termVector());
	 this.height = height;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for fileSize
**/ 

public MetadataInteger	fileSize()
{
MetadataInteger	result	=this.fileSize;
if(result == null)
{
result = new MetadataInteger();
this.fileSize	=	 result;
}
return result;
}

/**
	Gets the value of the field fileSize
**/ 

public Integer getFileSize()
{
	return fileSize().getValue();
}

/**
	Sets the value of the field fileSize
**/ 

public void setFileSize( Integer fileSize )
{
	this.fileSize().setValue(fileSize);
}

/**
	The heavy weight setter method for field fileSize
**/ 

public void hwSetFileSize( Integer fileSize )
{
	this.fileSize().setValue(fileSize);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: fileSize
**/ 

public boolean isNullFileSize()
{
	return fileSize == null || fileSize.getValue() == null;
}

/**
	 Sets the fileSize directly
**/ 

public void setFileSizeMetadata(MetadataInteger fileSize)
{	this.fileSize = fileSize;
}
/**
	Heavy Weight Direct setter method for fileSize
**/ 

public void hwSetFileSizeMetadata(MetadataInteger fileSize)
{	 if(this.fileSize!=null && this.fileSize.getValue()!=null && hasTermVector())
		 termVector().remove(this.fileSize.termVector());
	 this.fileSize = fileSize;
	rebuildCompositeTermVector();
}
}

