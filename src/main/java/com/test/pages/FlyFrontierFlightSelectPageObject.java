package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlyFrontierFlightSelectPageObject {
	WebDriver driver;
 @FindBy(xpath="//*[@id=\"flight-section-container\"]/div[1]/div/div[1]/div[2]/h1") 
	WebElement pageHeading;
 @FindBy(xpath="//*[@id=\"ibe-depart-section\"]/div/div[6]/div[1]/div/div[1]/h1")
   WebElement departingFlights;
@FindBy(xpath="//*[@id=\"ibe-depart-section\"]/div/div[6]/div[2]/div[1]/div[3]/div[1]/div/div[2]/div[1]/label/span[2]")
  WebElement selectedDepartFlight;
@FindBy(xpath="//*[@id=\"ibe-return-section\"]/div[1]/div[6]/div[1]/div/div[1]/h1")
 WebElement returnFlights;
@FindBy(xpath="//*[@id=\"ibe-return-section\"]/div[1]/div[6]/div[2]/div[1]/div[3]/div[1]/div/div[2]/div[1]/label/span[2]")
 WebElement selectedReturnFlight;
@FindBy(id="submit_flight_search_button")
 WebElement continueBtn;


public FlyFrontierFlightSelectPageObject(WebDriver driver) {
	this.driver=driver;;

PageFactory.initElements(driver,this);
}


public String verifyPageHeading() {
	return pageHeading.getText();
}
public String verifyPageText1 () {
	return departingFlights.getText();
}
public void departFlightSelection() {
	selectedDepartFlight.click();
}
public String verifyPageText2() {
	return returnFlights.getText();
}
public void returnFlightSelection() {
	selectedReturnFlight.click();
}
public void ContinueBtn() {
	continueBtn.click();
}
}
