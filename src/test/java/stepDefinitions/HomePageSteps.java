package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps {
    HomePage hp = new HomePage();
    @Given("user is on automation practice")
    public void userIsOnAutomationPracticeHomePage() {
        Assert.assertTrue(hp.verifyUserOnHomePage());
    }

    @When("user clicks on sign in")
    public void userClicksOnSignIn() {
    hp.goToAuthenticationPage();
    }

    @When("user searches for product {string} in the search field")
    public void userSearchesForProductInTheSearchField(String product) {
        hp.searchProduct(product);
    }

    @And("user clicks on search")
    public void userClicksOnSearch() {
        hp.clickSearch();
    }

    @Then("user should see a message {string}")
    public void userShouldSeeAMessage(String expectedError) {
        Assert.assertEquals(expectedError,hp.searchError().replace("\"jeans\"","jeans"));
    }

    @Then("user should navigate to the product page")
    public void userShouldNavigateToTheProductPage() {
        Assert.assertTrue(hp.productPage());
    }
}
