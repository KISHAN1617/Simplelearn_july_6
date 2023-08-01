package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Restaurant {
	
	private WebDriverWait wait;

	@FindBy(xpath = " //*[@id=\"root\"]/div[1]/div[1]/div/div/main/div[3]/div/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement firstrest;
	
	public Restaurant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void selectFirstRest() {
		wait.until(ExpectedConditions.visibilityOfAllElements(firstrest));
		firstrest.click();
	}

}
