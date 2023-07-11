 package Demo;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException {
		// 1.open the browser
		ChromeDriver driver=new ChromeDriver();
		
		
		 //2.maximize it
		driver.manage().window().maximize();
		
		
		 //3.Navigate to application
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Mobiles")).click();

		
		WebElement mobiles =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mobiles).build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mobiles & Accessories")));
		
		
		driver.findElement(By.linkText("Apple")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div[2]/div[1]/h2")).click();
		
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		driver.findElement(By.id("buy-now-button")).click();
		
		WebElement signInElement=driver.findElement(By.id("ap_email"));
		if(signInElement.isDisplayed())
		{
			System.out.println("user not signed");
		}
		else
		{
			System.out.println("user is signed");
		}
		driver.quit();

		
	 
	}

}