//
// SearchCrumb.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


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

namespace Ecologylab.BigSemantics.Generated.Library.SearchNS 
{
	[SimplInherit]
	public class SearchCrumb : Metadata
	{
		[SimplScalar]
		private MetadataString searchQuery;

		public SearchCrumb()
		{ }

		public SearchCrumb(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString SearchQuery
		{
			get{return searchQuery;}
			set
			{
				if (this.searchQuery != value)
				{
					this.searchQuery = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
