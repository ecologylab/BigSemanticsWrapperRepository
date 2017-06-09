//
// Disaster.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.EventNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.EventNS 
{
	/// <summary>
	/// Generalized Disaster Object
	/// </summary>
	[SimplInherit]
	public class Disaster : Event
	{
		[SimplScalar]
		private MetadataFloat magnitude;

		[SimplComposite]
		[MmName("map_image")]
		private Image mapImage;

		[SimplComposite]
		[MmName("map")]
		private Document map;

		[SimplComposite]
		[MmName("source")]
		private RichDocument source;

		public Disaster()
		{ }

		public Disaster(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataFloat Magnitude
		{
			get{return magnitude;}
			set
			{
				if (this.magnitude != value)
				{
					this.magnitude = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Image MapImage
		{
			get{return mapImage;}
			set
			{
				if (this.mapImage != value)
				{
					this.mapImage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Document Map
		{
			get{return map;}
			set
			{
				if (this.map != value)
				{
					this.map = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public RichDocument Source
		{
			get{return source;}
			set
			{
				if (this.source != value)
				{
					this.source = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
