package ecologylab.semantics.generated.library;

import java.util.ArrayList;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.serialization.simpl_inherit;

@simpl_inherit

public class Channel extends Metadata{

	@simpl_collection("item") @simpl_nowrap private ArrayList<Item>	item;

/**
	Constructor
**/ 

public Channel()
{
 super();
}

/**
	Constructor
**/ 

public Channel(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for item
**/ 

public  ArrayList<Item>	item()
{
 ArrayList<Item>	result	=this.item;
if(result == null)
{
result = new  ArrayList<Item>();
this.item	=	 result;
}
return result;
}

/**
	Set the value of field item
**/ 

public void setItem(  ArrayList<Item> item )
{
this.item = item ;
}

/**
	Get the value of field item
**/ 

public  ArrayList<Item> getItem(){
return this.item;
}
}
