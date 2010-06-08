package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;


/**
	The definition of weather report class.
**/ 

@xml_inherit

public class  WeatherReport
extends  Document
{


/**
	The name of the city.
**/ 

	 @xml_leaf private MetadataString	city;

/**
	The weather condition of the city, like sunny or cloudy.
**/ 

	 @xml_leaf private MetadataString	weather;

/**
	The URL of the picture indicating weather condition.
**/ 

	 @xml_leaf private MetadataParsedURL	picUrl;

/**
	The temperature.
**/ 

	 @xml_leaf private MetadataString	temperature;

/**
	The humidity of the air.
**/ 

	 @xml_leaf private MetadataString	humidity;

/**
	The wind speed.
**/ 

	 @xml_leaf private MetadataString	wind;

/**
	The dew point.
**/ 

	 @xml_leaf private MetadataString	dewPoint;

/**
	Constructor
**/ 

public WeatherReport()
{
 super();
}

/**
	Constructor
**/ 

public WeatherReport(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for city
**/ 

public MetadataString	city()
{
MetadataString	result	=this.city;
if(result == null)
{
result = new MetadataString();
this.city	=	 result;
}
return result;
}

/**
	Gets the value of the field city
**/ 

public String getCity(){
return city().getValue();
}

/**
	Sets the value of the field city
**/ 

public void setCity( String city )
{
this.city().setValue(city);
}

/**
	The heavy weight setter method for field city
**/ 

public void hwSetCity( String city )
{
this.city().setValue(city);
rebuildCompositeTermVector();
 }
/**
	 Sets the city directly
**/ 

public void setCityMetadata(MetadataString city)
{	this.city = city;
}
/**
	Heavy Weight Direct setter method for city
**/ 

public void hwSetCityMetadata(MetadataString city)
{	 if(this.city!=null && this.city.getValue()!=null && hasTermVector())
		 termVector().remove(this.city.termVector());
	 this.city = city;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for weather
**/ 

public MetadataString	weather()
{
MetadataString	result	=this.weather;
if(result == null)
{
result = new MetadataString();
this.weather	=	 result;
}
return result;
}

/**
	Gets the value of the field weather
**/ 

public String getWeather(){
return weather().getValue();
}

/**
	Sets the value of the field weather
**/ 

public void setWeather( String weather )
{
this.weather().setValue(weather);
}

/**
	The heavy weight setter method for field weather
**/ 

public void hwSetWeather( String weather )
{
this.weather().setValue(weather);
rebuildCompositeTermVector();
 }
/**
	 Sets the weather directly
**/ 

public void setWeatherMetadata(MetadataString weather)
{	this.weather = weather;
}
/**
	Heavy Weight Direct setter method for weather
**/ 

public void hwSetWeatherMetadata(MetadataString weather)
{	 if(this.weather!=null && this.weather.getValue()!=null && hasTermVector())
		 termVector().remove(this.weather.termVector());
	 this.weather = weather;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for picUrl
**/ 

public MetadataParsedURL	picUrl()
{
MetadataParsedURL	result	=this.picUrl;
if(result == null)
{
result = new MetadataParsedURL();
this.picUrl	=	 result;
}
return result;
}

/**
	Gets the value of the field picUrl
**/ 

public ParsedURL getPicUrl(){
return picUrl().getValue();
}

/**
	Sets the value of the field picUrl
**/ 

public void setPicUrl( ParsedURL picUrl )
{
this.picUrl().setValue(picUrl);
}

/**
	The heavy weight setter method for field picUrl
**/ 

public void hwSetPicUrl( ParsedURL picUrl )
{
this.picUrl().setValue(picUrl);
rebuildCompositeTermVector();
 }
/**
	 Sets the picUrl directly
**/ 

public void setPicUrlMetadata(MetadataParsedURL picUrl)
{	this.picUrl = picUrl;
}
/**
	Heavy Weight Direct setter method for picUrl
**/ 

public void hwSetPicUrlMetadata(MetadataParsedURL picUrl)
{	 if(this.picUrl!=null && this.picUrl.getValue()!=null && hasTermVector())
		 termVector().remove(this.picUrl.termVector());
	 this.picUrl = picUrl;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for temperature
**/ 

public MetadataString	temperature()
{
MetadataString	result	=this.temperature;
if(result == null)
{
result = new MetadataString();
this.temperature	=	 result;
}
return result;
}

/**
	Gets the value of the field temperature
**/ 

public String getTemperature(){
return temperature().getValue();
}

/**
	Sets the value of the field temperature
**/ 

public void setTemperature( String temperature )
{
this.temperature().setValue(temperature);
}

/**
	The heavy weight setter method for field temperature
**/ 

public void hwSetTemperature( String temperature )
{
this.temperature().setValue(temperature);
rebuildCompositeTermVector();
 }
/**
	 Sets the temperature directly
**/ 

public void setTemperatureMetadata(MetadataString temperature)
{	this.temperature = temperature;
}
/**
	Heavy Weight Direct setter method for temperature
**/ 

public void hwSetTemperatureMetadata(MetadataString temperature)
{	 if(this.temperature!=null && this.temperature.getValue()!=null && hasTermVector())
		 termVector().remove(this.temperature.termVector());
	 this.temperature = temperature;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for humidity
**/ 

public MetadataString	humidity()
{
MetadataString	result	=this.humidity;
if(result == null)
{
result = new MetadataString();
this.humidity	=	 result;
}
return result;
}

/**
	Gets the value of the field humidity
**/ 

public String getHumidity(){
return humidity().getValue();
}

/**
	Sets the value of the field humidity
**/ 

public void setHumidity( String humidity )
{
this.humidity().setValue(humidity);
}

/**
	The heavy weight setter method for field humidity
**/ 

public void hwSetHumidity( String humidity )
{
this.humidity().setValue(humidity);
rebuildCompositeTermVector();
 }
/**
	 Sets the humidity directly
**/ 

public void setHumidityMetadata(MetadataString humidity)
{	this.humidity = humidity;
}
/**
	Heavy Weight Direct setter method for humidity
**/ 

public void hwSetHumidityMetadata(MetadataString humidity)
{	 if(this.humidity!=null && this.humidity.getValue()!=null && hasTermVector())
		 termVector().remove(this.humidity.termVector());
	 this.humidity = humidity;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for wind
**/ 

public MetadataString	wind()
{
MetadataString	result	=this.wind;
if(result == null)
{
result = new MetadataString();
this.wind	=	 result;
}
return result;
}

/**
	Gets the value of the field wind
**/ 

public String getWind(){
return wind().getValue();
}

/**
	Sets the value of the field wind
**/ 

public void setWind( String wind )
{
this.wind().setValue(wind);
}

/**
	The heavy weight setter method for field wind
**/ 

public void hwSetWind( String wind )
{
this.wind().setValue(wind);
rebuildCompositeTermVector();
 }
/**
	 Sets the wind directly
**/ 

public void setWindMetadata(MetadataString wind)
{	this.wind = wind;
}
/**
	Heavy Weight Direct setter method for wind
**/ 

public void hwSetWindMetadata(MetadataString wind)
{	 if(this.wind!=null && this.wind.getValue()!=null && hasTermVector())
		 termVector().remove(this.wind.termVector());
	 this.wind = wind;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for dewPoint
**/ 

public MetadataString	dewPoint()
{
MetadataString	result	=this.dewPoint;
if(result == null)
{
result = new MetadataString();
this.dewPoint	=	 result;
}
return result;
}

/**
	Gets the value of the field dewPoint
**/ 

public String getDewPoint(){
return dewPoint().getValue();
}

/**
	Sets the value of the field dewPoint
**/ 

public void setDewPoint( String dewPoint )
{
this.dewPoint().setValue(dewPoint);
}

/**
	The heavy weight setter method for field dewPoint
**/ 

public void hwSetDewPoint( String dewPoint )
{
this.dewPoint().setValue(dewPoint);
rebuildCompositeTermVector();
 }
/**
	 Sets the dewPoint directly
**/ 

public void setDewPointMetadata(MetadataString dewPoint)
{	this.dewPoint = dewPoint;
}
/**
	Heavy Weight Direct setter method for dewPoint
**/ 

public void hwSetDewPointMetadata(MetadataString dewPoint)
{	 if(this.dewPoint!=null && this.dewPoint.getValue()!=null && hasTermVector())
		 termVector().remove(this.dewPoint.termVector());
	 this.dewPoint = dewPoint;
	rebuildCompositeTermVector();
}
}

