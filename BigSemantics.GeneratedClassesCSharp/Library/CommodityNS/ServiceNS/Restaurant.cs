//
// Restaurant.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ServiceNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CommodityNS.ServiceNS 
{
	[SimplInherit]
	public class Restaurant : Service
	{
		/// <summary>
		/// Price range of the restaurant
		/// </summary>
		[SimplScalar]
		private MetadataString priceRange;

		/// <summary>
		/// The genres of food offered.
		/// </summary>
		[SimplCollection("restaurant_genre")]
		[MmName("genres")]
		private List<RestaurantGenre> genres;

		public Restaurant()
		{ }

		public Restaurant(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString PriceRange
		{
			get{return priceRange;}
			set
			{
				if (this.priceRange != value)
				{
					this.priceRange = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<RestaurantGenre> Genres
		{
			get{return genres;}
			set
			{
				if (this.genres != value)
				{
					this.genres = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
