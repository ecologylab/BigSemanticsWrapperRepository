package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;


/**
	The Text Class
**/ 

@simpl_inherit

public class  Text
extends  Media
{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	text;

/**
	Constructor
**/ 

public Text()
{
 super();
}

/**
	Constructor
**/ 

public Text(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for text
**/ 

public MetadataString	text()
{
MetadataString	result	=this.text;
if(result == null)
{
result = new MetadataString();
this.text	=	 result;
}
return result;
}

/**
	Gets the value of the field text
**/ 

public String getText(){
return text().getValue();
}

/**
	Sets the value of the field text
**/ 

public void setText( String text )
{
this.text().setValue(text);
}

/**
	The heavy weight setter method for field text
**/ 

public void hwSetText( String text )
{
this.text().setValue(text);
rebuildCompositeTermVector();
 }
/**
	 Sets the text directly
**/ 

public void setTextMetadata(MetadataString text)
{	this.text = text;
}
/**
	Heavy Weight Direct setter method for text
**/ 

public void hwSetTextMetadata(MetadataString text)
{	 if(this.text!=null && this.text.getValue()!=null && hasTermVector())
		 termVector().remove(this.text.termVector());
	 this.text = text;
	rebuildCompositeTermVector();
}
}

