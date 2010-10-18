package ecologylab.semantics.generated.library.bibManaging;

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


/**
	Summary page from CiteSeerX.
**/ 

@simpl_inherit

public class  CiteseerxSummary
extends  CiteseerxRecord
{

	@simpl_scalar private MetadataString	sourceBibtex;
	@simpl_scalar private MetadataParsedURL	citationPage;
	@simpl_scalar private MetadataParsedURL	cocitationPage;

/**
	Constructor
**/ 

public CiteseerxSummary()
{
 super();
}

/**
	Constructor
**/ 

public CiteseerxSummary(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for sourceBibtex
**/ 

public MetadataString	sourceBibtex()
{
MetadataString	result	=this.sourceBibtex;
if(result == null)
{
result = new MetadataString();
this.sourceBibtex	=	 result;
}
return result;
}

/**
	Gets the value of the field sourceBibtex
**/ 

public String getSourceBibtex()
{
	return sourceBibtex().getValue();
}

/**
	Sets the value of the field sourceBibtex
**/ 

public void setSourceBibtex( String sourceBibtex )
{
	this.sourceBibtex().setValue(sourceBibtex);
}

/**
	The heavy weight setter method for field sourceBibtex
**/ 

public void hwSetSourceBibtex( String sourceBibtex )
{
	this.sourceBibtex().setValue(sourceBibtex);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: sourceBibtex
**/ 

public boolean isNullSourceBibtex()
{
	return sourceBibtex == null || sourceBibtex.getValue() == null;
}

/**
	 Sets the sourceBibtex directly
**/ 

public void setSourceBibtexMetadata(MetadataString sourceBibtex)
{	this.sourceBibtex = sourceBibtex;
}
/**
	Heavy Weight Direct setter method for sourceBibtex
**/ 

public void hwSetSourceBibtexMetadata(MetadataString sourceBibtex)
{	 if(this.sourceBibtex!=null && this.sourceBibtex.getValue()!=null && hasTermVector())
		 termVector().remove(this.sourceBibtex.termVector());
	 this.sourceBibtex = sourceBibtex;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for citationPage
**/ 

public MetadataParsedURL	citationPage()
{
MetadataParsedURL	result	=this.citationPage;
if(result == null)
{
result = new MetadataParsedURL();
this.citationPage	=	 result;
}
return result;
}

/**
	Gets the value of the field citationPage
**/ 

public ParsedURL getCitationPage()
{
	return citationPage().getValue();
}

/**
	Sets the value of the field citationPage
**/ 

public void setCitationPage( ParsedURL citationPage )
{
	this.citationPage().setValue(citationPage);
}

/**
	The heavy weight setter method for field citationPage
**/ 

public void hwSetCitationPage( ParsedURL citationPage )
{
	this.citationPage().setValue(citationPage);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: citationPage
**/ 

public boolean isNullCitationPage()
{
	return citationPage == null || citationPage.getValue() == null;
}

/**
	 Sets the citationPage directly
**/ 

public void setCitationPageMetadata(MetadataParsedURL citationPage)
{	this.citationPage = citationPage;
}
/**
	Heavy Weight Direct setter method for citationPage
**/ 

public void hwSetCitationPageMetadata(MetadataParsedURL citationPage)
{	 if(this.citationPage!=null && this.citationPage.getValue()!=null && hasTermVector())
		 termVector().remove(this.citationPage.termVector());
	 this.citationPage = citationPage;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for cocitationPage
**/ 

public MetadataParsedURL	cocitationPage()
{
MetadataParsedURL	result	=this.cocitationPage;
if(result == null)
{
result = new MetadataParsedURL();
this.cocitationPage	=	 result;
}
return result;
}

/**
	Gets the value of the field cocitationPage
**/ 

public ParsedURL getCocitationPage()
{
	return cocitationPage().getValue();
}

/**
	Sets the value of the field cocitationPage
**/ 

public void setCocitationPage( ParsedURL cocitationPage )
{
	this.cocitationPage().setValue(cocitationPage);
}

/**
	The heavy weight setter method for field cocitationPage
**/ 

public void hwSetCocitationPage( ParsedURL cocitationPage )
{
	this.cocitationPage().setValue(cocitationPage);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: cocitationPage
**/ 

public boolean isNullCocitationPage()
{
	return cocitationPage == null || cocitationPage.getValue() == null;
}

/**
	 Sets the cocitationPage directly
**/ 

public void setCocitationPageMetadata(MetadataParsedURL cocitationPage)
{	this.cocitationPage = cocitationPage;
}
/**
	Heavy Weight Direct setter method for cocitationPage
**/ 

public void hwSetCocitationPageMetadata(MetadataParsedURL cocitationPage)
{	 if(this.cocitationPage!=null && this.cocitationPage.getValue()!=null && hasTermVector())
		 termVector().remove(this.cocitationPage.termVector());
	 this.cocitationPage = cocitationPage;
	rebuildCompositeTermVector();
}
}

