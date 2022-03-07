package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature",
					glue= "com\\stepdefinition",
					
					monochrome = true,
					
					dryRun = false,
					
					strict = true,
					
					tags = ("~@AD06"), 
					
					plugin = {
					"html:Reports/Adactin_Html_Report.html",
					//"pretty", //Console Report
					"json:Reports/Adactin_Json_Report",
					"com.cucumber.listener.ExtentCucumberFormatter:Cucumber Report/Adactin.html"
					}
						
					)

public class Adactin_Test_Runner {
	
	public static WebDriver driver; // Null
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		driver = Base_Class.launchBroser("chrome");
	}
	@AfterClass
	public static void tear_Down() {
		
		Base_Class.close();
	}

}
