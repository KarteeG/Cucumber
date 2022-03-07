package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Cnfimarion {

	private WebDriver driver;

	@FindBy(id = "logout")
	private WebElement logout;

	@FindBy(id = "my_itinerary")
	private WebElement mylit;

	public Booking_Cnfimarion(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getMylit() {
		return mylit;
	}

}