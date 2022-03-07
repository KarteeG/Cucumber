package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Cart_Summary {
	
	private WebDriver driver;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement qty;
	
	@FindBy(xpath ="//a[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]")
	private WebElement ptc;

	public Shipping_Cart_Summary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getPtc() {
		return ptc;
	}
	
	
	
	

}
