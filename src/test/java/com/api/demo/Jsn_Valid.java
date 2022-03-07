package com.api.demo;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Jsn_Valid {
	
	public static void main(String[] args) throws Throwable {
		File f= new File("C:\\Users\\u\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\payload\\p.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonobj = (JSONObject) parse;
		Object object = jsonobj.get("Name");
		String string = object.toString();
		System.out.println(string);
	}

}
