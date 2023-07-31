package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import utils.Tools;

public class Driver extends Tools {
	protected static LandingPage landingPage;
	protected static AllMobileBrands allMobileBrands;
	protected static ApplePhones applePhones;

	protected static BuyPhone buyPhone;

	protected static SignIn signIn;

	public static void init() {
		// open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		landingPage = new LandingPage(driver);
		allMobileBrands = new AllMobileBrands(driver);
		applePhones = new ApplePhones(driver);
		buyPhone = new BuyPhone(driver);
		signIn = new SignIn(driver);

	}
}
