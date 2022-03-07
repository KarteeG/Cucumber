package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.cucum.automation.Page_Automation_Manager;
import com.helper.File_Reader;
import com.testrunner.Test_Runner_Using_Hooks_Backgroud;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner_Using_Hooks_Backgroud.driver;
	Page_Automation_Manager pam = new Page_Automation_Manager(driver);
	
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario Name :"+ name);
		System.out.println("Scenario Started");
	}
	@After
	public void afterhooks(Scenario s) throws IOException {
		if (s.isFailed()) {
			screenShot("C:\\Users\\u\\eclipse-workspace\\Cucumber\\Screen Shots\\file.png");
		}
		String status = s.getStatus();
		System.out.println("Status:"+ status);
	}

	@Given("^user Launch The Appilicatio And it Navigate To The Actual Page$")
	public void user_Launch_The_Appilicatio_And_it_Navigate_To_The_Actual_Page() throws Throwable {
		String url = File_Reader.getInstanceFR().getInstanceCR().getInstanceAutomationUrl();
		getUrl(url);
		maximize();
		waitImp(5000, TimeUnit.SECONDS);
	}

	@When("^user Click On The  Sighin Button And It Navigate To The Login Page$")
	public void user_Click_On_The_Sighin_Button_And_It_Navigate_To_The_Login_Page() throws Throwable {
		clickOnElement(pam.getInstanceLP().getSigninButton());
	}

	@When("^user Enter The username in Username$")
	public void user_Enter_The_username_in_Username() throws Throwable {
		inputValues(pam.getInstanceLP().getUsername(), "kartee.sri@gmail.com");
	}

	@When("^uer Enter The Password In Password$")
	public void uer_Enter_The_Password_In_Password() throws Throwable {
		inputValues(pam.getInstanceLP().getPassword(), "password");
	}

	@Then("^user Click The Sighn Button And It Navigate To the My Account Page$")
	public void user_Click_The_Sighn_Button_And_It_Navigate_To_the_My_Account_Page() throws Throwable {
		clickOnElement(pam.getInstanceLP().getLogin());
	}

	@Then("^user Click On The Login Button It Will Naviagte To The My Acconnt Page$")
	public void user_Click_On_The_Login_Button_It_Will_Naviagte_To_The_My_Acconnt_Page() throws Throwable {
		clickOnElement(pam.getInstanceLP().getLogin());
	}

	@When("^user See The Full Screen$")
	public void user_See_The_Full_Screen() throws Throwable {
		driver.manage().window().fullscreen();
	}

	@When("^user Click On The Women Button And it Naviagte To The Womens Page$")
	public void user_Click_On_The_Women_Button_And_it_Naviagte_To_The_Womens_Page() throws Throwable {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstancewp().getWomens());
	}

	@When("^user click The Faded Short Sleeve Image And It Naviagate To The Faded Short Sleeve Page Frame$")
	public void user_click_The_Faded_Short_Sleeve_Image_And_It_Naviagate_To_The_Faded_Short_Sleeve_Page_Frame()
			throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getFsst());
		clickOnElement(pam.getInstancewp().getFsst());
		sleep(5000);
	}

	@When("^user Enter The Qty In The Qty Text Boxs$")
	public void user_Enter_The_Qty_In_The_Qty_Text_Boxs() throws Throwable {
		sleep(5000);
		swithFrames("index", "0", null);
		inputValues(pam.getInstancewp().getQty(), "1");
	}

	@When("^user Select The Size In Size Selection$")
	public void user_Select_The_Size_In_Size_Selection() throws Throwable {
		dropDown("visible", pam.getInstancewp().getSize(), "M");
	}

	@When("^user Click The Add To Cart Button and It Naviagte To The Shopping Cart Page$")
	public void user_Click_The_Add_To_Cart_Button_and_It_Naviagte_To_The_Shopping_Cart_Page() throws Throwable {
		clickOnElement(pam.getInstancewp().getPtc());
		swithFrames("default", null, null);
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To Shiping Cart Summary Pages$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_Shiping_Cart_Summary_Pages()
			throws Throwable {
		clickOnElement(pam.getInstancewp().getPtc1());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To The Addresses Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_The_Addresses_Page() throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getPtc2());
		clickOnElement(pam.getInstancewp().getPtc2());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To The Shpping Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_The_Shpping_Page() throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getPtc3());
		sleep(5000);
		clickOnElement(pam.getInstancewp().getPtc3());
	}

	@When("^user Click The Terms And Services Radio Button$")
	public void user_Click_The_Terms_And_Services_Radio_Button() throws Throwable {
		clickOnElement(pam.getInstancewp().getCheckbox());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To the Payment Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_the_Payment_Page() throws Throwable {
		clickOnElement(pam.getInstancewp().getPtc4());
	}

	@When("^user Click The Bank Wire Button and It Naviagte To The Order Summary Page$")
	public void user_Click_The_Bank_Wire_Button_and_It_Naviagte_To_The_Order_Summary_Page() throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getBwire());
		clickOnElement(pam.getInstancewp().getBwire());
	}

	@When("^user Click the Confirm Button and It Navigate To The Order Confirmation Page$")
	public void user_Click_the_Confirm_Button_and_It_Navigate_To_The_Order_Confirmation_Page() throws Throwable {
		clickOnElement(pam.getInstancewp().getConfirm());
		JavaScroll("scrolldown");
	}

	@Then("^user Click The SignOut Button And It Will Naviagte To The Login Page$")
	public void user_Click_The_SignOut_Button_And_It_Will_Naviagte_To_The_Login_Page() throws Throwable {
		clickOnElement(pam.getInstanceLT().getLogout());
	}

	@When("^user See The Full Screen View$")
	public void user_See_The_Full_Screen_View() throws Throwable {
		driver.manage().window().fullscreen();
	}

	@When("^user Click on The Dresses Button And it Naviagte To The Dresses Page$")
	public void user_Click_on_The_Dresses_Button_And_it_Naviagte_To_The_Dresses_Page() throws Throwable {
		waitImp(50, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceDP().getDress());
	}

	@When("^user click The Printed Dress Image And It Naviagate To The Printed Dress Frame$")
	public void user_click_The_Printed_Dress_Image_And_It_Naviagate_To_The_Printed_Dress_Frame() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPd());
	}

	@When("^user click The Add To Cart Button and it Naviagte To The Shopping Cart$")
	public void user_click_The_Add_To_Cart_Button_and_it_Naviagte_To_The_Shopping_Cart() throws Throwable {
		sleep(5000);
		swithFrames("index", "0", null);
		clickOnElement(pam.getInstanceDP().getAtc());
		swithFrames("default", null, null);
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To The Shiping Cart Summary Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_The_Shiping_Cart_Summary_Page()
			throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc());
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To the Addresses Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_the_Addresses_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc1());
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To the Shpping Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_the_Shpping_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc2());
	}

	@When("^user Click The Terms And Services Button the Service Radio Button$")
	public void user_Click_The_Terms_And_Services_Button_the_Service_Radio_Button() throws Throwable {
		clickOnElement(pam.getInstanceDP().getCheckbox());
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To the Paeyment Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_the_Paeyment_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc3());
	}

	@When("^user Click The Bank Wire Payment Button and It Naviagte To the Order Summary Page$")
	public void user_Click_The_Bank_Wire_Payment_Button_and_It_Naviagte_To_the_Order_Summary_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getBwire());
	}

	@When("^user Click The Confirm Button and It Navigate To the Order Confirmation Page$")
	public void user_Click_The_Confirm_Button_and_It_Navigate_To_the_Order_Confirmation_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getConfirm());
		JavaScroll("scrolldown");
	}

//	@When("^user See The Full Screen Size$")
//	public void user_See_The_Full_Screen_Size() throws Throwable {
//		driver.manage().window().fullscreen();
//	}

	@When("^user Click on The T-Shirts Button And it Naviagte To The T-shirts Page$")
	public void user_Click_on_The_T_Shirts_Button_And_it_Naviagte_To_The_T_shirts_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getTshirts());
	}

	@When("^user click The Faded T-Shirt Image And It NAviagate To The Faded T-Shirt Page Frame$")
	public void user_click_The_Faded_T_Shirt_Image_And_It_NAviagate_To_The_Faded_T_Shirt_Page_Frame() throws Throwable {
		clickOnElement(pam.getInstanceTS().getFsst());
		sleep(5000);
	}

	@When("^user click The Add To Cart Button and it Naviagte To The Shiping Cart$")
	public void user_click_The_Add_To_Cart_Button_and_it_Naviagte_To_The_Shiping_Cart() throws Throwable {
		sleep(5000);
		swithFrames("index", "0", null);
		clickOnElement(pam.getInstanceTS().getAtc());
		swithFrames("default", null, null);
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To The Shiping Cart Summary$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_The_Shiping_Cart_Summary()
			throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc());
		waitImp(30, TimeUnit.SECONDS);
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To The Addresses Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_The_Addresses_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc1());
	}

	@When("^user Click The Proceed To The Checkout Button And It Naviagte To The Shpping Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_And_It_Naviagte_To_The_Shpping_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc2());
	}

	@When("^user Click The Terms And Services The Radio Button$")
	public void user_Click_The_Terms_And_Services_The_Radio_Button() throws Throwable {
		clickOnElement(pam.getInstanceTS().getCheckbox());
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To The Payment Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_The_Payment_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc3());
	}

	@When("^user Click The Payment Bank Wire Button and It Naviagte To The Order Summary Page$")
	public void user_Click_The_Payment_Bank_Wire_Button_and_It_Naviagte_To_The_Order_Summary_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getBwire());
	}

	@When("^user Click the I Confirm Button and It Navigate To The Order Confirmation Page$")
	public void user_Click_the_I_Confirm_Button_and_It_Navigate_To_The_Order_Confirmation_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getConfirm());
		JavaScroll("scrolldown");
	}

	@Then("^user Click To The SignOut Button And It The Naviagte To Login Page$")
	public void user_Click_To_The_SignOut_Button_And_It_The_Naviagte_To_Login_Page() throws Throwable {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceLT().getLogout());
	}

}
