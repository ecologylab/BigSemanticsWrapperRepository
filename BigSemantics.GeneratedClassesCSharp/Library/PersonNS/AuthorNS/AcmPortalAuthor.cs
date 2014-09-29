//
// AcmPortalAuthor.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS 
{
	[SimplInherit]
	public class AcmPortalAuthor : Author
	{
		[SimplComposite]
		[MmName("publication_detail")]
		private AcmPortalAuthorPublicationDetail publicationDetail;

		[SimplComposite]
		[MmName("collaborators")]
		private AcmPortalAuthorCollaborators collaborators;

		[SimplCollection("acm_portal_institution_profile")]
		[MmName("affiliations")]
		private List<AcmPortalInstitutionProfile> affiliations;

		public AcmPortalAuthor()
		{ }

		public AcmPortalAuthor(MetaMetadataCompositeField mmd) : base(mmd) { }


		public AcmPortalAuthorPublicationDetail PublicationDetail
		{
			get{return publicationDetail;}
			set
			{
				if (this.publicationDetail != value)
				{
					this.publicationDetail = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public AcmPortalAuthorCollaborators Collaborators
		{
			get{return collaborators;}
			set
			{
				if (this.collaborators != value)
				{
					this.collaborators = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<AcmPortalInstitutionProfile> Affiliations
		{
			get{return affiliations;}
			set
			{
				if (this.affiliations != value)
				{
					this.affiliations = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}