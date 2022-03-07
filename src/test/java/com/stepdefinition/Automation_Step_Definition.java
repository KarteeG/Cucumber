package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.cucum.automation.Page_Automation_Manager;
import com.helper.File_Reader;
import com.testrunner.Automation_Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_Step_Definition extends Base_Class {

	public static WebDriver driver = Automation_Test_Runner.driver;
	Page_Automation_Manager pam = new Page_Automation_Manager(driver);
	public static Logger log = Logger.getLogger(Automation_Step_Definition.class);
	

	@Given("^user Open The Appilication$")
	public void user_Open_The_Appilication() throws Throwable {
		String url = File_Reader.getInstanceFR().getInstanceCR().getInstanceAutomationUrl();
		getUrl(url);
		maximize();
		waitImp(5000, TimeUnit.SECONDS);
		//BasicConfigurator.configure();
		log.info("Browser Launch");
	}

	@Then("^user Click On The Sighn In Button It Naviagate Login Page$")
	public void user_Click_On_The_Sighn_In_Button_It_Naviagate_Login_Page() throws Throwable {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceLP().getSigninButton());
	}

	@When("^user Enter The Username In The Username Field \"([^\"]*)\"$")
	public void user_Enter_The_Username_In_The_Username_Field(String username) throws Throwable {
		inputValues(pam.getInstanceLP().getUsername(), username);
	}

	@When("^user Enter The Passeord In The Password Field \"([^\"]*)\"$")
	public void user_Enter_The_Passeord_In_The_Password_Field(String password) throws Throwable {
		inputValues(pam.getInstanceLP().getPassword(), password);
	}

	@Then("^user click The Sign In Button And It Navigate To My Account Page$")
	public void user_click_The_Sign_In_Button_And_It_Navigate_To_My_Account_Page() throws Throwable {
		clickOnElement(pam.getInstanceLP().getLogin());
	}

	@When("^user Want To Full Screen$")
	public void user_Want_To_Full_Screen() throws Throwable {
		driver.manage().window().fullscreen();
	}

	@When("^user Click On The Women Button And it Naviagte To Womens Page$")
	public void user_Click_On_The_Women_Button_And_it_Naviagte_To_Womens_Page() throws Throwable {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstancewp().getWomens());
	}

	@When("^user click The Faded Short Sleeve Image And It Naviagate To Faded Short Sleeve Page Frame$")
	public void user_click_The_Faded_Short_Sleeve_Image_And_It_Naviagate_To_Faded_Short_Sleeve_Page_Frame()
			throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getFsst());
		clickOnElement(pam.getInstancewp().getFsst());
		sleep(5000);
	}

	@When("^user Enter The Qty In The Qty Text Box$")
	public void user_Enter_The_Qty_In_The_Qty_Text_Box() throws Throwable {
		swithFrames("index", "0", null);
		inputValues(pam.getInstancewp().getQty(), "1");
	}

	@When("^user Select The Size In Size$")
	public void user_Select_The_Size_In_Size() throws Throwable {
		dropDown("visible", pam.getInstancewp().getSize(), "M");
	}

	@When("^user Click The Add To Cart Button and It Naviagte To Shopping Cart$")
	public void user_Click_The_Add_To_Cart_Button_and_It_Naviagte_To_Shopping_Cart() throws Throwable {
		clickOnElement(pam.getInstancewp().getPtc());
		swithFrames("default", null, null);
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To Shiping Cart Summary Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_Shiping_Cart_Summary_Page()
			throws Throwable {
		clickOnElement(pam.getInstancewp().getPtc1());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To Addresses Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_Addresses_Page() throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getPtc2());
		clickOnElement(pam.getInstancewp().getPtc2());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To Shpping Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_Shpping_Page() throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getPtc3());
		sleep(5000);
		clickOnElement(pam.getInstancewp().getPtc3());
	}

	@When("^user Click The Terms And Service Radio Button$")
	public void user_Click_The_Terms_And_Service_Radio_Button() throws Throwable {
		clickOnElement(pam.getInstancewp().getCheckbox());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To Payment Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_Payment_Page() throws Throwable {
		clickOnElement(pam.getInstancewp().getPtc4());
	}

	@When("^user Click The Bank Wire Button and It Naviagte To Order Summary Page$")
	public void user_Click_The_Bank_Wire_Button_and_It_Naviagte_To_Order_Summary_Page() throws Throwable {
		javaScriptOptions("scrollintoview", pam.getInstancewp().getBwire());
		clickOnElement(pam.getInstancewp().getBwire());
	}

	@When("^user Click the Confirm Button and It Navigate To Order Confirmation Page$")
	public void user_Click_the_Confirm_Button_and_It_Navigate_To_Order_Confirmation_Page() throws Throwable {
		clickOnElement(pam.getInstancewp().getConfirm());
		JavaScroll("scrolldown");
		log.info("Women Purchase Succesfully");
	}

	@Then("^user Click The SignOut Button And It Will Naviagte To Login Page$")
	public void user_Click_The_SignOut_Button_And_It_Will_Naviagte_To_Login_Page() throws Throwable {
		clickOnElement(pam.getInstanceLT().getLogout());
		log.info("Loout Succesfully");
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Text Box$")
	public void user_Enter_The_In_The_Username_Text_Box(String username) throws Throwable {
		inputValues(pam.getInstanceLP().getUsername(), username);

	}

	@When("^user Enter The \"([^\"]*)\" In The Password Text Box$")
	public void user_Enter_The_In_The_Password_Text_Box(String password) throws Throwable {
		inputValues(pam.getInstanceLP().getPassword(), password);
	}

	@Then("^user click The Sign In Button And It Navigate To My Accounts Page$")
	public void user_click_The_Sign_In_Button_And_It_Navigate_To_My_Accounts_Page() throws Throwable {
		clickOnElement(pam.getInstanceLP().getLogin());
		log.info("Login Succesfully");
	}

	@When("^user Click on The Dresses Button And it Naviagte To Dresses Page$")
	public void user_Click_on_The_Dresses_Button_And_it_Naviagte_To_Dresses_Page() throws Throwable {
		waitImp(50, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceDP().getDress());
	}

	@When("^user click The Printed Dress Image And It Naviagate To Printed Dress Frame$")
	public void user_click_The_Printed_Dress_Image_And_It_Naviagate_To_Printed_Dress_Frame() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPd());
	}

	@When("^user click The Add To Cart Button and it Naviagte To Shopping Cart$")
	public void user_click_The_Add_To_Cart_Button_and_it_Naviagte_To_Shopping_Cart() throws Throwable {
		swithFrames("index", "0", null);
		clickOnElement(pam.getInstanceDP().getAtc());
		swithFrames("default", null, null);
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To The Shiping Cart Summary Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_The_Shiping_Cart_Summary_Page()
			throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To the Addresses Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_the_Addresses_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc1());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To the Shpping Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_the_Shpping_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc2());
	}

	@When("^user Click The Terms And click the Service Radio Button$")
	public void user_Click_The_Terms_And_click_the_Service_Radio_Button() throws Throwable {
		clickOnElement(pam.getInstanceDP().getCheckbox());
	}

	@When("^user Click The Proceed To Checkout Button and It Naviagte To the Paeyment Page$")
	public void user_Click_The_Proceed_To_Checkout_Button_and_It_Naviagte_To_the_Paeyment_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getPtc3());
	}

	@When("^user Click The Bank Wire Button and It Naviagte To the Order Summary Page$")
	public void user_Click_The_Bank_Wire_Button_and_It_Naviagte_To_the_Order_Summary_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getBwire());
	}

	@When("^user Click the Confirm Button and It Navigate To the Order Confirmation Page$")
	public void user_Click_the_Confirm_Button_and_It_Navigate_To_the_Order_Confirmation_Page() throws Throwable {
		clickOnElement(pam.getInstanceDP().getConfirm());
		JavaScroll("scrolldown");
		log.info("Dresses Purchase Succesfully");
	}

	@Then("^user Click The SignOut Button And It Will Naviagte To the Login Page$")
	public void user_Click_The_SignOut_Button_And_It_Will_Naviagte_To_the_Login_Page() throws Throwable {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceLT().getLogout());
		log.info("Loout Succesfully");
	}

	@When("^user Enter The \"([^\"]*)\" In To  The Username Text Box$")
	public void user_Enter_The_In_To_The_Username_Text_Box(String username) throws Throwable {
		inputValues(pam.getInstanceLP().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In To The Password Text Box$")
	public void user_Enter_The_In_To_The_Password_Text_Box(String password) throws Throwable {
		inputValues(pam.getInstanceLP().getPassword(), password);
	}

	@Then("^user click The Sign In Button And It Navigate To The My Account Page$")
	public void user_click_The_Sign_In_Button_And_It_Navigate_To_The_My_Account_Page() throws Throwable {
		clickOnElement(pam.getInstanceLP().getLogin());
		log.info("Login Succesfully");
	}

	@When("^user Click on The T-Shirts Button And it Naviagte To T-shirts Page$")
	public void user_Click_on_The_T_Shirts_Button_And_it_Naviagte_To_T_shirts_Page() throws Throwable {
		waitImp(50, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceTS().getTshirts());

	}

	@When("^user click The Faded T-Shirt Image And It NAviagate To Faded T-Shirt Page Frame$")
	public void user_click_The_Faded_T_Shirt_Image_And_It_NAviagate_To_Faded_T_Shirt_Page_Frame() throws Throwable {
		clickOnElement(pam.getInstanceTS().getFsst());
		sleep(5000);
	}

	@When("^user click The Add To Cart Button and it Naviagte To the Shopping Cart$")
	public void user_click_The_Add_To_Cart_Button_and_it_Naviagte_To_the_Shopping_Cart() throws Throwable {
		sleep(5000);
		swithFrames("index", "0", null);
		clickOnElement(pam.getInstanceTS().getAtc());
		swithFrames("default", null, null);
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To Shiping Cart Summary Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_Shiping_Cart_Summary_Page()
			throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc());
		waitImp(30, TimeUnit.SECONDS);
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To Addresses Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_Addresses_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc1());
	}

	@When("^user Click The Proceed To The Checkout Button And It Naviagte To Shpping Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_And_It_Naviagte_To_Shpping_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc2());
	}

	@When("^user Click The Terms And Service The Radio Button$")
	public void user_Click_The_Terms_And_Service_The_Radio_Button() throws Throwable {
		clickOnElement(pam.getInstanceTS().getCheckbox());
	}

	@When("^user Click The Proceed To The Checkout Button and It Naviagte To Payment Page$")
	public void user_Click_The_Proceed_To_The_Checkout_Button_and_It_Naviagte_To_Payment_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getPtc3());
	}

	@When("^user Click The Payment Bank Wire Button and It Naviagte To Order Summary Page$")
	public void user_Click_The_Payment_Bank_Wire_Button_and_It_Naviagte_To_Order_Summary_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getBwire());
	}

	@When("^user Click the I Confirm Button and It Navigate To Order Confirmation Page$")
	public void user_Click_the_I_Confirm_Button_and_It_Navigate_To_Order_Confirmation_Page() throws Throwable {
		clickOnElement(pam.getInstanceTS().getConfirm());
		JavaScroll("scrolldown");
		log.info("T-shirts Purchase Succesfully");
	}

	@Then("^user Click To The SignOut Button And It  Naviagte To Login Page$")
	public void user_Click_To_The_SignOut_Button_And_It_Naviagte_To_Login_Page() throws Throwable {
		waitImp(30, TimeUnit.SECONDS);
		clickOnElement(pam.getInstanceLT().getLogout());
		log.info("Loout Succesfully");
	}

}
