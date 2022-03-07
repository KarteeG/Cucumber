package com.cucum.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signinButton;
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement login;

		

	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSigninButton() {
		return signinButton;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

}
