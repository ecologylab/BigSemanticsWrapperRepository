//
//  GooglePatent.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 02/02/11.
//  Copyright 2011 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using ecologylab.attributes;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata.builtins;

namespace ecologylab.semantics.generated.library 
{
	/// <summary>
	/// Google Patents Class
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class GooglePatent : Document
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataString inventor;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataString abstractField;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataString claims;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataParsedURL picLink;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_collection("search_result")]
		[xml_tag("referenced_bys")]
		[mm_name("referenced_bys")]
		private List<SearchResult> referencedBys;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_collection("search_result")]
		[xml_tag("citations")]
		[mm_name("citations")]
		private List<SearchResult> citations;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_collection("search_result")]
		[xml_tag("pic_links")]
		[mm_name("pic_links")]
		private List<SearchResult> picLinks;

		public GooglePatent()
		{ }

		public MetadataString Inventor
		{
			get{return inventor;}
			set{inventor = value;}
		}

		public MetadataString AbstractField
		{
			get{return abstractField;}
			set{abstractField = value;}
		}

		public MetadataString Claims
		{
			get{return claims;}
			set{claims = value;}
		}

		public MetadataParsedURL PicLink
		{
			get{return picLink;}
			set{picLink = value;}
		}

		public List<SearchResult> ReferencedBys
		{
			get{return referencedBys;}
			set{referencedBys = value;}
		}

		public List<SearchResult> Citations
		{
			get{return citations;}
			set{citations = value;}
		}

		public List<SearchResult> PicLinks
		{
			get{return picLinks;}
			set{picLinks = value;}
		}
	}
}
