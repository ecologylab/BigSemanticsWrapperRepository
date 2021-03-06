//
// AskNatureStrategy.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class AskNatureStrategy : RichDocument
	{
		[SimplScalar]
		private MetadataString summary;

		[SimplScalar]
		private MetadataString excerpt;

		[SimplComposite]
		[MmName("inspiring_organism")]
		private AskNatureOrganism inspiringOrganism;

		[SimplComposite]
		[MmName("expert")]
		private AskNatureExpert expert;

		[SimplScalar]
		private MetadataString applicationIdeas;

		[SimplScalar]
		private MetadataString interestedIndstrialSectors;

		[SimplCollection("ask_nature_product")]
		[MmName("inspired_products")]
		private List<AskNatureProduct> inspiredProducts;

		[SimplComposite]
		[MmName("biomimicry_taxonomy")]
		private AskNatureTaxonomy biomimicryTaxonomy;

		public AskNatureStrategy()
		{ }

		public AskNatureStrategy(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Summary
		{
			get{return summary;}
			set
			{
				if (this.summary != value)
				{
					this.summary = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Excerpt
		{
			get{return excerpt;}
			set
			{
				if (this.excerpt != value)
				{
					this.excerpt = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public AskNatureOrganism InspiringOrganism
		{
			get{return inspiringOrganism;}
			set
			{
				if (this.inspiringOrganism != value)
				{
					this.inspiringOrganism = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public AskNatureExpert Expert
		{
			get{return expert;}
			set
			{
				if (this.expert != value)
				{
					this.expert = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ApplicationIdeas
		{
			get{return applicationIdeas;}
			set
			{
				if (this.applicationIdeas != value)
				{
					this.applicationIdeas = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString InterestedIndstrialSectors
		{
			get{return interestedIndstrialSectors;}
			set
			{
				if (this.interestedIndstrialSectors != value)
				{
					this.interestedIndstrialSectors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<AskNatureProduct> InspiredProducts
		{
			get{return inspiredProducts;}
			set
			{
				if (this.inspiredProducts != value)
				{
					this.inspiredProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public AskNatureTaxonomy BiomimicryTaxonomy
		{
			get{return biomimicryTaxonomy;}
			set
			{
				if (this.biomimicryTaxonomy != value)
				{
					this.biomimicryTaxonomy = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
