//
//  Tumblr.cs
//  s.im.pl serialization
//
//  Generated by DotNetTranslator on 11/10/10.
//  Copyright 2010 Interface Ecology Lab. 
//

using System;
using System.Collections.Generic;
using ecologylab.attributes;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;

namespace ecologylab.semantics.generated.library 
{
	/// <summary>
	/// Tumblr blog class
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class Tumblr : Document
	{
		/// <summary>
		/// Phone number of the restaurant
		/// </summary>
		[simpl_scalar]
		private MetadataString post;

		public Tumblr()
		{ }

		public MetadataString Post
		{
			get{return post;}
			set{post = value;}
		}
	}
}
