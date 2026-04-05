package lumaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LumaPageHandling {

	public static void main(String[] args) throws Exception {

		WebDriver w = new ChromeDriver();
		w.get("https://luma.enablementadobe.com/content/luma/us/en.html");
		w.manage().window().maximize();
		Thread.sleep(10000);
		w.findElement(By.xpath("//*[@class=\"navbar navbar-inverse navbar-fixed-top hidden-xs hidden-sm\"]/div/ul[2]/li[2]/a")).click();
		Thread.sleep(10000);
		/*List<WebElement> ac = w.findElements(By.xpath("//*[@role=\"form\"]/div[2]/span/a[1]"));
		String s = "new account";
	for (WebElement s1 : ac) {
	 if (s1.getText().equals(s)) {
		 s1.click();
		 return;
		
	}
		
	}*/		
	
		w.findElement(By.linkText("new account")).click();
		
				
		Thread.sleep(1000);
		w.findElement(By.name("name=\"fname\"")).sendKeys("Priyanka");
		Thread.sleep(10000);
		w.findElement(By.name("lname")).sendKeys("Pawar");
		Thread.sleep(10000);
		w.findElement(By.name("email")).sendKeys("priyankapawar0322@gmail.com");
		w.findElement(By.name("password")).sendKeys("123456789");
		w.findElement(By.className("form-control.scf-js-confirm-password")).sendKeys("123456789");
		w.findElement(By.xpath("//*[@class=\"btn btn-default scf-login\"]")).click();
		
		w.findElement(By.linkText("here")).click();
		w.findElement(By.cssSelector("button[class=\"btn btn-default scf-login\"]")).click();
		
		
		WebElement menCategory = w.findElement(By.linkText("//*[@class=\"cmp-navigation__group\"]/li[2]"));
		Actions act = new Actions(w);
		act.moveToElement(menCategory).perform();
		w.findElement(By.xpath("//*[@class=\"cmp-navigation__group\"]/li[2]")).click();
		
		w.findElement(By.linkText("Jackets, Hoodies & Tees")).click();
		
		w.findElement(By.id("cq-image-jsp-/content/luma/us/en/products/men/tops/jackets/montana-wind-jacket/jcr:content/root/product/assets/asset")).click();
		
		w.findElement(By.xpath("//*[@class=\"we-Product-actions\"]/button")).click();
		w.findElement(By.className("\"btn btn-primary btn-action pull-right\"")).click();
		w.findElement(By.className("btn btn-primary btn-action cq-dd-linkTo btn-checkout")).click();
		
		w.findElement(By.id("\"form-text-260762246\"")).sendKeys("Priyanka");
		w.findElement(By.id("form-text-1038908588")).sendKeys("Pawar");
		w.findElement(By.id("form-text-1872431321")).sendKeys("Andheri");
		
		WebElement dropDown = w.findElement(By.id("form-options-417181665"));
		 
		Select dp = new Select(dropDown);
		dp.deselectByVisibleText("Australia");
		
		w.findElement(By.id("form-button-1573303396")).click();
		w.findElement(By.id("form-button-1244170883")).click();			
		
	}
}
