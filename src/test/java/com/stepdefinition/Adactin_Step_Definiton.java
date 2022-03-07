package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helper.File_Reader;
import com.pageobjectmanager.Adactin_Manager;
import com.testrunner.Adactin_Test_Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_Step_Definiton extends Base_Class {

	public static WebDriver driver = Adactin_Test_Runner.driver;
	Adactin_Manager am = new Adactin_Manager(driver);
	public static Logger log = Logger.getLogger(Adactin_Step_Definiton.class);
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Status: "+ name);
	}
	@After
	public void AfterHooks(Scenario s) throws IOException {
		if (s.isFailed()) {
			screenShot("adctin.png");
		}
		String status = s.getStatus();
		System.out.println("Status: "+status);
	}
	
	@Given("^user Launch The Appilication$")
	public void user_Launch_The_Appilication() throws Throwable {

		String url = File_Reader.getInstanceFR().getInstanceCR().getInstanceAdactinURL();
		getUrl(url);
		maximize();
		waitImp(5000, TimeUnit.SECONDS);
		log.info("Brower Launched");
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		inputValues(am.getinstancemp().getUser(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputValues(am.getinstancemp().getPass(), password);
	}

	@Then("^user Click On The Login Button And It Navigate to The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_to_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(am.getinstancemp().getLogin());
		BasicConfigurator.configure();
		log.info("Login Succesfully");
	}

	@When("^user Select The \"([^\"]*)\"$")
	public void user_Select_The(String location) throws Throwable {
		dropDown("Visible", am.getinstanceshp().getLocation(), location);
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		dropDown("Visible", am.getinstanceshp().getHotel(), "Hotel Creek");
	}

	@Given("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		dropDown("Visible", am.getinstanceshp().getRoom(), "Super Deluxe");
	}

	@Given("^user Select The No Of Rooms$")
	public void user_Select_The_No_Of_Rooms() throws Throwable {
		dropDown("visible", am.getinstanceshp().getRoomnos(), "5 - Five");
	}

	@Given("^user Enter The Check in Date$")
	public void user_Enter_The_Check_in_Date() throws Throwable {
		inputValues(am.getinstanceshp().getCid(), "02/01/2022");
	}

	@Given("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		inputValues(am.getinstanceshp().getCod(), "03/01/2022");
	}

	@Given("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		dropDown("Visible", am.getinstanceshp().getAr(), "4 - Four");
	}

	@Given("^user Select The Childs Per Room$")
	public void user_Select_The_Childs_Per_Room() throws Throwable {
		dropDown("visible", am.getinstanceshp().getCr(), "4 - Four");
	}

	@Then("^user Click The Search Button And It Navigate To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(am.getinstanceshp().getSubmit());
		log.info("Search Hotel Succesfully");
	}

	@When("^clck The Select Button$")
	public void clck_The_Select_Button() throws Throwable {
		clickOnElement(am.getInstancesp().getBtn());
	}

	@Then("^user Click The Continue Button And it Navigate To The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_it_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(am.getInstancesp().getCoc());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		inputValues(am.getInstancebh().getFname(), "Karthick");
	}

	@Given("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		inputValues(am.getInstancebh().getLname(), "N.G.");
	}

	@Given("^user Enter The Billing Address In Biling Address Field$")
	public void user_Enter_The_Billing_Address_In_Biling_Address_Field() throws Throwable {
		inputValues(am.getInstancebh().getAdd(), "DGL");
	}

	@Given("^user Enter The Credit Card Number In Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
		inputValues(am.getInstancebh().getCc(), "5121842154121854");
	}

	@Given("^user Select The Card Type$")
	public void user_Select_The_Card_Type() throws Throwable {
		dropDown("visible", am.getInstancebh().getCctype(), "VISA");
	}

	@Given("^user Select The Expiry Month$")
	public void user_Select_The_Expiry_Month() throws Throwable {
		dropDown("visible", am.getInstancebh().getMonth(), "December");
	}

	@Given("^user Select The Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
		dropDown("Visible", am.getInstancebh().getYear(), "2022");
	}

	@When("^user Enter CVV Number In The CVV \"([^\"]*)\"$")
	public void user_Enter_CVV_Number_In_The_CVV(String cvv) throws Throwable {
		inputValues(am.getInstancebh().getCvv(), cvv);
	}

	@Then("^user click The Book Now Button And it Naviagate To The Booking Confirmation Page$")
	public void user_click_The_Book_Now_Button_And_it_Naviagate_To_The_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(am.getInstancebh().getBook());
		log.info("Booked Succsfully");
	}

	@Then("^user Click On The My ltinerary Button And It Navigate To the Booking Itinaray Page$")
	public void user_Click_On_The_My_ltinerary_Button_And_It_Navigate_To_the_Booking_Itinaray_Page() throws Throwable {
		sleep(5000);
		checkBox(am.getinstancebc().getMylit());
		sleep(5000);
	}

	@When("^tags Method Checking Purpose$")
	public void tags_Method_Checking_Purpose() throws Throwable {
		sleep(5000);
		driver.manage().window().fullscreen();
	}

	@Then("^user Click On The Logout Button and It Naviagate To The Logout Page$")
	public void user_Click_On_The_Logout_Button_and_It_Naviagate_To_The_Logout_Page() throws Throwable {
		sleep(5000);
		clickOnElement(am.getinstancebc().getLogout());
		sleep(5000);
		log.info("Logout Succesfully");
	}

}
