package In.swiggy.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import In.swiggy.pages.AddTocart;
import In.swiggy.pages.HomePage;
import In.swiggy.pages.SelectResturant;
import utils.Tools;

public class Driver extends Tools {
	protected static HomePage homePage;
	protected static SelectResturant selectResturant;
	protected static AddTocart addToCart;
	public static void init() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		homePage = new HomePage(driver);
		selectResturant=new SelectResturant(driver);
		addToCart=new AddTocart(driver);
}
}
