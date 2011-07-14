package ecologylab.semantics.generated.library.rss;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.library.rss.Dc;
import ecologylab.semantics.generated.library.rss.MmdInlineMediaContentInYahooMediaRss;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  YahooMediaRss.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * News feeds.
 */ 
@simpl_inherit
public class YahooMediaRss extends Dc
{
	/** 
	 */ 
	@simpl_composite @mm_name("media_content")	private MmdInlineMediaContentInYahooMediaRss mediaContent;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("media:description")	@simpl_hints(Hint.XML_LEAF)	private MetadataString mediaDescription;

	public YahooMediaRss()
	{ }

	public YahooMediaRss(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MmdInlineMediaContentInYahooMediaRss getMediaContent()
	{
		return mediaContent;
	}

	public void setMediaContent(MmdInlineMediaContentInYahooMediaRss mediaContent)
	{
		this.mediaContent = mediaContent;
	}
	public MetadataString	mediaDescription()
	{
		MetadataString	result = this.mediaDescription;
		if (result == null)
		{
			result = new MetadataString();
			this.mediaDescription = result;
		}
		return result;
	}

	public String getMediaDescription()
	{
		return this.mediaDescription().getValue();
	}

	public void setMediaDescription(String mediaDescription)
	{
		this.mediaDescription().setValue(mediaDescription);
	}

}
