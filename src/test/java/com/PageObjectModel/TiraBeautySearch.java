package com.PageObjectModel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiraBeautySearch {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.tirabeauty.com/");
		
		TirabeautyPOMWithPageFactory repo = new TirabeautyPOMWithPageFactory(w);
		
		repo.search("lipstick");
	Thread.sleep(2000);
		repo.product("Lakme Forever Matte Liquid Lip 16hr Lipstick Lightweight & Transferproof - Nude Dream (5.6 ml)");
		
		String main = w.getWindowHandle();
		Set<String> mainAndChild = w.getWindowHandles();
		for (String mac : mainAndChild) {
			if(!mac.equals(main)) {
				w.switchTo().window(mac);
			}
			
		}
		Thread.sleep(2000);
		repo.addToBag();
	}

}
