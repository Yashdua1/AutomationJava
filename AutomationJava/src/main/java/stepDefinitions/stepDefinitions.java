package stepDefinitions;

import io.cucumber.java.en.*;

public class stepDefinitions {
	
	@Given("^User navigates to the URL$")
	public void userNavigatesToURL()
	{
		System.out.println("User navigates the URL");
		
	}
	
	@And("^User inputs text \"(.*?)\" in searchbox$")
	public void userInputsText(String strkeyword)
	{
		System.out.println("user inputs the text " + strkeyword);
	}
	
	@Then("^User verifies value of book as \"(.*?)\"$")
	public void userVerifiedPrice(String strPrice)
	{
		System.out.println("Price for verification " + strPrice);
		
	}


}
