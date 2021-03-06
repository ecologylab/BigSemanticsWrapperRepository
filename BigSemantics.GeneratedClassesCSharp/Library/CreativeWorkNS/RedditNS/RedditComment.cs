//
// RedditComment.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.RedditNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.RedditNS 
{
	[SimplInherit]
	public class RedditComment : RichDocument
	{
		[SimplComposite]
		[MmName("commenter")]
		private RichDocument commenter;

		[SimplScalar]
		private MetadataString age;

		[SimplScalar]
		private MetadataString karma;

		[SimplCollection("reddit_comment")]
		[MmName("replies")]
		private List<RedditComment> replies;

		public RedditComment()
		{ }

		public RedditComment(MetaMetadataCompositeField mmd) : base(mmd) { }


		public RichDocument Commenter
		{
			get{return commenter;}
			set
			{
				if (this.commenter != value)
				{
					this.commenter = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Age
		{
			get{return age;}
			set
			{
				if (this.age != value)
				{
					this.age = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Karma
		{
			get{return karma;}
			set
			{
				if (this.karma != value)
				{
					this.karma = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RedditComment> Replies
		{
			get{return replies;}
			set
			{
				if (this.replies != value)
				{
					this.replies = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
