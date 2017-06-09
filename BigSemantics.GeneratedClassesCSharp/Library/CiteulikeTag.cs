//
// CiteulikeTag.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS;
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
	public class CiteulikeTag : RichDocument
	{
		[SimplCollection("citeulike_paper")]
		[MmName("articles")]
		private List<CiteulikePaper> articles;

		public CiteulikeTag()
		{ }

		public CiteulikeTag(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<CiteulikePaper> Articles
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
	}
}
