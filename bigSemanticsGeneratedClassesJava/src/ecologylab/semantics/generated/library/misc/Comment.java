package ecologylab.semantics.generated.library.misc;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.person.Person;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import ecologylab.serialization.annotations.simpl_scalar;
import ecologylab.serialization.annotations.simpl_tag;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Comment extends Metadata
{
	@simpl_scalar
	@simpl_tag("content")
	@simpl_other_tags({"description"})
	private MetadataString description;

	@simpl_composite
	@mm_name("author")
	private Person author;

	/** 
	 *How long this comment has been there.
	 */ 
	@simpl_scalar
	private MetadataString time;

	/** 
	 *How many votes this comment has got.
	 */ 
	@simpl_scalar
	private MetadataInteger count;

	public Comment()
	{ super(); }

	public Comment(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	description()
	{
		MetadataString	result = this.description;
		if (result == null)
		{
			result = new MetadataString();
			this.description = result;
		}
		return result;
	}

	public String getDescription()
	{
		return this.description == null ? null : description().getValue();
	}

	public MetadataString getDescriptionMetadata()
	{
		return description;
	}

	public void setDescription(String description)
	{
		if (description != null)
			this.description().setValue(description);
	}

	public void setDescriptionMetadata(MetadataString description)
	{
		this.description = description;
	}

	public Person getAuthor()
	{
		return author;
	}

	public void setAuthor(Person author)
	{
		this.author = author;
	}

	public MetadataString	time()
	{
		MetadataString	result = this.time;
		if (result == null)
		{
			result = new MetadataString();
			this.time = result;
		}
		return result;
	}

	public String getTime()
	{
		return this.time == null ? null : time().getValue();
	}

	public MetadataString getTimeMetadata()
	{
		return time;
	}

	public void setTime(String time)
	{
		if (time != null)
			this.time().setValue(time);
	}

	public void setTimeMetadata(MetadataString time)
	{
		this.time = time;
	}

	public MetadataInteger	count()
	{
		MetadataInteger	result = this.count;
		if (result == null)
		{
			result = new MetadataInteger();
			this.count = result;
		}
		return result;
	}

	public Integer getCount()
	{
		return this.count == null ? 0 : count().getValue();
	}

	public MetadataInteger getCountMetadata()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		if (count != 0)
			this.count().setValue(count);
	}

	public void setCountMetadata(MetadataInteger count)
	{
		this.count = count;
	}
}
