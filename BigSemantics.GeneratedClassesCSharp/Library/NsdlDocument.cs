//
// NsdlDocument.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
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
	public class NsdlDocument : Dc
	{
		[SimplComposite]
		[MmName("header")]
		private Header header;

		public NsdlDocument()
		{ }

		public NsdlDocument(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Header Header
		{
			get{return header;}
			set
			{
				if (this.header != value)
				{
					this.header = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
