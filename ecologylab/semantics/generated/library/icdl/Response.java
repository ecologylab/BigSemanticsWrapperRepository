package ecologylab.semantics.generated.library.icdl;


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
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
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
public class Response
extends Metadata
{

@simpl_scalar
private MetadataInteger	pnum;

@simpl_scalar
private MetadataInteger	total;

@simpl_collection("book") @simpl_nowrap @mm_name("books")
private ArrayList<Book>	books;



/**
	Constructor
*/
public Response()
{
 super();
}

/**
	Constructor
*/
public Response(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for pnum
*/
public MetadataInteger	pnum()
{
	MetadataInteger	result = this.pnum;
	if (result == null)
	{
		result = new MetadataInteger();
		this.pnum = result;
	}
	return result;
}

/**
	Gets the value of the field pnum
*/
public Integer getPnum()
{
	return this.pnum().getValue();
}

/**
	Sets the value of the field pnum
*/
public void setPnum(Integer pnum)
{
	this.pnum().setValue(pnum);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: pnum
*/
public boolean isNullPnum()
{
	return pnum == null || pnum.getValue() == null;
}

/**
	The heavy weight setter method for field pnum
*/
public void hwSetPnum(Integer pnum)
{
	this.pnum().setValue(pnum);
	rebuildCompositeTermVector();
}

/**
	 Sets the pnum directly.
*/
public void setPnumMetadata(MetadataInteger pnum)
{
	this.pnum = pnum;
}

/**
	Heavy Weight Direct setter method for pnum
*/
public void hwSetPnumMetadata(MetadataInteger pnum)
{
	if (this.pnum != null && this.pnum.getValue() != null && hasTermVector())
		termVector().remove(this.pnum.termVector());
	this.pnum = pnum;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for total
*/
public MetadataInteger	total()
{
	MetadataInteger	result = this.total;
	if (result == null)
	{
		result = new MetadataInteger();
		this.total = result;
	}
	return result;
}

/**
	Gets the value of the field total
*/
public Integer getTotal()
{
	return this.total().getValue();
}

/**
	Sets the value of the field total
*/
public void setTotal(Integer total)
{
	this.total().setValue(total);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: total
*/
public boolean isNullTotal()
{
	return total == null || total.getValue() == null;
}

/**
	The heavy weight setter method for field total
*/
public void hwSetTotal(Integer total)
{
	this.total().setValue(total);
	rebuildCompositeTermVector();
}

/**
	 Sets the total directly.
*/
public void setTotalMetadata(MetadataInteger total)
{
	this.total = total;
}

/**
	Heavy Weight Direct setter method for total
*/
public void hwSetTotalMetadata(MetadataInteger total)
{
	if (this.total != null && this.total.getValue() != null && hasTermVector())
		termVector().remove(this.total.termVector());
	this.total = total;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for books
*/
public ArrayList<Book>	books()
{
	ArrayList<Book>	result = this.books;
	if (result == null)
	{
		result = new ArrayList<Book>();
		this.books = result;
	}
	return result;
}

/**
	Get the value of field books
*/
public ArrayList<Book> getBooks()
{
	return this.books;
}

/**
	Set the value of field books
*/
public void setBooks(ArrayList<Book> books)
{
	this.books = books;
}


}

