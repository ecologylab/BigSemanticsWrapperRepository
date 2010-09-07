package ecologylab.semantics.generated.library.fastflip;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
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

public class  Thumbnail
extends  Metadata
{

	@simpl_scalar private MetadataParsedURL	pic;

/**
	Constructor
**/ 

public Thumbnail()
{
 super();
}

/**
	Constructor
**/ 

public Thumbnail(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for pic
**/ 

public MetadataParsedURL	pic()
{
MetadataParsedURL	result	=this.pic;
if(result == null)
{
result = new MetadataParsedURL();
this.pic	=	 result;
}
return result;
}

/**
	Gets the value of the field pic
**/ 

public ParsedURL getPic(){
return pic().getValue();
}

/**
	Sets the value of the field pic
**/ 

public void setPic( ParsedURL pic )
{
this.pic().setValue(pic);
}

/**
	The heavy weight setter method for field pic
**/ 

public void hwSetPic( ParsedURL pic )
{
this.pic().setValue(pic);
rebuildCompositeTermVector();
 }
/**
	 Sets the pic directly
**/ 

public void setPicMetadata(MetadataParsedURL pic)
{	this.pic = pic;
}
/**
	Heavy Weight Direct setter method for pic
**/ 

public void hwSetPicMetadata(MetadataParsedURL pic)
{	 if(this.pic!=null && this.pic.getValue()!=null && hasTermVector())
		 termVector().remove(this.pic.termVector());
	 this.pic = pic;
	rebuildCompositeTermVector();
}
}
