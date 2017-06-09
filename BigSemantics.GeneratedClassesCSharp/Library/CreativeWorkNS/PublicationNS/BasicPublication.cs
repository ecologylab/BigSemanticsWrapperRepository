//
// BasicPublication.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	/// <summary>
	/// A publication.
	/// </summary>
	[SimplInherit]
	public class BasicPublication : CreativeWork
	{
		[SimplScalar]
		private MetadataString isbn;

		[SimplComposite]
		[MmName("publisher")]
		private Publisher publisher;

		public BasicPublication()
		{ }

		public BasicPublication(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Isbn
		{
			get{return isbn;}
			set
			{
				if (this.isbn != value)
				{
					this.isbn = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Publisher Publisher
		{
			get{return publisher;}
			set
			{
				if (this.publisher != value)
				{
					this.publisher = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
