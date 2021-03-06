//
// TvShow.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	/// <summary>
	/// The TV show info class
	/// </summary>
	[SimplInherit]
	public class TvShow : CreativeWork
	{
		[SimplScalar]
		private MetadataString premiered;

		[SimplScalar]
		private MetadataString status;

		/// <summary>
		/// A picture of this show.
		/// </summary>
		[SimplScalar]
		private MetadataParsedURL pic;

		[SimplCollection("movie_person")]
		[MmName("cast")]
		private List<MoviePerson> cast;

		[SimplCollection("tv_show_episode")]
		[MmName("episode_list")]
		private List<TvShowEpisode> episodeList;

		[SimplCollection("tv_show")]
		[MmName("similar_shows")]
		private List<TvShow> similarShows;

		public TvShow()
		{ }

		public TvShow(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Premiered
		{
			get{return premiered;}
			set
			{
				if (this.premiered != value)
				{
					this.premiered = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Status
		{
			get{return status;}
			set
			{
				if (this.status != value)
				{
					this.status = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Pic
		{
			get{return pic;}
			set
			{
				if (this.pic != value)
				{
					this.pic = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<MoviePerson> Cast
		{
			get{return cast;}
			set
			{
				if (this.cast != value)
				{
					this.cast = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<TvShowEpisode> EpisodeList
		{
			get{return episodeList;}
			set
			{
				if (this.episodeList != value)
				{
					this.episodeList = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<TvShow> SimilarShows
		{
			get{return similarShows;}
			set
			{
				if (this.similarShows != value)
				{
					this.similarShows = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
