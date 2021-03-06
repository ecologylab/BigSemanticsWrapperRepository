//
// AnandtechReview.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.TechReviewNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.TechReviewNS 
{
	/// <summary>
	/// anandtech.com review
	/// </summary>
	[SimplInherit]
	public class AnandtechReview : TechReview
	{
		[SimplScalar]
		private MetadataString author;

		[SimplCollection("rich_document")]
		[MmName("sections")]
		private List<RichDocument> sections;

		[SimplCollection("rich_document")]
		[MmName("specifications")]
		private List<RichDocument> specifications;

		public AnandtechReview()
		{ }

		public AnandtechReview(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Author
		{
			get{return author;}
			set
			{
				if (this.author != value)
				{
					this.author = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> Sections
		{
			get{return sections;}
			set
			{
				if (this.sections != value)
				{
					this.sections = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RichDocument> Specifications
		{
			get{return specifications;}
			set
			{
				if (this.specifications != value)
				{
					this.specifications = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
