//
// IcdlBook.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library 
{
	[SimplInherit]
	public class IcdlBook : Document
	{
		[SimplScalar]
		private MetadataString id;

		[SimplScalar]
		private MetadataString languages;

		[SimplScalar]
		private MetadataParsedURL cover;

		[SimplScalar]
		private MetadataInteger height;

		[SimplScalar]
		private MetadataInteger width;

		[SimplScalar]
		private MetadataString booktitle;

		[SimplScalar]
		private MetadataParsedURL bookurl;

		public IcdlBook()
		{ }

		public IcdlBook(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Id
		{
			get{return id;}
			set
			{
				if (this.id != value)
				{
					this.id = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Languages
		{
			get{return languages;}
			set
			{
				if (this.languages != value)
				{
					this.languages = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Cover
		{
			get{return cover;}
			set
			{
				if (this.cover != value)
				{
					this.cover = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Height
		{
			get{return height;}
			set
			{
				if (this.height != value)
				{
					this.height = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Width
		{
			get{return width;}
			set
			{
				if (this.width != value)
				{
					this.width = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Booktitle
		{
			get{return booktitle;}
			set
			{
				if (this.booktitle != value)
				{
					this.booktitle = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Bookurl
		{
			get{return bookurl;}
			set
			{
				if (this.bookurl != value)
				{
					this.bookurl = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}