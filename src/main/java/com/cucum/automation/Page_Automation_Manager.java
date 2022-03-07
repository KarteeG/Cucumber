package com.cucum.automation;

import org.openqa.selenium.WebDriver;

public class Page_Automation_Manager {

	private WebDriver driver;
	private Login_Page lp;
	private Womens_Page wp;
	private Logout lt;
	private Dresses_Page dp;
	private TShirts ts;
	
	
	public Page_Automation_Manager(WebDriver driver2) {
		this.driver=driver2;
	}



	public Login_Page getInstanceLP() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}return lp;
	}
	
	public Womens_Page getInstancewp() {
		if (wp == null) {
			wp = new Womens_Page(driver);
		}return wp;
	}
	
	public Logout getInstanceLT() {
		if (lt == null) {
			lt = new Logout(driver);
		}return lt;
	}
	
	public Dresses_Page getInstanceDP() {
		if (dp == null) {
			dp = new Dresses_Page(driver);
		}return dp;
	}
	
	public TShirts getInstanceTS() {
		if ( ts == null) {
			ts = new TShirts(driver);
		}return ts;
	}
}
