package In.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocart {
	private Actions actions;

	@FindBy(xpath = "(//div[contains(@class,'RPOp')])[1]")
	private WebElement addItem;

	@FindBy(xpath="(//a[contains(@class,'T-E')])[1]")
	private WebElement viewCart;

	@FindBy(xpath = "//div[contains(@class,'uP')]")
    private WebElement checkoutButton;
	@FindBy(xpath="//div[contains(@class,'axtv')]")
	 private WebElement verifyText;
	public AddTocart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void addItem() throws InterruptedException {
		Thread.sleep(3000);
		addItem.click();
	}
	public void hoverOverCart() {
		actions.moveToElement(viewCart).build().perform();
	}
	public void checkOut() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("me");
		checkoutButton.click();
	}

	public String getText() {
		String text = verifyText.getText();
		return text;
	}
}
