package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserProfiling {
	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable -notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com");
	}

}
