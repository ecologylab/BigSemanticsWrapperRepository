//
// TateArtist.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ArtistNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.TateArtistNS 
{
	[SimplInherit]
	public class TateArtist : Artist
	{
		[SimplScalar]
		private MetadataString bio;

		public TateArtist()
		{ }

		public TateArtist(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Bio
		{
			get{return bio;}
			set
			{
				if (this.bio != value)
				{
					this.bio = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
