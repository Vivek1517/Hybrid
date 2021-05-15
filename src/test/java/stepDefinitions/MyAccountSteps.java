package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MyAccountPage;

public class MyAccountSteps {
    MyAccountPage myAccount = new MyAccountPage();
    @Then("user should navigate to My Account page")
    public void userShouldNavigateToMyAccountPage() {
        Assert.assertTrue(myAccount.isUserOnMyAccountPage());
    }
}
