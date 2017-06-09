//
// YoutubeChannel.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
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
	/// <summary>
	/// youtube channels
	/// </summary>
	[SimplInherit]
	public class YoutubeChannel : RichDocument
	{
		[SimplCollection("youtube_video")]
		[MmName("featured_video")]
		private List<YoutubeVideo> featuredVideo;

		[SimplCollection("yt_playlist")]
		[MmName("playlists")]
		private List<YtPlaylist> playlists;

		[SimplCollection("rich_document")]
		[MmName("featured_channels")]
		private List<RichDocument> featuredChannels;

		[SimplCollection("youtube_channel")]
		[MmName("related_channels")]
		private List<YoutubeChannel> relatedChannels;

		public YoutubeChannel()
		{ }

		public YoutubeChannel(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<YoutubeVideo> FeaturedVideo
		{
			get{return featuredVideo;}
			set
			{
				if (this.featuredVideo != value)
				{
					this.featuredVideo = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<YtPlaylist> Playlists
		{
			get{return playlists;}
			set
			{
				if (this.playlists != value)
				{
					this.playlists = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> FeaturedChannels
		{
			get{return featuredChannels;}
			set
			{
				if (this.featuredChannels != value)
				{
					this.featuredChannels = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<YoutubeChannel> RelatedChannels
		{
			get{return relatedChannels;}
			set
			{
				if (this.relatedChannels != value)
				{
					this.relatedChannels = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
