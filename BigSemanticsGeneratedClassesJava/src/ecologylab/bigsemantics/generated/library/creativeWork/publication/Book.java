package ecologylab.bigsemantics.generated.library.creativeWork.publication;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.creativeWork.publication.Publication;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.person.author.Author;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metadata.scalar.MetadataParsedURL;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Book extends Publication
{
	@simpl_collection("author")
	@mm_name("editors")
	private List<Author> editors;

	@simpl_scalar
	private MetadataString edition;

	@simpl_scalar
	private MetadataString newthing;

	@simpl_collection("publication")
	@mm_name("table_of_contents")
	private List<Publication> tableOfContents;

	@simpl_scalar
	private MetadataParsedURL coverImage;

	public Book()
	{ super(); }

	public Book(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Author> getEditors()
	{
		return editors;
	}

  // lazy evaluation:
  public List<Author> editors()
  {
    if (editors == null)
      editors = new ArrayList<Author>();
    return editors;
  }

  // addTo:
  public void addToEditors(Author element)
  {
    editors().add(element);
  }

  // size:
  public int editorsSize()
  {
    return editors == null ? 0 : editors.size();
  }

	public void setEditors(List<Author> editors)
	{
		this.editors = editors;
	}

	public MetadataString	edition()
	{
		MetadataString	result = this.edition;
		if (result == null)
		{
			result = new MetadataString();
			this.edition = result;
		}
		return result;
	}

	public String getEdition()
	{
		return this.edition == null ? null : edition().getValue();
	}

	public MetadataString getEditionMetadata()
	{
		return edition;
	}

	public void setEdition(String edition)
	{
		if (edition != null)
			this.edition().setValue(edition);
	}

	public void setEditionMetadata(MetadataString edition)
	{
		this.edition = edition;
	}

	public MetadataString	newthing()
	{
		MetadataString	result = this.newthing;
		if (result == null)
		{
			result = new MetadataString();
			this.newthing = result;
		}
		return result;
	}

	public String getNewthing()
	{
		return this.newthing == null ? null : newthing().getValue();
	}

	public MetadataString getNewthingMetadata()
	{
		return newthing;
	}

	public void setNewthing(String newthing)
	{
		if (newthing != null)
			this.newthing().setValue(newthing);
	}

	public void setNewthingMetadata(MetadataString newthing)
	{
		this.newthing = newthing;
	}

	public List<Publication> getTableOfContents()
	{
		return tableOfContents;
	}

  // lazy evaluation:
  public List<Publication> tableOfContents()
  {
    if (tableOfContents == null)
      tableOfContents = new ArrayList<Publication>();
    return tableOfContents;
  }

  // addTo:
  public void addToTableOfContents(Publication element)
  {
    tableOfContents().add(element);
  }

  // size:
  public int tableOfContentsSize()
  {
    return tableOfContents == null ? 0 : tableOfContents.size();
  }

	public void setTableOfContents(List<Publication> tableOfContents)
	{
		this.tableOfContents = tableOfContents;
	}

	public MetadataParsedURL	coverImage()
	{
		MetadataParsedURL	result = this.coverImage;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.coverImage = result;
		}
		return result;
	}

	public ParsedURL getCoverImage()
	{
		return this.coverImage == null ? null : coverImage().getValue();
	}

	public MetadataParsedURL getCoverImageMetadata()
	{
		return coverImage;
	}

	public void setCoverImage(ParsedURL coverImage)
	{
		if (coverImage != null)
			this.coverImage().setValue(coverImage);
	}

	public void setCoverImageMetadata(MetadataParsedURL coverImage)
	{
		this.coverImage = coverImage;
	}
}
