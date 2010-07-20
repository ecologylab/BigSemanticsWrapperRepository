package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
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
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class GoogleImageThumbnail extends Metadata{


/**
	thumbnail url
**/ 

	 @simpl_scalar private MetadataParsedURL	thumbnailSrc;

/**
	thumb caption
**/ 

	 @simpl_scalar private MetadataString	thumbnailCaption;

/**
	Constructor
**/ 

public GoogleImageThumbnail()
{
 super();
}

/**
	Constructor
**/ 

public GoogleImageThumbnail(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for thumbnailSrc
**/ 

public MetadataParsedURL	thumbnailSrc()
{
MetadataParsedURL	result	=this.thumbnailSrc;
if(result == null)
{
result = new MetadataParsedURL();
this.thumbnailSrc	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbnailSrc
**/ 

public ParsedURL getThumbnailSrc(){
return thumbnailSrc().getValue();
}

/**
	Sets the value of the field thumbnailSrc
**/ 

public void setThumbnailSrc( ParsedURL thumbnailSrc )
{
this.thumbnailSrc().setValue(thumbnailSrc);
}

/**
	The heavy weight setter method for field thumbnailSrc
**/ 

public void hwSetThumbnailSrc( ParsedURL thumbnailSrc )
{
this.thumbnailSrc().setValue(thumbnailSrc);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbnailSrc directly
**/ 

public void setThumbnailSrcMetadata(MetadataParsedURL thumbnailSrc)
{	this.thumbnailSrc = thumbnailSrc;
}
/**
	Heavy Weight Direct setter method for thumbnailSrc
**/ 

public void hwSetThumbnailSrcMetadata(MetadataParsedURL thumbnailSrc)
{	 if(this.thumbnailSrc!=null && this.thumbnailSrc.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbnailSrc.termVector());
	 this.thumbnailSrc = thumbnailSrc;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for thumbnailCaption
**/ 

public MetadataString	thumbnailCaption()
{
MetadataString	result	=this.thumbnailCaption;
if(result == null)
{
result = new MetadataString();
this.thumbnailCaption	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbnailCaption
**/ 

public String getThumbnailCaption(){
return thumbnailCaption().getValue();
}

/**
	Sets the value of the field thumbnailCaption
**/ 

public void setThumbnailCaption( String thumbnailCaption )
{
this.thumbnailCaption().setValue(thumbnailCaption);
}

/**
	The heavy weight setter method for field thumbnailCaption
**/ 

public void hwSetThumbnailCaption( String thumbnailCaption )
{
this.thumbnailCaption().setValue(thumbnailCaption);
rebuildCompositeTermVector();
 }
/**
	 Sets the thumbnailCaption directly
**/ 

public void setThumbnailCaptionMetadata(MetadataString thumbnailCaption)
{	this.thumbnailCaption = thumbnailCaption;
}
/**
	Heavy Weight Direct setter method for thumbnailCaption
**/ 

public void hwSetThumbnailCaptionMetadata(MetadataString thumbnailCaption)
{	 if(this.thumbnailCaption!=null && this.thumbnailCaption.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbnailCaption.termVector());
	 this.thumbnailCaption = thumbnailCaption;
	rebuildCompositeTermVector();
}}
