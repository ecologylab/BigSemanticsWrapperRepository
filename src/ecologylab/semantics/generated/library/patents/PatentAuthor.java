package ecologylab.semantics.generated.library.patents;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creative_work.Author;
import ecologylab.semantics.generated.library.patents.Patent;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Authors of Patents; really this should be a mix-in to author
 */ 
@simpl_inherit
public class PatentAuthor extends Author
{
	@simpl_collection("patent")
	@mm_name("patents")
	private List<Patent> patents;

	public PatentAuthor()
	{ super(); }

	public PatentAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Patent> getPatents()
	{
		return patents;
	}

  // lazy evaluation:
  public List<Patent> patents()
  {
    if (patents == null)
      patents = new ArrayList<Patent>();
    return patents;
  }

  // addTo:
  public void addToPatents(Patent element)
  {
    patents().add(element);
  }

  // size:
  public int patentsSize()
  {
    return patents == null ? 0 : patents.size();
  }

	public void setPatents(List<Patent> patents)
	{
		this.patents = patents;
	}
}