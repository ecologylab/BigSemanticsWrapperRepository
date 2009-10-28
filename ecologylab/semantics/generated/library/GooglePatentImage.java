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


/**
	Google Patents Image Class
**/ 

@xml_inherit
@xml_tag("google_patent_image")
public class  GooglePatentImage
extends  Document
{


/**
	Constructor
**/ 

public GooglePatentImage()
{
 super();
}

/**
	Constructor
**/ 

public GooglePatentImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("patent_name") @xml_nested private MetadataString	patentName;

/**
	null
**/ 

	@xml_tag("inventor") @xml_nested private MetadataString	inventor;
	@xml_collection("pic_urls") private ArrayList<SearchResult>	picUrls;

/**
	Lazy Evaluation for patentName
**/ 

public MetadataString	patentName()
{
MetadataString	result	=this.patentName;
if(result == null)
{
result = new MetadataString();
this.patentName	=	 result;
}
return result;
}

/**
	Gets the value of the field patentName
**/ 

public String getPatentName(){
return patentName().getValue();
}

/**
	Sets the value of the field patentName
**/ 

public void setPatentName( String patentName )
{
this.patentName().setValue(patentName);
}

/**
	The heavy weight setter method for field patentName
**/ 

public void hwSetPatentName( String patentName )
{
this.patentName().setValue(patentName);
rebuildCompositeTermVector();
 }
/**
	 Sets the patentName directly
**/ 

public void setPatentNameMetadata(MetadataString patentName)
{	this.patentName = patentName;
}
/**
	Heavy Weight Direct setter method for patentName
**/ 

public void hwSetPatentNameMetadata(MetadataString patentName)
{	 if(this.patentName!=null && this.patentName.getValue()!=null && hasTermVector())
		 termVector().remove(this.patentName.termVector());
	 this.patentName = patentName;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for inventor
**/ 

public MetadataString	inventor()
{
MetadataString	result	=this.inventor;
if(result == null)
{
result = new MetadataString();
this.inventor	=	 result;
}
return result;
}

/**
	Gets the value of the field inventor
**/ 

public String getInventor(){
return inventor().getValue();
}

/**
	Sets the value of the field inventor
**/ 

public void setInventor( String inventor )
{
this.inventor().setValue(inventor);
}

/**
	The heavy weight setter method for field inventor
**/ 

public void hwSetInventor( String inventor )
{
this.inventor().setValue(inventor);
rebuildCompositeTermVector();
 }
/**
	 Sets the inventor directly
**/ 

public void setInventorMetadata(MetadataString inventor)
{	this.inventor = inventor;
}
/**
	Heavy Weight Direct setter method for inventor
**/ 

public void hwSetInventorMetadata(MetadataString inventor)
{	 if(this.inventor!=null && this.inventor.getValue()!=null && hasTermVector())
		 termVector().remove(this.inventor.termVector());
	 this.inventor = inventor;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for picUrls
**/ 

public  ArrayList<SearchResult>	picUrls()
{
 ArrayList<SearchResult>	result	=this.picUrls;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.picUrls	=	 result;
}
return result;
}

/**
	Set the value of field picUrls
**/ 

public void setPicUrls(  ArrayList<SearchResult> picUrls )
{
this.picUrls = picUrls ;
}

/**
	Get the value of field picUrls
**/ 

public  ArrayList<SearchResult> getPicUrls(){
return this.picUrls;
}

}

