package ecologylab.semantics.generated.library.nsdl;

import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.generated.library.nsdl.Header;
import ecologylab.semantics.generated.library.rss.Dc;
import ecologylab.serialization.simpl_inherit;

/**
*  NsdlDocument.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/05/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class NsdlDocument extends Dc
{
	/** 
	 */ 
	@simpl_composite	@mm_name("header")
	private Header header;

	public NsdlDocument()
	{ }

	public NsdlDocument(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Header getHeader()
	{
		return header;
	}

	public void setHeader(Header header)
	{
		this.header = header;
	}
}
