package Demo2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplictWaitDemo {
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {           // open the browser
		driver=new ChromeDriver();              //class object = new class
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");     // navigate the application    //object.method()
	}
	@Test
	public void titleVerification() {
		driver.findElement(By.id("start")).click();
		
		String expectedText="Hello World!";
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		
		String actualText=driver.findElement(By.cssSelector("#finish > h4")).getText();
		Assert.assertEquals(actualText,expectedText);

	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();

}}
