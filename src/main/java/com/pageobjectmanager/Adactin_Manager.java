package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.adactin.Book_A_Hotel;
import com.adactin.Booking_Cnfimarion;
import com.adactin.Main_Page;
import com.adactin.Search_Hotel_Page;
import com.adactin.Select_Hotel_Page;

public class Adactin_Manager {
	
	private  WebDriver driver;
	private Main_Page mp;
	private Search_Hotel_Page shp;
	private Select_Hotel_Page sp;
	private Book_A_Hotel bh;
	private Booking_Cnfimarion bc;
	

	public Adactin_Manager(WebDriver driver2) {
		this.driver=driver2;
	}


	public Main_Page getinstancemp() {
		if (mp == null) {
			mp = new Main_Page(driver);
		}return mp;
	}
	
	public Search_Hotel_Page getinstanceshp() {
		if (shp == null) {
			shp = new Search_Hotel_Page(driver);
		}return shp;
	}
	
	public Select_Hotel_Page getInstancesp() {
		if (sp == null) {
			sp = new Select_Hotel_Page(driver);
		}
		return sp;
	}
	
	public Book_A_Hotel getInstancebh() {
		if (bh == null) {
			bh= new Book_A_Hotel(driver);
		}return bh;
	}
	
	public Booking_Cnfimarion getinstancebc() {
		if (bc==null) {
			bc = new Booking_Cnfimarion(driver);
		}return bc;

	}

}
