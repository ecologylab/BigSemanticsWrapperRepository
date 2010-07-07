package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;


/**
	The RSS class
**/ 

@simpl_inherit

public class  Rss
extends  Document
{


private  @simpl_composite Channel	channel;
/**
	Constructor
**/ 

public Rss()
{
 super();
}

/**
	Constructor
**/ 

public Rss(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for channel
**/ 

public Channel	channel()
{
Channel	result	=this.channel;
if(result == null)
{
result = new Channel();
this.channel	=	 result;
}
return result;
}

/**
	Set the value of field channel
**/ 

public void setChannel( Channel channel )
{
this.channel = channel ;
}

/**
	Get the value of field channel
**/ 

public Channel getChannel(){
return this.channel;
}

}

