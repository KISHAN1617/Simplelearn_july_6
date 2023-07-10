package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTableDemo {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/table");
		
		WebElement firstTable =driver.findElement(By.id("shopping"));
		
		List<WebElement>rows=firstTable.findElements(By.tagName("tr"));
		
		int sum=0;
		for(int i=1;i<rows.size();i++) {
			
			WebElement row=rows.get(1);
			List<WebElement>columns=row.findElements(By.tagName("td"));
			
			int Price=Integer.parseInt(columns.get(1).getText());
			sum=sum+Price;	
	  }
		int expectedSum=858;
		if(expectedSum==sum) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case Failed");
			
			
		}
}}
