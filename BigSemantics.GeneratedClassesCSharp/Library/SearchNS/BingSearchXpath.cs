//
// BingSearchXpath.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


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

namespace Ecologylab.BigSemantics.Generated.Library.SearchNS 
{
	/// <summary>
	/// The bing Search class, using xpath parser.
	/// </summary>
	[SimplInherit]
	public class BingSearchXpath : Search<RichDocument>
	{
		public BingSearchXpath()
		{ }

		public BingSearchXpath(MetaMetadataCompositeField mmd) : base(mmd) { }

	}
}
