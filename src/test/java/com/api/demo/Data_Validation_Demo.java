package com.api.demo;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Data_Validation_Demo {
	
	@Test
	public void Data_Validation() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users/2");
		String respone_Body = response.asString();
		System.out.println("Response Body:" + respone_Body);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code:"+ statusCode);
		ResponseBody body = response.getBody();
		System.out.println("Body:"+body);
		String sessionId = response.getSessionId();
		System.out.println("SessionId:"+ sessionId);
		long time = response.getTime();
		System.out.println("Time :"+ time);
		String header = response.getHeader("Content-Type");
		System.out.println("Header:"+header);
		
		

	}

}
