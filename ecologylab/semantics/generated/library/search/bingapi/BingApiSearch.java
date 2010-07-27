package ecologylab.semantics.generated.library.search.bingapi;

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
import ecologylab.semantics.generated.library.search.bingapi.*;
import ecologylab.semantics.generated.library.slashdot.*;
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
@xml_tag("SearchResponse")
public class  BingApiSearch
extends  Document
{


private @xml_tag("web:Web") @simpl_composite @mm_name("web_section") WebSection	webSection;
private @xml_tag("mms:Image") @simpl_composite @mm_name("image_section") ImageSection	imageSection;
/**
	Constructor
**/ 

public BingApiSearch()
{
 super();
}

/**
	Constructor
**/ 

public BingApiSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for webSection
**/ 

public WebSection	webSection()
{
WebSection	result	=this.webSection;
if(result == null)
{
result = new WebSection();
this.webSection	=	 result;
}
return result;
}

/**
	Set the value of field webSection
**/ 

public void setWebSection( WebSection webSection )
{
this.webSection = webSection ;
}

/**
	Get the value of field webSection
**/ 

public WebSection getWebSection(){
return this.webSection;
}

/**
	Lazy Evaluation for imageSection
**/ 

public ImageSection	imageSection()
{
ImageSection	result	=this.imageSection;
if(result == null)
{
result = new ImageSection();
this.imageSection	=	 result;
}
return result;
}

/**
	Set the value of field imageSection
**/ 

public void setImageSection( ImageSection imageSection )
{
this.imageSection = imageSection ;
}

/**
	Get the value of field imageSection
**/ 

public ImageSection getImageSection(){
return this.imageSection;
}

}

