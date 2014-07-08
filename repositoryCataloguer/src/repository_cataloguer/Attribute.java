package repository_cataloguer;

import java.util.*;

public class Attribute {
	private String name;
	private ArrayList<String> values;
	private ArrayList<String> locations;
	public Attribute(String atName){
		name = atName;
		values = new ArrayList<String>();
		locations = new ArrayList<String>();
	}
	
	
	public void addValue(String value){
		boolean unique = true;
		for (int i = 0; i < values.size(); i++){
			if (value.equals(values.get(i))){
				unique = false;
			}
		}
		if (unique){
			values.add(value);
		}
	}
	public void addLocation(String location){
		boolean unique = true;
		for (int i = 0; i < locations.size(); i++){
			if (location.equals(locations.get(i))){
				unique = false;
			}
		}
		if (unique){
			locations.add(location);
		}
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<String> getValues(){
		return values;
	}
	public ArrayList<String> getLocations(){
		return locations;
	}
}

