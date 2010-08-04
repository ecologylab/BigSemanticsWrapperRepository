package ecologylab.semantics.generated.library.opml;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
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

public class Body extends Metadata{

	 @simpl_collection("outline") @simpl_nowrap @mm_name("outline") private ArrayList<Outline>	outline;

/**
	Constructor
**/ 

public Body()
{
 super();
}

/**
	Constructor
**/ 

public Body(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for outline
**/ 

public  ArrayList<Outline>	outline()
{
 ArrayList<Outline>	result	=this.outline;
if(result == null)
{
result = new  ArrayList<Outline>();
this.outline	=	 result;
}
return result;
}

/**
	Set the value of field outline
**/ 

public void setOutline(  ArrayList<Outline> outline )
{
this.outline = outline ;
}

/**
	Get the value of field outline
**/ 

public  ArrayList<Outline> getOutline(){
return this.outline;
}
}