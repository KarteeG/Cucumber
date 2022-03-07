package com.api.demo;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Url_Data_Validation {

	@Test
	public void data_Validatio() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification requset = RestAssured.given();
		Response response = requset.get("api/users?page=2");
		String resonse_Body = response.asString();
		System.out.println("Response Body :"+resonse_Body);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code:"+statusCode);
		Assert.assertEquals(200, statusCode);
		System.out.println("Data Validation Succesfull");
	
	}
}
