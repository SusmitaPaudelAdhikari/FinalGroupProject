package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FrontierFlightSelectionPageUsingPageFactory {
	static WebDriver driver;
	static String URL;
	FlyFrontierFlightSelectPageObject flyFrontierFlightSelectPageObject;
	
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		URL="https://booking.flyfrontier.com/Flight/Select";
		flyFrontierFlightSelectPageObject=new FlyFrontierFlightSelectPageObject(driver);
	}

	public void frontierFlightSelection() {
		driver.get(URL);
		flyFrontierFlightSelectPageObject.verifyPageHeading();
		flyFrontierFlightSelectPageObject.verifyPageText1();
		flyFrontierFlightSelectPageObject.departFlightSelection();
		flyFrontierFlightSelectPageObject.verifyPageText2();
		flyFrontierFlightSelectPageObject.returnFlightSelection();
		flyFrontierFlightSelectPageObject.ContinueBtn();
	}
	
}
