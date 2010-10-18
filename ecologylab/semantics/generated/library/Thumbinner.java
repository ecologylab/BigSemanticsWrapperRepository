package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class Thumbinner extends Metadata{

	@simpl_scalar private MetadataString	thumbImgCaption;
	@simpl_scalar private MetadataParsedURL	thumbImgSrc;

/**
	Constructor
**/ 

public Thumbinner()
{
 super();
}

/**
	Constructor
**/ 

public Thumbinner(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for thumbImgCaption
**/ 

public MetadataString	thumbImgCaption()
{
MetadataString	result	=this.thumbImgCaption;
if(result == null)
{
result = new MetadataString();
this.thumbImgCaption	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbImgCaption
**/ 

public String getThumbImgCaption()
{
	return thumbImgCaption().getValue();
}

/**
	Sets the value of the field thumbImgCaption
**/ 

public void setThumbImgCaption( String thumbImgCaption )
{
	this.thumbImgCaption().setValue(thumbImgCaption);
}

/**
	The heavy weight setter method for field thumbImgCaption
**/ 

public void hwSetThumbImgCaption( String thumbImgCaption )
{
	this.thumbImgCaption().setValue(thumbImgCaption);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: thumbImgCaption
**/ 

public boolean isNullThumbImgCaption()
{
	return thumbImgCaption == null || thumbImgCaption.getValue() == null;
}

/**
	 Sets the thumbImgCaption directly
**/ 

public void setThumbImgCaptionMetadata(MetadataString thumbImgCaption)
{	this.thumbImgCaption = thumbImgCaption;
}
/**
	Heavy Weight Direct setter method for thumbImgCaption
**/ 

public void hwSetThumbImgCaptionMetadata(MetadataString thumbImgCaption)
{	 if(this.thumbImgCaption!=null && this.thumbImgCaption.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbImgCaption.termVector());
	 this.thumbImgCaption = thumbImgCaption;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for thumbImgSrc
**/ 

public MetadataParsedURL	thumbImgSrc()
{
MetadataParsedURL	result	=this.thumbImgSrc;
if(result == null)
{
result = new MetadataParsedURL();
this.thumbImgSrc	=	 result;
}
return result;
}

/**
	Gets the value of the field thumbImgSrc
**/ 

public ParsedURL getThumbImgSrc()
{
	return thumbImgSrc().getValue();
}

/**
	Sets the value of the field thumbImgSrc
**/ 

public void setThumbImgSrc( ParsedURL thumbImgSrc )
{
	this.thumbImgSrc().setValue(thumbImgSrc);
}

/**
	The heavy weight setter method for field thumbImgSrc
**/ 

public void hwSetThumbImgSrc( ParsedURL thumbImgSrc )
{
	this.thumbImgSrc().setValue(thumbImgSrc);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: thumbImgSrc
**/ 

public boolean isNullThumbImgSrc()
{
	return thumbImgSrc == null || thumbImgSrc.getValue() == null;
}

/**
	 Sets the thumbImgSrc directly
**/ 

public void setThumbImgSrcMetadata(MetadataParsedURL thumbImgSrc)
{	this.thumbImgSrc = thumbImgSrc;
}
/**
	Heavy Weight Direct setter method for thumbImgSrc
**/ 

public void hwSetThumbImgSrcMetadata(MetadataParsedURL thumbImgSrc)
{	 if(this.thumbImgSrc!=null && this.thumbImgSrc.getValue()!=null && hasTermVector())
		 termVector().remove(this.thumbImgSrc.termVector());
	 this.thumbImgSrc = thumbImgSrc;
	rebuildCompositeTermVector();
}}
