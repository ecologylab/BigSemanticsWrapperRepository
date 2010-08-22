package ecologylab.semantics.generated.library.misc;

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

public class  DcDocument
extends  Document
{

	@simpl_scalar private MetadataString	subject;

/**
	Constructor
**/ 

public DcDocument()
{
 super();
}

/**
	Constructor
**/ 

public DcDocument(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

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

