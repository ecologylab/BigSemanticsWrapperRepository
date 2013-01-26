package ecologylab.semantics.generated.library.grant;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creative_work.Author;
import ecologylab.semantics.generated.library.grant.Grant;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class Investigator<CW extends Grant> extends Author
{
	@simpl_scalar
	private MetadataString email;

	@simpl_scalar
	private MetadataString investigationType;

	public Investigator()
	{ super(); }

	public Investigator(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	email()
	{
		MetadataString	result = this.email;
		if (result == null)
		{
			result = new MetadataString();
			this.email = result;
		}
		return result;
	}

	public String getEmail()
	{
		return this.email == null ? null : email().getValue();
	}

	public MetadataString getEmailMetadata()
	{
		return email;
	}

	public void setEmail(String email)
	{
		if (email != null)
			this.email().setValue(email);
	}

	public void setEmailMetadata(MetadataString email)
	{
		this.email = email;
	}

	public MetadataString	investigationType()
	{
		MetadataString	result = this.investigationType;
		if (result == null)
		{
			result = new MetadataString();
			this.investigationType = result;
		}
		return result;
	}

	public String getInvestigationType()
	{
		return this.investigationType == null ? null : investigationType().getValue();
	}

	public MetadataString getInvestigationTypeMetadata()
	{
		return investigationType;
	}

	public void setInvestigationType(String investigationType)
	{
		if (investigationType != null)
			this.investigationType().setValue(investigationType);
	}

	public void setInvestigationTypeMetadata(MetadataString investigationType)
	{
		this.investigationType = investigationType;
	}
}
