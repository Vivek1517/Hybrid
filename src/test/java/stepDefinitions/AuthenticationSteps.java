package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AuthenticationPage;

public class AuthenticationSteps {
    AuthenticationPage ap = new AuthenticationPage();
    @Then("user should navigate to authentication page")
    public void userShouldNavigateToAuthenticationPage() {
        Assert.assertTrue(ap.isUserOnAuthenticationPage());
    }

    @Given("user enters email as {string} and password as {string}")
    public void userEntersEmailAsAndPasswordAs(String email, String pwd) {
        ap.inputEmailaddress(email);
        ap.inputPassword(pwd);
    }

    @And("user clicks on log in")
    public void userClicksOnLogIn() {
        ap.clickOnLogin();
    }

    @When("user enters email {string} under create an account heading")
    public void userEntersEmailUnderCreateAnAccountHeading(String email) {
        ap.enterEmailToCreateAccount(email);
    }

    @And("user clicks on create an account page.")
    public void userClicksOnCreateAnAccountPage() {
        ap.clickONCreateAccount();
    }

    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expectedError) {
        Assert.assertEquals(expectedError,ap.showErrorMessage());
    }
}
