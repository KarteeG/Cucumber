package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configure_Reader {

	public static Properties p;

	public Configure_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\u\\eclipse-workspace\\Revised_Maven\\src\\main\\java\\com\\prperties\\Configure.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getInstanceAutomationUrl() {
		String auurl = p.getProperty("automationurl");
		return auurl;
	}

	public String getInstanceAdactinURL() {
		String aduser = p.getProperty("adactinurl");
		return aduser;
	}
	
	public String getInstanceAuUser() {
		String auuser = p.getProperty("auuser");
		return auuser;
	}
	public String getInstanceAcPass() {
		String aupass = p.getProperty("aupass");
		return aupass;

	}
	public String getInstanceAdUser() {
		String aduser = p.getProperty("aduser");
		return aduser;
	}
	public String getInstanceAdPass() {
		String adpass = p.getProperty("adpass");
		return adpass;
	}
	public String getInstanceloaction() {
		String location = p.getProperty("location");
		return location;
	}
	public String getInstanceHotels() {
		String hotels = p.getProperty("hotels");
		return hotels;
	}
	public String getInstanceRoomType() {
		String rtype = p.getProperty("roomType");
		return rtype;
	}
	public String getInstanceNoOfRooms() {
		String nor = p.getProperty("noOfRooms");
		return nor;
	}
	public String getInstanceCID() {
		String cid = p.getProperty("cid");
		return cid;
	}
	public String getInstanceCOD() {
		String cod = p.getProperty("cod");
		return cod;
	}
	public String getInstanceAPR() {
		String apr = p.getProperty("apr");
		return apr;
	}
	public String getInstanceCPR() {
		String cpr = p.getProperty("cpr");
		return cpr;
	}	
	public String getInstanceFName() {
		String fname = p.getProperty("firstName");
		return fname;
	}
	public String getInstanceLName() {
		String lname = p.getProperty("lastName");
		return lname;
	}
	public String getInstanceBilling() {
		String billing = p.getProperty("Billing");
		return billing;
	}
	public String getInstanceCCNo() {
		String ccno = p.getProperty("CCNo");
		return ccno;
	}
	public String getInstanceCCType() {
		String cctype = p.getProperty("CCType");
		return cctype;
	}
	public String getInstamceEcpMonth() {
		String emonth = p.getProperty("ExpMonth");
		return emonth;
	}
	public String getInstanceExpYear() {
		String eyear = p.getProperty("ExpYear");
		return eyear;
	}
	public String getInstanceCVV() {
		String cvv = p.getProperty("ExpYear");
		return cvv;
	}

}
