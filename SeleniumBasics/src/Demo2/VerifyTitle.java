package Demo2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 

public class VerifyTitle {
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {           // open the browser
		driver=new ChromeDriver();              //class object = new class
		driver.get("https://facebook.com");     // navigate the application    //object.method()
	}
	
	@Test
	public void titleVerification() {
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		
		 Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	

}
