//
//  SlashdotTag.cs
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

namespace ecologylab.semantics.generated.library.slashdot 
{
	/// <summary>
	/// This is a generated code. DO NOT edit or modify it.
	/// @author MetadataCompiler
	/// </summary>
	[simpl_descriptor_classes(new Type[] { typeof(MetadataClassDescriptor), typeof(MetadataFieldDescriptor) })]
	[simpl_inherit]
	public class SlashdotTag : Metadata
	{
		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataString name;

		/// <summary>
		/// missing java doc comments or could not find the source file.
		/// </summary>
		[simpl_scalar]
		private MetadataParsedURL link;

		public SlashdotTag()
		{ }

		public MetadataString Name
		{
			get{return name;}
			set{name = value;}
		}

		public MetadataParsedURL Link
		{
			get{return link;}
			set{link = value;}
		}
	}
}
