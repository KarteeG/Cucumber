package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	private WebDriver driver;
	
	@FindBy(name="cgv")
	private WebElement a;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement ptc;

	public Shipping_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDrier() {
		return driver;
	}

	public WebElement getA() {
		return a;
	}

	public WebElement getPtc() {
		return ptc;
	}
	
	

}
