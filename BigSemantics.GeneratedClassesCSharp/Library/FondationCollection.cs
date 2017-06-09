//
// FondationCollection.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
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
	[SimplInherit]
	public class FondationCollection : RichDocument
	{
		[SimplCollection("fondation_article")]
		[MmName("articles")]
		private List<FondationArticle> articles;

		[SimplCollection("fondation_category_collection")]
		[MmName("related_collections")]
		private List<FondationCategoryCollection> relatedCollections;

		public FondationCollection()
		{ }

		public FondationCollection(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<FondationArticle> Articles
		{
			get{return articles;}
			set
			{
				if (this.articles != value)
				{
					this.articles = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<FondationCategoryCollection> RelatedCollections
		{
			get{return relatedCollections;}
			set
			{
				if (this.relatedCollections != value)
				{
					this.relatedCollections = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
