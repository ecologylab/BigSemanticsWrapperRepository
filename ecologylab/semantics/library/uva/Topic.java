package ecologylab.semantics.library.uva;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.Hint;
import ecologylab.xml.simpl_inherit;


/**
	For Collabartion with UVA's Cluster formation project.
**/ 

@simpl_inherit

public class  Topic
extends  Document
{


/**
	
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataStringBuilder	contentKeywords;

/**
	
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataStringBuilder	anchorKeywords;

/**
	
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataStringBuilder	urlKeywords;

/**
	
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataStringBuilder	titleKeywords;

/**
	
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataInteger	id;

/**
	Constructor
**/ 

public Topic()
{
 super();
}

/**
	Constructor
**/ 

public Topic(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for contentKeywords
**/ 

public MetadataStringBuilder	contentKeywords()
{
MetadataStringBuilder	result	=this.contentKeywords;
if(result == null)
{
result = new MetadataStringBuilder();
this.contentKeywords	=	 result;
}
return result;
}

/**
	Gets the value of the field contentKeywords
**/ 

public StringBuilder getContentKeywords(){
return contentKeywords().getValue();
}

/**
	Sets the value of the field contentKeywords
**/ 

public void setContentKeywords( StringBuilder contentKeywords )
{
this.contentKeywords().setValue(contentKeywords);
}

/**
	The heavy weight setter method for field contentKeywords
**/ 

public void hwSetContentKeywords( StringBuilder contentKeywords )
{
this.contentKeywords().setValue(contentKeywords);
rebuildCompositeTermVector();
 }
/**
	 Sets the contentKeywords directly
**/ 

public void setContentKeywordsMetadata(MetadataStringBuilder contentKeywords)
{	this.contentKeywords = contentKeywords;
}
/**
	Heavy Weight Direct setter method for contentKeywords
**/ 

public void hwSetContentKeywordsMetadata(MetadataStringBuilder contentKeywords)
{	 if(this.contentKeywords!=null && this.contentKeywords.getValue()!=null && hasTermVector())
		 termVector().remove(this.contentKeywords.termVector());
	 this.contentKeywords = contentKeywords;
	rebuildCompositeTermVector();
}
/**
	 Appends the value to the field contentKeywords
**/ 

public void appendContentKeywords( String contentKeywords )
{
this.contentKeywords().setValue(contentKeywords);
}

/**
	The heavy weight Append method for field contentKeywords
**/ 

public void hwAppendContentKeywords( StringBuilder contentKeywords )
{
this.contentKeywords().setValue(contentKeywords);
rebuildCompositeTermVector();
 }
/**
	The heavy weight Append method for field contentKeywords
**/ 

public void hwAppendContentKeywords( String contentKeywords )
{
this.contentKeywords().setValue(contentKeywords);
rebuildCompositeTermVector();
 }
/**
	Lazy Evaluation for anchorKeywords
**/ 

public MetadataStringBuilder	anchorKeywords()
{
MetadataStringBuilder	result	=this.anchorKeywords;
if(result == null)
{
result = new MetadataStringBuilder();
this.anchorKeywords	=	 result;
}
return result;
}

/**
	Gets the value of the field anchorKeywords
**/ 

public StringBuilder getAnchorKeywords(){
return anchorKeywords().getValue();
}

/**
	Sets the value of the field anchorKeywords
**/ 

public void setAnchorKeywords( StringBuilder anchorKeywords )
{
this.anchorKeywords().setValue(anchorKeywords);
}

/**
	The heavy weight setter method for field anchorKeywords
**/ 

public void hwSetAnchorKeywords( StringBuilder anchorKeywords )
{
this.anchorKeywords().setValue(anchorKeywords);
rebuildCompositeTermVector();
 }
/**
	 Sets the anchorKeywords directly
**/ 

public void setAnchorKeywordsMetadata(MetadataStringBuilder anchorKeywords)
{	this.anchorKeywords = anchorKeywords;
}
/**
	Heavy Weight Direct setter method for anchorKeywords
**/ 

public void hwSetAnchorKeywordsMetadata(MetadataStringBuilder anchorKeywords)
{	 if(this.anchorKeywords!=null && this.anchorKeywords.getValue()!=null && hasTermVector())
		 termVector().remove(this.anchorKeywords.termVector());
	 this.anchorKeywords = anchorKeywords;
	rebuildCompositeTermVector();
}
/**
	 Appends the value to the field anchorKeywords
**/ 

public void appendAnchorKeywords( String anchorKeywords )
{
this.anchorKeywords().setValue(anchorKeywords);
}

/**
	The heavy weight Append method for field anchorKeywords
**/ 

public void hwAppendAnchorKeywords( StringBuilder anchorKeywords )
{
this.anchorKeywords().setValue(anchorKeywords);
rebuildCompositeTermVector();
 }
/**
	The heavy weight Append method for field anchorKeywords
**/ 

public void hwAppendAnchorKeywords( String anchorKeywords )
{
this.anchorKeywords().setValue(anchorKeywords);
rebuildCompositeTermVector();
 }
/**
	Lazy Evaluation for urlKeywords
**/ 

public MetadataStringBuilder	urlKeywords()
{
MetadataStringBuilder	result	=this.urlKeywords;
if(result == null)
{
result = new MetadataStringBuilder();
this.urlKeywords	=	 result;
}
return result;
}

/**
	Gets the value of the field urlKeywords
**/ 

public StringBuilder getUrlKeywords(){
return urlKeywords().getValue();
}

/**
	Sets the value of the field urlKeywords
**/ 

public void setUrlKeywords( StringBuilder urlKeywords )
{
this.urlKeywords().setValue(urlKeywords);
}

/**
	The heavy weight setter method for field urlKeywords
**/ 

public void hwSetUrlKeywords( StringBuilder urlKeywords )
{
this.urlKeywords().setValue(urlKeywords);
rebuildCompositeTermVector();
 }
/**
	 Sets the urlKeywords directly
**/ 

public void setUrlKeywordsMetadata(MetadataStringBuilder urlKeywords)
{	this.urlKeywords = urlKeywords;
}
/**
	Heavy Weight Direct setter method for urlKeywords
**/ 

public void hwSetUrlKeywordsMetadata(MetadataStringBuilder urlKeywords)
{	 if(this.urlKeywords!=null && this.urlKeywords.getValue()!=null && hasTermVector())
		 termVector().remove(this.urlKeywords.termVector());
	 this.urlKeywords = urlKeywords;
	rebuildCompositeTermVector();
}
/**
	 Appends the value to the field urlKeywords
**/ 

public void appendUrlKeywords( String urlKeywords )
{
this.urlKeywords().setValue(urlKeywords);
}

/**
	The heavy weight Append method for field urlKeywords
**/ 

public void hwAppendUrlKeywords( StringBuilder urlKeywords )
{
this.urlKeywords().setValue(urlKeywords);
rebuildCompositeTermVector();
 }
/**
	The heavy weight Append method for field urlKeywords
**/ 

public void hwAppendUrlKeywords( String urlKeywords )
{
this.urlKeywords().setValue(urlKeywords);
rebuildCompositeTermVector();
 }
/**
	Lazy Evaluation for titleKeywords
**/ 

public MetadataStringBuilder	titleKeywords()
{
MetadataStringBuilder	result	=this.titleKeywords;
if(result == null)
{
result = new MetadataStringBuilder();
this.titleKeywords	=	 result;
}
return result;
}

/**
	Gets the value of the field titleKeywords
**/ 

public StringBuilder getTitleKeywords(){
return titleKeywords().getValue();
}

/**
	Sets the value of the field titleKeywords
**/ 

public void setTitleKeywords( StringBuilder titleKeywords )
{
this.titleKeywords().setValue(titleKeywords);
}

/**
	The heavy weight setter method for field titleKeywords
**/ 

public void hwSetTitleKeywords( StringBuilder titleKeywords )
{
this.titleKeywords().setValue(titleKeywords);
rebuildCompositeTermVector();
 }
/**
	 Sets the titleKeywords directly
**/ 

public void setTitleKeywordsMetadata(MetadataStringBuilder titleKeywords)
{	this.titleKeywords = titleKeywords;
}
/**
	Heavy Weight Direct setter method for titleKeywords
**/ 

public void hwSetTitleKeywordsMetadata(MetadataStringBuilder titleKeywords)
{	 if(this.titleKeywords!=null && this.titleKeywords.getValue()!=null && hasTermVector())
		 termVector().remove(this.titleKeywords.termVector());
	 this.titleKeywords = titleKeywords;
	rebuildCompositeTermVector();
}
/**
	 Appends the value to the field titleKeywords
**/ 

public void appendTitleKeywords( String titleKeywords )
{
this.titleKeywords().setValue(titleKeywords);
}

/**
	The heavy weight Append method for field titleKeywords
**/ 

public void hwAppendTitleKeywords( StringBuilder titleKeywords )
{
this.titleKeywords().setValue(titleKeywords);
rebuildCompositeTermVector();
 }
/**
	The heavy weight Append method for field titleKeywords
**/ 

public void hwAppendTitleKeywords( String titleKeywords )
{
this.titleKeywords().setValue(titleKeywords);
rebuildCompositeTermVector();
 }
/**
	Lazy Evaluation for id
**/ 

public MetadataInteger	id()
{
MetadataInteger	result	=this.id;
if(result == null)
{
result = new MetadataInteger();
this.id	=	 result;
}
return result;
}

/**
	Gets the value of the field id
**/ 

public Integer getId(){
return id().getValue();
}

/**
	Sets the value of the field id
**/ 

public void setId( Integer id )
{
this.id().setValue(id);
}

/**
	The heavy weight setter method for field id
**/ 

public void hwSetId( Integer id )
{
this.id().setValue(id);
rebuildCompositeTermVector();
 }
/**
	 Sets the id directly
**/ 

public void setIdMetadata(MetadataInteger id)
{	this.id = id;
}
/**
	Heavy Weight Direct setter method for id
**/ 

public void hwSetIdMetadata(MetadataInteger id)
{	 if(this.id!=null && this.id.getValue()!=null && hasTermVector())
		 termVector().remove(this.id.termVector());
	 this.id = id;
	rebuildCompositeTermVector();
}
}

