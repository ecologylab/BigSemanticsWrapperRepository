package ecologylab.semantics.generated.library.slashdot;

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

public class  SlashdotArticle
extends  Document
{

	@simpl_scalar private MetadataString	poster;
	@simpl_scalar private MetadataParsedURL	posterUrl;
	@simpl_scalar private MetadataString	description;
	 @simpl_collection("anchor") @xml_tag("anchors") @mm_name("anchors") private ArrayList<Anchor>	anchors;

/**
	Constructor
**/ 

public SlashdotArticle()
{
 super();
}

/**
	Constructor
**/ 

public SlashdotArticle(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for poster
**/ 

public MetadataString	poster()
{
MetadataString	result	=this.poster;
if(result == null)
{
result = new MetadataString();
this.poster	=	 result;
}
return result;
}

/**
	Gets the value of the field poster
**/ 

public String getPoster(){
return poster().getValue();
}

/**
	Sets the value of the field poster
**/ 

public void setPoster( String poster )
{
this.poster().setValue(poster);
}

/**
	The heavy weight setter method for field poster
**/ 

public void hwSetPoster( String poster )
{
this.poster().setValue(poster);
rebuildCompositeTermVector();
 }
/**
	 Sets the poster directly
**/ 

public void setPosterMetadata(MetadataString poster)
{	this.poster = poster;
}
/**
	Heavy Weight Direct setter method for poster
**/ 

public void hwSetPosterMetadata(MetadataString poster)
{	 if(this.poster!=null && this.poster.getValue()!=null && hasTermVector())
		 termVector().remove(this.poster.termVector());
	 this.poster = poster;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for posterUrl
**/ 

public MetadataParsedURL	posterUrl()
{
MetadataParsedURL	result	=this.posterUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.posterUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field posterUrl
**/ 

public ParsedURL getPosterUrl(){
return posterUrl().getValue();
}

/**
	Sets the value of the field posterUrl
**/ 

public void setPosterUrl( ParsedURL posterUrl )
{
this.posterUrl().setValue(posterUrl);
}

/**
	The heavy weight setter method for field posterUrl
**/ 

public void hwSetPosterUrl( ParsedURL posterUrl )
{
this.posterUrl().setValue(posterUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the posterUrl directly
**/ 

public void setPosterUrlMetadata(MetadataParsedURL posterUrl)
{	this.posterUrl = posterUrl;
}
/**
	Heavy Weight Direct setter method for posterUrl
**/ 

public void hwSetPosterUrlMetadata(MetadataParsedURL posterUrl)
{	 if(this.posterUrl!=null && this.posterUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.posterUrl.termVector());
	 this.posterUrl = posterUrl;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for description
**/ 

public MetadataString	description()
{
MetadataString	result	=this.description;
if(result == null)
{
result = new MetadataString();
this.description	=	 result;
}
return result;
}

/**
	Gets the value of the field description
**/ 

public String getDescription(){
return description().getValue();
}

/**
	Sets the value of the field description
**/ 

public void setDescription( String description )
{
this.description().setValue(description);
}

/**
	The heavy weight setter method for field description
**/ 

public void hwSetDescription( String description )
{
this.description().setValue(description);
rebuildCompositeTermVector();
 }
/**
	 Sets the description directly
**/ 

public void setDescriptionMetadata(MetadataString description)
{	this.description = description;
}
/**
	Heavy Weight Direct setter method for description
**/ 

public void hwSetDescriptionMetadata(MetadataString description)
{	 if(this.description!=null && this.description.getValue()!=null && hasTermVector())
		 termVector().remove(this.description.termVector());
	 this.description = description;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for anchors
**/ 

public  ArrayList<Anchor>	anchors()
{
 ArrayList<Anchor>	result	=this.anchors;
if(result == null)
{
result = new  ArrayList<Anchor>();
this.anchors	=	 result;
}
return result;
}

/**
	Set the value of field anchors
**/ 

public void setAnchors(  ArrayList<Anchor> anchors )
{
this.anchors = anchors ;
}

/**
	Get the value of field anchors
**/ 

public  ArrayList<Anchor> getAnchors(){
return this.anchors;
}

}

