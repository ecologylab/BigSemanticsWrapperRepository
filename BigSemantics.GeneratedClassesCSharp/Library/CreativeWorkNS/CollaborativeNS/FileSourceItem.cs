//
// FileSourceItem.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2017 Interface Ecology Lab. 
//


using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.BigSemantics.MetadataNS.Scalar;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.CollaborativeNS 
{
	[SimplInherit]
	public class FileSourceItem : Document
	{
		[SimplScalar]
		private MetadataString fileName;

		[SimplScalar]
		private MetadataString lastCommitMessage;

		[SimplScalar]
		private MetadataString lastUpdated;

		public FileSourceItem()
		{ }

		public FileSourceItem(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString FileName
		{
			get{return fileName;}
			set
			{
				if (this.fileName != value)
				{
					this.fileName = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString LastCommitMessage
		{
			get{return lastCommitMessage;}
			set
			{
				if (this.lastCommitMessage != value)
				{
					this.lastCommitMessage = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString LastUpdated
		{
			get{return lastUpdated;}
			set
			{
				if (this.lastUpdated != value)
				{
					this.lastUpdated = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}