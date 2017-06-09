//
// Earthquake.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.EventNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.EventNS 
{
	/// <summary>
	/// Generalized Earthquake Object
	/// </summary>
	[SimplInherit]
	public class Earthquake : Disaster
	{
		[SimplScalar]
		private MetadataFloat depth;

		public Earthquake()
		{ }

		public Earthquake(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataFloat Depth
		{
			get{return depth;}
			set
			{
				if (this.depth != value)
				{
					this.depth = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
