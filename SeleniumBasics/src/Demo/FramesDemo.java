package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static void main(String[] args) {
		// 1.open the browser
		ChromeDriver driver=new ChromeDriver();
		
		
		 //2.maximize it
		driver.manage().window().maximize();
		
		
		 //3.Navigate to application
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//Go inside the frame that contains 'DEPRICATED' hyperlink
		driver.switchTo().frame("classFrame");
		
		
		 //4.click on DEPRECATED
		driver.findElement(By.linkText("DEPRECATED")).click();
	}

}
