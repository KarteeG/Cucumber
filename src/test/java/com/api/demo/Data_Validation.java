package com.api.demo;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {
	
	@Test
	public void validattion() {
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users/2");
		
		String respone_Body = response.asString();
		
		System.out.println("Response Body:"+respone_Body);
		
		int statusCode = response.getStatusCode();
		
		System.out.println("StatusCode:"+statusCode);
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Data Validation Succesfull");
		
		ResponseBody body = response.getBody();
		
		System.out.println("Body:"+body);
		
		String statusLine = response.getStatusLine();
		
		System.out.println("Status Line:  "+ statusLine);
		
		long time = response.getTime();
		
		System.out.println("Time:"+time);
		
		String sessionId = response.getSessionId();
		
		System.out.println("Session Id:"+sessionId);
		
		String header = response.getHeader("Content-Type");
		
		System.out.println("Header:"+header);
	}

}
