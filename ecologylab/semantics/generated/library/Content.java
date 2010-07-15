package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
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
@xml_tag("media:content")
public class Content extends Metadata{


/**
	null
**/ 

	 @simpl_scalar private MetadataParsedURL	url;

/**
	null
**/ 

	 @simpl_scalar private MetadataInteger	height;

/**
	null
**/ 

	 @simpl_scalar private MetadataInteger	width;

/**
	Constructor
**/ 

public Content()
{
 super();
}

/**
	Constructor
**/ 

public Content(MetaMetadata metaMetadata)
{
super(metaMetadata);
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
}
/**
	Lazy Evaluation for height
**/ 

public MetadataInteger	height()
{
MetadataInteger	result	=this.height;
if(result == null)
{
result = new MetadataInteger();
this.height	=	 result;
}
return result;
}

/**
	Gets the value of the field height
**/ 

public Integer getHeight(){
return height().getValue();
}

/**
	Sets the value of the field height
**/ 

public void setHeight( Integer height )
{
this.height().setValue(height);
}

/**
	The heavy weight setter method for field height
**/ 

public void hwSetHeight( Integer height )
{
this.height().setValue(height);
rebuildCompositeTermVector();
 }
/**
	 Sets the height directly
**/ 

public void setHeightMetadata(MetadataInteger height)
{	this.height = height;
}
/**
	Heavy Weight Direct setter method for height
**/ 

public void hwSetHeightMetadata(MetadataInteger height)
{	 if(this.height!=null && this.height.getValue()!=null && hasTermVector())
		 termVector().remove(this.height.termVector());
	 this.height = height;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for width
**/ 

public MetadataInteger	width()
{
MetadataInteger	result	=this.width;
if(result == null)
{
result = new MetadataInteger();
this.width	=	 result;
}
return result;
}

/**
	Gets the value of the field width
**/ 

public Integer getWidth(){
return width().getValue();
}

/**
	Sets the value of the field width
**/ 

public void setWidth( Integer width )
{
this.width().setValue(width);
}

/**
	The heavy weight setter method for field width
**/ 

public void hwSetWidth( Integer width )
{
this.width().setValue(width);
rebuildCompositeTermVector();
 }
/**
	 Sets the width directly
**/ 

public void setWidthMetadata(MetadataInteger width)
{	this.width = width;
}
/**
	Heavy Weight Direct setter method for width
**/ 

public void hwSetWidthMetadata(MetadataInteger width)
{	 if(this.width!=null && this.width.getValue()!=null && hasTermVector())
		 termVector().remove(this.width.termVector());
	 this.width = width;
	rebuildCompositeTermVector();
}}
