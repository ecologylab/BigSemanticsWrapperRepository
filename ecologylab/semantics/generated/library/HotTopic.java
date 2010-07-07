package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;

@simpl_inherit

public class HotTopic extends Metadata{


/**
	null
**/ 

	 @simpl_scalar @simpl_hints(Hint.XML_LEAF) private MetadataString	topic;

/**
	Constructor
**/ 

public HotTopic()
{
 super();
}

/**
	Constructor
**/ 

public HotTopic(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for topic
**/ 

public MetadataString	topic()
{
MetadataString	result	=this.topic;
if(result == null)
{
result = new MetadataString();
this.topic	=	 result;
}
return result;
}

/**
	Gets the value of the field topic
**/ 

public String getTopic(){
return topic().getValue();
}

/**
	Sets the value of the field topic
**/ 

public void setTopic( String topic )
{
this.topic().setValue(topic);
}

/**
	The heavy weight setter method for field topic
**/ 

public void hwSetTopic( String topic )
{
this.topic().setValue(topic);
rebuildCompositeTermVector();
 }
/**
	 Sets the topic directly
**/ 

public void setTopicMetadata(MetadataString topic)
{	this.topic = topic;
}
/**
	Heavy Weight Direct setter method for topic
**/ 

public void hwSetTopicMetadata(MetadataString topic)
{	 if(this.topic!=null && this.topic.getValue()!=null && hasTermVector())
		 termVector().remove(this.topic.termVector());
	 this.topic = topic;
	rebuildCompositeTermVector();
}}
