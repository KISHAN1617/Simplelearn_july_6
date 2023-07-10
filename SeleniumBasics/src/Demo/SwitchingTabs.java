package Demo;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTabs {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Maximize it
		driver.manage().window().maximize();
		
		//3 navigate to application
		driver.get("https://www.facebook.com/");
		
		//4  Click on 'Instagram'
		driver.findElement(By.linkText("Instagram")).click();
		
		//5 Switch focus on  new Tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		//Wait for the nextpage to load completely
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		//6 Write 'abc@gmail.com' in the email textbox of instagram page
		driver.findElement(By.name( "username")).sendKeys( "abc@gmail.com");
		
	}

}
