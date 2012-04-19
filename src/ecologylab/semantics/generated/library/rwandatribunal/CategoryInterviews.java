package ecologylab.semantics.generated.library.rwandatribunal;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.rwandatribunal.Interview;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *categorized interviews
 */ 
@simpl_inherit
public class CategoryInterviews extends Metadata
{
	/** 
	 *category
	 */ 
	@simpl_scalar
	private MetadataString category;

	/** 
	 *personnel interview
	 */ 
	@simpl_collection("interview")
	@mm_name("interviews")
	private List<Interview> interviews;

	public CategoryInterviews()
	{ super(); }

	public CategoryInterviews(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	category()
	{
		MetadataString	result = this.category;
		if (result == null)
		{
			result = new MetadataString();
			this.category = result;
		}
		return result;
	}

	public String getCategory()
	{
		return this.category == null ? null : category().getValue();
	}

	public MetadataString getCategoryMetadata()
	{
		return category;
	}

	public void setCategory(String category)
	{
		if (category != null)
			this.category().setValue(category);
	}

	public void setCategoryMetadata(MetadataString category)
	{
		this.category = category;
	}

	public List<Interview> getInterviews()
	{
		return interviews;
	}

  // lazy evaluation:
  public List<Interview> interviews()
  {
    if (interviews == null)
      interviews = new ArrayList<Interview>();
    return interviews;
  }

  // addTo:
  public void addToInterviews(Interview element)
  {
    interviews().add(element);
  }

  // size:
  public int interviewsSize()
  {
    return interviews == null ? 0 : interviews.size();
  }

	public void setInterviews(List<Interview> interviews)
	{
		this.interviews = interviews;
	}
}