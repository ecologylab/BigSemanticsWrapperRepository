//
// Grant.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS;
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Builtins.CreativeWorkNS;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS 
{
	[SimplInherit]
	public class Grant : CreativeWork
	{
		[SimplCollection("grant_program")]
		[MmName("programs")]
		private List<GrantProgram> programs;

		[SimplScalar]
		private MetadataString grantNumber;

		[SimplScalar]
		private MetadataDate startDate;

		[SimplScalar]
		private MetadataDate expireDate;

		[SimplScalar]
		private MetadataInteger amount;

		[SimplCollection("grant_staff")]
		[MmName("managers")]
		private List<GrantStaff> managers;

		[SimplComposite]
		[MmName("sponsor")]
		private PostalAddress sponsor;

		[SimplCollection("scholarly_article")]
		[MmName("publications")]
		private List<ScholarlyArticle> publications;

		[SimplCollection("scholarly_article")]
		[MmName("proceedings")]
		private List<ScholarlyArticle> proceedings;

		[SimplCollection("relevant_location")]
		[MmName("relevant_locations")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataParsedURL> relevantLocations;

		public Grant()
		{ }

		public Grant(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<GrantProgram> Programs
		{
			get{return programs;}
			set
			{
				if (this.programs != value)
				{
					this.programs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString GrantNumber
		{
			get{return grantNumber;}
			set
			{
				if (this.grantNumber != value)
				{
					this.grantNumber = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate StartDate
		{
			get{return startDate;}
			set
			{
				if (this.startDate != value)
				{
					this.startDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataDate ExpireDate
		{
			get{return expireDate;}
			set
			{
				if (this.expireDate != value)
				{
					this.expireDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Amount
		{
			get{return amount;}
			set
			{
				if (this.amount != value)
				{
					this.amount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<GrantStaff> Managers
		{
			get{return managers;}
			set
			{
				if (this.managers != value)
				{
					this.managers = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public PostalAddress Sponsor
		{
			get{return sponsor;}
			set
			{
				if (this.sponsor != value)
				{
					this.sponsor = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ScholarlyArticle> Publications
		{
			get{return publications;}
			set
			{
				if (this.publications != value)
				{
					this.publications = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ScholarlyArticle> Proceedings
		{
			get{return proceedings;}
			set
			{
				if (this.proceedings != value)
				{
					this.proceedings = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataParsedURL> RelevantLocations
		{
			get{return relevantLocations;}
			set
			{
				if (this.relevantLocations != value)
				{
					this.relevantLocations = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
