package pack3;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepnewfile {
	@Given("Enter your userrname")
	public void enter_your_userrname() {
	   System.out.println("user in login screen");
	}

	@When("Enter your password")
	public void enter_your_password(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
	   for(int i=0;i<list.size();i++){
		   System.out.println(list.get(i).get("name"));
		   System.out.println(list.get(i).get("value"));
	   }
	}

	@Then("home paged displayed")
	public void home_paged_displayed() {
		 System.out.println("logged to home page");
	}

	
}
