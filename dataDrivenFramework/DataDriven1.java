package dataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven1 {
	
	
	@DataProvider(name="logindata")
	public String[][] loginTestData() throws IOException {
				return DataDrivenPOI.readExcel();

	}



	@Test(dataProvider="logindata")
	public void LoginBothCorrect(String uname, String pword) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElementById("txtUsername").sendKeys(uname);
		driver.findElementById("txtPassword").sendKeys(pword);
		driver.findElementById("btnLogin").click();


	}

}
