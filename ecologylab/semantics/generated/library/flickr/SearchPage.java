package ecologylab.semantics.generated.library.flickr;

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

public class  SearchPage
extends  Metadata
{

	@simpl_scalar private MetadataParsedURL	linkPage;

/**
	Constructor
**/ 

public SearchPage()
{
 super();
}

/**
	Constructor
**/ 

public SearchPage(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for linkPage
**/ 

public MetadataParsedURL	linkPage()
{
MetadataParsedURL	result	=this.linkPage;
if(result == null)
{
result = new MetadataParsedURL();
this.linkPage	=	 result;
}
return result;
}

/**
	Gets the value of the field linkPage
**/ 

public ParsedURL getLinkPage(){
return linkPage().getValue();
}

/**
	Sets the value of the field linkPage
**/ 

public void setLinkPage( ParsedURL linkPage )
{
this.linkPage().setValue(linkPage);
}

/**
	The heavy weight setter method for field linkPage
**/ 

public void hwSetLinkPage( ParsedURL linkPage )
{
this.linkPage().setValue(linkPage);
rebuildCompositeTermVector();
 }
/**
	 Sets the linkPage directly
**/ 

public void setLinkPageMetadata(MetadataParsedURL linkPage)
{	this.linkPage = linkPage;
}
/**
	Heavy Weight Direct setter method for linkPage
**/ 

public void hwSetLinkPageMetadata(MetadataParsedURL linkPage)
{	 if(this.linkPage!=null && this.linkPage.getValue()!=null && hasTermVector())
		 termVector().remove(this.linkPage.termVector());
	 this.linkPage = linkPage;
	rebuildCompositeTermVector();
}
}

