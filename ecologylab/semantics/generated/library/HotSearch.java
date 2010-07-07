package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.Hint;
import ecologylab.xml.simpl_inherit;

@simpl_inherit

public class HotSearch extends Metadata{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	search;

/**
	Constructor
**/ 

public HotSearch()
{
 super();
}

/**
	Constructor
**/ 

public HotSearch(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for search
**/ 

public MetadataString	search()
{
MetadataString	result	=this.search;
if(result == null)
{
result = new MetadataString();
this.search	=	 result;
}
return result;
}

/**
	Gets the value of the field search
**/ 

public String getSearch(){
return search().getValue();
}

/**
	Sets the value of the field search
**/ 

public void setSearch( String search )
{
this.search().setValue(search);
}

/**
	The heavy weight setter method for field search
**/ 

public void hwSetSearch( String search )
{
this.search().setValue(search);
rebuildCompositeTermVector();
 }
/**
	 Sets the search directly
**/ 

public void setSearchMetadata(MetadataString search)
{	this.search = search;
}
/**
	Heavy Weight Direct setter method for search
**/ 

public void hwSetSearchMetadata(MetadataString search)
{	 if(this.search!=null && this.search.getValue()!=null && hasTermVector())
		 termVector().remove(this.search.termVector());
	 this.search = search;
	rebuildCompositeTermVector();
}}
