package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyntraWithoutPOM {

	private WebDriver w;
	public MyntraWithoutPOM(WebDriver wd) {
		w = wd;
		
	}
	private By search = By.cssSelector("input[placeholder=\"Search for products, brands and more\"]");
	private By product = By.cssSelector("h4[class=\"product-product\"]");
	private By addToBag = By.cssSelector("div.pdp-add-to-bag.pdp-button.pdp-flex.pdp-center");
	

public void Search(String search) {   
	w.findElement(this.search).sendKeys(search, Keys.ENTER);
}
public void Product() {
	w.findElement(product).click();
}
public void AddToBag() {
	w.findElement(addToBag).click();
}
}