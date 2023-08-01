package in.swiggy.teststeps;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodSteps extends Driver{
	
	@Given("a user is in the LandingPage on swiggy")
	public void a_user_is_in_the_landing_page_on_swiggy() {
	    assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}

	@When("he type delivery location in the search box and then select 1st option from the drop-down")
	public void he_type_delivery_location_in_the_search_box_and_then_select_1st_option_from_the_drop_down() {
		landingpage.locationSearch("Hydrabad");
	}

	@When("Click on the first restaurant shown under Top restaurant chains in location")
	public void click_on_the_first_restaurant_shown_under_top_restaurant_chains_in_location() {
		restaurant.selectFirstRest();
	}

	@When("Click on Add button corresponding to first listed dish")
	public void click_on_add_button_corresponding_to_first_listed_dish() {
		 food.AddFood();
	}

	@When("Hover over Cart in the top right corner")
	public void hover_over_cart_in_the_top_right_corner() {
		food.Cart();
	}

	@When("Click on Check Out in the sub-menu")
	public void click_on_check_out_in_the_sub_menu() {
		food.CheckOut();
	}

	@Then("Verify the text visible on the next page")
	public void verify_the_text_visible_on_the_next_page() {
		 assertTrue(signin.SigninPage().equals("To place your order now, log in to your existing account or sign up."));
	    
	}


}
