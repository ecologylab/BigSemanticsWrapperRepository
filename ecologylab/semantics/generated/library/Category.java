package ecologylab.semantics.generated.library;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;

@simpl_inherit

public class Category extends Metadata{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	name;

/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataParsedURL	catLink;

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
	Lazy Evaluation for catLink
**/ 

public MetadataParsedURL	catLink()
{
MetadataParsedURL	result	=this.catLink;
if(result == null)
{
result = new MetadataParsedURL();
this.catLink	=	 result;
}
return result;
}

/**
	Gets the value of the field catLink
**/ 

public ParsedURL getCatLink(){
return catLink().getValue();
}

/**
	Sets the value of the field catLink
**/ 

public void setCatLink( ParsedURL catLink )
{
this.catLink().setValue(catLink);
}

/**
	The heavy weight setter method for field catLink
**/ 

public void hwSetCatLink( ParsedURL catLink )
{
this.catLink().setValue(catLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the catLink directly
**/ 

public void setCatLinkMetadata(MetadataParsedURL catLink)
{	this.catLink = catLink;
}
/**
	Heavy Weight Direct setter method for catLink
**/ 

public void hwSetCatLinkMetadata(MetadataParsedURL catLink)
{	 if(this.catLink!=null && this.catLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.catLink.termVector());
	 this.catLink = catLink;
	rebuildCompositeTermVector();
}}
