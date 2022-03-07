package com.cucum.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	private WebDriver driver;
	
	@FindBy(xpath ="(//a[@href=\"http://automationpractice.com/index.php?id_category=8&controller=category\"])[2]")
	private WebElement dress;
	
	@FindBy(xpath = "//img[@src=\"http://automationpractice.com/img/p/8/8-home_default.jpg\"]")
	private WebElement pd;
	
	@FindBy (name = "Submit")
	private WebElement atc;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement ptc;
	
	@FindBy(xpath = "//a[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]")
	private WebElement ptc1;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement ptc2;
	
	@FindBy (id = "cgv")
	private WebElement checkbox;
	
	@FindBy(name = "processCarrier")
	private WebElement ptc3;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bwire;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirm;

	public Dresses_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getPd() {
		return pd;
	}

	public WebElement getAtc() {
		return atc;
	}

	public WebElement getPtc() {
		return ptc;
	}

	public WebElement getPtc1() {
		return ptc1;
	}

	public WebElement getPtc2() {
		return ptc2;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getPtc3() {
		return ptc3;
	}

	public WebElement getBwire() {
		return bwire;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	

}
