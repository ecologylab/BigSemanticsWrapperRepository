package repository_cataloguer;

import java.util.*;
import repository_cataloguer.Attribute;

public class Tag {
	private String tag;
	private ArrayList<Attribute> uniqueAttributes;
	private ArrayList<String> wrappers;
	private ArrayList<String> locations;
	public Tag(String tagName, String wrapper){
		tag = tagName;
		uniqueAttributes = new ArrayList<Attribute>();
		
		locations = new ArrayList<String>();
	}
	
	public void addAttribute(Attribute attribute){
		boolean unique = true;
		for (int i = 0; i < uniqueAttributes.size(); i++){
			if (attribute.getName().equals(uniqueAttributes.get(i).getName())){
				unique = false;
				for (int j = 0; j < attribute.getValues().size(); j++){
					uniqueAttributes.get(i).addValue(attribute.getValues().get(j));
				}
				for (int j = 0; j < attribute.getLocations().size(); j++){
					uniqueAttributes.get(i).addLocation(attribute.getLocations().get(j));
				}
			}
		}
		if (unique){
			uniqueAttributes.add(attribute);
		}
	}
	public void addLocation(String repoName){
		
		boolean unique = true;
		for (int i = 0; i < locations.size(); i++){
			if (locations.get(i).equals(repoName)){
				unique = false;
			}
		}
		if (unique){
			locations.add(repoName);
		}
	}
	public void addWrapper(String wrapper){
		wrappers.add(wrapper);
	}
	
	public ArrayList<Attribute> getAttributes(){
		return uniqueAttributes;
	}
	public ArrayList<String> getWrappers(){
		return wrappers;
	}
	public ArrayList<String> getLocations(){
		return locations;
	}
	public String getName(){
		return tag;
	}
}


