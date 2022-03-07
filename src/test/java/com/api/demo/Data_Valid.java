package com.api.demo;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Valid {
	
	@Test
	public void validation() {
		
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users/2");
		String respone_Body = response.asString();
		System.out.println("Response Body:"+ respone_Body);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code: "+statusCode);
		Assert.assertEquals(200, statusCode);
		System.out.println("Data Validation Succesfull");

	}

}
