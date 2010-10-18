package ecologylab.semantics.generated.library.nsdl;

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

public class Header extends Metadata{

	@xml_tag("resourceIdentifier")@simpl_scalar private MetadataParsedURL	resourceIdentifier;

/**
	Constructor
**/ 

public Header()
{
 super();
}

/**
	Constructor
**/ 

public Header(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for resourceIdentifier
**/ 

public MetadataParsedURL	resourceIdentifier()
{
MetadataParsedURL	result	=this.resourceIdentifier;
if(result == null)
{
result = new MetadataParsedURL();
this.resourceIdentifier	=	 result;
}
return result;
}

/**
	Gets the value of the field resourceIdentifier
**/ 

public ParsedURL getResourceIdentifier()
{
	return resourceIdentifier().getValue();
}

/**
	Sets the value of the field resourceIdentifier
**/ 

public void setResourceIdentifier( ParsedURL resourceIdentifier )
{
	this.resourceIdentifier().setValue(resourceIdentifier);
}

/**
	The heavy weight setter method for field resourceIdentifier
**/ 

public void hwSetResourceIdentifier( ParsedURL resourceIdentifier )
{
	this.resourceIdentifier().setValue(resourceIdentifier);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: resourceIdentifier
**/ 

public boolean isNullResourceIdentifier()
{
	return resourceIdentifier == null || resourceIdentifier.getValue() == null;
}

/**
	 Sets the resourceIdentifier directly
**/ 

public void setResourceIdentifierMetadata(MetadataParsedURL resourceIdentifier)
{	this.resourceIdentifier = resourceIdentifier;
}
/**
	Heavy Weight Direct setter method for resourceIdentifier
**/ 

public void hwSetResourceIdentifierMetadata(MetadataParsedURL resourceIdentifier)
{	 if(this.resourceIdentifier!=null && this.resourceIdentifier.getValue()!=null && hasTermVector())
		 termVector().remove(this.resourceIdentifier.termVector());
	 this.resourceIdentifier = resourceIdentifier;
	rebuildCompositeTermVector();
}}
