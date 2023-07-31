package in.amazon.teststeps;

import java.util.ArrayList;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchItem extends Driver {
	@When("I type physics books in the search box and select the third option from the drop-down")
	public void i_type_physics_books_in_the_search_box_and_select_the_third_option_from_the_drop_down() {
		landingPage.searchItem("physics books");
	}

	@When("I select rating fourstar and above from the left side bar")
	public void i_select_rating_fourstar_and_above_from_the_left_side_bar() throws InterruptedException {
		landingPage.customerReview();
	}

	@When("I click on the first search result")
	public void i_click_on_the_first_search_result() throws InterruptedException {
		
		applePhones.clickFirstBook();
	}
	@When("I switches focus on the new tab")
	public void i_switches_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@When("I click Add to Cart button")
	public void i_click_add_to_cart_button() {
		applePhones.addToCart();
	}

	@When("I click on Proceed to Buy button")
	public void i_click_on_proceed_to_buy_button() {
		applePhones.proceedToBuy();
	}

	@Then("I should be on the Sign in page.")
	public void i_should_be_on_the_sign_in_page() {
		String expectedText = "Sign in";
		String actualText = signIn.getSignInText();
		Assert.assertEquals(actualText, expectedText);
	}
}
