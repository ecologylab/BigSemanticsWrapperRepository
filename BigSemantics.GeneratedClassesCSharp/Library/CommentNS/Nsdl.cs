//
// Nsdl.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CommentNS 
{
	/// <summary>
	/// The NSDL class
	/// </summary>
	[SimplInherit]
	public class Nsdl : RichDocument
	{
		[SimplScalar]
		private MetadataString subject;

		public Nsdl()
		{ }

		public Nsdl(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Subject
		{
			get{return subject;}
			set
			{
				if (this.subject != value)
				{
					this.subject = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
