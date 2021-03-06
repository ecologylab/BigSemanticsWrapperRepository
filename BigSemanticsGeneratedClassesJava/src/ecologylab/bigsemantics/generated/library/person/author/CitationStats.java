package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataInteger;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class CitationStats extends Metadata
{
	@simpl_scalar
	private MetadataInteger recentHIndex;

	@simpl_scalar
	private MetadataInteger recentI10Index;

	@simpl_scalar
	private MetadataInteger recentCitations;

	@simpl_scalar
	private MetadataInteger allCitations;

	@simpl_scalar
	private MetadataInteger allHIndex;

	@simpl_scalar
	private MetadataInteger allI10Index;

	@simpl_scalar
	private MetadataString howRecent;

	public CitationStats()
	{ super(); }

	public CitationStats(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	recentHIndex()
	{
		MetadataInteger	result = this.recentHIndex;
		if (result == null)
		{
			result = new MetadataInteger();
			this.recentHIndex = result;
		}
		return result;
	}

	public Integer getRecentHIndex()
	{
		return this.recentHIndex == null ? 0 : recentHIndex().getValue();
	}

	public MetadataInteger getRecentHIndexMetadata()
	{
		return recentHIndex;
	}

	public void setRecentHIndex(Integer recentHIndex)
	{
		if (recentHIndex != 0)
			this.recentHIndex().setValue(recentHIndex);
	}

	public void setRecentHIndexMetadata(MetadataInteger recentHIndex)
	{
		this.recentHIndex = recentHIndex;
	}

	public MetadataInteger	recentI10Index()
	{
		MetadataInteger	result = this.recentI10Index;
		if (result == null)
		{
			result = new MetadataInteger();
			this.recentI10Index = result;
		}
		return result;
	}

	public Integer getRecentI10Index()
	{
		return this.recentI10Index == null ? 0 : recentI10Index().getValue();
	}

	public MetadataInteger getRecentI10IndexMetadata()
	{
		return recentI10Index;
	}

	public void setRecentI10Index(Integer recentI10Index)
	{
		if (recentI10Index != 0)
			this.recentI10Index().setValue(recentI10Index);
	}

	public void setRecentI10IndexMetadata(MetadataInteger recentI10Index)
	{
		this.recentI10Index = recentI10Index;
	}

	public MetadataInteger	recentCitations()
	{
		MetadataInteger	result = this.recentCitations;
		if (result == null)
		{
			result = new MetadataInteger();
			this.recentCitations = result;
		}
		return result;
	}

	public Integer getRecentCitations()
	{
		return this.recentCitations == null ? 0 : recentCitations().getValue();
	}

	public MetadataInteger getRecentCitationsMetadata()
	{
		return recentCitations;
	}

	public void setRecentCitations(Integer recentCitations)
	{
		if (recentCitations != 0)
			this.recentCitations().setValue(recentCitations);
	}

	public void setRecentCitationsMetadata(MetadataInteger recentCitations)
	{
		this.recentCitations = recentCitations;
	}

	public MetadataInteger	allCitations()
	{
		MetadataInteger	result = this.allCitations;
		if (result == null)
		{
			result = new MetadataInteger();
			this.allCitations = result;
		}
		return result;
	}

	public Integer getAllCitations()
	{
		return this.allCitations == null ? 0 : allCitations().getValue();
	}

	public MetadataInteger getAllCitationsMetadata()
	{
		return allCitations;
	}

	public void setAllCitations(Integer allCitations)
	{
		if (allCitations != 0)
			this.allCitations().setValue(allCitations);
	}

	public void setAllCitationsMetadata(MetadataInteger allCitations)
	{
		this.allCitations = allCitations;
	}

	public MetadataInteger	allHIndex()
	{
		MetadataInteger	result = this.allHIndex;
		if (result == null)
		{
			result = new MetadataInteger();
			this.allHIndex = result;
		}
		return result;
	}

	public Integer getAllHIndex()
	{
		return this.allHIndex == null ? 0 : allHIndex().getValue();
	}

	public MetadataInteger getAllHIndexMetadata()
	{
		return allHIndex;
	}

	public void setAllHIndex(Integer allHIndex)
	{
		if (allHIndex != 0)
			this.allHIndex().setValue(allHIndex);
	}

	public void setAllHIndexMetadata(MetadataInteger allHIndex)
	{
		this.allHIndex = allHIndex;
	}

	public MetadataInteger	allI10Index()
	{
		MetadataInteger	result = this.allI10Index;
		if (result == null)
		{
			result = new MetadataInteger();
			this.allI10Index = result;
		}
		return result;
	}

	public Integer getAllI10Index()
	{
		return this.allI10Index == null ? 0 : allI10Index().getValue();
	}

	public MetadataInteger getAllI10IndexMetadata()
	{
		return allI10Index;
	}

	public void setAllI10Index(Integer allI10Index)
	{
		if (allI10Index != 0)
			this.allI10Index().setValue(allI10Index);
	}

	public void setAllI10IndexMetadata(MetadataInteger allI10Index)
	{
		this.allI10Index = allI10Index;
	}

	public MetadataString	howRecent()
	{
		MetadataString	result = this.howRecent;
		if (result == null)
		{
			result = new MetadataString();
			this.howRecent = result;
		}
		return result;
	}

	public String getHowRecent()
	{
		return this.howRecent == null ? null : howRecent().getValue();
	}

	public MetadataString getHowRecentMetadata()
	{
		return howRecent;
	}

	public void setHowRecent(String howRecent)
	{
		if (howRecent != null)
			this.howRecent().setValue(howRecent);
	}

	public void setHowRecentMetadata(MetadataString howRecent)
	{
		this.howRecent = howRecent;
	}
}
