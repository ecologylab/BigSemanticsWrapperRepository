//
// IeeeKeywords.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class IeeeKeywords : RichDocument
	{
		[SimplCollection("ieee_xplore_search")]
		[MmName("keywords")]
		private List<IeeeXploreSearch> keywords;

		public IeeeKeywords()
		{ }

		public IeeeKeywords(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<IeeeXploreSearch> Keywords
		{
			get{return keywords;}
			set
			{
				if (this.keywords != value)
				{
					this.keywords = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
