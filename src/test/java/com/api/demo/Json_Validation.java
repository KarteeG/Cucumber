package com.api.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Json_Validation {

	public static void main(String[] args) throws Throwable {
		
		File f = new File(
				"C:\\Users\\u\\eclipse-workspace\\Revised_Maven\\src\\test\\java\\com\\payload\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonobj = (JSONObject) parse;
		Object object = jsonobj.get("data");
		String string = object.toString();
		System.out.println(string);
		
}
}