package In.swiggy.teststeps;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder extends Driver  {
	@Given("a user is on the landing page of swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));

	}

	@When("I type my delivery location as Hyderabad and select the first option from the auto-complete box")
	public void i_type_my_delivery_location_as_hyderabad_and_select_the_first_option_from_the_auto_complete_box() {
	 homePage.loactionSearch("hyderabad");
	}

	@When("I click on the first restaurant shown under Top restaurant chains in Hyderabad")
	public void i_click_on_the_first_restaurant_shown_under_top_restaurant_chains_in_hyderabad() throws InterruptedException {
		selectResturant.selectResturantClick();
	}

	@When("I click on the Add button corresponding to the first listed dish")
	public void i_click_on_the_add_button_corresponding_to_the_first_listed_dish() throws InterruptedException {
		addToCart.addItem();
	}

	@When("I hover over the Cart in the top right corner")
	public void i_hover_over_the_cart_in_the_top_right_corner() {
		addToCart.hoverOverCart();
	}

	@When("I click on Check Out in the sub-menu")
	public void i_click_on_check_out_in_the_sub_menu() throws InterruptedException {
		addToCart.checkOut();
	}

	@Then("I verify that the text To place your order now, log in to your existing account or sign up.is visible on the next page")
	public void i_verify_that_the_text_to_place_your_order_now_log_in_to_your_existing_account_or_sign_up_is_visible_on_the_next_page() {
		
	}


}
