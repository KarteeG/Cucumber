package com.cucum.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;

	public Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

	

}
