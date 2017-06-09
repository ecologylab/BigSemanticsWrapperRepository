//
// AcmPortalPeriodical.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	[SimplInherit]
	public class AcmPortalPeriodical : Periodical
	{
		[SimplCollection("acm_portal")]
		[MmName("articles")]
		private List<AcmPortal> articles;

		public AcmPortalPeriodical()
		{ }

		public AcmPortalPeriodical(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<AcmPortal> Articles
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
