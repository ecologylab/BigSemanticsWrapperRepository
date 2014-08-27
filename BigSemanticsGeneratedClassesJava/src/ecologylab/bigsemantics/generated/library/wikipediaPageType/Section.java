package ecologylab.bigsemantics.generated.library.wikipediaPageType;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.wikipediaPageType.Paragraph;
import ecologylab.bigsemantics.generated.library.wikipediaPageType.Section;
import ecologylab.bigsemantics.metadata.Metadata;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Section extends Metadata
{
	@simpl_scalar
	private MetadataString title;

	@simpl_collection("paragraph")
	@mm_name("paragraphs")
	private List<Paragraph> paragraphs;

	@simpl_collection("section")
	@mm_name("subsections")
	private List<Section> subsections;

	public Section()
	{ super(); }

	public Section(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title == null ? null : title().getValue();
	}

	public MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(MetadataString title)
	{
		this.title = title;
	}

	public List<Paragraph> getParagraphs()
	{
		return paragraphs;
	}

  // lazy evaluation:
  public List<Paragraph> paragraphs()
  {
    if (paragraphs == null)
      paragraphs = new ArrayList<Paragraph>();
    return paragraphs;
  }

  // addTo:
  public void addToParagraphs(Paragraph element)
  {
    paragraphs().add(element);
  }

  // size:
  public int paragraphsSize()
  {
    return paragraphs == null ? 0 : paragraphs.size();
  }

	public void setParagraphs(List<Paragraph> paragraphs)
	{
		this.paragraphs = paragraphs;
	}

	public List<Section> getSubsections()
	{
		return subsections;
	}

  // lazy evaluation:
  public List<Section> subsections()
  {
    if (subsections == null)
      subsections = new ArrayList<Section>();
    return subsections;
  }

  // addTo:
  public void addToSubsections(Section element)
  {
    subsections().add(element);
  }

  // size:
  public int subsectionsSize()
  {
    return subsections == null ? 0 : subsections.size();
  }

	public void setSubsections(List<Section> subsections)
	{
		this.subsections = subsections;
	}
}
