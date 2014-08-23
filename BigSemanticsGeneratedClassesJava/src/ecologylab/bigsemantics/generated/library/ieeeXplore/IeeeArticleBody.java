package ecologylab.bigsemantics.generated.library.ieeeXplore;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.ieeeXplore.Sections;
import ecologylab.bigsemantics.metadata.builtins.CompoundDocument;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class IeeeArticleBody extends CompoundDocument
{
	@simpl_collection("sections")
	@mm_name("sections")
	private List<Sections> sections;

	public IeeeArticleBody()
	{ super(); }

	public IeeeArticleBody(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Sections> getSections()
	{
		return sections;
	}

  // lazy evaluation:
  public List<Sections> sections()
  {
    if (sections == null)
      sections = new ArrayList<Sections>();
    return sections;
  }

  // addTo:
  public void addToSections(Sections element)
  {
    sections().add(element);
  }

  // size:
  public int sectionsSize()
  {
    return sections == null ? 0 : sections.size();
  }

	public void setSections(List<Sections> sections)
	{
		this.sections = sections;
	}
}