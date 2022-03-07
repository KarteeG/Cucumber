package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Page {

	private WebDriver driver;

	@FindBy(id="username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement login;
	

	public Main_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
