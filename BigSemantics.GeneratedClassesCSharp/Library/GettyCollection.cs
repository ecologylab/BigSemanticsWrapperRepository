//
// GettyCollection.cs
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

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class GettyCollection : RichDocument
	{
		[SimplCollection("getty_object")]
		[MmName("artworks")]
		private List<GettyObject> artworks;

		public GettyCollection()
		{ }

		public GettyCollection(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<GettyObject> Artworks
		{
			get{return artworks;}
			set
			{
				if (this.artworks != value)
				{
					this.artworks = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
