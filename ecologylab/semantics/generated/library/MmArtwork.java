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
	ACM Multimedia Interactive Artwork class
**/ 

@xml_inherit

public class  MmArtwork
extends  Artwork
{


/**
	Link the ACM Portal page.
**/ 

	 @xml_nested private MetadataParsedURL	extendedAbstract;

/**
	Constructor
**/ 

public MmArtwork()
{
 super();
}

/**
	Constructor
**/ 

public MmArtwork(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for extendedAbstract
**/ 

public MetadataParsedURL	extendedAbstract()
{
MetadataParsedURL	result	=this.extendedAbstract;
if(result == null)
{
result = new MetadataParsedURL();
this.extendedAbstract	=	 result;
}
return result;
}

/**
	Gets the value of the field extendedAbstract
**/ 

public ParsedURL getExtendedAbstract(){
return extendedAbstract().getValue();
}

/**
	Sets the value of the field extendedAbstract
**/ 

public void setExtendedAbstract( ParsedURL extendedAbstract )
{
this.extendedAbstract().setValue(extendedAbstract);
}

/**
	The heavy weight setter method for field extendedAbstract
**/ 

public void hwSetExtendedAbstract( ParsedURL extendedAbstract )
{
this.extendedAbstract().setValue(extendedAbstract);
rebuildCompositeTermVector();
 }
/**
	 Sets the extendedAbstract directly
**/ 

public void setExtendedAbstractMetadata(MetadataParsedURL extendedAbstract)
{	this.extendedAbstract = extendedAbstract;
}
/**
	Heavy Weight Direct setter method for extendedAbstract
**/ 

public void hwSetExtendedAbstractMetadata(MetadataParsedURL extendedAbstract)
{	 if(this.extendedAbstract!=null && this.extendedAbstract.getValue()!=null && hasTermVector())
		 termVector().remove(this.extendedAbstract.termVector());
	 this.extendedAbstract = extendedAbstract;
	rebuildCompositeTermVector();
}
}

