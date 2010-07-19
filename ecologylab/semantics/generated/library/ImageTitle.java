package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class ImageTitle extends Metadata{

	 @simpl_scalar private MetadataString	titleAll;
	 @simpl_scalar private MetadataParsedURL	imgUrl;
	 @simpl_scalar private MetadataString	heading;
	 @simpl_scalar private MetadataString	property;
	 @simpl_scalar private MetadataParsedURL	refUrl;

/**
	Constructor
**/ 

public ImageTitle()
{
 super();
}

/**
	Constructor
**/ 

public ImageTitle(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for titleAll
**/ 

public MetadataString	titleAll()
{
MetadataString	result	=this.titleAll;
if(result == null)
{
result = new MetadataString();
this.titleAll	=	 result;
}
return result;
}

/**
	Gets the value of the field titleAll
**/ 

public String getTitleAll(){
return titleAll().getValue();
}

/**
	Sets the value of the field titleAll
**/ 

public void setTitleAll( String titleAll )
{
this.titleAll().setValue(titleAll);
}

/**
	The heavy weight setter method for field titleAll
**/ 

public void hwSetTitleAll( String titleAll )
{
this.titleAll().setValue(titleAll);
rebuildCompositeTermVector();
 }
/**
	 Sets the titleAll directly
**/ 

public void setTitleAllMetadata(MetadataString titleAll)
{	this.titleAll = titleAll;
}
/**
	Heavy Weight Direct setter method for titleAll
**/ 

public void hwSetTitleAllMetadata(MetadataString titleAll)
{	 if(this.titleAll!=null && this.titleAll.getValue()!=null && hasTermVector())
		 termVector().remove(this.titleAll.termVector());
	 this.titleAll = titleAll;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for imgUrl
**/ 

public MetadataParsedURL	imgUrl()
{
MetadataParsedURL	result	=this.imgUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.imgUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field imgUrl
**/ 

public ParsedURL getImgUrl(){
return imgUrl().getValue();
}

/**
	Sets the value of the field imgUrl
**/ 

public void setImgUrl( ParsedURL imgUrl )
{
this.imgUrl().setValue(imgUrl);
}

/**
	The heavy weight setter method for field imgUrl
**/ 

public void hwSetImgUrl( ParsedURL imgUrl )
{
this.imgUrl().setValue(imgUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the imgUrl directly
**/ 

public void setImgUrlMetadata(MetadataParsedURL imgUrl)
{	this.imgUrl = imgUrl;
}
/**
	Heavy Weight Direct setter method for imgUrl
**/ 

public void hwSetImgUrlMetadata(MetadataParsedURL imgUrl)
{	 if(this.imgUrl!=null && this.imgUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.imgUrl.termVector());
	 this.imgUrl = imgUrl;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for heading
**/ 

public MetadataString	heading()
{
MetadataString	result	=this.heading;
if(result == null)
{
result = new MetadataString();
this.heading	=	 result;
}
return result;
}

/**
	Gets the value of the field heading
**/ 

public String getHeading(){
return heading().getValue();
}

/**
	Sets the value of the field heading
**/ 

public void setHeading( String heading )
{
this.heading().setValue(heading);
}

/**
	The heavy weight setter method for field heading
**/ 

public void hwSetHeading( String heading )
{
this.heading().setValue(heading);
rebuildCompositeTermVector();
 }
/**
	 Sets the heading directly
**/ 

public void setHeadingMetadata(MetadataString heading)
{	this.heading = heading;
}
/**
	Heavy Weight Direct setter method for heading
**/ 

public void hwSetHeadingMetadata(MetadataString heading)
{	 if(this.heading!=null && this.heading.getValue()!=null && hasTermVector())
		 termVector().remove(this.heading.termVector());
	 this.heading = heading;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for property
**/ 

public MetadataString	property()
{
MetadataString	result	=this.property;
if(result == null)
{
result = new MetadataString();
this.property	=	 result;
}
return result;
}

/**
	Gets the value of the field property
**/ 

public String getProperty(){
return property().getValue();
}

/**
	Sets the value of the field property
**/ 

public void setProperty( String property )
{
this.property().setValue(property);
}

/**
	The heavy weight setter method for field property
**/ 

public void hwSetProperty( String property )
{
this.property().setValue(property);
rebuildCompositeTermVector();
 }
/**
	 Sets the property directly
**/ 

public void setPropertyMetadata(MetadataString property)
{	this.property = property;
}
/**
	Heavy Weight Direct setter method for property
**/ 

public void hwSetPropertyMetadata(MetadataString property)
{	 if(this.property!=null && this.property.getValue()!=null && hasTermVector())
		 termVector().remove(this.property.termVector());
	 this.property = property;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for refUrl
**/ 

public MetadataParsedURL	refUrl()
{
MetadataParsedURL	result	=this.refUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.refUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field refUrl
**/ 

public ParsedURL getRefUrl(){
return refUrl().getValue();
}

/**
	Sets the value of the field refUrl
**/ 

public void setRefUrl( ParsedURL refUrl )
{
this.refUrl().setValue(refUrl);
}

/**
	The heavy weight setter method for field refUrl
**/ 

public void hwSetRefUrl( ParsedURL refUrl )
{
this.refUrl().setValue(refUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the refUrl directly
**/ 

public void setRefUrlMetadata(MetadataParsedURL refUrl)
{	this.refUrl = refUrl;
}
/**
	Heavy Weight Direct setter method for refUrl
**/ 

public void hwSetRefUrlMetadata(MetadataParsedURL refUrl)
{	 if(this.refUrl!=null && this.refUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.refUrl.termVector());
	 this.refUrl = refUrl;
	rebuildCompositeTermVector();
}}
