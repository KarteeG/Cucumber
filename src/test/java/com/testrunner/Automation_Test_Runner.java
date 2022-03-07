package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Automation.feature",
				
					glue = "com\\stepdefinition",
					
					dryRun = false,
					
					strict = true,
					
					monochrome = true,
					
					tags = ("~@AT03"),

					
					plugin = {
						
							"html:Reports/Automation_Html_Report.html",
						//	"pretty", //Console Report
							"json:Reports/Automation_Json_Report",
	"com.cucumber.listener.ExtentCucumberFormatter:Cucumber Report/Automation.html"
					}
						)

public class Automation_Test_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		
		driver = Base_Class.launchBroser("chrome");
	}
	@AfterClass
	public static  void tearDown() {
		Base_Class.close();
	}
	
}
