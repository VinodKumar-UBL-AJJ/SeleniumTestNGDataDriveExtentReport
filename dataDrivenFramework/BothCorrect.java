package dataDrivenFramework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BothCorrect {


	String[][] data={
			{"Admin","admin123"},
			{"ffsfsf","admin123"},
			{"Admin","sfffsfsf"},
			{"adfgfgmin","admffgfin"}
	};




	@DataProvider(name="logindata")
	public String[][] loginTestData() {

		return data;


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
