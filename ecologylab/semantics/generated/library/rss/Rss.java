package ecologylab.semantics.generated.library.rss;


import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;


/**
	A news feed.

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/
@simpl_inherit
public class Rss
extends Document
{

@simpl_composite @mm_name("channel")
private Channel	channel;



/**
	Constructor
*/
public Rss()
{
 super();
}

/**
	Constructor
*/
public Rss(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy evaluation for channel
*/
public Channel	channel()
{
	Channel	result = this.channel;
	if (result == null)
	{
		result = new Channel();
		this.channel = result;
	}
	return result;
}

/**
	Get the value of field channel
*/
public Channel getChannel()
{
	return this.channel;
}

/**
	Set the value of field channel
*/
public void setChannel(Channel channel)
{
	this.channel = channel;
}


}

