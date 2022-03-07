package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Procced_To_Check_Out {
	private WebDriver driver;
	
	@FindBy(xpath ="//a[@class='btn btn-default button button-medium']")
	private WebElement ptc;

	public Procced_To_Check_Out(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPtc() {
		return ptc;
	}
	
	
}
