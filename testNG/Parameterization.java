package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	ChromeDriver driver;
	
	@BeforeSuite
	public void openWebsite() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();		
	}
	
	@Test
	@Parameters({"username", "password"})
	public void loginFunction(String uname, String pword) {
		
	driver.findElementById("txtUsername").sendKeys(uname);
	driver.findElementById("txtPassword").sendKeys(pword);
	driver.findElementById("btnLogin").click();
	
	}
	
	
	  @AfterSuite 
	  public void closeBrowser() { 
		  driver.quit(); 
		  }
	 

}
