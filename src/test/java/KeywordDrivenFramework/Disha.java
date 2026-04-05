package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disha {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/Disha.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for (int i = 1; i<=4; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell testStep = row.getCell(3);

			String[] testSteps = testStep.toString().split("[0-9]");

			WebDriver w = null;
			RepoOfDisha r = null;

			for (String ts : testSteps) {
				
				System.out.println(ts);
				


				if ("Launch chrome browser".equalsIgnoreCase(ts.trim())) {
					
					w = new ChromeDriver();
					r = new RepoOfDisha(w);

				}else if("navigate to url".equalsIgnoreCase(ts.trim())) {
					w.get("http://103.251.94.38:8080/MIDMS/Home.jsp");
				}
				else if("Enter username".equalsIgnoreCase(ts.trim())) {
					r.username();
					
				}
				else if("Enter password".equalsIgnoreCase(ts.trim())) {
					r.password();
					Thread.sleep(1000);
				}
				else if("Enter captcha".equalsIgnoreCase(ts.trim())) {

					Thread.sleep(10000);
				}
				else if ("Click on keep me sign in checkbox".equalsIgnoreCase(ts.trim())) {
					r.keepMeSignIn();	
					Thread.sleep(1000);
				}
				else if ("Click on login button".equalsIgnoreCase(ts.trim())) {
					r.login();
					Thread.sleep(1000);
				}
				else if ("Click on menu".equalsIgnoreCase(ts.trim())) {
					r.menu();
					Thread.sleep(1000);
				}
				else if ("Click on Registration".equalsIgnoreCase(ts.trim())) {
					r.registration();
					Thread.sleep(1000);
				}
				else if ("Click on Prefix".equalsIgnoreCase(ts.trim())) {
					r.prefix();
					Thread.sleep(1000);
				}
				else if ("Enter on FirstName".equalsIgnoreCase(ts.trim())) {
					r.firstName();
					Thread.sleep(1000);
				}
				else if ("Enter on LastName".equalsIgnoreCase(ts.trim())) {
					r.lastName();
					Thread.sleep(1000);
				}
				else if ("Click B TO C".equalsIgnoreCase(ts.trim())) {
					r.BTOC();
					Thread.sleep(1000);
				}
				else if ("Click browser".equalsIgnoreCase(ts.trim())) {
					Thread.sleep(1000);
					w.quit();
				}
			}
		}
	}
}