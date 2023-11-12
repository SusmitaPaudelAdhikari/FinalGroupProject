package com.test.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePage {
	static WebDriver driver;
		static String URL;
		
		@BeforeSuite
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		URL= ("https://www.flyfrontier.com/");
		
		}
		@Test
	public void NavigatingToTravelBtn() throws InterruptedException {
			driver.get(URL);
			WebElement linkText=driver.findElement(By.partialLinkText("Travel"));
			Actions act=new Actions(driver);
			act.moveToElement(linkText).perform();
			WebElement flightBtn=driver.findElement(By.partialLinkText("traver/book/flight"));
			flightBtn.click();
			Thread.sleep(5000);
		
		}
		
		
}

