//
// SocialMediaPost.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.PersonNS;
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
	/// <summary>
	/// social media post
	/// </summary>
	[SimplInherit]
	public class SocialMediaPost : Post
	{
		[SimplScalar]
		private MetadataString titleContent;

		[SimplComposite]
		[MmName("shared")]
		private SocialMediaUser shared;

		[SimplScalar]
		private MetadataString shares;

		[SimplScalar]
		private MetadataString feeling;

		/// <summary>
		/// location created
		/// </summary>
		[SimplScalar]
		private MetadataString creationLocation;

		/// <summary>
		/// date created
		/// </summary>
		[SimplScalar]
		private MetadataString date;

		/// <summary>
		/// Timestamp of when created AM/PM
		/// </summary>
		[SimplScalar]
		private MetadataString time;

		[SimplCollection("up_vote")]
		[MmName("up_votes")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> upVotes;

		[SimplScalar]
		private MetadataString downVotes;

		[SimplCollection("url")]
		[MmName("urls")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> urls;

		[SimplComposite]
		[MmName("video")]
		private SocialVideo video;

		[SimplCollection("description_content")]
		[MmName("description_content")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> descriptionContent;

		[SimplComposite]
		[MmName("sticker")]
		private Image sticker;

		/// <summary>
		/// Photos posted in post.
		/// </summary>
		[SimplCollection("image")]
		[MmName("photos")]
		private List<Image> photos;

		[SimplScalar]
		private MetadataString numComments;

		[SimplCollection("person")]
		[MmName("with_users")]
		private List<Person> withUsers;

		/// <summary>
		/// comments,replys,subtweets
		/// </summary>
		[SimplCollection("social_media_post")]
		[MmName("comments")]
		private List<SocialMediaPost> comments;

		public SocialMediaPost()
		{ }

		public SocialMediaPost(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString TitleContent
		{
			get{return titleContent;}
			set
			{
				if (this.titleContent != value)
				{
					this.titleContent = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public SocialMediaUser Shared
		{
			get{return shared;}
			set
			{
				if (this.shared != value)
				{
					this.shared = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Shares
		{
			get{return shares;}
			set
			{
				if (this.shares != value)
				{
					this.shares = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Feeling
		{
			get{return feeling;}
			set
			{
				if (this.feeling != value)
				{
					this.feeling = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CreationLocation
		{
			get{return creationLocation;}
			set
			{
				if (this.creationLocation != value)
				{
					this.creationLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Date
		{
			get{return date;}
			set
			{
				if (this.date != value)
				{
					this.date = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Time
		{
			get{return time;}
			set
			{
				if (this.time != value)
				{
					this.time = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> UpVotes
		{
			get{return upVotes;}
			set
			{
				if (this.upVotes != value)
				{
					this.upVotes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DownVotes
		{
			get{return downVotes;}
			set
			{
				if (this.downVotes != value)
				{
					this.downVotes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> Urls
		{
			get{return urls;}
			set
			{
				if (this.urls != value)
				{
					this.urls = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public SocialVideo Video
		{
			get{return video;}
			set
			{
				if (this.video != value)
				{
					this.video = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> DescriptionContent
		{
			get{return descriptionContent;}
			set
			{
				if (this.descriptionContent != value)
				{
					this.descriptionContent = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Image Sticker
		{
			get{return sticker;}
			set
			{
				if (this.sticker != value)
				{
					this.sticker = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Image> Photos
		{
			get{return photos;}
			set
			{
				if (this.photos != value)
				{
					this.photos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString NumComments
		{
			get{return numComments;}
			set
			{
				if (this.numComments != value)
				{
					this.numComments = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Person> WithUsers
		{
			get{return withUsers;}
			set
			{
				if (this.withUsers != value)
				{
					this.withUsers = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SocialMediaPost> Comments
		{
			get{return comments;}
			set
			{
				if (this.comments != value)
				{
					this.comments = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
