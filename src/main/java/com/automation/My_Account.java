package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Women']")
	private WebElement Casulas;
	
	@FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]")
	private WebElement addToCart;

	public My_Account(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCasulas() {
		return Casulas;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	

}
