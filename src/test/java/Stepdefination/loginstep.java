package Stepdefination;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {

		@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
			System.out.println("user is on login page");

	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user enters the username and password");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user inside login button");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page");

	}

}
