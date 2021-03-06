//
// SlashdotRss.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
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
	public class SlashdotRss : RichDocument
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
