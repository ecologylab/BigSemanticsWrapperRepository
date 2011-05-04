//
//  FlickrSearch.cs
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

namespace ecologylab.semantics.generated.library.flickr 
{
	/// <summary>
	/// The flickr search class
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class FlickrSearch : Document
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_collection("flickr_image")]
		[xml_tag("flickr_results")]
		[mm_name("flickr_results")]
		private List<FlickrImage> flickrResults;

		public FlickrSearch()
		{ }

		public List<FlickrImage> FlickrResults
		{
			get{return flickrResults;}
			set{flickrResults = value;}
		}
	}
}
