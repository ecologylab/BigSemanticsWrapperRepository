//
// RhizomeArtist.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS 
{
	[SimplInherit]
	public class RhizomeArtist : Artist
	{
		[SimplScalar]
		private MetadataString bio;

		public RhizomeArtist()
		{ }

		public RhizomeArtist(MetaMetadataCompositeField mmd) : base(mmd) { }


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
