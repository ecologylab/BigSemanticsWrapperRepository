package ecologylab.semantics.generated.library.slashdot;


import ecologylab.semantics.generated.library.rss.Item;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;


/**
	One item in a feed.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class SlashdotItem
extends Item
{

@simpl_scalar @xml_tag("slash:department") @simpl_hints(Hint.XML_LEAF)
private MetadataString	department;

@simpl_scalar @xml_tag("slash:section") @simpl_hints(Hint.XML_LEAF)
private MetadataString	section;



/**
	Constructor
*/
public SlashdotItem()
{
 super();
}

/**
	Constructor
*/
public SlashdotItem(MetaMetadataCompositeField metaMetadata)
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

/**
	Lazy evaluation for section
*/
public MetadataString	section()
{
	MetadataString	result = this.section;
	if (result == null)
	{
		result = new MetadataString();
		this.section = result;
	}
	return result;
}

/**
	Gets the value of the field section
*/
public String getSection()
{
	return this.section().getValue();
}

/**
	Sets the value of the field section
*/
public void setSection(String section)
{
	this.section().setValue(section);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: section
*/
public boolean isNullSection()
{
	return section == null || section.getValue() == null;
}

/**
	The heavy weight setter method for field section
*/
public void hwSetSection(String section)
{
	this.section().setValue(section);
	rebuildCompositeTermVector();
}

/**
	 Sets the section directly.
*/
public void setSectionMetadata(MetadataString section)
{
	this.section = section;
}

/**
	Heavy Weight Direct setter method for section
*/
public void hwSetSectionMetadata(MetadataString section)
{
	if (this.section != null && this.section.getValue() != null && hasTermVector())
		termVector().remove(this.section.termVector());
	this.section = section;
	rebuildCompositeTermVector();
}


}

