import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectModel.MyntraWithoutPOM;

public class MyntraSearch {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		MyntraWithoutPOM repo = new MyntraWithoutPOM(w);
		w.get("https://www.myntra.com/");
		Thread.sleep(2000);
		repo.Search("mobile");
		Thread.sleep(2000);
		repo.Product();
		
		String main = w.getWindowHandle();
		Set<String> mainAndChild = w.getWindowHandles();
		for (String mac : mainAndChild) {
			if(!mac.equals(main)) {
				w.switchTo().window(mac);
			}
			
		}
		
		Thread.sleep(2000);
		repo.AddToBag();

	}

}
