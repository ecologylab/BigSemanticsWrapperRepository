package ecologylab.bigsemantics.generated.library.creativeWork.artwork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.artwork.Artwork;
import ecologylab.bigsemantics.generated.library.search.RhizomeTag;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class RhizomeArtwork extends Artwork
{
	@simpl_collection("artwork")
	@simpl_other_tags({"creative_works"})
	@mm_name("related_works")
	private List<Artwork> relatedWorks;

	@simpl_collection("rhizome_tag")
	@mm_name("tags")
	private List<RhizomeTag> tags;

	public RhizomeArtwork()
	{ super(); }

	public RhizomeArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Artwork> getRelatedWorks()
	{
		return relatedWorks;
	}

  // lazy evaluation:
  public List<Artwork> relatedWorks()
  {
    if (relatedWorks == null)
      relatedWorks = new ArrayList<Artwork>();
    return relatedWorks;
  }

  // addTo:
  public void addToRelatedWorks(Artwork element)
  {
    relatedWorks().add(element);
  }

  // size:
  public int relatedWorksSize()
  {
    return relatedWorks == null ? 0 : relatedWorks.size();
  }

	public void setRelatedWorks(List<Artwork> relatedWorks)
	{
		this.relatedWorks = relatedWorks;
	}

	public List<RhizomeTag> getTags()
	{
		return tags;
	}

  // lazy evaluation:
  public List<RhizomeTag> tags()
  {
    if (tags == null)
      tags = new ArrayList<RhizomeTag>();
    return tags;
  }

  // addTo:
  public void addToTags(RhizomeTag element)
  {
    tags().add(element);
  }

  // size:
  public int tagsSize()
  {
    return tags == null ? 0 : tags.size();
  }

	public void setTags(List<RhizomeTag> tags)
	{
		this.tags = tags;
	}
}
