package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Util;


public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="home-page-tabs")
    WebElement verifyUserIsOnHomePage;
    @FindBy(css=".login")
    WebElement clickOnSignin;
    @FindBy(id="search_query_top")
    WebElement enterProduct;
    @FindBy(name="submit_search")
    WebElement clickSearch;
    @FindBy(css=".alert.alert-warning")
    WebElement searchError;
    @FindBy(id="contact-link")
    WebElement clickContactUs;
    @FindBy(css=".compare-form")
    WebElement productPage;

    public boolean verifyUserOnHomePage(){
        return Util.isDisplayed(verifyUserIsOnHomePage);
    }
    public void goToAuthenticationPage(){
        Util.click(clickOnSignin);
    }
    public void searchProduct(String text){
        Util.sendKeys(enterProduct,text);
    }
    public void clickSearch(){
        Util.click(clickSearch);
    }
    public void clickOnContactUs(){
        Util.click(clickContactUs);
    }
    public String searchError(){
        return Util.getText(searchError);
    }
    public boolean productPage(){
        return Util.isDisplayed(productPage);
    }
}
