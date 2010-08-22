package ecologylab.semantics.generated.library.products;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
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
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;

@simpl_inherit

public class  Product
extends  Document
{

	@simpl_scalar private MetadataString	price;

/**
	Constructor
**/ 

public Product()
{
 super();
}

/**
	Constructor
**/ 

public Product(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for price
**/ 

public MetadataString	price()
{
MetadataString	result	=this.price;
if(result == null)
{
result = new MetadataString();
this.price	=	 result;
}
return result;
}

/**
	Gets the value of the field price
**/ 

public String getPrice(){
return price().getValue();
}

/**
	Sets the value of the field price
**/ 

public void setPrice( String price )
{
this.price().setValue(price);
}

/**
	The heavy weight setter method for field price
**/ 

public void hwSetPrice( String price )
{
this.price().setValue(price);
rebuildCompositeTermVector();
 }
/**
	 Sets the price directly
**/ 

public void setPriceMetadata(MetadataString price)
{	this.price = price;
}
/**
	Heavy Weight Direct setter method for price
**/ 

public void hwSetPriceMetadata(MetadataString price)
{	 if(this.price!=null && this.price.getValue()!=null && hasTermVector())
		 termVector().remove(this.price.termVector());
	 this.price = price;
	rebuildCompositeTermVector();
}
}

