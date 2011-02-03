//
//  UrbanSpoonGenre.cs
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

namespace ecologylab.semantics.generated.library.urbanspoon 
{
	/// <summary>
	/// UrbanSpoon Search Class
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class UrbanSpoonGenre : Search
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_collection("search_result")]
		[xml_tag("top_results")]
		[mm_name("top_results")]
		private List<SearchResult> topResults;

		public UrbanSpoonGenre()
		{ }

		public List<SearchResult> TopResults
		{
			get{return topResults;}
			set{topResults = value;}
		}
	}
}
