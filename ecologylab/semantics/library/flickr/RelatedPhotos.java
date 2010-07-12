package ecologylab.semantics.library.flickr;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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


/**
	null
**/ 

@simpl_inherit

public class  RelatedPhotos
extends  Metadata
{


/**
	null
**/ 

	 @simpl_scalar private MetadataParsedURL	nearbyPhotosLink;

/**
	null
**/ 

	 @simpl_scalar private MetadataString	nearbyPhotos;

/**
	Constructor
**/ 

public RelatedPhotos()
{
 super();
}

/**
	Constructor
**/ 

public RelatedPhotos(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for nearbyPhotosLink
**/ 

public MetadataParsedURL	nearbyPhotosLink()
{
MetadataParsedURL	result	=this.nearbyPhotosLink;
if(result == null)
{
result = new MetadataParsedURL();
this.nearbyPhotosLink	=	 result;
}
return result;
}

/**
	Gets the value of the field nearbyPhotosLink
**/ 

public ParsedURL getNearbyPhotosLink(){
return nearbyPhotosLink().getValue();
}

/**
	Sets the value of the field nearbyPhotosLink
**/ 

public void setNearbyPhotosLink( ParsedURL nearbyPhotosLink )
{
this.nearbyPhotosLink().setValue(nearbyPhotosLink);
}

/**
	The heavy weight setter method for field nearbyPhotosLink
**/ 

public void hwSetNearbyPhotosLink( ParsedURL nearbyPhotosLink )
{
this.nearbyPhotosLink().setValue(nearbyPhotosLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the nearbyPhotosLink directly
**/ 

public void setNearbyPhotosLinkMetadata(MetadataParsedURL nearbyPhotosLink)
{	this.nearbyPhotosLink = nearbyPhotosLink;
}
/**
	Heavy Weight Direct setter method for nearbyPhotosLink
**/ 

public void hwSetNearbyPhotosLinkMetadata(MetadataParsedURL nearbyPhotosLink)
{	 if(this.nearbyPhotosLink!=null && this.nearbyPhotosLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.nearbyPhotosLink.termVector());
	 this.nearbyPhotosLink = nearbyPhotosLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for nearbyPhotos
**/ 

public MetadataString	nearbyPhotos()
{
MetadataString	result	=this.nearbyPhotos;
if(result == null)
{
result = new MetadataString();
this.nearbyPhotos	=	 result;
}
return result;
}

/**
	Gets the value of the field nearbyPhotos
**/ 

public String getNearbyPhotos(){
return nearbyPhotos().getValue();
}

/**
	Sets the value of the field nearbyPhotos
**/ 

public void setNearbyPhotos( String nearbyPhotos )
{
this.nearbyPhotos().setValue(nearbyPhotos);
}

/**
	The heavy weight setter method for field nearbyPhotos
**/ 

public void hwSetNearbyPhotos( String nearbyPhotos )
{
this.nearbyPhotos().setValue(nearbyPhotos);
rebuildCompositeTermVector();
 }
/**
	 Sets the nearbyPhotos directly
**/ 

public void setNearbyPhotosMetadata(MetadataString nearbyPhotos)
{	this.nearbyPhotos = nearbyPhotos;
}
/**
	Heavy Weight Direct setter method for nearbyPhotos
**/ 

public void hwSetNearbyPhotosMetadata(MetadataString nearbyPhotos)
{	 if(this.nearbyPhotos!=null && this.nearbyPhotos.getValue()!=null && hasTermVector())
		 termVector().remove(this.nearbyPhotos.termVector());
	 this.nearbyPhotos = nearbyPhotos;
	rebuildCompositeTermVector();
}
}

