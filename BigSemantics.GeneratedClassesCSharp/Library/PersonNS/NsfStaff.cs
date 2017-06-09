//
// NsfStaff.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.PersonNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.PersonNS 
{
	[SimplInherit]
	public class NsfStaff : GrantStaff
	{
		[SimplComposite]
		[MmName("grants_by_search")]
		private NsfSearch grantsBySearch;

		public NsfStaff()
		{ }

		public NsfStaff(MetaMetadataCompositeField mmd) : base(mmd) { }


		public NsfSearch GrantsBySearch
		{
			get{return grantsBySearch;}
			set
			{
				if (this.grantsBySearch != value)
				{
					this.grantsBySearch = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
