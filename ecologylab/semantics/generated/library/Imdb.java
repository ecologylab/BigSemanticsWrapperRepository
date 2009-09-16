package ecologylab.semantics.generated.library;

/**
 * This is a generated code. DO NOT edit or modify it.
 * 
 * @author MetadataCompiler
 **/

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.DebugMetadata;
import ecologylab.semantics.metadata.scalar.MetadataStringBuilder;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataInteger;

import java.util.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.net.ParsedURL;
import ecologylab.generic.HashMapArrayList;
import ecologylab.xml.xml_inherit;
import ecologylab.xml.types.element.Mappable;
import ecologylab.semantics.library.DefaultMetadataTranslationSpace;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.scholarlyPublication.*;

/**
 * null
 **/

@xml_inherit
@xml_tag("imdb")
public class Imdb extends Document
{

	/**
	 * Constructor
	 **/

	public Imdb()
	{
		super();
	}

	/**
	 * Constructor
	 **/

	public Imdb(MetaMetadata metaMetadata)
	{
		super(metaMetadata);
	}

	/**
	 * null
	 **/

	@xml_tag("title")
	@xml_nested
	private MetadataString	title;

	/**
	 * Lazy Evaluation for title
	 **/

	public MetadataString title()
	{
		MetadataString result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	/**
	 * Gets the value of the field title
	 **/

	public String getTitle()
	{
		return title().getValue();
	}

	/**
	 * Sets the value of the field title
	 **/

	public void setTitle(String title)
	{
		this.title().setValue(title);
	}

	/**
	 * The heavy weight setter method for field title
	 **/

	public void hwSetTitle(String title)
	{
		this.title().setValue(title);
		rebuildCompositeTermVector();
	}

	/**
	 * Sets the title directly
	 **/

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}

	/**
	 * Heavy Weight Direct setter method for title
	 **/

	public void hwSetTitleMetadata(MetadataString title)
	{
		if (this.title != null && this.title.getValue() != null && hasTermVector())
			termVector().remove(this.title.termVector());
		this.title = title;
		rebuildCompositeTermVector();
	}

	/**
	 * null
	 **/

	@xml_tag("rating")
	@xml_nested
	private MetadataString	rating;

	/**
	 * Lazy Evaluation for rating
	 **/

	public MetadataString rating()
	{
		MetadataString result = this.rating;
		if (result == null)
		{
			result = new MetadataString();
			this.rating = result;
		}
		return result;
	}

	/**
	 * Gets the value of the field rating
	 **/

	public String getRating()
	{
		return rating().getValue();
	}

	/**
	 * Sets the value of the field rating
	 **/

	public void setRating(String rating)
	{
		this.rating().setValue(rating);
	}

	/**
	 * The heavy weight setter method for field rating
	 **/

	public void hwSetRating(String rating)
	{
		this.rating().setValue(rating);
		rebuildCompositeTermVector();
	}

	/**
	 * Sets the rating directly
	 **/

	public void setRatingMetadata(MetadataString rating)
	{
		this.rating = rating;
	}

	/**
	 * Heavy Weight Direct setter method for rating
	 **/

	public void hwSetRatingMetadata(MetadataString rating)
	{
		if (this.rating != null && this.rating.getValue() != null && hasTermVector())
			termVector().remove(this.rating.termVector());
		this.rating = rating;
		rebuildCompositeTermVector();
	}

	/**
	 * null
	 **/

	@xml_tag("director")
	@xml_nested
	private MetadataString	director;

	/**
	 * Lazy Evaluation for director
	 **/

	public MetadataString director()
	{
		MetadataString result = this.director;
		if (result == null)
		{
			result = new MetadataString();
			this.director = result;
		}
		return result;
	}

	/**
	 * Gets the value of the field director
	 **/

	public String getDirector()
	{
		return director().getValue();
	}

	/**
	 * Sets the value of the field director
	 **/

	public void setDirector(String director)
	{
		this.director().setValue(director);
	}

	/**
	 * The heavy weight setter method for field director
	 **/

	public void hwSetDirector(String director)
	{
		this.director().setValue(director);
		rebuildCompositeTermVector();
	}

	/**
	 * Sets the director directly
	 **/

	public void setDirectorMetadata(MetadataString director)
	{
		this.director = director;
	}

	/**
	 * Heavy Weight Direct setter method for director
	 **/

	public void hwSetDirectorMetadata(MetadataString director)
	{
		if (this.director != null && this.director.getValue() != null && hasTermVector())
			termVector().remove(this.director.termVector());
		this.director = director;
		rebuildCompositeTermVector();
	}

	/**
	 * null
	 **/

	@xml_tag("plot")
	@xml_nested
	private MetadataString	plot;

	/**
	 * Lazy Evaluation for plot
	 **/

	public MetadataString plot()
	{
		MetadataString result = this.plot;
		if (result == null)
		{
			result = new MetadataString();
			this.plot = result;
		}
		return result;
	}

	/**
	 * Gets the value of the field plot
	 **/

	public String getPlot()
	{
		return plot().getValue();
	}

	/**
	 * Sets the value of the field plot
	 **/

	public void setPlot(String plot)
	{
		this.plot().setValue(plot);
	}

	/**
	 * The heavy weight setter method for field plot
	 **/

	public void hwSetPlot(String plot)
	{
		this.plot().setValue(plot);
		rebuildCompositeTermVector();
	}

	/**
	 * Sets the plot directly
	 **/

	public void setPlotMetadata(MetadataString plot)
	{
		this.plot = plot;
	}

	/**
	 * Heavy Weight Direct setter method for plot
	 **/

	public void hwSetPlotMetadata(MetadataString plot)
	{
		if (this.plot != null && this.plot.getValue() != null && hasTermVector())
			termVector().remove(this.plot.termVector());
		this.plot = plot;
		rebuildCompositeTermVector();
	}
}
