package ecologylab.bigsemantics.generated.library.person.author;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.person.author.Author;
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
public class IeeeAuthorPage extends Author
{
	@simpl_collection("rich_document")
	@mm_name("authors")
	private List<RichDocument> authors;

	public IeeeAuthorPage()
	{ super(); }

	public IeeeAuthorPage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<RichDocument> getAuthors()
	{
		return authors;
	}

  // lazy evaluation:
  public List<RichDocument> authors()
  {
    if (authors == null)
      authors = new ArrayList<RichDocument>();
    return authors;
  }

  // addTo:
  public void addToAuthors(RichDocument element)
  {
    authors().add(element);
  }

  // size:
  public int authorsSize()
  {
    return authors == null ? 0 : authors.size();
  }

	public void setAuthors(List<RichDocument> authors)
	{
		this.authors = authors;
	}
}