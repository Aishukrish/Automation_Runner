package com.api.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Validation {
public static void main(String[] args) throws IOException, ParseException {
	File f= new File("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\src\\test\\java\\com\\api\\payload\\Payload.json");
	FileReader reader= new FileReader(f);
	JSONParser parser= new JSONParser();
	Object obj=parser.parse(reader);
	JSONObject jobj= (JSONObject) obj;
	Object object= jobj.get("Team");
	String value= object.toString();
	System.out.println("Team   :"+value);
	
	
}
}
