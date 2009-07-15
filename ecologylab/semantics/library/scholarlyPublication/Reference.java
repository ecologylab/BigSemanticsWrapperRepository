package ecologylab.semantics.library.scholarlyPublication;

 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;

@xml_inherit
@xml_tag("reference")
public class Reference extends Metadata{


/**
	Constructor
**/ 

public Reference()
{
 super();
}

/**
	Constructor
**/ 

public Reference(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	
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
}
/**
	
**/ 

	@xml_tag("bib_tex") @xml_nested private MetadataString	bibTex;

/**
	Lazy Evaluation for bibTex
**/ 

public MetadataString	bibTex()
{
MetadataString	result	=this.bibTex;
if(result == null)
{
result = new MetadataString();
this.bibTex	=	 result;
}
return result;
}

/**
	Gets the value of the field bibTex
**/ 

public String getBibTex(){
return bibTex().getValue();
}

/**
	Sets the value of the field bibTex
**/ 

public void setBibTex( String bibTex )
{
this.bibTex().setValue(bibTex);
}

/**
	The heavy weight setter method for field bibTex
**/ 

public void hwSetBibTex( String bibTex )
{
this.bibTex().setValue(bibTex);
rebuildCompositeTermVector();
 }
/**
	 Sets the bibTex directly
**/ 

public void setBibTexMetadata(MetadataString bibTex)
{	this.bibTex = bibTex;
}
/**
	Heavy Weight Direct setter method for bibTex
**/ 

public void hwSetBibTexMetadata(MetadataString bibTex)
{	 if(this.bibTex!=null && this.bibTex.getValue()!=null && hasTermVector())
		 termVector().remove(this.bibTex.termVector());
	 this.bibTex = bibTex;
	rebuildCompositeTermVector();
}}
