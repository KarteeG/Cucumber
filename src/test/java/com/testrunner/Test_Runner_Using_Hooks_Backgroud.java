package com.testrunner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\Test.feature",	
					glue="com\\stepdefinition",
					monochrome = true,
					tags= {"~@Full1","~@Full2"},
					plugin= {
							"pretty",
						"html:Reports/Test.html",
						"json:Reports/Test.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Cucumber Report/Test.html"
					}
		)

public class Test_Runner_Using_Hooks_Backgroud {
	
	
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		driver = Base_Class.launchBroser("chrome");
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
