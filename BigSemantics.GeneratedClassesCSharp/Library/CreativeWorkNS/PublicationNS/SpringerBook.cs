//
// SpringerBook.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS;
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

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS 
{
	/// <summary>
	/// A book in Springer Link.
	/// </summary>
	[SimplInherit]
	public class SpringerBook : Book
	{
		[SimplScalar]
		private MetadataString subtitle;

		[SimplCollection("springer_search")]
		[MmName("editor_names")]
		private List<SpringerSearch> editorNames;

		[SimplCollection("springer_search")]
		[MmName("book_chapters_incomplete")]
		private List<SpringerSearch> bookChaptersIncomplete;

		[SimplScalar]
		private MetadataString copyright;

		[SimplScalar]
		[SimplTag("DOI")]
		private MetadataString DOI;

		[SimplScalar]
		[SimplTag("print_ISBN")]
		private MetadataString printISBN;

		[SimplScalar]
		[SimplTag("online_ISBN")]
		private MetadataString onlineISBN;

		[SimplScalar]
		private MetadataString seriesVolume;

		[SimplScalar]
		[SimplTag("series_ISSN")]
		private MetadataString seriesISSN;

		[SimplScalar]
		private MetadataString copyrightHolder;

		[SimplCollection("springer_search")]
		[MmName("topics")]
		private List<SpringerSearch> topics;

		[SimplCollection("springer_search")]
		[MmName("ebook_packages")]
		private List<SpringerSearch> ebookPackages;

		[SimplCollection("editor_affiliation")]
		[MmName("editor_affiliations")]
		private List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> editorAffiliations;

		public SpringerBook()
		{ }

		public SpringerBook(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Subtitle
		{
			get{return subtitle;}
			set
			{
				if (this.subtitle != value)
				{
					this.subtitle = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SpringerSearch> EditorNames
		{
			get{return editorNames;}
			set
			{
				if (this.editorNames != value)
				{
					this.editorNames = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SpringerSearch> BookChaptersIncomplete
		{
			get{return bookChaptersIncomplete;}
			set
			{
				if (this.bookChaptersIncomplete != value)
				{
					this.bookChaptersIncomplete = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString Copyright
		{
			get{return copyright;}
			set
			{
				if (this.copyright != value)
				{
					this.copyright = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString DOIProp
		{
			get{return DOI;}
			set
			{
				if (this.DOI != value)
				{
					this.DOI = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString PrintISBN
		{
			get{return printISBN;}
			set
			{
				if (this.printISBN != value)
				{
					this.printISBN = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString OnlineISBN
		{
			get{return onlineISBN;}
			set
			{
				if (this.onlineISBN != value)
				{
					this.onlineISBN = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString SeriesVolume
		{
			get{return seriesVolume;}
			set
			{
				if (this.seriesVolume != value)
				{
					this.seriesVolume = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString SeriesISSN
		{
			get{return seriesISSN;}
			set
			{
				if (this.seriesISSN != value)
				{
					this.seriesISSN = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString CopyrightHolder
		{
			get{return copyrightHolder;}
			set
			{
				if (this.copyrightHolder != value)
				{
					this.copyrightHolder = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SpringerSearch> Topics
		{
			get{return topics;}
			set
			{
				if (this.topics != value)
				{
					this.topics = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<SpringerSearch> EbookPackages
		{
			get{return ebookPackages;}
			set
			{
				if (this.ebookPackages != value)
				{
					this.ebookPackages = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Ecologylab.BigSemantics.MetadataNS.Scalar.MetadataString> EditorAffiliations
		{
			get{return editorAffiliations;}
			set
			{
				if (this.editorAffiliations != value)
				{
					this.editorAffiliations = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
