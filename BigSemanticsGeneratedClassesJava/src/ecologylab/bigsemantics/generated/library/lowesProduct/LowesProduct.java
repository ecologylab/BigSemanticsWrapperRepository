package ecologylab.bigsemantics.generated.library.lowesProduct;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.generated.library.product.Product;
import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.mm_name;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class LowesProduct extends Product
{
	@simpl_composite
	@mm_name("image")
	private Image image;

	public LowesProduct()
	{ super(); }

	public LowesProduct(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}
}
