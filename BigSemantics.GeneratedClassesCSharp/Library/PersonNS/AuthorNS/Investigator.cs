//
// Investigator.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.PersonNS.AuthorNS;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS 
{
	[SimplInherit]
	public class Investigator<CW> : Author where CW : Grant
	{
		[SimplScalar]
		private MetadataString email;

		[SimplScalar]
		private MetadataString investigationType;

		public Investigator()
		{ }

		public Investigator(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Email
		{
			get{return email;}
			set
			{
				if (this.email != value)
				{
					this.email = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString InvestigationType
		{
			get{return investigationType;}
			set
			{
				if (this.investigationType != value)
				{
					this.investigationType = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
