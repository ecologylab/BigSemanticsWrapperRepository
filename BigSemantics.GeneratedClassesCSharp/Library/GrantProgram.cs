//
// GrantProgram.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS;
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
	public class GrantProgram : RichDocument
	{
		[SimplCollection("grant_staff")]
		[MmName("staffs")]
		private List<GrantStaff> staffs;

		[SimplScalar]
		private MetadataString synopsis;

		[SimplScalar]
		private MetadataString guidelines;

		[SimplCollection("due_date")]
		[MmName("due_dates")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataDate> dueDates;

		[SimplCollection("grant")]
		[MmName("grants")]
		private List<Grant> grants;

		public GrantProgram()
		{ }

		public GrantProgram(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<GrantStaff> Staffs
		{
			get{return staffs;}
			set
			{
				if (this.staffs != value)
				{
					this.staffs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Synopsis
		{
			get{return synopsis;}
			set
			{
				if (this.synopsis != value)
				{
					this.synopsis = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Guidelines
		{
			get{return guidelines;}
			set
			{
				if (this.guidelines != value)
				{
					this.guidelines = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataDate> DueDates
		{
			get{return dueDates;}
			set
			{
				if (this.dueDates != value)
				{
					this.dueDates = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Grant> Grants
		{
			get{return grants;}
			set
			{
				if (this.grants != value)
				{
					this.grants = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
