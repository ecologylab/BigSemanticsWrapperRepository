//
// TempFieldValueHolder.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.MomaArtworkNS 
{
	[SimplInherit]
	public class TempFieldValueHolder : Metadata
	{
		[SimplScalar]
		private MetadataString tempDimensions;

		[SimplScalar]
		private MetadataString tempYear;

		[SimplScalar]
		private MetadataString tempMedium;

		public TempFieldValueHolder()
		{ }

		public TempFieldValueHolder(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString TempDimensions
		{
			get{return tempDimensions;}
			set
			{
				if (this.tempDimensions != value)
				{
					this.tempDimensions = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString TempYear
		{
			get{return tempYear;}
			set
			{
				if (this.tempYear != value)
				{
					this.tempYear = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString TempMedium
		{
			get{return tempMedium;}
			set
			{
				if (this.tempMedium != value)
				{
					this.tempMedium = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
