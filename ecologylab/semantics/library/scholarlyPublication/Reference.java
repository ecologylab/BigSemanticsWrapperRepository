package ecologylab.semantics.library.scholarlyPublication;

 import ecologylab.semantics.library.scalar.*; 
import ecologylab.semantics.metadata.*;
  import java.util.*;
 import ecologylab.semantics.metametadata.MetaMetadata;
  import ecologylab.net.ParsedURL;
 import ecologylab.generic.HashMapArrayList;
 import ecologylab.semantics.generated.library.*;

public class Reference extends Metadata{

/**
	Constructor
**/ 

public Reference()
{
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

MetadataParsedURL	link()
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
 }/**
	
**/ 

	@xml_tag("bib_tex") @xml_nested private MetadataString	bibTex;
/**
	Lazy Evaluation for bibTex
**/ 

MetadataString	bibTex()
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
 }}
