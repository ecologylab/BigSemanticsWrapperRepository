package ecologylab.semantics.generated.library.bibManaging;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
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
	Summary page from CiteSeerX.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class CiteseerxSummary
extends CiteseerxRecord
{

@simpl_scalar
private MetadataParsedURL	citationPage;

@simpl_scalar
private MetadataParsedURL	cocitationPage;



/**
	Constructor
*/
public CiteseerxSummary()
{
 super();
}

/**
	Constructor
*/
public CiteseerxSummary(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for citationPage
*/
public MetadataParsedURL	citationPage()
{
	MetadataParsedURL	result = this.citationPage;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.citationPage = result;
	}
	return result;
}

/**
	Gets the value of the field citationPage
*/
public ParsedURL getCitationPage()
{
	return this.citationPage().getValue();
}

/**
	Sets the value of the field citationPage
*/
public void setCitationPage(ParsedURL citationPage)
{
	this.citationPage().setValue(citationPage);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: citationPage
*/
public boolean isNullCitationPage()
{
	return citationPage == null || citationPage.getValue() == null;
}

/**
	The heavy weight setter method for field citationPage
*/
public void hwSetCitationPage(ParsedURL citationPage)
{
	this.citationPage().setValue(citationPage);
	rebuildCompositeTermVector();
}

/**
	 Sets the citationPage directly.
*/
public void setCitationPageMetadata(MetadataParsedURL citationPage)
{
	this.citationPage = citationPage;
}

/**
	Heavy Weight Direct setter method for citationPage
*/
public void hwSetCitationPageMetadata(MetadataParsedURL citationPage)
{
	if (this.citationPage != null && this.citationPage.getValue() != null && hasTermVector())
		termVector().remove(this.citationPage.termVector());
	this.citationPage = citationPage;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for cocitationPage
*/
public MetadataParsedURL	cocitationPage()
{
	MetadataParsedURL	result = this.cocitationPage;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.cocitationPage = result;
	}
	return result;
}

/**
	Gets the value of the field cocitationPage
*/
public ParsedURL getCocitationPage()
{
	return this.cocitationPage().getValue();
}

/**
	Sets the value of the field cocitationPage
*/
public void setCocitationPage(ParsedURL cocitationPage)
{
	this.cocitationPage().setValue(cocitationPage);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: cocitationPage
*/
public boolean isNullCocitationPage()
{
	return cocitationPage == null || cocitationPage.getValue() == null;
}

/**
	The heavy weight setter method for field cocitationPage
*/
public void hwSetCocitationPage(ParsedURL cocitationPage)
{
	this.cocitationPage().setValue(cocitationPage);
	rebuildCompositeTermVector();
}

/**
	 Sets the cocitationPage directly.
*/
public void setCocitationPageMetadata(MetadataParsedURL cocitationPage)
{
	this.cocitationPage = cocitationPage;
}

/**
	Heavy Weight Direct setter method for cocitationPage
*/
public void hwSetCocitationPageMetadata(MetadataParsedURL cocitationPage)
{
	if (this.cocitationPage != null && this.cocitationPage.getValue() != null && hasTermVector())
		termVector().remove(this.cocitationPage.termVector());
	this.cocitationPage = cocitationPage;
	rebuildCompositeTermVector();
}


}

