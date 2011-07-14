package ecologylab.semantics.generated.library.nsdl;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineHeaderInNsdlDocument.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineHeaderInNsdlDocument extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("resourceIdentifier")	private MetadataParsedURL resourceIdentifier;

	public MmdInlineHeaderInNsdlDocument()
	{ }

	public MmdInlineHeaderInNsdlDocument(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	resourceIdentifier()
	{
		MetadataParsedURL	result = this.resourceIdentifier;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.resourceIdentifier = result;
		}
		return result;
	}

	public ParsedURL getResourceIdentifier()
	{
		return this.resourceIdentifier().getValue();
	}

	public void setResourceIdentifier(ParsedURL resourceIdentifier)
	{
		this.resourceIdentifier().setValue(resourceIdentifier);
	}

}
