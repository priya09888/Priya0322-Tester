package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCart {

	public static void main(String[] args) {

WebDriver w = new ChromeDriver();
		
		FlipkartSearchPOMWithoutPageFactory repo = new FlipkartSearchPOMWithoutPageFactory(w);
		w.get("https://www.flipkart.com/");
		
		repo.SearchByEnter("Mobile");
		repo.SelectFirstProductOnly();
		repo.SwitchToEmbededWindow();
		repo.AddToCart();
		
	}

}
