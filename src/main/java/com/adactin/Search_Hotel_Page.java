package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {

	private WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement room;

	@FindBy(id = "room_nos")
	private WebElement roomnos;

	@FindBy(id = "datepick_in")
	private WebElement Cid;

	@FindBy(id = "datepick_out")
	private WebElement Cod;

	@FindBy(id = "adult_room")
	private WebElement ar;

	@FindBy(id = "child_room")
	private WebElement cr;

	@FindBy(id = "Submit")
	private WebElement submit;

	public Search_Hotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCid() {
		return Cid;
	}

	public WebElement getCod() {
		return Cod;
	}

	public WebElement getAr() {
		return ar;
	}

	public WebElement getCr() {
		return cr;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
