//
// VimeoUser.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2015 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.PersonNS.AuthorNS;
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
	/// vimeo user page
	/// </summary>
	[SimplInherit]
	public class VimeoUser : Author
	{
		[SimplScalar]
		private MetadataParsedURL portrait;

		[SimplScalar]
		private MetadataString dateJoined;

		[SimplScalar]
		private MetadataString likes;

		[SimplScalar]
		private MetadataString groups;

		[SimplScalar]
		private MetadataString channels;

		[SimplScalar]
		private MetadataString albumns;

		[SimplComposite]
		[MmName("videos")]
		private VimeoList videos;

		[SimplComposite]
		[MmName("following")]
		private VimeoList following;

		public VimeoUser()
		{ }

		public VimeoUser(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL Portrait
		{
			get{return portrait;}
			set
			{
				if (this.portrait != value)
				{
					this.portrait = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DateJoined
		{
			get{return dateJoined;}
			set
			{
				if (this.dateJoined != value)
				{
					this.dateJoined = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Likes
		{
			get{return likes;}
			set
			{
				if (this.likes != value)
				{
					this.likes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Groups
		{
			get{return groups;}
			set
			{
				if (this.groups != value)
				{
					this.groups = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Channels
		{
			get{return channels;}
			set
			{
				if (this.channels != value)
				{
					this.channels = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Albumns
		{
			get{return albumns;}
			set
			{
				if (this.albumns != value)
				{
					this.albumns = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public VimeoList Videos
		{
			get{return videos;}
			set
			{
				if (this.videos != value)
				{
					this.videos = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public VimeoList Following
		{
			get{return following;}
			set
			{
				if (this.following != value)
				{
					this.following = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
