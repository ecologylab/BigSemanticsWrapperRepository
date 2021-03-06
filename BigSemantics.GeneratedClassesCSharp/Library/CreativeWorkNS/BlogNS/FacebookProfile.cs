//
// FacebookProfile.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogNS 
{
	[SimplInherit]
	public class FacebookProfile : SocialMediaProfile
	{
		[SimplComposite]
		[SimplTag("coverPhoto")]
		[MmName("coverPhoto")]
		private Image coverPhoto;

		[SimplCollection("facebook_user")]
		[MmName("facebook")]
		private List<FacebookUser> facebook;

		/// <summary>
		/// mainFeed
		/// </summary>
		[SimplCollection("social_media_post")]
		[MmName("feed")]
		private List<SocialMediaPost> feed;

		[SimplCollection("social_media_feed")]
		[SimplTag("Friends")]
		[MmName("Friends")]
		private List<SocialMediaFeed> Friends;

		[SimplCollection("social_media_feed")]
		[SimplTag("Photos")]
		[MmName("Photos")]
		private List<SocialMediaFeed> Photos;

		[SimplCollection("social_media_feed")]
		[SimplTag("Videos")]
		[MmName("Videos")]
		private List<SocialMediaFeed> Videos;

		[SimplCollection("interest_group")]
		[SimplTag("Sports")]
		[MmName("Sports")]
		private List<InterestGroup> Sports;

		[SimplCollection("interest_group")]
		[SimplTag("Music")]
		[MmName("Music")]
		private List<InterestGroup> Music;

		[SimplCollection("interest_group")]
		[SimplTag("Movies")]
		[MmName("Movies")]
		private List<InterestGroup> Movies;

		[SimplCollection("interest_group")]
		[SimplTag("appsAndGames")]
		[MmName("appsAndGames")]
		private List<InterestGroup> appsAndGames;

		[SimplCollection("interest_group")]
		[SimplTag("Likes")]
		[MmName("Likes")]
		private List<InterestGroup> Likes;

		[SimplCollection("social_media_feed")]
		[MmName("check_ins")]
		private List<SocialMediaFeed> checkIns;

		public FacebookProfile()
		{ }

		public FacebookProfile(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Image CoverPhoto
		{
			get{return coverPhoto;}
			set
			{
				if (this.coverPhoto != value)
				{
					this.coverPhoto = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FacebookUser> Facebook
		{
			get{return facebook;}
			set
			{
				if (this.facebook != value)
				{
					this.facebook = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SocialMediaPost> Feed
		{
			get{return feed;}
			set
			{
				if (this.feed != value)
				{
					this.feed = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SocialMediaFeed> FriendsProp
		{
			get{return Friends;}
			set
			{
				if (this.Friends != value)
				{
					this.Friends = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SocialMediaFeed> PhotosProp
		{
			get{return Photos;}
			set
			{
				if (this.Photos != value)
				{
					this.Photos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SocialMediaFeed> VideosProp
		{
			get{return Videos;}
			set
			{
				if (this.Videos != value)
				{
					this.Videos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<InterestGroup> SportsProp
		{
			get{return Sports;}
			set
			{
				if (this.Sports != value)
				{
					this.Sports = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<InterestGroup> MusicProp
		{
			get{return Music;}
			set
			{
				if (this.Music != value)
				{
					this.Music = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<InterestGroup> MoviesProp
		{
			get{return Movies;}
			set
			{
				if (this.Movies != value)
				{
					this.Movies = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<InterestGroup> AppsAndGames
		{
			get{return appsAndGames;}
			set
			{
				if (this.appsAndGames != value)
				{
					this.appsAndGames = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<InterestGroup> LikesProp
		{
			get{return Likes;}
			set
			{
				if (this.Likes != value)
				{
					this.Likes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SocialMediaFeed> CheckIns
		{
			get{return checkIns;}
			set
			{
				if (this.checkIns != value)
				{
					this.checkIns = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
