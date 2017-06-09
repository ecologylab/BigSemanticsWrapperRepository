//
// NsfAward.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	/// <summary>
	/// NSF award details.
	/// </summary>
	[SimplInherit]
	public class NsfAward : Grant
	{
		[SimplComposite]
		[MmName("division")]
		private NsfDivision division;

		[SimplScalar]
		private MetadataString amountString;

		[SimplScalar]
		private MetadataString awardInstrument;

		[SimplScalar]
		private MetadataString fieldApplications;

		[SimplScalar]
		private MetadataDate initialAmendmentDate;

		[SimplScalar]
		private MetadataDate latestAmendmentDate;

		[SimplScalar]
		private MetadataString programReferenceCodes;

		[SimplCollection("program_element_code")]
		[MmName("program_element_codes")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> programElementCodes;

		public NsfAward()
		{ }

		public NsfAward(MetaMetadataCompositeField mmd) : base(mmd) { }


		public NsfDivision Division
		{
			get{return division;}
			set
			{
				if (this.division != value)
				{
					this.division = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString AmountString
		{
			get{return amountString;}
			set
			{
				if (this.amountString != value)
				{
					this.amountString = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString AwardInstrument
		{
			get{return awardInstrument;}
			set
			{
				if (this.awardInstrument != value)
				{
					this.awardInstrument = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString FieldApplications
		{
			get{return fieldApplications;}
			set
			{
				if (this.fieldApplications != value)
				{
					this.fieldApplications = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate InitialAmendmentDate
		{
			get{return initialAmendmentDate;}
			set
			{
				if (this.initialAmendmentDate != value)
				{
					this.initialAmendmentDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate LatestAmendmentDate
		{
			get{return latestAmendmentDate;}
			set
			{
				if (this.latestAmendmentDate != value)
				{
					this.latestAmendmentDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString ProgramReferenceCodes
		{
			get{return programReferenceCodes;}
			set
			{
				if (this.programReferenceCodes != value)
				{
					this.programReferenceCodes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> ProgramElementCodes
		{
			get{return programElementCodes;}
			set
			{
				if (this.programElementCodes != value)
				{
					this.programElementCodes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
