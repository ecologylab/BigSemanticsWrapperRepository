//
// WebVideo.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.PrimitivesNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.PrimitivesNS 
{
	[SimplInherit]
	public class WebVideo : Video
	{
		[SimplComposite]
		[MmName("provider")]
		private MediaProvider provider;

		public WebVideo()
		{ }

		public WebVideo(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MediaProvider Provider
		{
			get{return provider;}
			set
			{
				if (this.provider != value)
				{
					this.provider = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
