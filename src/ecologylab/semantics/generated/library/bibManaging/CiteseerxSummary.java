package ecologylab.semantics.generated.library.bibManaging;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.bibManaging.CiteseerxRecord;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.List;
import java.util.Map;

/** 
 *Summary page from CiteSeerX.
 */ 
@simpl_inherit
public class CiteseerxSummary extends CiteseerxRecord
{
	@simpl_scalar
	private MetadataParsedURL citationPage;

	/** 
	 *Papers that cite the same works.
	 */ 
	@simpl_scalar
	private MetadataParsedURL activeBibliographyPage;

	/** 
	 *Papers that are cited by the same works.
	 */ 
	@simpl_scalar
	private MetadataParsedURL cocitationPage;

	public CiteseerxSummary()
	{ }

	public CiteseerxSummary(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	citationPage()
	{
		MetadataParsedURL	result = this.citationPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.citationPage = result;
		}
		return result;
	}

	public ParsedURL getCitationPage()
	{
		return this.citationPage == null ? null : citationPage().getValue();
	}

	public MetadataParsedURL getCitationPageMetadata()
	{
		return citationPage;
	}

	public void setCitationPage(ParsedURL citationPage)
	{
		if (citationPage != null)
			this.citationPage().setValue(citationPage);
	}

	public void setCitationPageMetadata(MetadataParsedURL citationPage)
	{
		this.citationPage = citationPage;
	}

	public MetadataParsedURL	activeBibliographyPage()
	{
		MetadataParsedURL	result = this.activeBibliographyPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.activeBibliographyPage = result;
		}
		return result;
	}

	public ParsedURL getActiveBibliographyPage()
	{
		return this.activeBibliographyPage == null ? null : activeBibliographyPage().getValue();
	}

	public MetadataParsedURL getActiveBibliographyPageMetadata()
	{
		return activeBibliographyPage;
	}

	public void setActiveBibliographyPage(ParsedURL activeBibliographyPage)
	{
		if (activeBibliographyPage != null)
			this.activeBibliographyPage().setValue(activeBibliographyPage);
	}

	public void setActiveBibliographyPageMetadata(MetadataParsedURL activeBibliographyPage)
	{
		this.activeBibliographyPage = activeBibliographyPage;
	}

	public MetadataParsedURL	cocitationPage()
	{
		MetadataParsedURL	result = this.cocitationPage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.cocitationPage = result;
		}
		return result;
	}

	public ParsedURL getCocitationPage()
	{
		return this.cocitationPage == null ? null : cocitationPage().getValue();
	}

	public MetadataParsedURL getCocitationPageMetadata()
	{
		return cocitationPage;
	}

	public void setCocitationPage(ParsedURL cocitationPage)
	{
		if (cocitationPage != null)
			this.cocitationPage().setValue(cocitationPage);
	}

	public void setCocitationPageMetadata(MetadataParsedURL cocitationPage)
	{
		this.cocitationPage = cocitationPage;
	}
}
