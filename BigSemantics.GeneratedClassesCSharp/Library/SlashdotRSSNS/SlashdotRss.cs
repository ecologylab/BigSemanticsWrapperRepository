//
// SlashdotRss.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.SlashdotRSSNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.SlashdotRSSNS 
{
	[SimplInherit]
	public class SlashdotRss : CompoundDocument
	{
		[SimplCollection("slashdot_item")]
		[SimplNoWrap]
		[MmName("items")]
		private List<SlashdotItem> items;

		public SlashdotRss()
		{ }

		public SlashdotRss(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<SlashdotItem> Items
		{
			get{return items;}
			set
			{
				if (this.items != value)
				{
					this.items = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
