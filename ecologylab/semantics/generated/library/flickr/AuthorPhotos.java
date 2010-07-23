package ecologylab.semantics.generated.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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

public class  AuthorPhotos
extends  Metadata
{

	@simpl_scalar private MetadataParsedURL	authorFlickrPageLink;
	@simpl_scalar private MetadataString	authorFlickrPage;
	@simpl_scalar private MetadataParsedURL	photosThatDayLink;
	@simpl_scalar private MetadataParsedURL	photosThatMonthLink;
	@simpl_scalar private MetadataParsedURL	photosThatYearLink;
	@simpl_scalar private MetadataString	photosThatDay;
	@simpl_scalar private MetadataString	photosThatMonth;
	@simpl_scalar private MetadataString	photosThatYear;

/**
	Constructor
**/ 

public AuthorPhotos()
{
 super();
}

/**
	Constructor
**/ 

public AuthorPhotos(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for authorFlickrPageLink
**/ 

public MetadataParsedURL	authorFlickrPageLink()
{
MetadataParsedURL	result	=this.authorFlickrPageLink;
if(result == null)
{
result = new MetadataParsedURL();
this.authorFlickrPageLink	=	 result;
}
return result;
}

/**
	Gets the value of the field authorFlickrPageLink
**/ 

public ParsedURL getAuthorFlickrPageLink(){
return authorFlickrPageLink().getValue();
}

/**
	Sets the value of the field authorFlickrPageLink
**/ 

public void setAuthorFlickrPageLink( ParsedURL authorFlickrPageLink )
{
this.authorFlickrPageLink().setValue(authorFlickrPageLink);
}

/**
	The heavy weight setter method for field authorFlickrPageLink
**/ 

public void hwSetAuthorFlickrPageLink( ParsedURL authorFlickrPageLink )
{
this.authorFlickrPageLink().setValue(authorFlickrPageLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the authorFlickrPageLink directly
**/ 

public void setAuthorFlickrPageLinkMetadata(MetadataParsedURL authorFlickrPageLink)
{	this.authorFlickrPageLink = authorFlickrPageLink;
}
/**
	Heavy Weight Direct setter method for authorFlickrPageLink
**/ 

public void hwSetAuthorFlickrPageLinkMetadata(MetadataParsedURL authorFlickrPageLink)
{	 if(this.authorFlickrPageLink!=null && this.authorFlickrPageLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.authorFlickrPageLink.termVector());
	 this.authorFlickrPageLink = authorFlickrPageLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for authorFlickrPage
**/ 

public MetadataString	authorFlickrPage()
{
MetadataString	result	=this.authorFlickrPage;
if(result == null)
{
result = new MetadataString();
this.authorFlickrPage	=	 result;
}
return result;
}

/**
	Gets the value of the field authorFlickrPage
**/ 

public String getAuthorFlickrPage(){
return authorFlickrPage().getValue();
}

/**
	Sets the value of the field authorFlickrPage
**/ 

public void setAuthorFlickrPage( String authorFlickrPage )
{
this.authorFlickrPage().setValue(authorFlickrPage);
}

/**
	The heavy weight setter method for field authorFlickrPage
**/ 

public void hwSetAuthorFlickrPage( String authorFlickrPage )
{
this.authorFlickrPage().setValue(authorFlickrPage);
rebuildCompositeTermVector();
 }
/**
	 Sets the authorFlickrPage directly
**/ 

public void setAuthorFlickrPageMetadata(MetadataString authorFlickrPage)
{	this.authorFlickrPage = authorFlickrPage;
}
/**
	Heavy Weight Direct setter method for authorFlickrPage
**/ 

public void hwSetAuthorFlickrPageMetadata(MetadataString authorFlickrPage)
{	 if(this.authorFlickrPage!=null && this.authorFlickrPage.getValue()!=null && hasTermVector())
		 termVector().remove(this.authorFlickrPage.termVector());
	 this.authorFlickrPage = authorFlickrPage;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for photosThatDayLink
**/ 

public MetadataParsedURL	photosThatDayLink()
{
MetadataParsedURL	result	=this.photosThatDayLink;
if(result == null)
{
result = new MetadataParsedURL();
this.photosThatDayLink	=	 result;
}
return result;
}

/**
	Gets the value of the field photosThatDayLink
**/ 

public ParsedURL getPhotosThatDayLink(){
return photosThatDayLink().getValue();
}

/**
	Sets the value of the field photosThatDayLink
**/ 

public void setPhotosThatDayLink( ParsedURL photosThatDayLink )
{
this.photosThatDayLink().setValue(photosThatDayLink);
}

/**
	The heavy weight setter method for field photosThatDayLink
**/ 

public void hwSetPhotosThatDayLink( ParsedURL photosThatDayLink )
{
this.photosThatDayLink().setValue(photosThatDayLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the photosThatDayLink directly
**/ 

public void setPhotosThatDayLinkMetadata(MetadataParsedURL photosThatDayLink)
{	this.photosThatDayLink = photosThatDayLink;
}
/**
	Heavy Weight Direct setter method for photosThatDayLink
**/ 

public void hwSetPhotosThatDayLinkMetadata(MetadataParsedURL photosThatDayLink)
{	 if(this.photosThatDayLink!=null && this.photosThatDayLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.photosThatDayLink.termVector());
	 this.photosThatDayLink = photosThatDayLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for photosThatMonthLink
**/ 

public MetadataParsedURL	photosThatMonthLink()
{
MetadataParsedURL	result	=this.photosThatMonthLink;
if(result == null)
{
result = new MetadataParsedURL();
this.photosThatMonthLink	=	 result;
}
return result;
}

/**
	Gets the value of the field photosThatMonthLink
**/ 

public ParsedURL getPhotosThatMonthLink(){
return photosThatMonthLink().getValue();
}

/**
	Sets the value of the field photosThatMonthLink
**/ 

public void setPhotosThatMonthLink( ParsedURL photosThatMonthLink )
{
this.photosThatMonthLink().setValue(photosThatMonthLink);
}

/**
	The heavy weight setter method for field photosThatMonthLink
**/ 

public void hwSetPhotosThatMonthLink( ParsedURL photosThatMonthLink )
{
this.photosThatMonthLink().setValue(photosThatMonthLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the photosThatMonthLink directly
**/ 

public void setPhotosThatMonthLinkMetadata(MetadataParsedURL photosThatMonthLink)
{	this.photosThatMonthLink = photosThatMonthLink;
}
/**
	Heavy Weight Direct setter method for photosThatMonthLink
**/ 

public void hwSetPhotosThatMonthLinkMetadata(MetadataParsedURL photosThatMonthLink)
{	 if(this.photosThatMonthLink!=null && this.photosThatMonthLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.photosThatMonthLink.termVector());
	 this.photosThatMonthLink = photosThatMonthLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for photosThatYearLink
**/ 

public MetadataParsedURL	photosThatYearLink()
{
MetadataParsedURL	result	=this.photosThatYearLink;
if(result == null)
{
result = new MetadataParsedURL();
this.photosThatYearLink	=	 result;
}
return result;
}

/**
	Gets the value of the field photosThatYearLink
**/ 

public ParsedURL getPhotosThatYearLink(){
return photosThatYearLink().getValue();
}

/**
	Sets the value of the field photosThatYearLink
**/ 

public void setPhotosThatYearLink( ParsedURL photosThatYearLink )
{
this.photosThatYearLink().setValue(photosThatYearLink);
}

/**
	The heavy weight setter method for field photosThatYearLink
**/ 

public void hwSetPhotosThatYearLink( ParsedURL photosThatYearLink )
{
this.photosThatYearLink().setValue(photosThatYearLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the photosThatYearLink directly
**/ 

public void setPhotosThatYearLinkMetadata(MetadataParsedURL photosThatYearLink)
{	this.photosThatYearLink = photosThatYearLink;
}
/**
	Heavy Weight Direct setter method for photosThatYearLink
**/ 

public void hwSetPhotosThatYearLinkMetadata(MetadataParsedURL photosThatYearLink)
{	 if(this.photosThatYearLink!=null && this.photosThatYearLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.photosThatYearLink.termVector());
	 this.photosThatYearLink = photosThatYearLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for photosThatDay
**/ 

public MetadataString	photosThatDay()
{
MetadataString	result	=this.photosThatDay;
if(result == null)
{
result = new MetadataString();
this.photosThatDay	=	 result;
}
return result;
}

/**
	Gets the value of the field photosThatDay
**/ 

public String getPhotosThatDay(){
return photosThatDay().getValue();
}

/**
	Sets the value of the field photosThatDay
**/ 

public void setPhotosThatDay( String photosThatDay )
{
this.photosThatDay().setValue(photosThatDay);
}

/**
	The heavy weight setter method for field photosThatDay
**/ 

public void hwSetPhotosThatDay( String photosThatDay )
{
this.photosThatDay().setValue(photosThatDay);
rebuildCompositeTermVector();
 }
/**
	 Sets the photosThatDay directly
**/ 

public void setPhotosThatDayMetadata(MetadataString photosThatDay)
{	this.photosThatDay = photosThatDay;
}
/**
	Heavy Weight Direct setter method for photosThatDay
**/ 

public void hwSetPhotosThatDayMetadata(MetadataString photosThatDay)
{	 if(this.photosThatDay!=null && this.photosThatDay.getValue()!=null && hasTermVector())
		 termVector().remove(this.photosThatDay.termVector());
	 this.photosThatDay = photosThatDay;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for photosThatMonth
**/ 

public MetadataString	photosThatMonth()
{
MetadataString	result	=this.photosThatMonth;
if(result == null)
{
result = new MetadataString();
this.photosThatMonth	=	 result;
}
return result;
}

/**
	Gets the value of the field photosThatMonth
**/ 

public String getPhotosThatMonth(){
return photosThatMonth().getValue();
}

/**
	Sets the value of the field photosThatMonth
**/ 

public void setPhotosThatMonth( String photosThatMonth )
{
this.photosThatMonth().setValue(photosThatMonth);
}

/**
	The heavy weight setter method for field photosThatMonth
**/ 

public void hwSetPhotosThatMonth( String photosThatMonth )
{
this.photosThatMonth().setValue(photosThatMonth);
rebuildCompositeTermVector();
 }
/**
	 Sets the photosThatMonth directly
**/ 

public void setPhotosThatMonthMetadata(MetadataString photosThatMonth)
{	this.photosThatMonth = photosThatMonth;
}
/**
	Heavy Weight Direct setter method for photosThatMonth
**/ 

public void hwSetPhotosThatMonthMetadata(MetadataString photosThatMonth)
{	 if(this.photosThatMonth!=null && this.photosThatMonth.getValue()!=null && hasTermVector())
		 termVector().remove(this.photosThatMonth.termVector());
	 this.photosThatMonth = photosThatMonth;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for photosThatYear
**/ 

public MetadataString	photosThatYear()
{
MetadataString	result	=this.photosThatYear;
if(result == null)
{
result = new MetadataString();
this.photosThatYear	=	 result;
}
return result;
}

/**
	Gets the value of the field photosThatYear
**/ 

public String getPhotosThatYear(){
return photosThatYear().getValue();
}

/**
	Sets the value of the field photosThatYear
**/ 

public void setPhotosThatYear( String photosThatYear )
{
this.photosThatYear().setValue(photosThatYear);
}

/**
	The heavy weight setter method for field photosThatYear
**/ 

public void hwSetPhotosThatYear( String photosThatYear )
{
this.photosThatYear().setValue(photosThatYear);
rebuildCompositeTermVector();
 }
/**
	 Sets the photosThatYear directly
**/ 

public void setPhotosThatYearMetadata(MetadataString photosThatYear)
{	this.photosThatYear = photosThatYear;
}
/**
	Heavy Weight Direct setter method for photosThatYear
**/ 

public void hwSetPhotosThatYearMetadata(MetadataString photosThatYear)
{	 if(this.photosThatYear!=null && this.photosThatYear.getValue()!=null && hasTermVector())
		 termVector().remove(this.photosThatYear.termVector());
	 this.photosThatYear = photosThatYear;
	rebuildCompositeTermVector();
}
}

