package ecologylab.semantics.generated.library.uva;

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

public class  KeywordSet
extends  Metadata
{

	@simpl_scalar private MetadataString	type;
	 @simpl_collection("String") @xml_tag("keywords") @mm_name("keywords") private ArrayList<String>	keywords;

/**
	Constructor
**/ 

public KeywordSet()
{
 super();
}

/**
	Constructor
**/ 

public KeywordSet(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for type
**/ 

public MetadataString	type()
{
MetadataString	result	=this.type;
if(result == null)
{
result = new MetadataString();
this.type	=	 result;
}
return result;
}

/**
	Gets the value of the field type
**/ 

public String getType()
{
	return type().getValue();
}

/**
	Sets the value of the field type
**/ 

public void setType( String type )
{
	this.type().setValue(type);
}

/**
	The heavy weight setter method for field type
**/ 

public void hwSetType( String type )
{
	this.type().setValue(type);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: type
**/ 

public boolean isNullType()
{
	return type == null || type.getValue() == null;
}

/**
	 Sets the type directly
**/ 

public void setTypeMetadata(MetadataString type)
{	this.type = type;
}
/**
	Heavy Weight Direct setter method for type
**/ 

public void hwSetTypeMetadata(MetadataString type)
{	 if(this.type!=null && this.type.getValue()!=null && hasTermVector())
		 termVector().remove(this.type.termVector());
	 this.type = type;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for keywords
**/ 

public  ArrayList<String>	keywords()
{
 ArrayList<String>	result	=this.keywords;
if(result == null)
{
result = new  ArrayList<String>();
this.keywords	=	 result;
}
return result;
}

/**
	Set the value of field keywords
**/ 

public void setKeywords(  ArrayList<String> keywords )
{
this.keywords = keywords ;
}

/**
	Get the value of field keywords
**/ 

public  ArrayList<String> getKeywords(){
return this.keywords;
}

}

