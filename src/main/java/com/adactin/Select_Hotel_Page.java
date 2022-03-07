package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	
	private WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement btn;
	
	@FindBy(id = "continue")
	private WebElement coc;

	public Select_Hotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getCoc() {
		return coc;
	}
	
	

}
