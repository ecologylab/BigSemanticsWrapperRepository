package ecologylab.semantics.generated.library;

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
import ecologylab.semantics.metadata.DefaultMetadataTranslationSpace;
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
	Artwork class
**/ 

@xml_inherit

public class  Artwork
extends  Document
{

	@xml_collection("artists") private ArrayList<Author>	artists;

/**
	Abstract of the work.
**/ 

	@xml_tag("abstract") @xml_nested private MetadataString	abstractField;

/**
	Medium on which the work is done.
**/ 

	 @xml_nested private MetadataString	medium;

/**
	Year the work was created.
**/ 

	 @xml_nested private MetadataString	year;

/**
	Website of the work or group responsible.
**/ 

	 @xml_nested private MetadataParsedURL	website;

/**
	Constructor
**/ 

public Artwork()
{
 super();
}

/**
	Constructor
**/ 

public Artwork(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for artists
**/ 

public  ArrayList<Author>	artists()
{
 ArrayList<Author>	result	=this.artists;
if(result == null)
{
result = new  ArrayList<Author>();
this.artists	=	 result;
}
return result;
}

/**
	Set the value of field artists
**/ 

public void setArtists(  ArrayList<Author> artists )
{
this.artists = artists ;
}

/**
	Get the value of field artists
**/ 

public  ArrayList<Author> getArtists(){
return this.artists;
}

/**
	Lazy Evaluation for abstractField
**/ 

public MetadataString	abstractField()
{
MetadataString	result	=this.abstractField;
if(result == null)
{
result = new MetadataString();
this.abstractField	=	 result;
}
return result;
}

/**
	Gets the value of the field abstractField
**/ 

public String getAbstractField(){
return abstractField().getValue();
}

/**
	Sets the value of the field abstractField
**/ 

public void setAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
}

/**
	The heavy weight setter method for field abstractField
**/ 

public void hwSetAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
rebuildCompositeTermVector();
 }
/**
	 Sets the abstractField directly
**/ 

public void setAbstractFieldMetadata(MetadataString abstractField)
{	this.abstractField = abstractField;
}
/**
	Heavy Weight Direct setter method for abstractField
**/ 

public void hwSetAbstractFieldMetadata(MetadataString abstractField)
{	 if(this.abstractField!=null && this.abstractField.getValue()!=null && hasTermVector())
		 termVector().remove(this.abstractField.termVector());
	 this.abstractField = abstractField;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for medium
**/ 

public MetadataString	medium()
{
MetadataString	result	=this.medium;
if(result == null)
{
result = new MetadataString();
this.medium	=	 result;
}
return result;
}

/**
	Gets the value of the field medium
**/ 

public String getMedium(){
return medium().getValue();
}

/**
	Sets the value of the field medium
**/ 

public void setMedium( String medium )
{
this.medium().setValue(medium);
}

/**
	The heavy weight setter method for field medium
**/ 

public void hwSetMedium( String medium )
{
this.medium().setValue(medium);
rebuildCompositeTermVector();
 }
/**
	 Sets the medium directly
**/ 

public void setMediumMetadata(MetadataString medium)
{	this.medium = medium;
}
/**
	Heavy Weight Direct setter method for medium
**/ 

public void hwSetMediumMetadata(MetadataString medium)
{	 if(this.medium!=null && this.medium.getValue()!=null && hasTermVector())
		 termVector().remove(this.medium.termVector());
	 this.medium = medium;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for year
**/ 

public MetadataString	year()
{
MetadataString	result	=this.year;
if(result == null)
{
result = new MetadataString();
this.year	=	 result;
}
return result;
}

/**
	Gets the value of the field year
**/ 

public String getYear(){
return year().getValue();
}

/**
	Sets the value of the field year
**/ 

public void setYear( String year )
{
this.year().setValue(year);
}

/**
	The heavy weight setter method for field year
**/ 

public void hwSetYear( String year )
{
this.year().setValue(year);
rebuildCompositeTermVector();
 }
/**
	 Sets the year directly
**/ 

public void setYearMetadata(MetadataString year)
{	this.year = year;
}
/**
	Heavy Weight Direct setter method for year
**/ 

public void hwSetYearMetadata(MetadataString year)
{	 if(this.year!=null && this.year.getValue()!=null && hasTermVector())
		 termVector().remove(this.year.termVector());
	 this.year = year;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for website
**/ 

public MetadataParsedURL	website()
{
MetadataParsedURL	result	=this.website;
if(result == null)
{
result = new MetadataParsedURL();
this.website	=	 result;
}
return result;
}

/**
	Gets the value of the field website
**/ 

public ParsedURL getWebsite(){
return website().getValue();
}

/**
	Sets the value of the field website
**/ 

public void setWebsite( ParsedURL website )
{
this.website().setValue(website);
}

/**
	The heavy weight setter method for field website
**/ 

public void hwSetWebsite( ParsedURL website )
{
this.website().setValue(website);
rebuildCompositeTermVector();
 }
/**
	 Sets the website directly
**/ 

public void setWebsiteMetadata(MetadataParsedURL website)
{	this.website = website;
}
/**
	Heavy Weight Direct setter method for website
**/ 

public void hwSetWebsiteMetadata(MetadataParsedURL website)
{	 if(this.website!=null && this.website.getValue()!=null && hasTermVector())
		 termVector().remove(this.website.termVector());
	 this.website = website;
	rebuildCompositeTermVector();
}
}

