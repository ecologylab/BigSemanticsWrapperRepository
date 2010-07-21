package ecologylab.semantics.generated.library.nsdl;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
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
@xml_tag("document")
public class NsdlDocument extends Metadata{


private  @simpl_composite Header	header;
private @xml_tag("fields") @simpl_composite Dc	nsdlDocument;
/**
	Constructor
**/ 

public NsdlDocument()
{
 super();
}

/**
	Constructor
**/ 

public NsdlDocument(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for header
**/ 

public Header	header()
{
Header	result	=this.header;
if(result == null)
{
result = new Header();
this.header	=	 result;
}
return result;
}

/**
	Set the value of field header
**/ 

public void setHeader( Header header )
{
this.header = header ;
}

/**
	Get the value of field header
**/ 

public Header getHeader(){
return this.header;
}

/**
	Lazy Evaluation for nsdlDocument
**/ 

public Dc	nsdlDocument()
{
Dc	result	=this.nsdlDocument;
if(result == null)
{
result = new Dc();
this.nsdlDocument	=	 result;
}
return result;
}

/**
	Set the value of field nsdlDocument
**/ 

public void setNsdlDocument( Dc nsdlDocument )
{
this.nsdlDocument = nsdlDocument ;
}

/**
	Get the value of field nsdlDocument
**/ 

public Dc getNsdlDocument(){
return this.nsdlDocument;
}
}
