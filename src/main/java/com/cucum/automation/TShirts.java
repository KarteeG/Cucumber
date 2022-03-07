package com.cucum.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirts {
	
	private WebDriver driver;
	@FindBy(xpath = "(//a[@href=\"http://automationpractice.com/index.php?id_category=5&controller=category\"])[2]")
	private WebElement tshirts;
	
	@FindBy(xpath = "//img[@src=\"http://automationpractice.com/img/p/1/1-home_default.jpg\"]")
	private WebElement fsst;
	
	@FindBy(name = "Submit")
	private WebElement atc;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement ptc;
	
	@FindBy(xpath ="//a[@href=\"http://automationpractice.com/index.php?controller=order&step=1\"]")
	private WebElement ptc1;
	
	@FindBy(name = "processAddress")
	private WebElement ptc2;
	
	@FindBy(id = "cgv")
	private WebElement checkbox;
	
	@FindBy(name = "processCarrier")
	private WebElement ptc3;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bwire;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirm;

	public TShirts(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getFsst() {
		return fsst;
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
