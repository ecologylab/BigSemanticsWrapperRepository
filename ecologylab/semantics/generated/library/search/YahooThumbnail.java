package ecologylab.semantics.generated.library.search;

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

public class  YahooThumbnail
extends  Metadata
{

	@xml_tag("Url")@simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	thumbUrl;
	@xml_tag("Width")@simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataInteger	width;
	@xml_tag("Height")@simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataInteger	height;

/**
	Constructor
**/ 

public YahooThumbnail()
{
 super();
}

/**
	Constructor
**/ 

public YahooThumbnail(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for thumbUrl
**/ 

public MetadataParsedURL	thumbUrl()
{
MetadataParsedURL	result	=this.thumbUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.thumbUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbUrl
**/ 

public ParsedURL getThumbUrl(){
return thumbUrl().getValue();
}

/**
	Sets the value of the field thumbUrl
**/ 

public void setThumbUrl( ParsedURL thumbUrl )
{
this.thumbUrl().setValue(thumbUrl);
}

/**
	The heavy weight setter method for field thumbUrl
**/ 

public void hwSetThumbUrl( ParsedURL thumbUrl )
{
this.thumbUrl().setValue(thumbUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbUrl directly
**/ 

public void setThumbUrlMetadata(MetadataParsedURL thumbUrl)
{	this.thumbUrl = thumbUrl;
}
/**
	Heavy Weight Direct setter method for thumbUrl
**/ 

public void hwSetThumbUrlMetadata(MetadataParsedURL thumbUrl)
{	 if(this.thumbUrl!=null && this.thumbUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbUrl.termVector());
	 this.thumbUrl = thumbUrl;
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
}

