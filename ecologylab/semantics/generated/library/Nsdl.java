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
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.imdb.*;


/**
	The NSDL class
**/ 

@xml_inherit
@xml_tag("nsdl")
public class  Nsdl
extends  Document
{


/**
	Constructor
**/ 

public Nsdl()
{
 super();
}

/**
	Constructor
**/ 

public Nsdl(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
**/ 

	@xml_tag("subject") @xml_nested private MetadataString	subject;

/**
	Lazy Evaluation for subject
**/ 

public MetadataString	subject()
{
MetadataString	result	=this.subject;
if(result == null)
{
result = new MetadataString();
this.subject	=	 result;
}
return result;
}

/**
	Gets the value of the field subject
**/ 

public String getSubject(){
return subject().getValue();
}

/**
	Sets the value of the field subject
**/ 

public void setSubject( String subject )
{
this.subject().setValue(subject);
}

/**
	The heavy weight setter method for field subject
**/ 

public void hwSetSubject( String subject )
{
this.subject().setValue(subject);
rebuildCompositeTermVector();
 }
/**
	 Sets the subject directly
**/ 

public void setSubjectMetadata(MetadataString subject)
{	this.subject = subject;
}
/**
	Heavy Weight Direct setter method for subject
**/ 

public void hwSetSubjectMetadata(MetadataString subject)
{	 if(this.subject!=null && this.subject.getValue()!=null && hasTermVector())
		 termVector().remove(this.subject.termVector());
	 this.subject = subject;
	rebuildCompositeTermVector();
}
}

