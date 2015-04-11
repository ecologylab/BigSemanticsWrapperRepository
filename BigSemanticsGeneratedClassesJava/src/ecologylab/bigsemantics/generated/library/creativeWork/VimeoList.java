package ecologylab.bigsemantics.generated.library.creativeWork;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2015) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class VimeoList extends RichDocument
{
	@simpl_collection("rich_document")
	@mm_name("links")
	private List<RichDocument> links;

	public VimeoList()
	{ super(); }

	public VimeoList(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<RichDocument> getLinks()
	{
		return links;
	}

  // lazy evaluation:
  public List<RichDocument> links()
  {
    if (links == null)
      links = new ArrayList<RichDocument>();
    return links;
  }

  // addTo:
  public void addToLinks(RichDocument element)
  {
    links().add(element);
  }

  // size:
  public int linksSize()
  {
    return links == null ? 0 : links.size();
  }

	public void setLinks(List<RichDocument> links)
	{
		this.links = links;
	}
}
