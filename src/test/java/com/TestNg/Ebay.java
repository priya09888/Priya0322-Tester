package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebay {
	
	//WebDriver w;
	
ThreadLocal<RemoteWebDriver> w;
DesiredCapabilities dc;
	
	 @BeforeMethod
	 public void launchAndNavigateToEbaySite() throws Exception {
		// w = new ChromeDriver();
		 
		dc = new DesiredCapabilities();
		 dc.setPlatform(Platform.WINDOWS);
		 dc.setBrowserName("chrome");
		 w= new ThreadLocal<>();
		 w.set(new RemoteWebDriver(dc));
		 Thread.sleep(2000);
		 w.get().get("https://www.ebay.com/");
	 }
	 @Test(dataProviderClass = DataForTesting.class,dataProvider = "ebay Athiras wishlist")
	 public void searchAnProduct(String search, String expectedTitle) throws Exception {
		 Thread.sleep(2000);
		 w.get().findElement(By.id("gh-ac")).sendKeys(search, Keys.ENTER);
	 }
	 @AfterMethod
	 public void closeAnBrowser() throws Exception {
		 Thread.sleep(2000);
		 w.get().quit();
	 }
	
	
	
	
	
	
	

}
