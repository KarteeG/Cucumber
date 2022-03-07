package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Summary {

	private WebDriver driver;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement con;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement sighnOut;

	public Order_Summary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getSighnOut() {
		return sighnOut;
	}
	
	
	

}
