//
// SfuCartoonArchive.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS.CartoonNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS.CartoonNS 
{
	[SimplInherit]
	public class SfuCartoonArchive : Cartoon
	{
		[SimplScalar]
		private MetadataString text;

		[SimplScalar]
		private MetadataString cartoonist;

		[SimplScalar]
		private MetadataDate datePublished;

		[SimplScalar]
		private MetadataString publishedIn;

		[SimplScalar]
		private MetadataString cartoonSize;

		[SimplScalar]
		private MetadataString notes;

		[SimplScalar]
		private MetadataString sfuReferenceCode;

		public SfuCartoonArchive()
		{ }

		public SfuCartoonArchive(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Text
		{
			get{return text;}
			set
			{
				if (this.text != value)
				{
					this.text = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Cartoonist
		{
			get{return cartoonist;}
			set
			{
				if (this.cartoonist != value)
				{
					this.cartoonist = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate DatePublished
		{
			get{return datePublished;}
			set
			{
				if (this.datePublished != value)
				{
					this.datePublished = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString PublishedIn
		{
			get{return publishedIn;}
			set
			{
				if (this.publishedIn != value)
				{
					this.publishedIn = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CartoonSize
		{
			get{return cartoonSize;}
			set
			{
				if (this.cartoonSize != value)
				{
					this.cartoonSize = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Notes
		{
			get{return notes;}
			set
			{
				if (this.notes != value)
				{
					this.notes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString SfuReferenceCode
		{
			get{return sfuReferenceCode;}
			set
			{
				if (this.sfuReferenceCode != value)
				{
					this.sfuReferenceCode = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
