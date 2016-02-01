//
// RedditPostData.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
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
	public class RedditPostData : Post
	{
		[SimplScalar]
		private MetadataString flair;

		[SimplScalar]
		private MetadataString postKarma;

		[SimplComposite]
		[MmName("post_content")]
		private RichDocument postContent;

		[SimplComposite]
		[MmName("comments")]
		private RedditComments comments;

		public RedditPostData()
		{ }

		public RedditPostData(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Flair
		{
			get{return flair;}
			set
			{
				if (this.flair != value)
				{
					this.flair = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString PostKarma
		{
			get{return postKarma;}
			set
			{
				if (this.postKarma != value)
				{
					this.postKarma = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument PostContent
		{
			get{return postContent;}
			set
			{
				if (this.postContent != value)
				{
					this.postContent = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RedditComments Comments
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