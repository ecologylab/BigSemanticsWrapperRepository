package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;


/**
	Google Patents Image Class
**/ 

@xml_inherit

public class  GooglePatentImage
extends  Document
{


/**
	null
**/ 

	 @xml_leaf private MetadataString	inventor;
	@xml_collection("pic_urls") private ArrayList<SearchResult>	picUrls;

/**
	Constructor
**/ 

public GooglePatentImage()
{
 super();
}

/**
	Constructor
**/ 

public GooglePatentImage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for inventor
**/ 

public MetadataString	inventor()
{
MetadataString	result	=this.inventor;
if(result == null)
{
result = new MetadataString();
this.inventor	=	 result;
}
return result;
}

/**
	Gets the value of the field inventor
**/ 

public String getInventor(){
return inventor().getValue();
}

/**
	Sets the value of the field inventor
**/ 

public void setInventor( String inventor )
{
this.inventor().setValue(inventor);
}

/**
	The heavy weight setter method for field inventor
**/ 

public void hwSetInventor( String inventor )
{
this.inventor().setValue(inventor);
rebuildCompositeTermVector();
 }
/**
	 Sets the inventor directly
**/ 

public void setInventorMetadata(MetadataString inventor)
{	this.inventor = inventor;
}
/**
	Heavy Weight Direct setter method for inventor
**/ 

public void hwSetInventorMetadata(MetadataString inventor)
{	 if(this.inventor!=null && this.inventor.getValue()!=null && hasTermVector())
		 termVector().remove(this.inventor.termVector());
	 this.inventor = inventor;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for picUrls
**/ 

public  ArrayList<SearchResult>	picUrls()
{
 ArrayList<SearchResult>	result	=this.picUrls;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.picUrls	=	 result;
}
return result;
}

/**
	Set the value of field picUrls
**/ 

public void setPicUrls(  ArrayList<SearchResult> picUrls )
{
this.picUrls = picUrls ;
}

/**
	Get the value of field picUrls
**/ 

public  ArrayList<SearchResult> getPicUrls(){
return this.picUrls;
}

}

