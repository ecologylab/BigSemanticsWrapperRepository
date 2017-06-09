//
// FlickrPhotostream.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
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
	/// All flickr photos of a particular user
	/// </summary>
	[SimplInherit]
	public class FlickrPhotostream : RichDocument
	{
		/// <summary>
		/// Collection of all images of a user
		/// </summary>
		[SimplCollection("flickr_photo")]
		[MmName("stream")]
		private List<FlickrPhoto> stream;

		[SimplCollection("flickr_photostream")]
		[MmName("following")]
		private List<FlickrPhotostream> following;

		[SimplCollection("groups")]
		[MmName("groups")]
		private List<Groups> groups;

		public FlickrPhotostream()
		{ }

		public FlickrPhotostream(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<FlickrPhoto> Stream
		{
			get{return stream;}
			set
			{
				if (this.stream != value)
				{
					this.stream = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FlickrPhotostream> Following
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

		public List<Groups> Groups
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
	}
}
