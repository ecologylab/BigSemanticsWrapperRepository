package ecologylab.semantics.library.imdb;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	Metadata for storing details of birth (date and place) of people
**/ 

@xml_inherit

public class  BirthDetail
extends  Document
{


/**
	null
**/ 

	 @xml_nested private MetadataString	dayOfBirth;

/**
	null
**/ 

	 @xml_nested private MetadataString	yearOfBirth;

/**
	null
**/ 

	 @xml_nested private MetadataString	placeOfBirth;

/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	dayOfBirthLink;

/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	yearOfBirthLink;

/**
	null
**/ 

	 @xml_nested private MetadataParsedURL	placeOfBirthLink;

/**
	Constructor
**/ 

public BirthDetail()
{
 super();
}

/**
	Constructor
**/ 

public BirthDetail(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for dayOfBirth
**/ 

public MetadataString	dayOfBirth()
{
MetadataString	result	=this.dayOfBirth;
if(result == null)
{
result = new MetadataString();
this.dayOfBirth	=	 result;
}
return result;
}

/**
	Gets the value of the field dayOfBirth
**/ 

public String getDayOfBirth(){
return dayOfBirth().getValue();
}

/**
	Sets the value of the field dayOfBirth
**/ 

public void setDayOfBirth( String dayOfBirth )
{
this.dayOfBirth().setValue(dayOfBirth);
}

/**
	The heavy weight setter method for field dayOfBirth
**/ 

public void hwSetDayOfBirth( String dayOfBirth )
{
this.dayOfBirth().setValue(dayOfBirth);
rebuildCompositeTermVector();
 }
/**
	 Sets the dayOfBirth directly
**/ 

public void setDayOfBirthMetadata(MetadataString dayOfBirth)
{	this.dayOfBirth = dayOfBirth;
}
/**
	Heavy Weight Direct setter method for dayOfBirth
**/ 

public void hwSetDayOfBirthMetadata(MetadataString dayOfBirth)
{	 if(this.dayOfBirth!=null && this.dayOfBirth.getValue()!=null && hasTermVector())
		 termVector().remove(this.dayOfBirth.termVector());
	 this.dayOfBirth = dayOfBirth;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for yearOfBirth
**/ 

public MetadataString	yearOfBirth()
{
MetadataString	result	=this.yearOfBirth;
if(result == null)
{
result = new MetadataString();
this.yearOfBirth	=	 result;
}
return result;
}

/**
	Gets the value of the field yearOfBirth
**/ 

public String getYearOfBirth(){
return yearOfBirth().getValue();
}

/**
	Sets the value of the field yearOfBirth
**/ 

public void setYearOfBirth( String yearOfBirth )
{
this.yearOfBirth().setValue(yearOfBirth);
}

/**
	The heavy weight setter method for field yearOfBirth
**/ 

public void hwSetYearOfBirth( String yearOfBirth )
{
this.yearOfBirth().setValue(yearOfBirth);
rebuildCompositeTermVector();
 }
/**
	 Sets the yearOfBirth directly
**/ 

public void setYearOfBirthMetadata(MetadataString yearOfBirth)
{	this.yearOfBirth = yearOfBirth;
}
/**
	Heavy Weight Direct setter method for yearOfBirth
**/ 

public void hwSetYearOfBirthMetadata(MetadataString yearOfBirth)
{	 if(this.yearOfBirth!=null && this.yearOfBirth.getValue()!=null && hasTermVector())
		 termVector().remove(this.yearOfBirth.termVector());
	 this.yearOfBirth = yearOfBirth;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for placeOfBirth
**/ 

public MetadataString	placeOfBirth()
{
MetadataString	result	=this.placeOfBirth;
if(result == null)
{
result = new MetadataString();
this.placeOfBirth	=	 result;
}
return result;
}

/**
	Gets the value of the field placeOfBirth
**/ 

public String getPlaceOfBirth(){
return placeOfBirth().getValue();
}

/**
	Sets the value of the field placeOfBirth
**/ 

public void setPlaceOfBirth( String placeOfBirth )
{
this.placeOfBirth().setValue(placeOfBirth);
}

/**
	The heavy weight setter method for field placeOfBirth
**/ 

public void hwSetPlaceOfBirth( String placeOfBirth )
{
this.placeOfBirth().setValue(placeOfBirth);
rebuildCompositeTermVector();
 }
/**
	 Sets the placeOfBirth directly
**/ 

public void setPlaceOfBirthMetadata(MetadataString placeOfBirth)
{	this.placeOfBirth = placeOfBirth;
}
/**
	Heavy Weight Direct setter method for placeOfBirth
**/ 

public void hwSetPlaceOfBirthMetadata(MetadataString placeOfBirth)
{	 if(this.placeOfBirth!=null && this.placeOfBirth.getValue()!=null && hasTermVector())
		 termVector().remove(this.placeOfBirth.termVector());
	 this.placeOfBirth = placeOfBirth;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for dayOfBirthLink
**/ 

public MetadataParsedURL	dayOfBirthLink()
{
MetadataParsedURL	result	=this.dayOfBirthLink;
if(result == null)
{
result = new MetadataParsedURL();
this.dayOfBirthLink	=	 result;
}
return result;
}

/**
	Gets the value of the field dayOfBirthLink
**/ 

public ParsedURL getDayOfBirthLink(){
return dayOfBirthLink().getValue();
}

/**
	Sets the value of the field dayOfBirthLink
**/ 

public void setDayOfBirthLink( ParsedURL dayOfBirthLink )
{
this.dayOfBirthLink().setValue(dayOfBirthLink);
}

/**
	The heavy weight setter method for field dayOfBirthLink
**/ 

public void hwSetDayOfBirthLink( ParsedURL dayOfBirthLink )
{
this.dayOfBirthLink().setValue(dayOfBirthLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the dayOfBirthLink directly
**/ 

public void setDayOfBirthLinkMetadata(MetadataParsedURL dayOfBirthLink)
{	this.dayOfBirthLink = dayOfBirthLink;
}
/**
	Heavy Weight Direct setter method for dayOfBirthLink
**/ 

public void hwSetDayOfBirthLinkMetadata(MetadataParsedURL dayOfBirthLink)
{	 if(this.dayOfBirthLink!=null && this.dayOfBirthLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.dayOfBirthLink.termVector());
	 this.dayOfBirthLink = dayOfBirthLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for yearOfBirthLink
**/ 

public MetadataParsedURL	yearOfBirthLink()
{
MetadataParsedURL	result	=this.yearOfBirthLink;
if(result == null)
{
result = new MetadataParsedURL();
this.yearOfBirthLink	=	 result;
}
return result;
}

/**
	Gets the value of the field yearOfBirthLink
**/ 

public ParsedURL getYearOfBirthLink(){
return yearOfBirthLink().getValue();
}

/**
	Sets the value of the field yearOfBirthLink
**/ 

public void setYearOfBirthLink( ParsedURL yearOfBirthLink )
{
this.yearOfBirthLink().setValue(yearOfBirthLink);
}

/**
	The heavy weight setter method for field yearOfBirthLink
**/ 

public void hwSetYearOfBirthLink( ParsedURL yearOfBirthLink )
{
this.yearOfBirthLink().setValue(yearOfBirthLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the yearOfBirthLink directly
**/ 

public void setYearOfBirthLinkMetadata(MetadataParsedURL yearOfBirthLink)
{	this.yearOfBirthLink = yearOfBirthLink;
}
/**
	Heavy Weight Direct setter method for yearOfBirthLink
**/ 

public void hwSetYearOfBirthLinkMetadata(MetadataParsedURL yearOfBirthLink)
{	 if(this.yearOfBirthLink!=null && this.yearOfBirthLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.yearOfBirthLink.termVector());
	 this.yearOfBirthLink = yearOfBirthLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for placeOfBirthLink
**/ 

public MetadataParsedURL	placeOfBirthLink()
{
MetadataParsedURL	result	=this.placeOfBirthLink;
if(result == null)
{
result = new MetadataParsedURL();
this.placeOfBirthLink	=	 result;
}
return result;
}

/**
	Gets the value of the field placeOfBirthLink
**/ 

public ParsedURL getPlaceOfBirthLink(){
return placeOfBirthLink().getValue();
}

/**
	Sets the value of the field placeOfBirthLink
**/ 

public void setPlaceOfBirthLink( ParsedURL placeOfBirthLink )
{
this.placeOfBirthLink().setValue(placeOfBirthLink);
}

/**
	The heavy weight setter method for field placeOfBirthLink
**/ 

public void hwSetPlaceOfBirthLink( ParsedURL placeOfBirthLink )
{
this.placeOfBirthLink().setValue(placeOfBirthLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the placeOfBirthLink directly
**/ 

public void setPlaceOfBirthLinkMetadata(MetadataParsedURL placeOfBirthLink)
{	this.placeOfBirthLink = placeOfBirthLink;
}
/**
	Heavy Weight Direct setter method for placeOfBirthLink
**/ 

public void hwSetPlaceOfBirthLinkMetadata(MetadataParsedURL placeOfBirthLink)
{	 if(this.placeOfBirthLink!=null && this.placeOfBirthLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.placeOfBirthLink.termVector());
	 this.placeOfBirthLink = placeOfBirthLink;
	rebuildCompositeTermVector();
}
}

