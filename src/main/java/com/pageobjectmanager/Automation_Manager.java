package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.automation.Addresses_Page;
import com.automation.Home_Page;
import com.automation.My_Account;
import com.automation.Order_Summary;
import com.automation.Payment_Method;
import com.automation.Procced_To_Check_Out;
import com.automation.Shipping_Cart_Summary;
import com.automation.Shipping_Page;
import com.automation.Signin_Page;

public class Automation_Manager {

	private WebDriver driver;
	private Home_Page hp;
	private Signin_Page sp;
	private My_Account ma;
	private Procced_To_Check_Out ptc;
	private Shipping_Cart_Summary scs;
	private Addresses_Page ap;
	private Shipping_Page ss;
	private Payment_Method pm;
	private Order_Summary os;

	public Automation_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Home_Page getInhanceHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	
	public Signin_Page getInhancesp() {
		if (sp == null) {
			sp = new Signin_Page(driver);
		}
		return sp;
	}
	
	public My_Account getInhancema() {
		if (ma == null) {
			ma = new My_Account(driver);
		}return ma;
	}
	
	public Procced_To_Check_Out getInstanceptc() {
		if (ptc == null) {
			ptc = new Procced_To_Check_Out(driver);
		}return ptc;
	}
	
	public  Shipping_Cart_Summary getInstancescs() {
		if (scs == null) {
			scs = new Shipping_Cart_Summary(driver);
		}return scs;
	}
	
	public Addresses_Page getinstanceap() {
		if (ap == null) {
			ap = new Addresses_Page(driver);
		}return ap;
	}
	
	public Shipping_Page getinstancess() {
		if (ss == null) {
			ss = new Shipping_Page(driver);
		}return ss;
	}
	
	public Payment_Method getInstancepm() {
		if (pm == null) {
			pm = new Payment_Method(driver);
		}return pm;
	}
	
	public  Order_Summary getInstanceos() {
		if (os == null) {
			os = new Order_Summary(driver);
		}return os;
	}

}
