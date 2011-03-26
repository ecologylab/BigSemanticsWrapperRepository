package ecologylab.semantics.generated.library.fastflip;


import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	Fast Flip Search

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class FastflipSearch
extends Document
{

@simpl_collection("thumbnail") @xml_tag("thumbnails") @mm_name("thumbnails")
private ArrayList<Thumbnail>	thumbnails;



/**
	Constructor
*/
public FastflipSearch()
{
 super();
}

/**
	Constructor
*/
public FastflipSearch(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for thumbnails
*/
public ArrayList<Thumbnail>	thumbnails()
{
	ArrayList<Thumbnail>	result = this.thumbnails;
	if (result == null)
	{
		result = new ArrayList<Thumbnail>();
		this.thumbnails = result;
	}
	return result;
}

/**
	Get the value of field thumbnails
*/
public ArrayList<Thumbnail> getThumbnails()
{
	return this.thumbnails;
}

/**
	Set the value of field thumbnails
*/
public void setThumbnails(ArrayList<Thumbnail> thumbnails)
{
	this.thumbnails = thumbnails;
}


}

