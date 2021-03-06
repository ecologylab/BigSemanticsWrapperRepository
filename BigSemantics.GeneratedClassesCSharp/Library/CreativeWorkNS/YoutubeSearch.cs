//
// YoutubeSearch.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	/// <summary>
	/// youtube video search results page
	/// </summary>
	[SimplInherit]
	public class YoutubeSearch : Search<YoutubeVideo>
	{
		public YoutubeSearch()
		{ }

		public YoutubeSearch(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
