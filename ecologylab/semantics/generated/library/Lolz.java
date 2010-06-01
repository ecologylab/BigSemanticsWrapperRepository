package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;


/**
	The LOLZ class
**/ 

@xml_inherit

public class  Lolz
extends  Document
{


/**
	null
**/ 

	 @xml_leaf private MetadataString	caption;

/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	picture;

/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	mightLike;

/**
	Constructor
**/ 

public Lolz()
{
 super();
}

/**
	Constructor
**/ 

public Lolz(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for caption
**/ 

public MetadataString	caption()
{
MetadataString	result	=this.caption;
if(result == null)
{
result = new MetadataString();
this.caption	=	 result;
}
return result;
}

/**
	Gets the value of the field caption
**/ 

public String getCaption(){
return caption().getValue();
}

/**
	Sets the value of the field caption
**/ 

public void setCaption( String caption )
{
this.caption().setValue(caption);
}

/**
	The heavy weight setter method for field caption
**/ 

public void hwSetCaption( String caption )
{
this.caption().setValue(caption);
rebuildCompositeTermVector();
 }
/**
	 Sets the caption directly
**/ 

public void setCaptionMetadata(MetadataString caption)
{	this.caption = caption;
}
/**
	Heavy Weight Direct setter method for caption
**/ 

public void hwSetCaptionMetadata(MetadataString caption)
{	 if(this.caption!=null && this.caption.getValue()!=null && hasTermVector())
		 termVector().remove(this.caption.termVector());
	 this.caption = caption;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for picture
**/ 

public MetadataParsedURL	picture()
{
MetadataParsedURL	result	=this.picture;
if(result == null)
{
result = new MetadataParsedURL();
this.picture	=	 result;
}
return result;
}

/**
	Gets the value of the field picture
**/ 

public ParsedURL getPicture(){
return picture().getValue();
}

/**
	Sets the value of the field picture
**/ 

public void setPicture( ParsedURL picture )
{
this.picture().setValue(picture);
}

/**
	The heavy weight setter method for field picture
**/ 

public void hwSetPicture( ParsedURL picture )
{
this.picture().setValue(picture);
rebuildCompositeTermVector();
 }
/**
	 Sets the picture directly
**/ 

public void setPictureMetadata(MetadataParsedURL picture)
{	this.picture = picture;
}
/**
	Heavy Weight Direct setter method for picture
**/ 

public void hwSetPictureMetadata(MetadataParsedURL picture)
{	 if(this.picture!=null && this.picture.getValue()!=null && hasTermVector())
		 termVector().remove(this.picture.termVector());
	 this.picture = picture;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for mightLike
**/ 

public MetadataParsedURL	mightLike()
{
MetadataParsedURL	result	=this.mightLike;
if(result == null)
{
result = new MetadataParsedURL();
this.mightLike	=	 result;
}
return result;
}

/**
	Gets the value of the field mightLike
**/ 

public ParsedURL getMightLike(){
return mightLike().getValue();
}

/**
	Sets the value of the field mightLike
**/ 

public void setMightLike( ParsedURL mightLike )
{
this.mightLike().setValue(mightLike);
}

/**
	The heavy weight setter method for field mightLike
**/ 

public void hwSetMightLike( ParsedURL mightLike )
{
this.mightLike().setValue(mightLike);
rebuildCompositeTermVector();
 }
/**
	 Sets the mightLike directly
**/ 

public void setMightLikeMetadata(MetadataParsedURL mightLike)
{	this.mightLike = mightLike;
}
/**
	Heavy Weight Direct setter method for mightLike
**/ 

public void hwSetMightLikeMetadata(MetadataParsedURL mightLike)
{	 if(this.mightLike!=null && this.mightLike.getValue()!=null && hasTermVector())
		 termVector().remove(this.mightLike.termVector());
	 this.mightLike = mightLike;
	rebuildCompositeTermVector();
}
}

