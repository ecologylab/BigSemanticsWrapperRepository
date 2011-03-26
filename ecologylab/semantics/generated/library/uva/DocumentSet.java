package ecologylab.semantics.generated.library.uva;


import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class DocumentSet
extends Metadata
{

@simpl_collection("document") @simpl_nowrap @mm_name("documents")
private ArrayList<Document>	documents;



/**
	Constructor
*/
public DocumentSet()
{
 super();
}

/**
	Constructor
*/
public DocumentSet(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for documents
*/
public ArrayList<Document>	documents()
{
	ArrayList<Document>	result = this.documents;
	if (result == null)
	{
		result = new ArrayList<Document>();
		this.documents = result;
	}
	return result;
}

/**
	Get the value of field documents
*/
public ArrayList<Document> getDocuments()
{
	return this.documents;
}

/**
	Set the value of field documents
*/
public void setDocuments(ArrayList<Document> documents)
{
	this.documents = documents;
}


}

