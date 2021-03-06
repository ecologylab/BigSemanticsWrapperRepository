//
// Cartoon.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS.CartoonNS 
{
	[SimplInherit]
	public class Cartoon : Artwork
	{
		[SimplComposite]
		[MmName("content")]
		private Image content;

		public Cartoon()
		{ }

		public Cartoon(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Image Content
		{
			get{return content;}
			set
			{
				if (this.content != value)
				{
					this.content = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
