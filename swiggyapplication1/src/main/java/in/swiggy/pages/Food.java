package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Food {
	
	private Actions actions;
	private WebDriverWait wait;

	@FindBy(xpath = "(//div[contains(@class,'_1RPOp')])[1]")
	private WebElement addfood;
	
	@FindBy(xpath = "(//li[contains(@class,'_1fo6c')])[1]")
	private WebElement cart;
	
	@FindBy(xpath = "//div[contains(@class,'_55uP6')]")
	private WebElement checkout;
	
	public Food(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void AddFood() {
		wait.until(ExpectedConditions.visibilityOf(addfood));
		addfood.click();
	}
	
	public void Cart() {
		actions.moveToElement(cart).build().perform();
	}
	
	public void CheckOut(){
		wait.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
	}

}
