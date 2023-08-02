package In.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private Actions actions;
	WebDriverWait wait;
	@FindBy(id = "location")
	private WebElement locationSearch;

	@FindBy(xpath = "//div[contains(@class,'LDb')]")
	private WebElement automCompleteBox;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}

	public void loactionSearch(String item) {
		locationSearch.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(automCompleteBox));

		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
