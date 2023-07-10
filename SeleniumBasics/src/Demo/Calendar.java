package Demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	private static final String List = null;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://Expedia.co.in");

		driver.findElement(By.id("date_form_feild-btn")).click();
		
		WebElement nextMonth = driver.findElement(By.xpath("//*[@id=\"app-layer-datepicker-check-in-out-start\"]/section/div[2]/div[2]/div/div[2]/table/thead/tr/th[1]"));
		List<WebElement>rows = nextMonth.findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++) {
			
			WebElement row=rows.get(1);
			List<WebElement>columns=row.findElements(By.tagName("button"));
			
			for(WebElement x:columns) {
				if(x.getAttribute("data-day").equals("9")) {
					x.click();
					break;
				}
			}
		
		}
		 
		
		
		 
	}

}
