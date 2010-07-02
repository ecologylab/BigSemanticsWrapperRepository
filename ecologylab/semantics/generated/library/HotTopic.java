package ecologylab.semantics.generated.library;

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.library.flickr.*;
import ecologylab.semantics.library.imdb.*;
import ecologylab.semantics.library.scholarlyPublication.*;
import ecologylab.semantics.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Media;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.xml.ElementState.xml_tag;
import ecologylab.xml.TranslationScope;
import ecologylab.xml.types.element.Mappable;
import ecologylab.xml.xml_inherit;
import java.util.*;

@xml_inherit

public class HotTopic extends Metadata{


/**
	null
**/ 

	 @xml_leaf private MetadataString	topic;

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
