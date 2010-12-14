package ecologylab.semantics.generated.library;


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
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	The definition of weather report class.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class WeatherReport
extends Document
{


/**
	The name of the city.
*/
@simpl_scalar
private MetadataString	city;


/**
	The weather condition of the city, like sunny or cloudy.
*/
@simpl_scalar
private MetadataString	weather;


/**
	The URL of the picture indicating weather condition.
*/
@simpl_scalar
private MetadataParsedURL	picUrl;


/**
	The temperature.
*/
@simpl_scalar
private MetadataString	temperature;


/**
	The humidity of the air.
*/
@simpl_scalar
private MetadataString	humidity;


/**
	The wind speed.
*/
@simpl_scalar
private MetadataString	wind;


/**
	The dew point.
*/
@simpl_scalar
private MetadataString	dewPoint;



/**
	Constructor
*/
public WeatherReport()
{
 super();
}

/**
	Constructor
*/
public WeatherReport(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for city
*/
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

/**
	Gets the value of the field city
*/
public String getCity()
{
	return this.city().getValue();
}

/**
	Sets the value of the field city
*/
public void setCity(String city)
{
	this.city().setValue(city);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: city
*/
public boolean isNullCity()
{
	return city == null || city.getValue() == null;
}

/**
	The heavy weight setter method for field city
*/
public void hwSetCity(String city)
{
	this.city().setValue(city);
	rebuildCompositeTermVector();
}

/**
	 Sets the city directly.
*/
public void setCityMetadata(MetadataString city)
{
	this.city = city;
}

/**
	Heavy Weight Direct setter method for city
*/
public void hwSetCityMetadata(MetadataString city)
{
	if (this.city != null && this.city.getValue() != null && hasTermVector())
		termVector().remove(this.city.termVector());
	this.city = city;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for weather
*/
public MetadataString	weather()
{
	MetadataString	result = this.weather;
	if (result == null)
	{
		result = new MetadataString();
		this.weather = result;
	}
	return result;
}

/**
	Gets the value of the field weather
*/
public String getWeather()
{
	return this.weather().getValue();
}

/**
	Sets the value of the field weather
*/
public void setWeather(String weather)
{
	this.weather().setValue(weather);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: weather
*/
public boolean isNullWeather()
{
	return weather == null || weather.getValue() == null;
}

/**
	The heavy weight setter method for field weather
*/
public void hwSetWeather(String weather)
{
	this.weather().setValue(weather);
	rebuildCompositeTermVector();
}

/**
	 Sets the weather directly.
*/
public void setWeatherMetadata(MetadataString weather)
{
	this.weather = weather;
}

/**
	Heavy Weight Direct setter method for weather
*/
public void hwSetWeatherMetadata(MetadataString weather)
{
	if (this.weather != null && this.weather.getValue() != null && hasTermVector())
		termVector().remove(this.weather.termVector());
	this.weather = weather;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for picUrl
*/
public MetadataParsedURL	picUrl()
{
	MetadataParsedURL	result = this.picUrl;
	if (result == null)
	{
		result = new MetadataParsedURL();
		this.picUrl = result;
	}
	return result;
}

/**
	Gets the value of the field picUrl
*/
public ParsedURL getPicUrl()
{
	return this.picUrl().getValue();
}

/**
	Sets the value of the field picUrl
*/
public void setPicUrl(ParsedURL picUrl)
{
	this.picUrl().setValue(picUrl);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: picUrl
*/
public boolean isNullPicUrl()
{
	return picUrl == null || picUrl.getValue() == null;
}

/**
	The heavy weight setter method for field picUrl
*/
public void hwSetPicUrl(ParsedURL picUrl)
{
	this.picUrl().setValue(picUrl);
	rebuildCompositeTermVector();
}

/**
	 Sets the picUrl directly.
*/
public void setPicUrlMetadata(MetadataParsedURL picUrl)
{
	this.picUrl = picUrl;
}

/**
	Heavy Weight Direct setter method for picUrl
*/
public void hwSetPicUrlMetadata(MetadataParsedURL picUrl)
{
	if (this.picUrl != null && this.picUrl.getValue() != null && hasTermVector())
		termVector().remove(this.picUrl.termVector());
	this.picUrl = picUrl;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for temperature
*/
public MetadataString	temperature()
{
	MetadataString	result = this.temperature;
	if (result == null)
	{
		result = new MetadataString();
		this.temperature = result;
	}
	return result;
}

/**
	Gets the value of the field temperature
*/
public String getTemperature()
{
	return this.temperature().getValue();
}

/**
	Sets the value of the field temperature
*/
public void setTemperature(String temperature)
{
	this.temperature().setValue(temperature);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: temperature
*/
public boolean isNullTemperature()
{
	return temperature == null || temperature.getValue() == null;
}

/**
	The heavy weight setter method for field temperature
*/
public void hwSetTemperature(String temperature)
{
	this.temperature().setValue(temperature);
	rebuildCompositeTermVector();
}

/**
	 Sets the temperature directly.
*/
public void setTemperatureMetadata(MetadataString temperature)
{
	this.temperature = temperature;
}

/**
	Heavy Weight Direct setter method for temperature
*/
public void hwSetTemperatureMetadata(MetadataString temperature)
{
	if (this.temperature != null && this.temperature.getValue() != null && hasTermVector())
		termVector().remove(this.temperature.termVector());
	this.temperature = temperature;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for humidity
*/
public MetadataString	humidity()
{
	MetadataString	result = this.humidity;
	if (result == null)
	{
		result = new MetadataString();
		this.humidity = result;
	}
	return result;
}

/**
	Gets the value of the field humidity
*/
public String getHumidity()
{
	return this.humidity().getValue();
}

/**
	Sets the value of the field humidity
*/
public void setHumidity(String humidity)
{
	this.humidity().setValue(humidity);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: humidity
*/
public boolean isNullHumidity()
{
	return humidity == null || humidity.getValue() == null;
}

/**
	The heavy weight setter method for field humidity
*/
public void hwSetHumidity(String humidity)
{
	this.humidity().setValue(humidity);
	rebuildCompositeTermVector();
}

/**
	 Sets the humidity directly.
*/
public void setHumidityMetadata(MetadataString humidity)
{
	this.humidity = humidity;
}

/**
	Heavy Weight Direct setter method for humidity
*/
public void hwSetHumidityMetadata(MetadataString humidity)
{
	if (this.humidity != null && this.humidity.getValue() != null && hasTermVector())
		termVector().remove(this.humidity.termVector());
	this.humidity = humidity;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for wind
*/
public MetadataString	wind()
{
	MetadataString	result = this.wind;
	if (result == null)
	{
		result = new MetadataString();
		this.wind = result;
	}
	return result;
}

/**
	Gets the value of the field wind
*/
public String getWind()
{
	return this.wind().getValue();
}

/**
	Sets the value of the field wind
*/
public void setWind(String wind)
{
	this.wind().setValue(wind);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: wind
*/
public boolean isNullWind()
{
	return wind == null || wind.getValue() == null;
}

/**
	The heavy weight setter method for field wind
*/
public void hwSetWind(String wind)
{
	this.wind().setValue(wind);
	rebuildCompositeTermVector();
}

/**
	 Sets the wind directly.
*/
public void setWindMetadata(MetadataString wind)
{
	this.wind = wind;
}

/**
	Heavy Weight Direct setter method for wind
*/
public void hwSetWindMetadata(MetadataString wind)
{
	if (this.wind != null && this.wind.getValue() != null && hasTermVector())
		termVector().remove(this.wind.termVector());
	this.wind = wind;
	rebuildCompositeTermVector();
}

/**
	Lazy evaluation for dewPoint
*/
public MetadataString	dewPoint()
{
	MetadataString	result = this.dewPoint;
	if (result == null)
	{
		result = new MetadataString();
		this.dewPoint = result;
	}
	return result;
}

/**
	Gets the value of the field dewPoint
*/
public String getDewPoint()
{
	return this.dewPoint().getValue();
}

/**
	Sets the value of the field dewPoint
*/
public void setDewPoint(String dewPoint)
{
	this.dewPoint().setValue(dewPoint);
}

/**
	Test to see if the value of the field is null, or if the field itself is null: dewPoint
*/
public boolean isNullDewPoint()
{
	return dewPoint == null || dewPoint.getValue() == null;
}

/**
	The heavy weight setter method for field dewPoint
*/
public void hwSetDewPoint(String dewPoint)
{
	this.dewPoint().setValue(dewPoint);
	rebuildCompositeTermVector();
}

/**
	 Sets the dewPoint directly.
*/
public void setDewPointMetadata(MetadataString dewPoint)
{
	this.dewPoint = dewPoint;
}

/**
	Heavy Weight Direct setter method for dewPoint
*/
public void hwSetDewPointMetadata(MetadataString dewPoint)
{
	if (this.dewPoint != null && this.dewPoint.getValue() != null && hasTermVector())
		termVector().remove(this.dewPoint.termVector());
	this.dewPoint = dewPoint;
	rebuildCompositeTermVector();
}


}

