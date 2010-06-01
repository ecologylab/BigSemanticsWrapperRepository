package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.xml_inherit;


/**
	Google Patents Class
**/ 

@xml_inherit

public class  GooglePatent
extends  Document
{


/**
	null
**/ 

	 @xml_leaf private MetadataString	inventor;

/**
	null
**/ 

	 @xml_leaf private MetadataString	abstractField;

/**
	null
**/ 

	 @xml_leaf private MetadataString	claims;

/**
	null
**/ 

	 @xml_leaf private MetadataParsedURL	picLink;
	@xml_collection("referenced_bys") private ArrayList<SearchResult>	referencedBys;
	@xml_collection("citations") private ArrayList<SearchResult>	citations;
	@xml_collection("pic_links") private ArrayList<SearchResult>	picLinks;

/**
	Constructor
**/ 

public GooglePatent()
{
 super();
}

/**
	Constructor
**/ 

public GooglePatent(MetaMetadata metaMetadata)
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
	Lazy Evaluation for abstractField
**/ 

public MetadataString	abstractField()
{
MetadataString	result	=this.abstractField;
if(result == null)
{
result = new MetadataString();
this.abstractField	=	 result;
}
return result;
}

/**
	Gets the value of the field abstractField
**/ 

public String getAbstractField(){
return abstractField().getValue();
}

/**
	Sets the value of the field abstractField
**/ 

public void setAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
}

/**
	The heavy weight setter method for field abstractField
**/ 

public void hwSetAbstractField( String abstractField )
{
this.abstractField().setValue(abstractField);
rebuildCompositeTermVector();
 }
/**
	 Sets the abstractField directly
**/ 

public void setAbstractFieldMetadata(MetadataString abstractField)
{	this.abstractField = abstractField;
}
/**
	Heavy Weight Direct setter method for abstractField
**/ 

public void hwSetAbstractFieldMetadata(MetadataString abstractField)
{	 if(this.abstractField!=null && this.abstractField.getValue()!=null && hasTermVector())
		 termVector().remove(this.abstractField.termVector());
	 this.abstractField = abstractField;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for claims
**/ 

public MetadataString	claims()
{
MetadataString	result	=this.claims;
if(result == null)
{
result = new MetadataString();
this.claims	=	 result;
}
return result;
}

/**
	Gets the value of the field claims
**/ 

public String getClaims(){
return claims().getValue();
}

/**
	Sets the value of the field claims
**/ 

public void setClaims( String claims )
{
this.claims().setValue(claims);
}

/**
	The heavy weight setter method for field claims
**/ 

public void hwSetClaims( String claims )
{
this.claims().setValue(claims);
rebuildCompositeTermVector();
 }
/**
	 Sets the claims directly
**/ 

public void setClaimsMetadata(MetadataString claims)
{	this.claims = claims;
}
/**
	Heavy Weight Direct setter method for claims
**/ 

public void hwSetClaimsMetadata(MetadataString claims)
{	 if(this.claims!=null && this.claims.getValue()!=null && hasTermVector())
		 termVector().remove(this.claims.termVector());
	 this.claims = claims;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for picLink
**/ 

public MetadataParsedURL	picLink()
{
MetadataParsedURL	result	=this.picLink;
if(result == null)
{
result = new MetadataParsedURL();
this.picLink	=	 result;
}
return result;
}

/**
	Gets the value of the field picLink
**/ 

public ParsedURL getPicLink(){
return picLink().getValue();
}

/**
	Sets the value of the field picLink
**/ 

public void setPicLink( ParsedURL picLink )
{
this.picLink().setValue(picLink);
}

/**
	The heavy weight setter method for field picLink
**/ 

public void hwSetPicLink( ParsedURL picLink )
{
this.picLink().setValue(picLink);
rebuildCompositeTermVector();
 }
/**
	 Sets the picLink directly
**/ 

public void setPicLinkMetadata(MetadataParsedURL picLink)
{	this.picLink = picLink;
}
/**
	Heavy Weight Direct setter method for picLink
**/ 

public void hwSetPicLinkMetadata(MetadataParsedURL picLink)
{	 if(this.picLink!=null && this.picLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.picLink.termVector());
	 this.picLink = picLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for referencedBys
**/ 

public  ArrayList<SearchResult>	referencedBys()
{
 ArrayList<SearchResult>	result	=this.referencedBys;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.referencedBys	=	 result;
}
return result;
}

/**
	Set the value of field referencedBys
**/ 

public void setReferencedBys(  ArrayList<SearchResult> referencedBys )
{
this.referencedBys = referencedBys ;
}

/**
	Get the value of field referencedBys
**/ 

public  ArrayList<SearchResult> getReferencedBys(){
return this.referencedBys;
}

/**
	Lazy Evaluation for citations
**/ 

public  ArrayList<SearchResult>	citations()
{
 ArrayList<SearchResult>	result	=this.citations;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.citations	=	 result;
}
return result;
}

/**
	Set the value of field citations
**/ 

public void setCitations(  ArrayList<SearchResult> citations )
{
this.citations = citations ;
}

/**
	Get the value of field citations
**/ 

public  ArrayList<SearchResult> getCitations(){
return this.citations;
}

/**
	Lazy Evaluation for picLinks
**/ 

public  ArrayList<SearchResult>	picLinks()
{
 ArrayList<SearchResult>	result	=this.picLinks;
if(result == null)
{
result = new  ArrayList<SearchResult>();
this.picLinks	=	 result;
}
return result;
}

/**
	Set the value of field picLinks
**/ 

public void setPicLinks(  ArrayList<SearchResult> picLinks )
{
this.picLinks = picLinks ;
}

/**
	Get the value of field picLinks
**/ 

public  ArrayList<SearchResult> getPicLinks(){
return this.picLinks;
}

}

