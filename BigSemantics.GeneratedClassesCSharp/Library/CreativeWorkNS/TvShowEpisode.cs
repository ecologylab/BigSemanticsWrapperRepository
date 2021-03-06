//
// TvShowEpisode.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
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
	/// TV Show episode
	/// </summary>
	[SimplInherit]
	public class TvShowEpisode : CreativeWork
	{
		[SimplScalar]
		[SimplHints(new Hint[] {Hint.XmlLeafCdata})]
		private MetadataString episodeNumber;

		public TvShowEpisode()
		{ }

		public TvShowEpisode(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString EpisodeNumber
		{
			get{return episodeNumber;}
			set
			{
				if (this.episodeNumber != value)
				{
					this.episodeNumber = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
