package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		
		
		 //2.maximize it
		driver.manage().window().maximize();
		
		
		 //3.Navigate to application
		driver.get("https://www.remove.bg/");
		
		//4.Click select files to upload button
		driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/div[1]/div/div/div/div[2]/div[2]/button")).click();
		
		Thread.sleep(3000);
		
		
		 //5.Handover the control to AutoIT to select file from the local machine ,click on the open button 
		Runtime.getRuntime().exec("Resources//Fileupload.exe");
		
		
	}

}
