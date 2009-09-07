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
@xml_tag("category")
public class Category extends Metadata{


/**
	Constructor
**/ 

public Category()
{
 super();
}

/**
	Constructor
**/ 

public Category(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("name") @xml_nested private MetadataString	name;

/**
	Lazy Evaluation for name
**/ 

public MetadataString	name()
{
MetadataString	result	=this.name;
if(result == null)
{
result = new MetadataString();
this.name	=	 result;
}
return result;
}

/**
	Gets the value of the field name
**/ 

public String getName(){
return name().getValue();
}

/**
	Sets the value of the field name
**/ 

public void setName( String name )
{
this.name().setValue(name);
}

/**
	The heavy weight setter method for field name
**/ 

public void hwSetName( String name )
{
this.name().setValue(name);
rebuildCompositeTermVector();
 }
/**
	 Sets the name directly
**/ 

public void setNameMetadata(MetadataString name)
{	this.name = name;
}
/**
	Heavy Weight Direct setter method for name
**/ 

public void hwSetNameMetadata(MetadataString name)
{	 if(this.name!=null && this.name.getValue()!=null && hasTermVector())
		 termVector().remove(this.name.termVector());
	 this.name = name;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("cLlink") @xml_nested private MetadataParsedURL	cLlink;

/**
	Lazy Evaluation for cLlink
**/ 

public MetadataParsedURL	cLlink()
{
MetadataParsedURL	result	=this.cLlink;
if(result == null)
{
result = new MetadataParsedURL();
this.cLlink	=	 result;
}
return result;
}

/**
	Gets the value of the field cLlink
**/ 

public ParsedURL getCLlink(){
return cLlink().getValue();
}

/**
	Sets the value of the field cLlink
**/ 

public void setCLlink( ParsedURL cLlink )
{
this.cLlink().setValue(cLlink);
}

/**
	The heavy weight setter method for field cLlink
**/ 

public void hwSetCLlink( ParsedURL cLlink )
{
this.cLlink().setValue(cLlink);
rebuildCompositeTermVector();
 }
/**
	 Sets the cLlink directly
**/ 

public void setCLlinkMetadata(MetadataParsedURL cLlink)
{	this.cLlink = cLlink;
}
/**
	Heavy Weight Direct setter method for cLlink
**/ 

public void hwSetCLlinkMetadata(MetadataParsedURL cLlink)
{	 if(this.cLlink!=null && this.cLlink.getValue()!=null && hasTermVector())
		 termVector().remove(this.cLlink.termVector());
	 this.cLlink = cLlink;
	rebuildCompositeTermVector();
}}
