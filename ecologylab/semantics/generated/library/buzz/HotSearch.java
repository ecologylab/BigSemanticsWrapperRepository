package ecologylab.semantics.generated.library.buzz;

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
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class HotSearch extends Metadata{

	 @simpl_scalar private MetadataString	search;

/**
	Constructor
**/ 

public HotSearch()
{
 super();
}

/**
	Constructor
**/ 

public HotSearch(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for search
**/ 

public MetadataString	search()
{
MetadataString	result	=this.search;
if(result == null)
{
result = new MetadataString();
this.search	=	 result;
}
return result;
}

/**
	Gets the value of the field search
**/ 

public String getSearch(){
return search().getValue();
}

/**
	Sets the value of the field search
**/ 

public void setSearch( String search )
{
this.search().setValue(search);
}

/**
	The heavy weight setter method for field search
**/ 

public void hwSetSearch( String search )
{
this.search().setValue(search);
rebuildCompositeTermVector();
 }
/**
	 Sets the search directly
**/ 

public void setSearchMetadata(MetadataString search)
{	this.search = search;
}
/**
	Heavy Weight Direct setter method for search
**/ 

public void hwSetSearchMetadata(MetadataString search)
{	 if(this.search!=null && this.search.getValue()!=null && hasTermVector())
		 termVector().remove(this.search.termVector());
	 this.search = search;
	rebuildCompositeTermVector();
}}
