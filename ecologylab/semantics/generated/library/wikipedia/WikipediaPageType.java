package ecologylab.semantics.generated.library.wikipedia;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.wikipedia.MmdInlineThumbinnerInThumbinnersInWikipediaPageType;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.library.wikipedia.MmdInlineParagraphInParagraphsInWikipediaPageType;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.wikipedia.MmdInlineCategoryInCategoriesInWikipediaPageType;

/**
*  WikipediaPageType.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/18/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * An article on wikipedia
 */ 
@simpl_inherit
public class WikipediaPageType extends CompoundDocument
{
	/** 
	 * Paragraphs in the article.
	 */ 
	@simpl_collection("paragraph") @mm_name("paragraphs")	private ArrayList<MmdInlineParagraphInParagraphsInWikipediaPageType> paragraphs;

	/** 
	 * Wikipedia Categories
	 */ 
	@simpl_collection("category") @mm_name("categories")	private ArrayList<MmdInlineCategoryInCategoriesInWikipediaPageType> categories;

	/** 
	 */ 
	@simpl_collection("thumbinner") @mm_name("thumbinners")	private ArrayList<MmdInlineThumbinnerInThumbinnersInWikipediaPageType> thumbinners;

	public WikipediaPageType()
	{ }

	public WikipediaPageType(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ArrayList<MmdInlineParagraphInParagraphsInWikipediaPageType> getParagraphs()
	{
		return paragraphs;
	}

	public void setParagraphs(ArrayList<MmdInlineParagraphInParagraphsInWikipediaPageType> paragraphs)
	{
		this.paragraphs = paragraphs;
	}

	public ArrayList<MmdInlineCategoryInCategoriesInWikipediaPageType> getCategories()
	{
		return categories;
	}

	public void setCategories(ArrayList<MmdInlineCategoryInCategoriesInWikipediaPageType> categories)
	{
		this.categories = categories;
	}

	public ArrayList<MmdInlineThumbinnerInThumbinnersInWikipediaPageType> getThumbinners()
	{
		return thumbinners;
	}

	public void setThumbinners(ArrayList<MmdInlineThumbinnerInThumbinnersInWikipediaPageType> thumbinners)
	{
		this.thumbinners = thumbinners;
	}
}