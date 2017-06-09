//
// RestaurantGenre.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ServiceNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CommodityNS.ServiceNS 
{
	/// <summary>
	/// Restaurants genre.
	/// </summary>
	[SimplInherit]
	public class RestaurantGenre : RichDocument
	{
		[SimplCollection("restaurant")]
		[MmName("restaurants")]
		private List<Restaurant> restaurants;

		public RestaurantGenre()
		{ }

		public RestaurantGenre(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<Restaurant> Restaurants
		{
			get{return restaurants;}
			set
			{
				if (this.restaurants != value)
				{
					this.restaurants = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
