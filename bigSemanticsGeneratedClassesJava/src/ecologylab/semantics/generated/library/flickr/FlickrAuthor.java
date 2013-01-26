package ecologylab.semantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creative_work.Author;
import ecologylab.semantics.generated.library.flickr.FlickrPhoto;
import ecologylab.semantics.generated.library.flickr.Photostream;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Author on flickr
 */ 
@simpl_inherit
public class FlickrAuthor extends Author
{
	/** 
	 *Image favorites
	 */ 
	@simpl_collection("flickr_photo")
	@mm_name("favorites")
	private List<FlickrPhoto> favorites;

	@simpl_composite
	@mm_name("photostream")
	private Photostream photostream;

	public FlickrAuthor()
	{ super(); }

	public FlickrAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrPhoto> getFavorites()
	{
		return favorites;
	}

  // lazy evaluation:
  public List<FlickrPhoto> favorites()
  {
    if (favorites == null)
      favorites = new ArrayList<FlickrPhoto>();
    return favorites;
  }

  // addTo:
  public void addToFavorites(FlickrPhoto element)
  {
    favorites().add(element);
  }

  // size:
  public int favoritesSize()
  {
    return favorites == null ? 0 : favorites.size();
  }

	public void setFavorites(List<FlickrPhoto> favorites)
	{
		this.favorites = favorites;
	}

	public Photostream getPhotostream()
	{
		return photostream;
	}

	public void setPhotostream(Photostream photostream)
	{
		this.photostream = photostream;
	}
}
