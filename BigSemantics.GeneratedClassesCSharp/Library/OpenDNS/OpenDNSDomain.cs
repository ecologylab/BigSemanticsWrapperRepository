//
// OpenDNSDomain.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.OpenDNS 
{
	/// <summary>
	/// openDNS tags for a domain
	/// </summary>
	[SimplInherit]
	[SimplTag("openDNSDomain")]
	public class OpenDNSDomain : Document
	{
		[SimplScalar]
		private MetadataString domain;

		public OpenDNSDomain()
		{ }

		public OpenDNSDomain(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Domain
		{
			get{return domain;}
			set
			{
				if (this.domain != value)
				{
					this.domain = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
