package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	@Test
	public void flipkart() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(w.getTitle(), "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com");
	
	
	w.quit();
	soft.assertAll();
	
	
	}

}
