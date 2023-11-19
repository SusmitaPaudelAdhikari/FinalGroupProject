package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlyFrontierFlightBookingpageObject {

	WebDriver driver;
@FindBy(xpath="//*[@id=\"findFlights\"]/div[2]/div/div[1]") WebElement pageText;
 @FindBy(xpath="//*[@id=findFlights]/div[2]/div/div[2]/fieldset/label[1]/span")
		 WebElement roundTrip;
@FindBy(name="origin") WebElement From;
@FindBy(name="destination") WebElement To;
@FindBy(id="departureDateContainer") WebElement DepartDate;
@FindBy(id="returnDateContainer") WebElement ReturnDate;
@FindBy(id="passengersInput") WebElement Travellers;

@FindBy(xpath="//*[@id=\"findFlights\"]/div[6]/div[1]/div[2]/fieldset/label[1]/span")
WebElement searchBy;
@FindBy(xpath="//*[@id=\"btnSearch\"]/img")WebElement searchBtn;


public FlyFrontierFlightBookingpageObject(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
}

public String verifyPageTitle() {
	return pageText.getText();
	
	
}
public void selectTrip() {
	roundTrip.click();
			
	
}
public void origion () {
	From.click();
	Select select= new Select(From);
	select.selectByVisibleText("Dallas/Ft. Worth (DFW)");
	
}
	public void destination() {
	To.click();
	Select select=new Select(To);
	select.selectByVisibleText("Maryland (BWI)");
	
}
public void departDate(String enterDepartDate) {
	DepartDate.sendKeys("enterDepartureDate");
	
}
public void returnDate(String enterReurnDate) {
	ReturnDate.sendKeys("enterReturnDate");
}

public void numberOfTravellers() {
	Travellers.click();
	Select select=new Select(Travellers);
	select.selectByIndex(0);
}
 public void selectingSearchBy() {
	 searchBy.click();
}
 public void clickSearchBtn() {
	 searchBtn.click();
	 
 }
}

