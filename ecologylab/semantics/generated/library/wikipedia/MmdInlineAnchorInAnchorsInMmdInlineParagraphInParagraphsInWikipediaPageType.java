package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString anchorText;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL link;

	/** 
	 */ 
	@simpl_scalar	private MetadataString targetTitle;

	public MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType()
	{ }

	public MmdInlineAnchorInAnchorsInMmdInlineParagraphInParagraphsInWikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	anchorText()
	{
		MetadataString	result = this.anchorText;
		if (result == null)
		{
			result = new MetadataString();
			this.anchorText = result;
		}
		return result;
	}

	public String getAnchorText()
	{
		return this.anchorText().getValue();
	}

	public void setAnchorText(String anchorText)
	{
		this.anchorText().setValue(anchorText);
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link().getValue();
	}

	public void setLink(ParsedURL link)
	{
		this.link().setValue(link);
	}

	public MetadataString	targetTitle()
	{
		MetadataString	result = this.targetTitle;
		if (result == null)
		{
			result = new MetadataString();
			this.targetTitle = result;
		}
		return result;
	}

	public String getTargetTitle()
	{
		return this.targetTitle().getValue();
	}

	public void setTargetTitle(String targetTitle)
	{
		this.targetTitle().setValue(targetTitle);
	}

}
