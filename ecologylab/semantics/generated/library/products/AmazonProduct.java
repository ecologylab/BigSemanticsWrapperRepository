package ecologylab.semantics.generated.library.products;


import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.artwork.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.camera.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.googleBooks.*;
import ecologylab.semantics.generated.library.gps.*;
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
public class AmazonProduct
extends Product
{

@simpl_scalar
private MetadataString	department;



/**
	Constructor
*/
public AmazonProduct()
{
 super();
}

/**
	Constructor
*/
public AmazonProduct(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for department
*/
public MetadataString	department()
{
	MetadataString	result = this.department;
	if (result == null)
	{
		result = new MetadataString();
		this.department = result;
	}
	return result;
}

/**
	Gets the value of the field department
*/
public String getDepartment()
{
	return this.department().getValue();
}

/**
	Sets the value of the field department
*/
public void setDepartment(String department)
{
	this.department().setValue(department);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: department
*/
public boolean isNullDepartment()
{
	return department == null || department.getValue() == null;
}

/**
	The heavy weight setter method for field department
*/
public void hwSetDepartment(String department)
{
	this.department().setValue(department);
	rebuildCompositeTermVector();
}

/**
	 Sets the department directly.
*/
public void setDepartmentMetadata(MetadataString department)
{
	this.department = department;
}

/**
	Heavy Weight Direct setter method for department
*/
public void hwSetDepartmentMetadata(MetadataString department)
{
	if (this.department != null && this.department.getValue() != null && hasTermVector())
		termVector().remove(this.department.termVector());
	this.department = department;
	rebuildCompositeTermVector();
}


}

