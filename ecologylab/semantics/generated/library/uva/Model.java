package ecologylab.semantics.generated.library.uva;


import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Model
extends Metadata
{

@simpl_collection("topic_cluster") @xml_tag("topic_clusters") @mm_name("topic_clusters")
private ArrayList<TopicCluster>	topicClusters;



/**
	Constructor
*/
public Model()
{
 super();
}

/**
	Constructor
*/
public Model(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for topicClusters
*/
public ArrayList<TopicCluster>	topicClusters()
{
	ArrayList<TopicCluster>	result = this.topicClusters;
	if (result == null)
	{
		result = new ArrayList<TopicCluster>();
		this.topicClusters = result;
	}
	return result;
}

/**
	Get the value of field topicClusters
*/
public ArrayList<TopicCluster> getTopicClusters()
{
	return this.topicClusters;
}

/**
	Set the value of field topicClusters
*/
public void setTopicClusters(ArrayList<TopicCluster> topicClusters)
{
	this.topicClusters = topicClusters;
}


}

