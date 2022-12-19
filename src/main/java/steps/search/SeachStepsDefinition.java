package steps.search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.GoogleHomePage;

public class SeachStepsDefinition {
    private GoogleHomePage googleHomePage;

    @Given("the user open google page")
    public void theUserOpenGooglePage() {
        googleHomePage = new GoogleHomePage();
        googleHomePage.open();
        System.out.println(googleHomePage.getDriver().getCurrentUrl());
    }


    @And("user fill the search with {string}")
    public void userFillTheSearchWithSelenium(String arg0) {
        System.out.println("and");
    }

    @When("the user execute the search")
    public void theUserExecuteTheSearch() {
        System.out.println("when");
    }


    @Then("the result will be shown")
    public void theResultWillBeShown() {
        System.out.println("then");
    }
}
