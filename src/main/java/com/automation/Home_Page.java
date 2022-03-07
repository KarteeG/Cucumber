package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	private WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement Singnin;

	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSingnin() {
		return Singnin;
	}
	
	

}
