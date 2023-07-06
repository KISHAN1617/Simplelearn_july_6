package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();                           // open the browser
		driver.get("https://facebook.com");                                // Navigate the application
		
		driver.findElement(By.id("email")).sendKeys("root5577@gmail.com"); // Enter the invalid user name "root55772gmail.com" or phone number in the text box
		driver.findElement(By.id("pass")).sendKeys("root123");             // enter the invalid password "root123" in the text box
		driver.findElement(By.name("login")).click();                      // Click login button
		
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		String actualErrMsg = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
		 
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		 
		driver.quit();                                                       //Close the browser
		 
	}

}
