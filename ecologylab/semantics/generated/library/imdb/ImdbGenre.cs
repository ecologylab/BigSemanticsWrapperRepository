//
//  ImdbGenre.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 04/01/11.
//  Copyright 2011 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using ecologylab.attributes;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;

namespace ecologylab.semantics.generated.library.imdb 
{
	/// <summary>
	/// IMDB genre
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class ImdbGenre : Document
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_collection("imdb_title")]
		[xml_tag("results")]
		[mm_name("results")]
		private List<ImdbTitle> results;

		public ImdbGenre()
		{ }

		public List<ImdbTitle> Results
		{
			get{return results;}
			set{results = value;}
		}
	}
}
