package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
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

public class ImageResult extends Metadata{


/**
	image title
**/ 

	 @simpl_scalar private MetadataString	imgTitle;

/**
	image summary
**/ 

	 @simpl_scalar private MetadataString	summary;

/**
	raw parsed URL for extracting values 'url', 'referer_url'
**/ 

	 @simpl_scalar private MetadataString	rawUrl;

/**
	mime type should be extracted from this property
**/ 

	 @simpl_scalar private MetadataString	rawProperty;

/**
	Constructor
**/ 

public ImageResult()
{
 super();
}

/**
	Constructor
**/ 

public ImageResult(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for imgTitle
**/ 

public MetadataString	imgTitle()
{
MetadataString	result	=this.imgTitle;
if(result == null)
{
result = new MetadataString();
this.imgTitle	=	 result;
}
return result;
}

/**
	Gets the value of the field imgTitle
**/ 

public String getImgTitle(){
return imgTitle().getValue();
}

/**
	Sets the value of the field imgTitle
**/ 

public void setImgTitle( String imgTitle )
{
this.imgTitle().setValue(imgTitle);
}

/**
	The heavy weight setter method for field imgTitle
**/ 

public void hwSetImgTitle( String imgTitle )
{
this.imgTitle().setValue(imgTitle);
rebuildCompositeTermVector();
 }
/**
	 Sets the imgTitle directly
**/ 

public void setImgTitleMetadata(MetadataString imgTitle)
{	this.imgTitle = imgTitle;
}
/**
	Heavy Weight Direct setter method for imgTitle
**/ 

public void hwSetImgTitleMetadata(MetadataString imgTitle)
{	 if(this.imgTitle!=null && this.imgTitle.getValue()!=null && hasTermVector())
		 termVector().remove(this.imgTitle.termVector());
	 this.imgTitle = imgTitle;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for summary
**/ 

public MetadataString	summary()
{
MetadataString	result	=this.summary;
if(result == null)
{
result = new MetadataString();
this.summary	=	 result;
}
return result;
}

/**
	Gets the value of the field summary
**/ 

public String getSummary(){
return summary().getValue();
}

/**
	Sets the value of the field summary
**/ 

public void setSummary( String summary )
{
this.summary().setValue(summary);
}

/**
	The heavy weight setter method for field summary
**/ 

public void hwSetSummary( String summary )
{
this.summary().setValue(summary);
rebuildCompositeTermVector();
 }
/**
	 Sets the summary directly
**/ 

public void setSummaryMetadata(MetadataString summary)
{	this.summary = summary;
}
/**
	Heavy Weight Direct setter method for summary
**/ 

public void hwSetSummaryMetadata(MetadataString summary)
{	 if(this.summary!=null && this.summary.getValue()!=null && hasTermVector())
		 termVector().remove(this.summary.termVector());
	 this.summary = summary;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for rawUrl
**/ 

public MetadataString	rawUrl()
{
MetadataString	result	=this.rawUrl;
if(result == null)
{
result = new MetadataString();
this.rawUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field rawUrl
**/ 

public String getRawUrl(){
return rawUrl().getValue();
}

/**
	Sets the value of the field rawUrl
**/ 

public void setRawUrl( String rawUrl )
{
this.rawUrl().setValue(rawUrl);
}

/**
	The heavy weight setter method for field rawUrl
**/ 

public void hwSetRawUrl( String rawUrl )
{
this.rawUrl().setValue(rawUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the rawUrl directly
**/ 

public void setRawUrlMetadata(MetadataString rawUrl)
{	this.rawUrl = rawUrl;
}
/**
	Heavy Weight Direct setter method for rawUrl
**/ 

public void hwSetRawUrlMetadata(MetadataString rawUrl)
{	 if(this.rawUrl!=null && this.rawUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.rawUrl.termVector());
	 this.rawUrl = rawUrl;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for rawProperty
**/ 

public MetadataString	rawProperty()
{
MetadataString	result	=this.rawProperty;
if(result == null)
{
result = new MetadataString();
this.rawProperty	=	 result;
}
return result;
}

/**
	Gets the value of the field rawProperty
**/ 

public String getRawProperty(){
return rawProperty().getValue();
}

/**
	Sets the value of the field rawProperty
**/ 

public void setRawProperty( String rawProperty )
{
this.rawProperty().setValue(rawProperty);
}

/**
	The heavy weight setter method for field rawProperty
**/ 

public void hwSetRawProperty( String rawProperty )
{
this.rawProperty().setValue(rawProperty);
rebuildCompositeTermVector();
 }
/**
	 Sets the rawProperty directly
**/ 

public void setRawPropertyMetadata(MetadataString rawProperty)
{	this.rawProperty = rawProperty;
}
/**
	Heavy Weight Direct setter method for rawProperty
**/ 

public void hwSetRawPropertyMetadata(MetadataString rawProperty)
{	 if(this.rawProperty!=null && this.rawProperty.getValue()!=null && hasTermVector())
		 termVector().remove(this.rawProperty.termVector());
	 this.rawProperty = rawProperty;
	rebuildCompositeTermVector();
}}
