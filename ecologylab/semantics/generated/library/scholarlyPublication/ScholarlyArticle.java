package ecologylab.semantics.generated.library.scholarlyPublication;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.publication.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.ImageClipping;
import ecologylab.semantics.metadata.builtins.MediaClipping;
import ecologylab.semantics.metadata.builtins.TextClipping;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.tools.MetaMetadataCompilerUtils;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class ScholarlyArticle
extends CompoundDocument
{


/**
	citation.cfm
*/
@simpl_scalar
private MetadataParsedURL	metadataPage;

@simpl_scalar @xml_tag("abstract")
private MetadataString	abstractField;


/**
	Metadata related to where this article was published.
*/
@simpl_composite @mm_name("source")
private Source	source;


/**
	Set of authors.
*/
@simpl_collection("author") @xml_tag("authors") @mm_name("authors")
private ArrayList<Author>	authors;


/**
	Papers cited by this paper.
*/
@simpl_collection("reference") @xml_tag("references") @mm_name("references")
private ArrayList<Entity<ScholarlyArticle>>	references;


/**
	Papers that cite this paper.
*/
@simpl_collection("citation") @xml_tag("citations") @mm_name("citations")
private ArrayList<Entity<ScholarlyArticle>>	citations;


/**
	The Classifications of this paper.
*/
@simpl_collection("tag") @xml_tag("classifications") @mm_name("classifications")
private ArrayList<Tag>	classifications;


/**
	Key Terms of the paper.
*/
@simpl_collection("tag") @xml_tag("keywords") @mm_name("keywords")
private ArrayList<Tag>	keywords;

@simpl_scalar
private MetadataString	pages;



/**
	Constructor
*/
public ScholarlyArticle()
{
 super();
}

/**
	Constructor
*/
public ScholarlyArticle(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for metadataPage
*/
public MetadataParsedURL	metadataPage()
{
	MetadataParsedURL	result = this.metadataPage;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.metadataPage = result;
	}
	return result;
}

/**
	Gets the value of the field metadataPage
*/
public ParsedURL getMetadataPage()
{
	return this.metadataPage().getValue();
}

/**
	Sets the value of the field metadataPage
*/
public void setMetadataPage(ParsedURL metadataPage)
{
	this.metadataPage().setValue(metadataPage);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: metadataPage
*/
public boolean isNullMetadataPage()
{
	return metadataPage == null || metadataPage.getValue() == null;
}

/**
	The heavy weight setter method for field metadataPage
*/
public void hwSetMetadataPage(ParsedURL metadataPage)
{
	this.metadataPage().setValue(metadataPage);
	rebuildCompositeTermVector();
}

/**
	 Sets the metadataPage directly.
*/
public void setMetadataPageMetadata(MetadataParsedURL metadataPage)
{
	this.metadataPage = metadataPage;
}

/**
	Heavy Weight Direct setter method for metadataPage
*/
public void hwSetMetadataPageMetadata(MetadataParsedURL metadataPage)
{
	if (this.metadataPage != null && this.metadataPage.getValue() != null && hasTermVector())
		termVector().remove(this.metadataPage.termVector());
	this.metadataPage = metadataPage;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for abstractField
*/
public MetadataString	abstractField()
{
	MetadataString	result = this.abstractField;
	if (result == null)
	{
		result = new MetadataString();
		this.abstractField = result;
	}
	return result;
}

/**
	Gets the value of the field abstractField
*/
public String getAbstractField()
{
	return this.abstractField().getValue();
}

/**
	Sets the value of the field abstractField
*/
public void setAbstractField(String abstractField)
{
	this.abstractField().setValue(abstractField);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: abstractField
*/
public boolean isNullAbstractField()
{
	return abstractField == null || abstractField.getValue() == null;
}

/**
	The heavy weight setter method for field abstractField
*/
public void hwSetAbstractField(String abstractField)
{
	this.abstractField().setValue(abstractField);
	rebuildCompositeTermVector();
}

/**
	 Sets the abstractField directly.
*/
public void setAbstractFieldMetadata(MetadataString abstractField)
{
	this.abstractField = abstractField;
}

/**
	Heavy Weight Direct setter method for abstractField
*/
public void hwSetAbstractFieldMetadata(MetadataString abstractField)
{
	if (this.abstractField != null && this.abstractField.getValue() != null && hasTermVector())
		termVector().remove(this.abstractField.termVector());
	this.abstractField = abstractField;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for source
*/
public Source	source()
{
	Source	result = this.source;
	if (result == null)
	{
		result = new Source();
		this.source = result;
	}
	return result;
}

/**
	Get the value of field source
*/
public Source getSource()
{
	return this.source;
}

/**
	Set the value of field source
*/
public void setSource(Source source)
{
	this.source = source;
}

/**
	Lazy evaluation for authors
*/
public ArrayList<Author>	authors()
{
	ArrayList<Author>	result = this.authors;
	if (result == null)
	{
		result = new ArrayList<Author>();
		this.authors = result;
	}
	return result;
}

/**
	Get the value of field authors
*/
public ArrayList<Author> getAuthors()
{
	return this.authors;
}

/**
	Set the value of field authors
*/
public void setAuthors(ArrayList<Author> authors)
{
	this.authors = authors;
}

/**
	Lazy evaluation for references
*/
public ArrayList<Entity<ScholarlyArticle>>	references()
{
	ArrayList<Entity<ScholarlyArticle>>	result = this.references;
	if (result == null)
	{
		result = new ArrayList<Entity<ScholarlyArticle>>();
		this.references = result;
	}
	return result;
}

/**
	Get the value of field references
*/
public ArrayList<Entity<ScholarlyArticle>> getReferences()
{
	return this.references;
}

/**
	Set the value of field references
*/
public void setReferences(ArrayList<Entity<ScholarlyArticle>> references)
{
	this.references = references;
}

/**
	Lazy evaluation for citations
*/
public ArrayList<Entity<ScholarlyArticle>>	citations()
{
	ArrayList<Entity<ScholarlyArticle>>	result = this.citations;
	if (result == null)
	{
		result = new ArrayList<Entity<ScholarlyArticle>>();
		this.citations = result;
	}
	return result;
}

/**
	Get the value of field citations
*/
public ArrayList<Entity<ScholarlyArticle>> getCitations()
{
	return this.citations;
}

/**
	Set the value of field citations
*/
public void setCitations(ArrayList<Entity<ScholarlyArticle>> citations)
{
	this.citations = citations;
}

/**
	Lazy evaluation for classifications
*/
public ArrayList<Tag>	classifications()
{
	ArrayList<Tag>	result = this.classifications;
	if (result == null)
	{
		result = new ArrayList<Tag>();
		this.classifications = result;
	}
	return result;
}

/**
	Get the value of field classifications
*/
public ArrayList<Tag> getClassifications()
{
	return this.classifications;
}

/**
	Set the value of field classifications
*/
public void setClassifications(ArrayList<Tag> classifications)
{
	this.classifications = classifications;
}

/**
	Lazy evaluation for keywords
*/
public ArrayList<Tag>	keywords()
{
	ArrayList<Tag>	result = this.keywords;
	if (result == null)
	{
		result = new ArrayList<Tag>();
		this.keywords = result;
	}
	return result;
}

/**
	Get the value of field keywords
*/
public ArrayList<Tag> getKeywords()
{
	return this.keywords;
}

/**
	Set the value of field keywords
*/
public void setKeywords(ArrayList<Tag> keywords)
{
	this.keywords = keywords;
}

/**
	Lazy evaluation for pages
*/
public MetadataString	pages()
{
	MetadataString	result = this.pages;
	if (result == null)
	{
		result = new MetadataString();
		this.pages = result;
	}
	return result;
}

/**
	Gets the value of the field pages
*/
public String getPages()
{
	return this.pages().getValue();
}

/**
	Sets the value of the field pages
*/
public void setPages(String pages)
{
	this.pages().setValue(pages);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pages
*/
public boolean isNullPages()
{
	return pages == null || pages.getValue() == null;
}

/**
	The heavy weight setter method for field pages
*/
public void hwSetPages(String pages)
{
	this.pages().setValue(pages);
	rebuildCompositeTermVector();
}

/**
	 Sets the pages directly.
*/
public void setPagesMetadata(MetadataString pages)
{
	this.pages = pages;
}

/**
	Heavy Weight Direct setter method for pages
*/
public void hwSetPagesMetadata(MetadataString pages)
{
	if (this.pages != null && this.pages.getValue() != null && hasTermVector())
		termVector().remove(this.pages.termVector());
	this.pages = pages;
	rebuildCompositeTermVector();
}


}

