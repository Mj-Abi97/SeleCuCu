package Cucumberdemo.Tutorials;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepfile {


	@Given("User entered the {string}")
	public void user_entered_the(String string) {
		System.out.println(string);
	}

	@When("user entered the {string}")
	public void user_enter_the(String string) {
		System.out.println(string); 
	}

	@Then("Page is Displayed")
	public void page_is_Displayed() {
		System.out.println("page is displayed");
	   
	}
@Given("user enter the user name") 
public void user_enter_the_user_name() {
  System.out.println("username");
}

@When("enter the password")
public void enter_the_password() {
	System.out.println("password");
	
}

@When("click button")
public void click_button() {
	System.out.println("click");
	
}

@Then("home page")
public void home_page() {
	System.out.println("home page");
	
	
}
@When("clicks the logout")
public void clicks_the_logout() {
	System.out.println("logout");
	}

@Then("Logouts from the homepage")
public void logouts_from_the_homepage() {
	System.out.println("Redirects to FirstPage");
}

}
