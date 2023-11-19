package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FrontierFlightBookPageUsingPageFactory {
	static WebDriver driver;
	static String URL;
	FlyFrontierFlightBookingpageObject flyFrontierflightBookingPageObject;
	
	@BeforeSuite
	public void beforeTest() {
		    driver = new ChromeDriver();	
		    URL = "https://www.flyfrontier.com/";  
	flyFrontierflightBookingPageObject=new FlyFrontierFlightBookingpageObject(driver);
	}
	@Test
	public void frontierFlightBooking() {
		driver.get(URL);
		flyFrontierflightBookingPageObject.verifyPageTitle();
		flyFrontierflightBookingPageObject.selectTrip();
		flyFrontierflightBookingPageObject.origion();
		flyFrontierflightBookingPageObject.destination();
		flyFrontierflightBookingPageObject.departDate("11/22/23");
		flyFrontierflightBookingPageObject.returnDate("12/9/23");
		flyFrontierflightBookingPageObject.numberOfTravellers();
		flyFrontierflightBookingPageObject.selectingSearchBy();
		flyFrontierflightBookingPageObject.clickSearchBtn();
	}
}
