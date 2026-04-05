package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoodMandu {

	public static void main(String[] args) {

		WebDriver w = new ChromeDriver();
		w.get("https://foodmandu.com/");
		
		FoodManduPOMWithPageFactory repo = new FoodManduPOMWithPageFactory(w);
		repo.login();
		
		repo.email("xyz@gmail.com");
		repo.sendPassword("1234567890");
		repo.loginbtn();
	}

}
