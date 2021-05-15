package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreateAnAccountPage;
import utilities.Util;

public class CreateAnAccountSteps {
    CreateAnAccountPage cp = new CreateAnAccountPage();
    @Then("user should navigate to create an account page.")
    public void userShouldNavigateToCreateAnAccountPage() {
        Assert.assertTrue(cp.isUserOnCreateAccountPage());
        Util.waitTime(5);
    }

    @When("user selects title {string} enters first name {string}, last name {string} and password {string}")
    public void userSelectsTitleEntersFirstNameLastNameAndPassword(String title, String firstName, String lastName, String pwd) {

        cp.selectGender(title,firstName,lastName,pwd);
    }

    @And("user selects DOB {string}, {string} and {string}")
    public void userSelectsDOBAnd(String date, String month, String year) {
        cp.selectDOB(date,month,year);
    }

    @And("user enter street address {string}, city {string} and post code {string}")
    public void userEnterStreetAddressCityAndPostCode(String street, String city, String postCode) {
        cp.enterAddress(street,city,postCode);
    }

    @And("user selects state {string} and country {string}")
    public void userSelectsStateAndCountry(String state, String country) {
        cp.selectStateAndCountry(state,country);
    }

    @And("user enters mobile number {string}")
    public void userEntersMobileNumber(String mobile) {
        cp.enterHomenoMobileno(mobile);
    }

    @And("user clicks on register")
    public void userClicksOnRegister() {
        cp.clickOnRegister();
    }

    @Then("user should see a validation message {string}")
    public void userShouldSeeAValidationMessage(String error) {
        Assert.assertEquals(cp.userShouldGetError(),error);
    }
}
