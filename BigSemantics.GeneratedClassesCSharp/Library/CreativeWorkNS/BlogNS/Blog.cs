//
// Blog.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
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
	public class Blog : CreativeWork
	{
		[SimplComposite]
		[MmName("photo")]
		private Image photo;

		[SimplCollection("post")]
		[MmName("posts")]
		private List<Post> posts;

		public Blog()
		{ }

		public Blog(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Image Photo
		{
			get{return photo;}
			set
			{
				if (this.photo != value)
				{
					this.photo = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Post> Posts
		{
			get{return posts;}
			set
			{
				if (this.posts != value)
				{
					this.posts = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
