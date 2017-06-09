package ecologylab.bigsemantics.generated.library.search;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.search.YahooResult;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class YahooGeoCodeResult extends YahooResult
{
	@simpl_scalar
	private MetadataString country;

	@simpl_scalar
	private MetadataString city;

	@simpl_scalar
	private MetadataString county;

	@simpl_scalar
	private MetadataString state;

	@simpl_scalar
	private MetadataString postal;

	@simpl_scalar
	private MetadataString line2;

	@simpl_scalar
	private MetadataString line1;

	public YahooGeoCodeResult()
	{ super(); }

	public YahooGeoCodeResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	country()
	{
		MetadataString	result = this.country;
		if (result == null)
		{
			result = new MetadataString();
			this.country = result;
		}
		return result;
	}

	public String getCountry()
	{
		return this.country == null ? null : country().getValue();
	}

	public MetadataString getCountryMetadata()
	{
		return country;
	}

	public void setCountry(String country)
	{
		if (country != null)
			this.country().setValue(country);
	}

	public void setCountryMetadata(MetadataString country)
	{
		this.country = country;
	}

	public MetadataString	city()
	{
		MetadataString	result = this.city;
		if (result == null)
		{
			result = new MetadataString();
			this.city = result;
		}
		return result;
	}

	public String getCity()
	{
		return this.city == null ? null : city().getValue();
	}

	public MetadataString getCityMetadata()
	{
		return city;
	}

	public void setCity(String city)
	{
		if (city != null)
			this.city().setValue(city);
	}

	public void setCityMetadata(MetadataString city)
	{
		this.city = city;
	}

	public MetadataString	county()
	{
		MetadataString	result = this.county;
		if (result == null)
		{
			result = new MetadataString();
			this.county = result;
		}
		return result;
	}

	public String getCounty()
	{
		return this.county == null ? null : county().getValue();
	}

	public MetadataString getCountyMetadata()
	{
		return county;
	}

	public void setCounty(String county)
	{
		if (county != null)
			this.county().setValue(county);
	}

	public void setCountyMetadata(MetadataString county)
	{
		this.county = county;
	}

	public MetadataString	state()
	{
		MetadataString	result = this.state;
		if (result == null)
		{
			result = new MetadataString();
			this.state = result;
		}
		return result;
	}

	public String getState()
	{
		return this.state == null ? null : state().getValue();
	}

	public MetadataString getStateMetadata()
	{
		return state;
	}

	public void setState(String state)
	{
		if (state != null)
			this.state().setValue(state);
	}

	public void setStateMetadata(MetadataString state)
	{
		this.state = state;
	}

	public MetadataString	postal()
	{
		MetadataString	result = this.postal;
		if (result == null)
		{
			result = new MetadataString();
			this.postal = result;
		}
		return result;
	}

	public String getPostal()
	{
		return this.postal == null ? null : postal().getValue();
	}

	public MetadataString getPostalMetadata()
	{
		return postal;
	}

	public void setPostal(String postal)
	{
		if (postal != null)
			this.postal().setValue(postal);
	}

	public void setPostalMetadata(MetadataString postal)
	{
		this.postal = postal;
	}

	public MetadataString	line2()
	{
		MetadataString	result = this.line2;
		if (result == null)
		{
			result = new MetadataString();
			this.line2 = result;
		}
		return result;
	}

	public String getLine2()
	{
		return this.line2 == null ? null : line2().getValue();
	}

	public MetadataString getLine2Metadata()
	{
		return line2;
	}

	public void setLine2(String line2)
	{
		if (line2 != null)
			this.line2().setValue(line2);
	}

	public void setLine2Metadata(MetadataString line2)
	{
		this.line2 = line2;
	}

	public MetadataString	line1()
	{
		MetadataString	result = this.line1;
		if (result == null)
		{
			result = new MetadataString();
			this.line1 = result;
		}
		return result;
	}

	public String getLine1()
	{
		return this.line1 == null ? null : line1().getValue();
	}

	public MetadataString getLine1Metadata()
	{
		return line1;
	}

	public void setLine1(String line1)
	{
		if (line1 != null)
			this.line1().setValue(line1);
	}

	public void setLine1Metadata(MetadataString line1)
	{
		this.line1 = line1;
	}
}
