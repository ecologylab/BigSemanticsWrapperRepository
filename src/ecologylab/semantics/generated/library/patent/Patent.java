package ecologylab.semantics.generated.library.patent;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.creative_work.CreativeWork;
import ecologylab.semantics.generated.library.patent.Patent;
import ecologylab.semantics.generated.library.patent.PatentClassification;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataDate;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_other_tags;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/** 
 *Patents Class
 */ 
@simpl_inherit
public class Patent extends CreativeWork
{
	@simpl_scalar
	private MetadataString inventor;

	@simpl_scalar
	private MetadataDate filingDate;

	@simpl_collection("patent_classification")
	@mm_name("classifications")
	private List<PatentClassification> classifications;

	@simpl_collection("claim")
	@mm_name("claims")
	private List<MetadataString> claims;

	/** 
	 *subsequent patents that cite this
	 */ 
	@simpl_collection("patent")
	@simpl_other_tags({"referenced_bys"})
	@mm_name("citations")
	private List<Patent> citations;

	/** 
	 *prior patents that this references
	 */ 
	@simpl_collection("patent")
	@mm_name("references")
	private List<Patent> references;

	@simpl_collection("image")
	@mm_name("drawings")
	private List<Image> drawings;

	public Patent()
	{ super(); }

	public Patent(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	inventor()
	{
		MetadataString	result = this.inventor;
		if (result == null)
		{
			result = new MetadataString();
			this.inventor = result;
		}
		return result;
	}

	public String getInventor()
	{
		return this.inventor == null ? null : inventor().getValue();
	}

	public MetadataString getInventorMetadata()
	{
		return inventor;
	}

	public void setInventor(String inventor)
	{
		if (inventor != null)
			this.inventor().setValue(inventor);
	}

	public void setInventorMetadata(MetadataString inventor)
	{
		this.inventor = inventor;
	}

	public MetadataDate	filingDate()
	{
		MetadataDate	result = this.filingDate;
		if (result == null)
		{
			result = new MetadataDate();
			this.filingDate = result;
		}
		return result;
	}

	public Date getFilingDate()
	{
		return this.filingDate == null ? null : filingDate().getValue();
	}

	public MetadataDate getFilingDateMetadata()
	{
		return filingDate;
	}

	public void setFilingDate(Date filingDate)
	{
		if (filingDate != null)
			this.filingDate().setValue(filingDate);
	}

	public void setFilingDateMetadata(MetadataDate filingDate)
	{
		this.filingDate = filingDate;
	}

	public List<PatentClassification> getClassifications()
	{
		return classifications;
	}

  // lazy evaluation:
  public List<PatentClassification> classifications()
  {
    if (classifications == null)
      classifications = new ArrayList<PatentClassification>();
    return classifications;
  }

  // addTo:
  public void addToClassifications(PatentClassification element)
  {
    classifications().add(element);
  }

  // size:
  public int classificationsSize()
  {
    return classifications == null ? 0 : classifications.size();
  }

	public void setClassifications(List<PatentClassification> classifications)
	{
		this.classifications = classifications;
	}

	public List<MetadataString> getClaims()
	{
		return claims;
	}

  // lazy evaluation:
  public List<MetadataString> claims()
  {
    if (claims == null)
      claims = new ArrayList<MetadataString>();
    return claims;
  }

  // addTo:
  public void addToClaims(MetadataString element)
  {
    claims().add(element);
  }

  // size:
  public int claimsSize()
  {
    return claims == null ? 0 : claims.size();
  }

	public void setClaims(List<MetadataString> claims)
	{
		this.claims = claims;
	}

	public List<Patent> getCitations()
	{
		return citations;
	}

  // lazy evaluation:
  public List<Patent> citations()
  {
    if (citations == null)
      citations = new ArrayList<Patent>();
    return citations;
  }

  // addTo:
  public void addToCitations(Patent element)
  {
    citations().add(element);
  }

  // size:
  public int citationsSize()
  {
    return citations == null ? 0 : citations.size();
  }

	public void setCitations(List<Patent> citations)
	{
		this.citations = citations;
	}

	public List<Patent> getReferences()
	{
		return references;
	}

  // lazy evaluation:
  public List<Patent> references()
  {
    if (references == null)
      references = new ArrayList<Patent>();
    return references;
  }

  // addTo:
  public void addToReferences(Patent element)
  {
    references().add(element);
  }

  // size:
  public int referencesSize()
  {
    return references == null ? 0 : references.size();
  }

	public void setReferences(List<Patent> references)
	{
		this.references = references;
	}

	public List<Image> getDrawings()
	{
		return drawings;
	}

  // lazy evaluation:
  public List<Image> drawings()
  {
    if (drawings == null)
      drawings = new ArrayList<Image>();
    return drawings;
  }

  // addTo:
  public void addToDrawings(Image element)
  {
    drawings().add(element);
  }

  // size:
  public int drawingsSize()
  {
    return drawings == null ? 0 : drawings.size();
  }

	public void setDrawings(List<Image> drawings)
	{
		this.drawings = drawings;
	}
}