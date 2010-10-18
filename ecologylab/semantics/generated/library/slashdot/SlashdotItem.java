package ecologylab.semantics.generated.library.slashdot;

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
	One item in a feed.
**/ 

@simpl_inherit

public class  SlashdotItem
extends  Item
{

	@xml_tag("slash:department")@simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	department;
	@xml_tag("slash:section")@simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	section;

/**
	Constructor
**/ 

public SlashdotItem()
{
 super();
}

/**
	Constructor
**/ 

public SlashdotItem(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for department
**/ 

public MetadataString	department()
{
MetadataString	result	=this.department;
if(result == null)
{
result = new MetadataString();
this.department	=	 result;
}
return result;
}

/**
	Gets the value of the field department
**/ 

public String getDepartment()
{
	return department().getValue();
}

/**
	Sets the value of the field department
**/ 

public void setDepartment( String department )
{
	this.department().setValue(department);
}

/**
	The heavy weight setter method for field department
**/ 

public void hwSetDepartment( String department )
{
	this.department().setValue(department);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: department
**/ 

public boolean isNullDepartment()
{
	return department == null || department.getValue() == null;
}

/**
	 Sets the department directly
**/ 

public void setDepartmentMetadata(MetadataString department)
{	this.department = department;
}
/**
	Heavy Weight Direct setter method for department
**/ 

public void hwSetDepartmentMetadata(MetadataString department)
{	 if(this.department!=null && this.department.getValue()!=null && hasTermVector())
		 termVector().remove(this.department.termVector());
	 this.department = department;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for section
**/ 

public MetadataString	section()
{
MetadataString	result	=this.section;
if(result == null)
{
result = new MetadataString();
this.section	=	 result;
}
return result;
}

/**
	Gets the value of the field section
**/ 

public String getSection()
{
	return section().getValue();
}

/**
	Sets the value of the field section
**/ 

public void setSection( String section )
{
	this.section().setValue(section);
}

/**
	The heavy weight setter method for field section
**/ 

public void hwSetSection( String section )
{
	this.section().setValue(section);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: section
**/ 

public boolean isNullSection()
{
	return section == null || section.getValue() == null;
}

/**
	 Sets the section directly
**/ 

public void setSectionMetadata(MetadataString section)
{	this.section = section;
}
/**
	Heavy Weight Direct setter method for section
**/ 

public void hwSetSectionMetadata(MetadataString section)
{	 if(this.section!=null && this.section.getValue()!=null && hasTermVector())
		 termVector().remove(this.section.termVector());
	 this.section = section;
	rebuildCompositeTermVector();
}
}

