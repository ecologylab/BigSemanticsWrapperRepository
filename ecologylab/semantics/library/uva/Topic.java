package ecologylab.semantics.library.uva;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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


/**
	For Collabartion with UVA's Cluster formation project.
**/ 

@xml_inherit
@xml_tag("topic")
public class  Topic
extends  Document
{


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
	
**/ 

	@xml_tag("content_keywords") @xml_nested private MetadataStringBuilder	contentKeywords;

/**
	Lazy Evaluation for contentKeywords
**/ 

MetadataStringBuilder	contentKeywords()
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
	
**/ 

	@xml_tag("anchor_keywords") @xml_nested private MetadataStringBuilder	anchorKeywords;

/**
	Lazy Evaluation for anchorKeywords
**/ 

MetadataStringBuilder	anchorKeywords()
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
	
**/ 

	@xml_tag("url_keywords") @xml_nested private MetadataStringBuilder	urlKeywords;

/**
	Lazy Evaluation for urlKeywords
**/ 

MetadataStringBuilder	urlKeywords()
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
	
**/ 

	@xml_tag("title_keywords") @xml_nested private MetadataStringBuilder	titleKeywords;

/**
	Lazy Evaluation for titleKeywords
**/ 

MetadataStringBuilder	titleKeywords()
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
	
**/ 

	@xml_tag("id") @xml_nested private MetadataInteger	id;

/**
	Lazy Evaluation for id
**/ 

MetadataInteger	id()
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
}

