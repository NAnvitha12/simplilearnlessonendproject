package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhones {
	@FindBy(xpath = "(//div[contains(@class,'s-card-container')])[2]")
	private WebElement secondMobile;

	public ApplePhones(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Relativity: The Special And The General Theory")
	private WebElement clickonFirstBook;
	
	@FindBy(id="add-to-cart-button")
		private WebElement addToCart;
	@FindBy(xpath="//input[contains(@name,'proceedToRetailCheckout')]")
	private WebElement proceedToBuy;
	public void clickSecondMobile() throws InterruptedException {
		Thread.sleep(500);
		secondMobile.click();
	}
	public void clickFirstBook() throws InterruptedException {
		Thread.sleep(1000);
		clickonFirstBook.click();
	}
	public void addToCart() {
		addToCart.click();
	}
	public void proceedToBuy() {
		proceedToBuy.click();
	}
}