//
// PoliticalCartoon.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS.CartoonNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS.CartoonNS 
{
	[SimplInherit]
	public class PoliticalCartoon : Cartoon
	{
		[SimplScalar]
		private MetadataString cartoonist;

		public PoliticalCartoon()
		{ }

		public PoliticalCartoon(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Cartoonist
		{
			get{return cartoonist;}
			set
			{
				if (this.cartoonist != value)
				{
					this.cartoonist = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
