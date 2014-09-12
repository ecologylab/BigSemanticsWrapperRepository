package repository_cataloguer;

import com.google.gson.Gson;

import java.util.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.w3c.dom.NamedNodeMap;
import repository_cataloguer.Tag;
import repository_cataloguer.Attribute;
import java.io.*;
public class RespositoryCataloguer {
	
	private ArrayList<Tag> uniqueTags;
	
	public RespositoryCataloguer(){
		uniqueTags = new ArrayList<Tag>();
	}
	
	public void addTag(Tag tag){
		boolean unique = true;
		
		for(int i = 0; i < uniqueTags.size(); i++){
			if (uniqueTags.get(i).getName().equals(tag.getName())){
				unique = false;
				for (int j= 0; j < tag.getAttributes().size(); j++){
					uniqueTags.get(i).addAttribute(tag.getAttributes().get(j));
				}
				for (int j= 0; j < tag.getLocations().size(); j++){
					uniqueTags.get(i).addLocation(tag.getLocations().get(j));
				}
				
			}
		}
		
		if(unique){
			uniqueTags.add(tag);
		}
	}
	
	public ArrayList<Tag> getTags(){
		return uniqueTags;
	}
	
	public void printDataToFile(File file){
		//Print out all unique tag names
		try{
		PrintWriter fw = new PrintWriter(file.getAbsoluteFile());
		
		fw.println("List of Tags");
		for (int i = 0; i < uniqueTags.size(); i++){
			fw.print("\tTag Name: ");
			fw.println(uniqueTags.get(i).getName());
			fw.println("\t\tAttribute Names: ");
			for (int j= 0; j < uniqueTags.get(i).getAttributes().size(); j++){
				fw.print("\t\t\tAttribute: ");
				Attribute att = uniqueTags.get(i).getAttributes().get(j);
				fw.println(att.getName());
				fw.print("\t\t\t\tValues it takes: ");
				
				fw.println(att.getValues());
			}
		}
		fw.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void printDataAsJSONToFile(File file){
		Gson gson = new Gson();
		try{
			PrintWriter fw = new PrintWriter(file.getAbsoluteFile());
			
			fw.println(gson.toJson(uniqueTags));
			fw.close();
			}catch (Exception e){
				e.printStackTrace();
			}
	}
	
	public static Tag tagFromNode(Node node, String docName){
		Tag newTag = new Tag(node.getNodeName(), docName);
		NamedNodeMap attributes = node.getAttributes();
		for (int j = 0; j < attributes.getLength(); j++){
			String attributeName = attributes.item(j).getNodeName();
			String attributeLocation = docName;
			Attribute att = new Attribute(attributeName);
			att.addLocation(attributeLocation);
			att.addValue(attributes.item(j).getNodeValue());
			newTag.addAttribute(att);
		
		}
		newTag.addLocation(docName);
		return newTag;
	}
	
	
	public void catalogueXML(File file){
		
		try{
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
		 
			
			NodeList list = doc.getElementsByTagName("*");
			
			
			
			for (int i = 0; i < list.getLength(); i++){
				Tag tag = tagFromNode(list.item(i), file.getName());		
				this.addTag(tag);
			
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
			
	}
	public static String getFileExtensionName(File f) {
	    if (f.getName().indexOf(".") == -1) {
	      return "";
	    } else {
	      return f.getName().substring(f.getName().length() - 3, f.getName().length());
	    }
	}
	
	public static File[] getXMLFiles(File folder) {
	    List<File> aList = new ArrayList<File>();

	    File[] files = folder.listFiles();
	    for (File pf : files) {

	      if (pf.isFile() && getFileExtensionName(pf).indexOf("xml") != -1) {
	        aList.add(pf);
	      }

	    }
	    
	    //recurse through all subdirectories
	    String[] names = folder.list();
	    for(String name : names)
	    {
	    	File tempFile = new File(folder.getAbsolutePath() + "/" + name);
	        if (tempFile.isDirectory())
	        {
	        	aList.addAll(Arrays.asList(getXMLFiles(tempFile)));
	        	System.out.println(name);
	        }
	    }	   
	    
	    return aList.toArray(new File[aList.size()]);

	}    
	public static void main(String[] args) {

		try{
			RespositoryCataloguer cataloguer = new RespositoryCataloguer();   
			String path = "..\\BigSemanticsWrappers\\repository";
			path = path.replaceAll("\\\\", "/");
			File directory = new File(path);
			//Need to generate a list of paths to be used. Loop through them and call catalogueXML for each
			File[] contents = getXMLFiles(directory);
			System.out.println(contents.length);
			for (int i = 0; i < contents.length; i++){
				
				cataloguer.catalogueXML(contents[i]);
			}
			
			File dataFile = new File("repositoryCatalogue.txt");
			if (!dataFile.exists()) {
				dataFile.createNewFile();
			}
			cataloguer.printDataToFile(dataFile);
			
			File jsonFile = new File("repositoryCatalogueJSON.txt");
			if (!jsonFile.exists()) {
				jsonFile.createNewFile();
			}
			cataloguer.printDataAsJSONToFile(jsonFile);
		}catch(Exception e){
			e.printStackTrace();

		}
		
			
			
	}

}
