//
// CommitsByDate.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.CollaborativeNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.CollaborativeNS 
{
	[SimplInherit]
	public class CommitsByDate : RichDocument
	{
		[SimplScalar]
		private MetadataString date;

		[SimplCollection("commit")]
		[MmName("commits_section")]
		private List<Commit> commitsSection;

		public CommitsByDate()
		{ }

		public CommitsByDate(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Date
		{
			get{return date;}
			set
			{
				if (this.date != value)
				{
					this.date = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Commit> CommitsSection
		{
			get{return commitsSection;}
			set
			{
				if (this.commitsSection != value)
				{
					this.commitsSection = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}