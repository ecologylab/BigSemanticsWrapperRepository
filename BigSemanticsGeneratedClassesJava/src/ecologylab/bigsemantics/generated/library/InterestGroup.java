package ecologylab.bigsemantics.generated.library;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2017) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.SocialMediaInterest;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.builtins.RichDocument;
import ecologylab.bigsemantics.metadata.builtins.person.Person;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *a group of interests
 */ 
@simpl_inherit
public class InterestGroup extends RichDocument
{
	@simpl_collection("social_media_interest")
	@mm_name("interests")
	private List<SocialMediaInterest> interests;

	@simpl_collection("person")
	@mm_name("friends")
	private List<Person> friends;

	public InterestGroup()
	{ super(); }

	public InterestGroup(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<SocialMediaInterest> getInterests()
	{
		return interests;
	}

  // lazy evaluation:
  public List<SocialMediaInterest> interests()
  {
    if (interests == null)
      interests = new ArrayList<SocialMediaInterest>();
    return interests;
  }

  // addTo:
  public void addToInterests(SocialMediaInterest element)
  {
    interests().add(element);
  }

  // size:
  public int interestsSize()
  {
    return interests == null ? 0 : interests.size();
  }

	public void setInterests(List<SocialMediaInterest> interests)
	{
		this.interests = interests;
	}

	public List<Person> getFriends()
	{
		return friends;
	}

  // lazy evaluation:
  public List<Person> friends()
  {
    if (friends == null)
      friends = new ArrayList<Person>();
    return friends;
  }

  // addTo:
  public void addToFriends(Person element)
  {
    friends().add(element);
  }

  // size:
  public int friendsSize()
  {
    return friends == null ? 0 : friends.size();
  }

	public void setFriends(List<Person> friends)
	{
		this.friends = friends;
	}
}
