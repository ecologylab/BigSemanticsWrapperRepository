package ecologylab.bigsemantics.generated.library.creativeWork.scholarlyArticle;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Sections extends RichDocument
{
	@simpl_collection("paragraph")
	@mm_name("paragraphs")
	private List<MetadataString> paragraphs;

	public Sections()
	{ super(); }

	public Sections(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<MetadataString> getParagraphs()
	{
		return paragraphs;
	}

  // lazy evaluation:
  public List<MetadataString> paragraphs()
  {
    if (paragraphs == null)
      paragraphs = new ArrayList<MetadataString>();
    return paragraphs;
  }

  // addTo:
  public void addToParagraphs(MetadataString element)
  {
    paragraphs().add(element);
  }

  // size:
  public int paragraphsSize()
  {
    return paragraphs == null ? 0 : paragraphs.size();
  }

	public void setParagraphs(List<MetadataString> paragraphs)
	{
		this.paragraphs = paragraphs;
	}
}
