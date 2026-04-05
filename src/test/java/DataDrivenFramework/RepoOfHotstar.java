package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoOfHotstar {

	WebDriver w;
	public RepoOfHotstar(WebDriver w) {
		PageFactory.initElements(w, this);
		this.w = w;
	}
	@FindBy(xpath="//*[@class=\"_3O2khXNePOp8a3Gd1EocHu absolute h-full flex items-center ELEVATION_5\"]/nav/div[2]/a/button")
	private WebElement searchicon;
	@FindBy(id="searchBar")
	private WebElement searchTextBox;
	@FindBy(xpath="//*[@data-testid=\"input-clear-option\"]/i")
	private WebElement crossIconInSearchTextBox;
	@FindBy(xpath= )
	
	
	
	
	
	}

