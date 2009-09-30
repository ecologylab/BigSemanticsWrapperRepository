package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.builtins.Entity;

 import java.util.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.net.ParsedURL;
import ecologylab.generic.HashMapArrayList;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;

@xml_inherit
@xml_tag("result")
public class Result extends Metadata{


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

public Result(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("Title") @xml_nested private MetadataString	Title;

/**
	Lazy Evaluation for Title
**/ 

public MetadataString	Title()
{
MetadataString	result	=this.Title;
if(result == null)
{
result = new MetadataString();
this.Title	=	 result;
}
return result;
}

/**
	Gets the value of the field Title
**/ 

public String getTitle(){
return Title().getValue();
}

/**
	Sets the value of the field Title
**/ 

public void setTitle( String Title )
{
this.Title().setValue(Title);
}

/**
	The heavy weight setter method for field Title
**/ 

public void hwSetTitle( String Title )
{
this.Title().setValue(Title);
rebuildCompositeTermVector();
 }
/**
	 Sets the Title directly
**/ 

public void setTitleMetadata(MetadataString Title)
{	this.Title = Title;
}
/**
	Heavy Weight Direct setter method for Title
**/ 

public void hwSetTitleMetadata(MetadataString Title)
{	 if(this.Title!=null && this.Title.getValue()!=null && hasTermVector())
		 termVector().remove(this.Title.termVector());
	 this.Title = Title;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("Summary") @xml_nested private MetadataString	Summary;

/**
	Lazy Evaluation for Summary
**/ 

public MetadataString	Summary()
{
MetadataString	result	=this.Summary;
if(result == null)
{
result = new MetadataString();
this.Summary	=	 result;
}
return result;
}

/**
	Gets the value of the field Summary
**/ 

public String getSummary(){
return Summary().getValue();
}

/**
	Sets the value of the field Summary
**/ 

public void setSummary( String Summary )
{
this.Summary().setValue(Summary);
}

/**
	The heavy weight setter method for field Summary
**/ 

public void hwSetSummary( String Summary )
{
this.Summary().setValue(Summary);
rebuildCompositeTermVector();
 }
/**
	 Sets the Summary directly
**/ 

public void setSummaryMetadata(MetadataString Summary)
{	this.Summary = Summary;
}
/**
	Heavy Weight Direct setter method for Summary
**/ 

public void hwSetSummaryMetadata(MetadataString Summary)
{	 if(this.Summary!=null && this.Summary.getValue()!=null && hasTermVector())
		 termVector().remove(this.Summary.termVector());
	 this.Summary = Summary;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("Url") @xml_nested private MetadataParsedURL	Url;

/**
	Lazy Evaluation for Url
**/ 

public MetadataParsedURL	Url()
{
MetadataParsedURL	result	=this.Url;
if(result == null)
{
result = new MetadataParsedURL();
this.Url	=	 result;
}
return result;
}

/**
	Gets the value of the field Url
**/ 

public ParsedURL getUrl(){
return Url().getValue();
}

/**
	Sets the value of the field Url
**/ 

public void setUrl( ParsedURL Url )
{
this.Url().setValue(Url);
}

/**
	The heavy weight setter method for field Url
**/ 

public void hwSetUrl( ParsedURL Url )
{
this.Url().setValue(Url);
rebuildCompositeTermVector();
 }
/**
	 Sets the Url directly
**/ 

public void setUrlMetadata(MetadataParsedURL Url)
{	this.Url = Url;
}
/**
	Heavy Weight Direct setter method for Url
**/ 

public void hwSetUrlMetadata(MetadataParsedURL Url)
{	 if(this.Url!=null && this.Url.getValue()!=null && hasTermVector())
		 termVector().remove(this.Url.termVector());
	 this.Url = Url;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("ClickUrl") @xml_nested private MetadataParsedURL	ClickUrl;

/**
	Lazy Evaluation for ClickUrl
**/ 

public MetadataParsedURL	ClickUrl()
{
MetadataParsedURL	result	=this.ClickUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.ClickUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field ClickUrl
**/ 

public ParsedURL getClickUrl(){
return ClickUrl().getValue();
}

/**
	Sets the value of the field ClickUrl
**/ 

public void setClickUrl( ParsedURL ClickUrl )
{
this.ClickUrl().setValue(ClickUrl);
}

/**
	The heavy weight setter method for field ClickUrl
**/ 

public void hwSetClickUrl( ParsedURL ClickUrl )
{
this.ClickUrl().setValue(ClickUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the ClickUrl directly
**/ 

public void setClickUrlMetadata(MetadataParsedURL ClickUrl)
{	this.ClickUrl = ClickUrl;
}
/**
	Heavy Weight Direct setter method for ClickUrl
**/ 

public void hwSetClickUrlMetadata(MetadataParsedURL ClickUrl)
{	 if(this.ClickUrl!=null && this.ClickUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.ClickUrl.termVector());
	 this.ClickUrl = ClickUrl;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("DisplayUrl") @xml_nested private MetadataParsedURL	DisplayUrl;

/**
	Lazy Evaluation for DisplayUrl
**/ 

public MetadataParsedURL	DisplayUrl()
{
MetadataParsedURL	result	=this.DisplayUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.DisplayUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field DisplayUrl
**/ 

public ParsedURL getDisplayUrl(){
return DisplayUrl().getValue();
}

/**
	Sets the value of the field DisplayUrl
**/ 

public void setDisplayUrl( ParsedURL DisplayUrl )
{
this.DisplayUrl().setValue(DisplayUrl);
}

/**
	The heavy weight setter method for field DisplayUrl
**/ 

public void hwSetDisplayUrl( ParsedURL DisplayUrl )
{
this.DisplayUrl().setValue(DisplayUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the DisplayUrl directly
**/ 

public void setDisplayUrlMetadata(MetadataParsedURL DisplayUrl)
{	this.DisplayUrl = DisplayUrl;
}
/**
	Heavy Weight Direct setter method for DisplayUrl
**/ 

public void hwSetDisplayUrlMetadata(MetadataParsedURL DisplayUrl)
{	 if(this.DisplayUrl!=null && this.DisplayUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.DisplayUrl.termVector());
	 this.DisplayUrl = DisplayUrl;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("ModificationDate") @xml_nested private MetadataInteger	ModificationDate;

/**
	Lazy Evaluation for ModificationDate
**/ 

public MetadataInteger	ModificationDate()
{
MetadataInteger	result	=this.ModificationDate;
if(result == null)
{
result = new MetadataInteger();
this.ModificationDate	=	 result;
}
return result;
}

/**
	Gets the value of the field ModificationDate
**/ 

public Integer getModificationDate(){
return ModificationDate().getValue();
}

/**
	Sets the value of the field ModificationDate
**/ 

public void setModificationDate( Integer ModificationDate )
{
this.ModificationDate().setValue(ModificationDate);
}

/**
	The heavy weight setter method for field ModificationDate
**/ 

public void hwSetModificationDate( Integer ModificationDate )
{
this.ModificationDate().setValue(ModificationDate);
rebuildCompositeTermVector();
 }
/**
	 Sets the ModificationDate directly
**/ 

public void setModificationDateMetadata(MetadataInteger ModificationDate)
{	this.ModificationDate = ModificationDate;
}
/**
	Heavy Weight Direct setter method for ModificationDate
**/ 

public void hwSetModificationDateMetadata(MetadataInteger ModificationDate)
{	 if(this.ModificationDate!=null && this.ModificationDate.getValue()!=null && hasTermVector())
		 termVector().remove(this.ModificationDate.termVector());
	 this.ModificationDate = ModificationDate;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("MimeType") @xml_nested private MetadataString	MimeType;

/**
	Lazy Evaluation for MimeType
**/ 

public MetadataString	MimeType()
{
MetadataString	result	=this.MimeType;
if(result == null)
{
result = new MetadataString();
this.MimeType	=	 result;
}
return result;
}

/**
	Gets the value of the field MimeType
**/ 

public String getMimeType(){
return MimeType().getValue();
}

/**
	Sets the value of the field MimeType
**/ 

public void setMimeType( String MimeType )
{
this.MimeType().setValue(MimeType);
}

/**
	The heavy weight setter method for field MimeType
**/ 

public void hwSetMimeType( String MimeType )
{
this.MimeType().setValue(MimeType);
rebuildCompositeTermVector();
 }
/**
	 Sets the MimeType directly
**/ 

public void setMimeTypeMetadata(MetadataString MimeType)
{	this.MimeType = MimeType;
}
/**
	Heavy Weight Direct setter method for MimeType
**/ 

public void hwSetMimeTypeMetadata(MetadataString MimeType)
{	 if(this.MimeType!=null && this.MimeType.getValue()!=null && hasTermVector())
		 termVector().remove(this.MimeType.termVector());
	 this.MimeType = MimeType;
	rebuildCompositeTermVector();
}}
