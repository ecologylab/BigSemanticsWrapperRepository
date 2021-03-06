//
// Asos.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ProductNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CommodityNS.ProductNS 
{
	[SimplInherit]
	public class Asos : Product
	{
		[SimplComposite]
		[MmName("designer")]
		private AsosPage designer;

		[SimplCollection("asos")]
		[MmName("recommmended_products")]
		private List<Asos> recommmendedProducts;

		[SimplCollection("rich_document")]
		[MmName("tags")]
		private List<RichDocument> tags;

		public Asos()
		{ }

		public Asos(MetaMetadataCompositeField mmd) : base(mmd) { }


		public AsosPage Designer
		{
			get{return designer;}
			set
			{
				if (this.designer != value)
				{
					this.designer = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Asos> RecommmendedProducts
		{
			get{return recommmendedProducts;}
			set
			{
				if (this.recommmendedProducts != value)
				{
					this.recommmendedProducts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> Tags
		{
			get{return tags;}
			set
			{
				if (this.tags != value)
				{
					this.tags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
