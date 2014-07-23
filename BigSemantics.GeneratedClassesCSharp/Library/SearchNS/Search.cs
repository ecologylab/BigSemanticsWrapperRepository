//
// Search.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.SearchNS 
{
	/// <summary>
	/// A search.
	/// </summary>
	[SimplInherit]
	public class Search<SR> : Document where SR : Document
	{
		[SimplScalar]
		private MetadataString query;

		[SimplCollection]
		[SimplNoWrap]
		[SimplScope("repository_documents")]
		[MmName("search_results")]
		private List<Document> searchResults;

		[SimplCollection("search")]
		[MmName("related_searches")]
		private List<Search<Document>> relatedSearches;

		[SimplComposite]
		[MmName("next_page")]
		private Search<Document> nextPage;

		public Search()
		{ }

		public Search(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Query
		{
			get{return query;}
			set
			{
				if (this.query != value)
				{
					this.query = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Document> SearchResults
		{
			get{return searchResults;}
			set
			{
				if (this.searchResults != value)
				{
					this.searchResults = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Search<Document>> RelatedSearches
		{
			get{return relatedSearches;}
			set
			{
				if (this.relatedSearches != value)
				{
					this.relatedSearches = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Search<Document> NextPage
		{
			get{return nextPage;}
			set
			{
				if (this.nextPage != value)
				{
					this.nextPage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
