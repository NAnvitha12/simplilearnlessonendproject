package In.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectResturant {
	private Actions actions;

	@FindBy(xpath="(//div[contains(@class,'sc-bczRLJ gWiXXg')])[1]")
	private WebElement selectResturant;
	public SelectResturant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	public void selectResturantClick() throws InterruptedException {
		Thread.sleep(5000);
		selectResturant.click();
	}
}
