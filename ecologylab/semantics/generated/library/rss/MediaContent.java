package ecologylab.semantics.generated.library.rss;

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

@simpl_inherit
@xml_tag("media:content")
public class MediaContent extends Metadata{

	@xml_tag("url")@simpl_scalar private MetadataParsedURL	mediaUrl;
	@simpl_scalar private MetadataInteger	height;
	@simpl_scalar private MetadataInteger	width;

/**
	Constructor
**/ 

public MediaContent()
{
 super();
}

/**
	Constructor
**/ 

public MediaContent(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for mediaUrl
**/ 

public MetadataParsedURL	mediaUrl()
{
MetadataParsedURL	result	=this.mediaUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.mediaUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field mediaUrl
**/ 

public ParsedURL getMediaUrl()
{
	return mediaUrl().getValue();
}

/**
	Sets the value of the field mediaUrl
**/ 

public void setMediaUrl( ParsedURL mediaUrl )
{
	this.mediaUrl().setValue(mediaUrl);
}

/**
	The heavy weight setter method for field mediaUrl
**/ 

public void hwSetMediaUrl( ParsedURL mediaUrl )
{
	this.mediaUrl().setValue(mediaUrl);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: mediaUrl
**/ 

public boolean isNullMediaUrl()
{
	return mediaUrl == null || mediaUrl.getValue() == null;
}

/**
	 Sets the mediaUrl directly
**/ 

public void setMediaUrlMetadata(MetadataParsedURL mediaUrl)
{	this.mediaUrl = mediaUrl;
}
/**
	Heavy Weight Direct setter method for mediaUrl
**/ 

public void hwSetMediaUrlMetadata(MetadataParsedURL mediaUrl)
{	 if(this.mediaUrl!=null && this.mediaUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.mediaUrl.termVector());
	 this.mediaUrl = mediaUrl;
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
}}
