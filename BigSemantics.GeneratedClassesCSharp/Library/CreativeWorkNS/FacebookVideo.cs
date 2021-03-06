//
// FacebookVideo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	/// <summary>
	/// facebook video
	/// </summary>
	[SimplInherit]
	public class FacebookVideo : SocialVideo
	{
		[SimplScalar]
		private MetadataString videoLink;

		public FacebookVideo()
		{ }

		public FacebookVideo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString VideoLink
		{
			get{return videoLink;}
			set
			{
				if (this.videoLink != value)
				{
					this.videoLink = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
