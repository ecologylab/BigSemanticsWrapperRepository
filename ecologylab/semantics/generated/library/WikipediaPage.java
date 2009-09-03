package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



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
 import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
 import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
 import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;


/**
	An article on wikipedia
**/ 

@xml_inherit
@xml_tag("wikipedia_page")
public class  WikipediaPage
extends  Document
{


/**
	Constructor
**/ 

public WikipediaPage()
{
 super();
}

/**
	Constructor
**/ 

public WikipediaPage(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	null
**/ 

	@xml_tag("title") @xml_nested private MetadataString	title;

/**
	Lazy Evaluation for title
**/ 

public MetadataString	title()
{
MetadataString	result	=this.title;
if(result == null)
{
result = new MetadataString();
this.title	=	 result;
}
return result;
}

/**
	Gets the value of the field title
**/ 

public String getTitle(){
return title().getValue();
}

/**
	Sets the value of the field title
**/ 

public void setTitle( String title )
{
this.title().setValue(title);
}

/**
	The heavy weight setter method for field title
**/ 

public void hwSetTitle( String title )
{
this.title().setValue(title);
rebuildCompositeTermVector();
 }
/**
	 Sets the title directly
**/ 

public void setTitleMetadata(MetadataString title)
{	this.title = title;
}
/**
	Heavy Weight Direct setter method for title
**/ 

public void hwSetTitleMetadata(MetadataString title)
{	 if(this.title!=null && this.title.getValue()!=null && hasTermVector())
		 termVector().remove(this.title.termVector());
	 this.title = title;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("description") @xml_nested private MetadataString	description;

/**
	Lazy Evaluation for description
**/ 

public MetadataString	description()
{
MetadataString	result	=this.description;
if(result == null)
{
result = new MetadataString();
this.description	=	 result;
}
return result;
}

/**
	Gets the value of the field description
**/ 

public String getDescription(){
return description().getValue();
}

/**
	Sets the value of the field description
**/ 

public void setDescription( String description )
{
this.description().setValue(description);
}

/**
	The heavy weight setter method for field description
**/ 

public void hwSetDescription( String description )
{
this.description().setValue(description);
rebuildCompositeTermVector();
 }
/**
	 Sets the description directly
**/ 

public void setDescriptionMetadata(MetadataString description)
{	this.description = description;
}
/**
	Heavy Weight Direct setter method for description
**/ 

public void hwSetDescriptionMetadata(MetadataString description)
{	 if(this.description!=null && this.description.getValue()!=null && hasTermVector())
		 termVector().remove(this.description.termVector());
	 this.description = description;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("main_image_src") @xml_nested private MetadataParsedURL	mainImageSrc;

/**
	Lazy Evaluation for mainImageSrc
**/ 

public MetadataParsedURL	mainImageSrc()
{
MetadataParsedURL	result	=this.mainImageSrc;
if(result == null)
{
result = new MetadataParsedURL();
this.mainImageSrc	=	 result;
}
return result;
}

/**
	Gets the value of the field mainImageSrc
**/ 

public ParsedURL getMainImageSrc(){
return mainImageSrc().getValue();
}

/**
	Sets the value of the field mainImageSrc
**/ 

public void setMainImageSrc( ParsedURL mainImageSrc )
{
this.mainImageSrc().setValue(mainImageSrc);
}

/**
	The heavy weight setter method for field mainImageSrc
**/ 

public void hwSetMainImageSrc( ParsedURL mainImageSrc )
{
this.mainImageSrc().setValue(mainImageSrc);
rebuildCompositeTermVector();
 }
/**
	 Sets the mainImageSrc directly
**/ 

public void setMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{	this.mainImageSrc = mainImageSrc;
}
/**
	Heavy Weight Direct setter method for mainImageSrc
**/ 

public void hwSetMainImageSrcMetadata(MetadataParsedURL mainImageSrc)
{	 if(this.mainImageSrc!=null && this.mainImageSrc.getValue()!=null && hasTermVector())
		 termVector().remove(this.mainImageSrc.termVector());
	 this.mainImageSrc = mainImageSrc;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("main_image_height") @xml_nested private MetadataInteger	mainImageHeight;

/**
	Lazy Evaluation for mainImageHeight
**/ 

public MetadataInteger	mainImageHeight()
{
MetadataInteger	result	=this.mainImageHeight;
if(result == null)
{
result = new MetadataInteger();
this.mainImageHeight	=	 result;
}
return result;
}

/**
	Gets the value of the field mainImageHeight
**/ 

public Integer getMainImageHeight(){
return mainImageHeight().getValue();
}

/**
	Sets the value of the field mainImageHeight
**/ 

public void setMainImageHeight( Integer mainImageHeight )
{
this.mainImageHeight().setValue(mainImageHeight);
}

/**
	The heavy weight setter method for field mainImageHeight
**/ 

public void hwSetMainImageHeight( Integer mainImageHeight )
{
this.mainImageHeight().setValue(mainImageHeight);
rebuildCompositeTermVector();
 }
/**
	 Sets the mainImageHeight directly
**/ 

public void setMainImageHeightMetadata(MetadataInteger mainImageHeight)
{	this.mainImageHeight = mainImageHeight;
}
/**
	Heavy Weight Direct setter method for mainImageHeight
**/ 

public void hwSetMainImageHeightMetadata(MetadataInteger mainImageHeight)
{	 if(this.mainImageHeight!=null && this.mainImageHeight.getValue()!=null && hasTermVector())
		 termVector().remove(this.mainImageHeight.termVector());
	 this.mainImageHeight = mainImageHeight;
	rebuildCompositeTermVector();
}
/**
	null
**/ 

	@xml_tag("main_image_width") @xml_nested private MetadataInteger	mainImageWidth;

/**
	Lazy Evaluation for mainImageWidth
**/ 

public MetadataInteger	mainImageWidth()
{
MetadataInteger	result	=this.mainImageWidth;
if(result == null)
{
result = new MetadataInteger();
this.mainImageWidth	=	 result;
}
return result;
}

/**
	Gets the value of the field mainImageWidth
**/ 

public Integer getMainImageWidth(){
return mainImageWidth().getValue();
}

/**
	Sets the value of the field mainImageWidth
**/ 

public void setMainImageWidth( Integer mainImageWidth )
{
this.mainImageWidth().setValue(mainImageWidth);
}

/**
	The heavy weight setter method for field mainImageWidth
**/ 

public void hwSetMainImageWidth( Integer mainImageWidth )
{
this.mainImageWidth().setValue(mainImageWidth);
rebuildCompositeTermVector();
 }
/**
	 Sets the mainImageWidth directly
**/ 

public void setMainImageWidthMetadata(MetadataInteger mainImageWidth)
{	this.mainImageWidth = mainImageWidth;
}
/**
	Heavy Weight Direct setter method for mainImageWidth
**/ 

public void hwSetMainImageWidthMetadata(MetadataInteger mainImageWidth)
{	 if(this.mainImageWidth!=null && this.mainImageWidth.getValue()!=null && hasTermVector())
		 termVector().remove(this.mainImageWidth.termVector());
	 this.mainImageWidth = mainImageWidth;
	rebuildCompositeTermVector();
}	@xml_collection("paragraphs") private ArrayList<Paragraph>	paragraphs;

/**
	Lazy Evaluation for paragraphs
**/ 

public ArrayList<Paragraph>	paragraphs()
{
ArrayList<Paragraph>	result	=this.paragraphs;
if(result == null)
{
result = new ArrayList<Paragraph>();
this.paragraphs	=	 result;
}
return result;
}

/**
	Set the value of field paragraphs
**/ 

public void setParagraphs( ArrayList<Paragraph> paragraphs )
{
this.paragraphs = paragraphs ;
}

/**
	Get the value of field paragraphs
**/ 

public ArrayList<Paragraph> getParagraphs(){
return this.paragraphs;
}
	@xml_collection("Categories") private ArrayList<Category>	Categories;

/**
	Lazy Evaluation for Categories
**/ 

public ArrayList<Category>	Categories()
{
ArrayList<Category>	result	=this.Categories;
if(result == null)
{
result = new ArrayList<Category>();
this.Categories	=	 result;
}
return result;
}

/**
	Set the value of field Categories
**/ 

public void setCategories( ArrayList<Category> Categories )
{
this.Categories = Categories ;
}

/**
	Get the value of field Categories
**/ 

public ArrayList<Category> getCategories(){
return this.Categories;
}
	@xml_collection("Thumbinners") private ArrayList<Thumbinner>	Thumbinners;

/**
	Lazy Evaluation for Thumbinners
**/ 

public ArrayList<Thumbinner>	Thumbinners()
{
ArrayList<Thumbinner>	result	=this.Thumbinners;
if(result == null)
{
result = new ArrayList<Thumbinner>();
this.Thumbinners	=	 result;
}
return result;
}

/**
	Set the value of field Thumbinners
**/ 

public void setThumbinners( ArrayList<Thumbinner> Thumbinners )
{
this.Thumbinners = Thumbinners ;
}

/**
	Get the value of field Thumbinners
**/ 

public ArrayList<Thumbinner> getThumbinners(){
return this.Thumbinners;
}

}

