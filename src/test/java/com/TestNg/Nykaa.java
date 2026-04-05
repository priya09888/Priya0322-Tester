package com.TestNg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Nykaa {
	
//	WebDriver w;
	RemoteWebDriver w;
	@Parameters("bs")
	@BeforeMethod
	public void launchAnBrowser(String browser) throws Exception {
		
		if (browser.equals("chrome")) {
			w = new ChromeDriver();
		} else if (browser.equals("firefox")){
			w = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			w = new EdgeDriver();
		}
	
		w.get("https://www.nykaa.com/");
	}
	@Test
	public void search() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.name("search-suggestions-nykaa")).sendKeys("shoes",Keys.ENTER);
		Thread.sleep(2000);
		Assert.assertEquals(w.getCurrentUrl(), "https://www.nykaa.com/search/result/?q=shoes&root=search&searchType=Manual&sourcepage=home");	
	}
	
	@Test
	public void category() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[9]/a")).click();
		String main = w.getWindowHandle();
		Set<String> multi = w.getWindowHandles();
		for (String m : multi) {
			if(!m.equals(main)) {
				w.switchTo().window(m);
			}
		}
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(w.getTitle(), "Men's Store");
		w.close();
		
		w.switchTo().window(main);
		soft.assertAll();	
	}
	
	@Test
	public void bag() throws Exception {
		
		w.findElement(By.id("header-bag-icon")).click();
		Thread.sleep(2000);
		Assert.assertEquals(w.findElement(By.cssSelector("span[data-test-id=\"header-title\"]")).getText(), "Bag");
		
		}
	@AfterMethod
	public void closeBrowser() {
		w.quit();
	
	}

}
