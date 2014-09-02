//
// TumblrSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.TumblrSearchNS 
{
	/// <summary>
	/// The tumblr search class
	/// </summary>
	[SimplInherit]
	public class TumblrSearch : Search<SocialMediaSearchResult>
	{
		public TumblrSearch()
		{ }

		public TumblrSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
