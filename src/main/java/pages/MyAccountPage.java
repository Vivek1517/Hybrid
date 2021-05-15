package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Util;

public class MyAccountPage extends BasePage{
    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(className="page-heading")
    WebElement isUserOnMyAccountPage;


    public boolean isUserOnMyAccountPage(){
        return Util.isDisplayed(isUserOnMyAccountPage);
    }

}
