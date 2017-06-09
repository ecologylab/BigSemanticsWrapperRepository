//
// GoogleImageSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS.ImageSearchNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.SearchNS 
{
	/// <summary>
	/// Google image search.
	/// </summary>
	[SimplInherit]
	public class GoogleImageSearch : ImageSearch<ImageSearchResult>
	{
		public GoogleImageSearch()
		{ }

		public GoogleImageSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
