package ecologylab.semantics.generated.library.uva;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class  TopicCluster
extends  Metadata
{

	@simpl_scalar private MetadataInteger	id;
	 @simpl_collection("document") @xml_tag("document_set") @mm_name("document_set") private ArrayList<Document>	documentSet;
	 @simpl_collection("keyword_set") @xml_tag("keyword_sets") @mm_name("keyword_sets") private ArrayList<KeywordSet>	keywordSets;
	@simpl_scalar private MetadataInteger	x;
	@simpl_scalar private MetadataInteger	y;
	@simpl_scalar private MetadataInteger	width;
	@simpl_scalar private MetadataInteger	height;

/**
	Constructor
**/ 

public TopicCluster()
{
 super();
}

/**
	Constructor
**/ 

public TopicCluster(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
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

public Integer getId()
{
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
	Tests to see if the value of the field is null, or if the field itself is null: id
**/ 

public boolean isNullId()
{
	return id == null || id.getValue() == null;
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
/**
	Lazy Evaluation for documentSet
**/ 

public  ArrayList<Document>	documentSet()
{
 ArrayList<Document>	result	=this.documentSet;
if(result == null)
{
result = new  ArrayList<Document>();
this.documentSet	=	 result;
}
return result;
}

/**
	Set the value of field documentSet
**/ 

public void setDocumentSet(  ArrayList<Document> documentSet )
{
this.documentSet = documentSet ;
}

/**
	Get the value of field documentSet
**/ 

public  ArrayList<Document> getDocumentSet(){
return this.documentSet;
}

/**
	Lazy Evaluation for keywordSets
**/ 

public  ArrayList<KeywordSet>	keywordSets()
{
 ArrayList<KeywordSet>	result	=this.keywordSets;
if(result == null)
{
result = new  ArrayList<KeywordSet>();
this.keywordSets	=	 result;
}
return result;
}

/**
	Set the value of field keywordSets
**/ 

public void setKeywordSets(  ArrayList<KeywordSet> keywordSets )
{
this.keywordSets = keywordSets ;
}

/**
	Get the value of field keywordSets
**/ 

public  ArrayList<KeywordSet> getKeywordSets(){
return this.keywordSets;
}

/**
	Lazy Evaluation for x
**/ 

public MetadataInteger	x()
{
MetadataInteger	result	=this.x;
if(result == null)
{
result = new MetadataInteger();
this.x	=	 result;
}
return result;
}

/**
	Gets the value of the field x
**/ 

public Integer getX()
{
	return x().getValue();
}

/**
	Sets the value of the field x
**/ 

public void setX( Integer x )
{
	this.x().setValue(x);
}

/**
	The heavy weight setter method for field x
**/ 

public void hwSetX( Integer x )
{
	this.x().setValue(x);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: x
**/ 

public boolean isNullX()
{
	return x == null || x.getValue() == null;
}

/**
	 Sets the x directly
**/ 

public void setXMetadata(MetadataInteger x)
{	this.x = x;
}
/**
	Heavy Weight Direct setter method for x
**/ 

public void hwSetXMetadata(MetadataInteger x)
{	 if(this.x!=null && this.x.getValue()!=null && hasTermVector())
		 termVector().remove(this.x.termVector());
	 this.x = x;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for y
**/ 

public MetadataInteger	y()
{
MetadataInteger	result	=this.y;
if(result == null)
{
result = new MetadataInteger();
this.y	=	 result;
}
return result;
}

/**
	Gets the value of the field y
**/ 

public Integer getY()
{
	return y().getValue();
}

/**
	Sets the value of the field y
**/ 

public void setY( Integer y )
{
	this.y().setValue(y);
}

/**
	The heavy weight setter method for field y
**/ 

public void hwSetY( Integer y )
{
	this.y().setValue(y);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: y
**/ 

public boolean isNullY()
{
	return y == null || y.getValue() == null;
}

/**
	 Sets the y directly
**/ 

public void setYMetadata(MetadataInteger y)
{	this.y = y;
}
/**
	Heavy Weight Direct setter method for y
**/ 

public void hwSetYMetadata(MetadataInteger y)
{	 if(this.y!=null && this.y.getValue()!=null && hasTermVector())
		 termVector().remove(this.y.termVector());
	 this.y = y;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for width
**/ 

public MetadataInteger	width()
{
MetadataInteger	result	=this.width;
if(result == null)
{
result = new MetadataInteger();
this.width	=	 result;
}
return result;
}

/**
	Gets the value of the field width
**/ 

public Integer getWidth()
{
	return width().getValue();
}

/**
	Sets the value of the field width
**/ 

public void setWidth( Integer width )
{
	this.width().setValue(width);
}

/**
	The heavy weight setter method for field width
**/ 

public void hwSetWidth( Integer width )
{
	this.width().setValue(width);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: width
**/ 

public boolean isNullWidth()
{
	return width == null || width.getValue() == null;
}

/**
	 Sets the width directly
**/ 

public void setWidthMetadata(MetadataInteger width)
{	this.width = width;
}
/**
	Heavy Weight Direct setter method for width
**/ 

public void hwSetWidthMetadata(MetadataInteger width)
{	 if(this.width!=null && this.width.getValue()!=null && hasTermVector())
		 termVector().remove(this.width.termVector());
	 this.width = width;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for height
**/ 

public MetadataInteger	height()
{
MetadataInteger	result	=this.height;
if(result == null)
{
result = new MetadataInteger();
this.height	=	 result;
}
return result;
}

/**
	Gets the value of the field height
**/ 

public Integer getHeight()
{
	return height().getValue();
}

/**
	Sets the value of the field height
**/ 

public void setHeight( Integer height )
{
	this.height().setValue(height);
}

/**
	The heavy weight setter method for field height
**/ 

public void hwSetHeight( Integer height )
{
	this.height().setValue(height);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: height
**/ 

public boolean isNullHeight()
{
	return height == null || height.getValue() == null;
}

/**
	 Sets the height directly
**/ 

public void setHeightMetadata(MetadataInteger height)
{	this.height = height;
}
/**
	Heavy Weight Direct setter method for height
**/ 

public void hwSetHeightMetadata(MetadataInteger height)
{	 if(this.height!=null && this.height.getValue()!=null && hasTermVector())
		 termVector().remove(this.height.termVector());
	 this.height = height;
	rebuildCompositeTermVector();
}
}

