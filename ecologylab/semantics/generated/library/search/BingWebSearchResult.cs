//
//  BingWebSearchResult.cs
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

namespace ecologylab.semantics.generated.library.search 
{
	/// <summary>
	/// Bing web search result.
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class BingWebSearchResult : SearchResult
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		[xml_tag("web:Title")]
		private MetadataString heading;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		[xml_tag("web:Description")]
		private MetadataString snippet;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		[xml_tag("web:Url")]
		private MetadataParsedURL link;

		public BingWebSearchResult()
		{ }

		public MetadataString Heading
		{
			get{return heading;}
			set{heading = value;}
		}

		public MetadataString Snippet
		{
			get{return snippet;}
			set{snippet = value;}
		}

		public MetadataParsedURL Link
		{
			get{return link;}
			set{link = value;}
		}
	}
}
