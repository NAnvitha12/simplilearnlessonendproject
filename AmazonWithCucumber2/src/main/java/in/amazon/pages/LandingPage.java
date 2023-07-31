package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private Actions actions;
	WebDriverWait wait;
	// locator of webelement on landing page of amazon
	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;

	@FindBy(id = "nav-link-accountList")
	private WebElement signInMenu;
	@FindBy(linkText = "Sign in")
	private WebElement signInBtn;
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBox;

	@FindBy(xpath = "//div[contains(@class,'autocomplete-results-container')]")
	private WebElement automCompleteBox;
  @FindBy(xpath="(//i[contains(@class,'a-icon a-icon-star-medium a-star-medium')])[1]")
	private WebElement customerReview;

  

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}

	public void clickMobiles() {
		mobiles.click();
	}

	public void hoverOverHelloSignInMenu() {
		actions.moveToElement(signInMenu).build().perform();
	}

	public void clickSignInBtn() {
		signInBtn.click();
	}
	public void searchItem(String item) {
		searchBox.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(automCompleteBox));

		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	public void customerReview() throws InterruptedException {
		Thread.sleep(1000);
		customerReview.click();
	}
	
	
}
