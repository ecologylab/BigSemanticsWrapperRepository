package ecologylab.semantics.generated.library;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import java.util.ArrayList;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metametadata.MetaMetadata;
import ecologylab.xml.simpl_inherit;


/**
	Google trends
**/ 

@simpl_inherit

public class  GoogleTrends
extends  Document
{

	@simpl_collection("hot_topic") @simpl_nowrap private ArrayList<HotTopic>	hotTopics;
	@simpl_collection("hot_search") @simpl_nowrap private ArrayList<HotSearch>	hotSearches;

/**
	Constructor
**/ 

public GoogleTrends()
{
 super();
}

/**
	Constructor
**/ 

public GoogleTrends(MetaMetadata metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for hotTopics
**/ 

public  ArrayList<HotTopic>	hotTopics()
{
 ArrayList<HotTopic>	result	=this.hotTopics;
if(result == null)
{
result = new  ArrayList<HotTopic>();
this.hotTopics	=	 result;
}
return result;
}

/**
	Set the value of field hotTopics
**/ 

public void setHotTopics(  ArrayList<HotTopic> hotTopics )
{
this.hotTopics = hotTopics ;
}

/**
	Get the value of field hotTopics
**/ 

public  ArrayList<HotTopic> getHotTopics(){
return this.hotTopics;
}

/**
	Lazy Evaluation for hotSearches
**/ 

public  ArrayList<HotSearch>	hotSearches()
{
 ArrayList<HotSearch>	result	=this.hotSearches;
if(result == null)
{
result = new  ArrayList<HotSearch>();
this.hotSearches	=	 result;
}
return result;
}

/**
	Set the value of field hotSearches
**/ 

public void setHotSearches(  ArrayList<HotSearch> hotSearches )
{
this.hotSearches = hotSearches ;
}

/**
	Get the value of field hotSearches
**/ 

public  ArrayList<HotSearch> getHotSearches(){
return this.hotSearches;
}

}

