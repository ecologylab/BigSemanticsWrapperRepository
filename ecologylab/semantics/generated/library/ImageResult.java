package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
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
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
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

@simpl_inherit

public class ImageResult extends Metadata{


/**
	raw parsed URL for extracting values 'url', 'referer_url'
**/ 

	@simpl_scalar private MetadataParsedURL	imgUrl;

/**
	image summary
**/ 

	@simpl_scalar private MetadataString	summary;

/**
	mime type should be extracted from this property
**/ 

	@simpl_scalar private MetadataString	rawProperty;

/**
	image title
**/ 

	@simpl_scalar private MetadataString	imgTitle;

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

public ImageResult(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
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

public ParsedURL getImgUrl()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: imgUrl
**/ 

public boolean isNullImgUrl()
{
	return imgUrl == null || imgUrl.getValue() == null;
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

public String getSummary()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: summary
**/ 

public boolean isNullSummary()
{
	return summary == null || summary.getValue() == null;
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

public String getRawProperty()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: rawProperty
**/ 

public boolean isNullRawProperty()
{
	return rawProperty == null || rawProperty.getValue() == null;
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

public String getImgTitle()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: imgTitle
**/ 

public boolean isNullImgTitle()
{
	return imgTitle == null || imgTitle.getValue() == null;
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
}}
