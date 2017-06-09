//
// MachineTags.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS 
{
	[SimplInherit]
	public class MachineTags : FlickrTag
	{
		[SimplScalar]
		private MetadataFloat confidence;

		public MachineTags()
		{ }

		public MachineTags(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataFloat Confidence
		{
			get{return confidence;}
			set
			{
				if (this.confidence != value)
				{
					this.confidence = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
