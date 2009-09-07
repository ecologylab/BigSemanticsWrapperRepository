package ecologylab.semantics.generated.library;

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
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;

@xml_inherit
@xml_tag("search_result")
public class SearchResult extends Metadata{


/**
	Constructor
**/ 

public SearchResult()
{
 super();
}

/**
	Constructor
**/ 

public SearchResult(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	The heading of search result
**/ 

	@xml_tag("heading") @xml_nested private MetadataString	heading;

/**
	Lazy Evaluation for heading
**/ 

public MetadataString	heading()
{
MetadataString	result	=this.heading;
if(result == null)
{
result = new MetadataString();
this.heading	=	 result;
}
return result;
}

/**
	Gets the value of the field heading
**/ 

public String getHeading(){
return heading().getValue();
}

/**
	Sets the value of the field heading
**/ 

public void setHeading( String heading )
{
this.heading().setValue(heading);
}

/**
	The heavy weight setter method for field heading
**/ 

public void hwSetHeading( String heading )
{
this.heading().setValue(heading);
rebuildCompositeTermVector();
 }
/**
	 Sets the heading directly
**/ 

public void setHeadingMetadata(MetadataString heading)
{	this.heading = heading;
}
/**
	Heavy Weight Direct setter method for heading
**/ 

public void hwSetHeadingMetadata(MetadataString heading)
{	 if(this.heading!=null && this.heading.getValue()!=null && hasTermVector())
		 termVector().remove(this.heading.termVector());
	 this.heading = heading;
	rebuildCompositeTermVector();
}
/**
	The snippet of search result
**/ 

	@xml_tag("snippet") @xml_nested private MetadataString	snippet;

/**
	Lazy Evaluation for snippet
**/ 

public MetadataString	snippet()
{
MetadataString	result	=this.snippet;
if(result == null)
{
result = new MetadataString();
this.snippet	=	 result;
}
return result;
}

/**
	Gets the value of the field snippet
**/ 

public String getSnippet(){
return snippet().getValue();
}

/**
	Sets the value of the field snippet
**/ 

public void setSnippet( String snippet )
{
this.snippet().setValue(snippet);
}

/**
	The heavy weight setter method for field snippet
**/ 

public void hwSetSnippet( String snippet )
{
this.snippet().setValue(snippet);
rebuildCompositeTermVector();
 }
/**
	 Sets the snippet directly
**/ 

public void setSnippetMetadata(MetadataString snippet)
{	this.snippet = snippet;
}
/**
	Heavy Weight Direct setter method for snippet
**/ 

public void hwSetSnippetMetadata(MetadataString snippet)
{	 if(this.snippet!=null && this.snippet.getValue()!=null && hasTermVector())
		 termVector().remove(this.snippet.termVector());
	 this.snippet = snippet;
	rebuildCompositeTermVector();
}
/**
	The link of the search result
**/ 

	@xml_tag("link") @xml_nested private MetadataParsedURL	link;

/**
	Lazy Evaluation for link
**/ 

public MetadataParsedURL	link()
{
MetadataParsedURL	result	=this.link;
if(result == null)
{
result = new MetadataParsedURL();
this.link	=	 result;
}
return result;
}

/**
	Gets the value of the field link
**/ 

public ParsedURL getLink(){
return link().getValue();
}

/**
	Sets the value of the field link
**/ 

public void setLink( ParsedURL link )
{
this.link().setValue(link);
}

/**
	The heavy weight setter method for field link
**/ 

public void hwSetLink( ParsedURL link )
{
this.link().setValue(link);
rebuildCompositeTermVector();
 }
/**
	 Sets the link directly
**/ 

public void setLinkMetadata(MetadataParsedURL link)
{	this.link = link;
}
/**
	Heavy Weight Direct setter method for link
**/ 

public void hwSetLinkMetadata(MetadataParsedURL link)
{	 if(this.link!=null && this.link.getValue()!=null && hasTermVector())
		 termVector().remove(this.link.termVector());
	 this.link = link;
	rebuildCompositeTermVector();
}}
