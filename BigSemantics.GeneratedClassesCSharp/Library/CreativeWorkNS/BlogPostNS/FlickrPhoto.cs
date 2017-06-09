//
// FlickrPhoto.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS 
{
	/// <summary>
	/// A Flickr image post page
	/// </summary>
	[SimplInherit]
	public class FlickrPhoto : Post
	{
		[SimplScalar]
		private MetadataDate dateTaken;

		[SimplScalar]
		private MetadataDate dateUploaded;

		[SimplScalar]
		private MetadataString captureDevice;

		[SimplScalar]
		private MetadataString extension;

		[SimplComposite]
		[MmName("geo_location")]
		private GisLocation geoLocation;

		[SimplComposite]
		[MmName("place")]
		private RichDocument place;

		[SimplCollection("machine_tags")]
		[MmName("machine_tags")]
		private List<MachineTags> machineTags;

		[SimplScalar]
		private MetadataString views;

		[SimplCollection("favorites")]
		[MmName("favorites")]
		private List<Favorites> favorites;

		[SimplCollection("comments")]
		[MmName("comments")]
		private List<Comments> comments;

		public FlickrPhoto()
		{ }

		public FlickrPhoto(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataDate DateTaken
		{
			get{return dateTaken;}
			set
			{
				if (this.dateTaken != value)
				{
					this.dateTaken = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate DateUploaded
		{
			get{return dateUploaded;}
			set
			{
				if (this.dateUploaded != value)
				{
					this.dateUploaded = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CaptureDevice
		{
			get{return captureDevice;}
			set
			{
				if (this.captureDevice != value)
				{
					this.captureDevice = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Extension
		{
			get{return extension;}
			set
			{
				if (this.extension != value)
				{
					this.extension = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public GisLocation GeoLocation
		{
			get{return geoLocation;}
			set
			{
				if (this.geoLocation != value)
				{
					this.geoLocation = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Place
		{
			get{return place;}
			set
			{
				if (this.place != value)
				{
					this.place = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<MachineTags> MachineTags
		{
			get{return machineTags;}
			set
			{
				if (this.machineTags != value)
				{
					this.machineTags = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Views
		{
			get{return views;}
			set
			{
				if (this.views != value)
				{
					this.views = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Favorites> Favorites
		{
			get{return favorites;}
			set
			{
				if (this.favorites != value)
				{
					this.favorites = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Comments> Comments
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
