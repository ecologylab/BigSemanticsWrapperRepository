package ecologylab.semantics.generated.library.search;

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
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class Result extends Metadata{

	@xml_tag("ModificationDate") @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	modificationDate;
	@xml_tag("Summary") @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	summary;
	@xml_tag("Title") @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	title;

private @xml_tag("Thumbnail") @simpl_composite YahooThumbnail	thumbnail;	@xml_tag("MimeType") @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	mimeType;
	@xml_tag("RefererUrl") @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	refererUrl;
	@xml_tag("Url") @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	url;

/**
	Constructor
**/ 

public Result()
{
 super();
}

/**
	Constructor
**/ 

public Result(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for modificationDate
**/ 

public MetadataString	modificationDate()
{
MetadataString	result	=this.modificationDate;
if(result == null)
{
result = new MetadataString();
this.modificationDate	=	 result;
}
return result;
}

/**
	Gets the value of the field modificationDate
**/ 

public String getModificationDate(){
return modificationDate().getValue();
}

/**
	Sets the value of the field modificationDate
**/ 

public void setModificationDate( String modificationDate )
{
this.modificationDate().setValue(modificationDate);
}

/**
	The heavy weight setter method for field modificationDate
**/ 

public void hwSetModificationDate( String modificationDate )
{
this.modificationDate().setValue(modificationDate);
rebuildCompositeTermVector();
 }
/**
	 Sets the modificationDate directly
**/ 

public void setModificationDateMetadata(MetadataString modificationDate)
{	this.modificationDate = modificationDate;
}
/**
	Heavy Weight Direct setter method for modificationDate
**/ 

public void hwSetModificationDateMetadata(MetadataString modificationDate)
{	 if(this.modificationDate!=null && this.modificationDate.getValue()!=null && hasTermVector())
		 termVector().remove(this.modificationDate.termVector());
	 this.modificationDate = modificationDate;
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
	Lazy Evaluation for title
**/ 

public MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for thumbnail
**/ 

public YahooThumbnail	thumbnail()
{
YahooThumbnail	result	=this.thumbnail;
if(result == null)
{
result = new YahooThumbnail();
this.thumbnail	=	 result;
}
return result;
}

/**
	Set the value of field thumbnail
**/ 

public void setThumbnail( YahooThumbnail thumbnail )
{
this.thumbnail = thumbnail ;
}

/**
	Get the value of field thumbnail
**/ 

public YahooThumbnail getThumbnail(){
return this.thumbnail;
}

/**
	Lazy Evaluation for mimeType
**/ 

public MetadataString	mimeType()
{
MetadataString	result	=this.mimeType;
if(result == null)
{
result = new MetadataString();
this.mimeType	=	 result;
}
return result;
}

/**
	Gets the value of the field mimeType
**/ 

public String getMimeType(){
return mimeType().getValue();
}

/**
	Sets the value of the field mimeType
**/ 

public void setMimeType( String mimeType )
{
this.mimeType().setValue(mimeType);
}

/**
	The heavy weight setter method for field mimeType
**/ 

public void hwSetMimeType( String mimeType )
{
this.mimeType().setValue(mimeType);
rebuildCompositeTermVector();
 }
/**
	 Sets the mimeType directly
**/ 

public void setMimeTypeMetadata(MetadataString mimeType)
{	this.mimeType = mimeType;
}
/**
	Heavy Weight Direct setter method for mimeType
**/ 

public void hwSetMimeTypeMetadata(MetadataString mimeType)
{	 if(this.mimeType!=null && this.mimeType.getValue()!=null && hasTermVector())
		 termVector().remove(this.mimeType.termVector());
	 this.mimeType = mimeType;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for refererUrl
**/ 

public MetadataParsedURL	refererUrl()
{
MetadataParsedURL	result	=this.refererUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.refererUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field refererUrl
**/ 

public ParsedURL getRefererUrl(){
return refererUrl().getValue();
}

/**
	Sets the value of the field refererUrl
**/ 

public void setRefererUrl( ParsedURL refererUrl )
{
this.refererUrl().setValue(refererUrl);
}

/**
	The heavy weight setter method for field refererUrl
**/ 

public void hwSetRefererUrl( ParsedURL refererUrl )
{
this.refererUrl().setValue(refererUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the refererUrl directly
**/ 

public void setRefererUrlMetadata(MetadataParsedURL refererUrl)
{	this.refererUrl = refererUrl;
}
/**
	Heavy Weight Direct setter method for refererUrl
**/ 

public void hwSetRefererUrlMetadata(MetadataParsedURL refererUrl)
{	 if(this.refererUrl!=null && this.refererUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.refererUrl.termVector());
	 this.refererUrl = refererUrl;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for url
**/ 

public MetadataParsedURL	url()
{
MetadataParsedURL	result	=this.url;
if(result == null)
{
result = new MetadataParsedURL();
this.url	=	 result;
}
return result;
}

/**
	Gets the value of the field url
**/ 

public ParsedURL getUrl(){
return url().getValue();
}

/**
	Sets the value of the field url
**/ 

public void setUrl( ParsedURL url )
{
this.url().setValue(url);
}

/**
	The heavy weight setter method for field url
**/ 

public void hwSetUrl( ParsedURL url )
{
this.url().setValue(url);
rebuildCompositeTermVector();
 }
/**
	 Sets the url directly
**/ 

public void setUrlMetadata(MetadataParsedURL url)
{	this.url = url;
}
/**
	Heavy Weight Direct setter method for url
**/ 

public void hwSetUrlMetadata(MetadataParsedURL url)
{	 if(this.url!=null && this.url.getValue()!=null && hasTermVector())
		 termVector().remove(this.url.termVector());
	 this.url = url;
	rebuildCompositeTermVector();
}}
