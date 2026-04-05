package com.HybridDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoOfHotstar {
	
	public RepoOfHotstar(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	@FindBy(xpath= "//*[@class=\"_3O2khXNePOp8a3Gd1EocHu absolute h-full flex items-center ELEVATION_5\"]/nav/div[2]/a/button")
	private WebElement searchicon;
	
	@FindBy(id= "searchBar")
	private WebElement searchTextBar;
	
	@FindBy(xpath= "//*[@class=\"_3O2khXNePOp8a3Gd1EocHu absolute h-full flex items-center ELEVATION_5\"]/nav/div[8]/a/button")
	private WebElement crossIconInsearchTextBar;
	
    @FindBy(xpath= "")
    private WebElement myspaceIcon;
    
    @FindBy()
    private WebElement loginbtn;
    
    @FindBy()
    private WebElement mobileNumberField;
    
    @FindBy()
    private WebElement getOTP;
    
    public void searchIcon() {
    	searchicon.click();
    }
    public void searchTextBox() {
    	searchTextBox
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
