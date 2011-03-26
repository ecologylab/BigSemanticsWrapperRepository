package ecologylab.semantics.generated.library.opml;


import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Body
extends Metadata
{

@simpl_collection("outline") @simpl_nowrap @mm_name("outline")
private ArrayList<Outline>	outline;



/**
	Constructor
*/
public Body()
{
 super();
}

/**
	Constructor
*/
public Body(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for outline
*/
public ArrayList<Outline>	outline()
{
	ArrayList<Outline>	result = this.outline;
	if (result == null)
	{
		result = new ArrayList<Outline>();
		this.outline = result;
	}
	return result;
}

/**
	Get the value of field outline
*/
public ArrayList<Outline> getOutline()
{
	return this.outline;
}

/**
	Set the value of field outline
*/
public void setOutline(ArrayList<Outline> outline)
{
	this.outline = outline;
}


}

