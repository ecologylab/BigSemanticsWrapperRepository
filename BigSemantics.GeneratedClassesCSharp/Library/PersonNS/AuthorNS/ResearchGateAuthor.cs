//
// ResearchGateAuthor.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS 
{
	[SimplInherit]
	public class ResearchGateAuthor : Author
	{
		[SimplComposite]
		[MmName("insitution")]
		private ResearchGateInstitution insitution;

		[SimplComposite]
		[MmName("department")]
		private ResearchGateInstitutionDepartment department;

		[SimplComposite]
		[MmName("stats")]
		private ResearchGateStats stats;

		[SimplCollection("research_gate_article")]
		[MmName("featured_publications")]
		private List<ResearchGateArticle> featuredPublications;

		[SimplCollection("research_gate_author")]
		[MmName("top_coauthors")]
		private List<ResearchGateAuthor> topCoauthors;

		[SimplCollection("skill")]
		[MmName("skills")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> skills;

		public ResearchGateAuthor()
		{ }

		public ResearchGateAuthor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public ResearchGateInstitution Insitution
		{
			get{return insitution;}
			set
			{
				if (this.insitution != value)
				{
					this.insitution = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public ResearchGateInstitutionDepartment Department
		{
			get{return department;}
			set
			{
				if (this.department != value)
				{
					this.department = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public ResearchGateStats Stats
		{
			get{return stats;}
			set
			{
				if (this.stats != value)
				{
					this.stats = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ResearchGateArticle> FeaturedPublications
		{
			get{return featuredPublications;}
			set
			{
				if (this.featuredPublications != value)
				{
					this.featuredPublications = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<ResearchGateAuthor> TopCoauthors
		{
			get{return topCoauthors;}
			set
			{
				if (this.topCoauthors != value)
				{
					this.topCoauthors = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> Skills
		{
			get{return skills;}
			set
			{
				if (this.skills != value)
				{
					this.skills = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}