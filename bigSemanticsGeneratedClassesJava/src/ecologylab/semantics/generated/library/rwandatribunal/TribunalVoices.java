package ecologylab.semantics.generated.library.rwandatribunal;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.rwandatribunal.CategoryInterviews;
import ecologylab.semantics.metadata.builtins.Document;
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
 *Video Interviews with personnel from Rwanda Tribunal
 */ 
@simpl_inherit
public class TribunalVoices extends Document
{
	@simpl_collection("category_interviews")
	@mm_name("categorized_interviews")
	private List<CategoryInterviews> categorizedInterviews;

	public TribunalVoices()
	{ super(); }

	public TribunalVoices(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<CategoryInterviews> getCategorizedInterviews()
	{
		return categorizedInterviews;
	}

  // lazy evaluation:
  public List<CategoryInterviews> categorizedInterviews()
  {
    if (categorizedInterviews == null)
      categorizedInterviews = new ArrayList<CategoryInterviews>();
    return categorizedInterviews;
  }

  // addTo:
  public void addToCategorizedInterviews(CategoryInterviews element)
  {
    categorizedInterviews().add(element);
  }

  // size:
  public int categorizedInterviewsSize()
  {
    return categorizedInterviews == null ? 0 : categorizedInterviews.size();
  }

	public void setCategorizedInterviews(List<CategoryInterviews> categorizedInterviews)
	{
		this.categorizedInterviews = categorizedInterviews;
	}
}
