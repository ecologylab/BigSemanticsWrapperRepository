package ecologylab.semantics.generated.library;

import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;

@simpl_inherit

public class Paragraph extends Metadata{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	paragraphText;
	@simpl_collection("anchor") private ArrayList<Anchor>	anchors;

/**
	Constructor
**/ 

public Paragraph()
{
 super();
}

/**
	Constructor
**/ 

public Paragraph(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for paragraphText
**/ 

public MetadataString	paragraphText()
{
MetadataString	result	=this.paragraphText;
if(result == null)
{
result = new MetadataString();
this.paragraphText	=	 result;
}
return result;
}

/**
	Gets the value of the field paragraphText
**/ 

public String getParagraphText(){
return paragraphText().getValue();
}

/**
	Sets the value of the field paragraphText
**/ 

public void setParagraphText( String paragraphText )
{
this.paragraphText().setValue(paragraphText);
}

/**
	The heavy weight setter method for field paragraphText
**/ 

public void hwSetParagraphText( String paragraphText )
{
this.paragraphText().setValue(paragraphText);
rebuildCompositeTermVector();
 }
/**
	 Sets the paragraphText directly
**/ 

public void setParagraphTextMetadata(MetadataString paragraphText)
{	this.paragraphText = paragraphText;
}
/**
	Heavy Weight Direct setter method for paragraphText
**/ 

public void hwSetParagraphTextMetadata(MetadataString paragraphText)
{	 if(this.paragraphText!=null && this.paragraphText.getValue()!=null && hasTermVector())
		 termVector().remove(this.paragraphText.termVector());
	 this.paragraphText = paragraphText;
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
