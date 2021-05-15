package pages;



import utilities.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {
    public AuthenticationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".page-heading")
    WebElement isUserOnAuthenticationPage;
    @FindBy(css="#email_create")
    WebElement inputEmailToCreateAccount;
    @FindBy(css="#SubmitCreate")
    WebElement clickONCreateAccount;
    @FindBy(id="login_form")
    WebElement loginFormIsDisplayed;
    @FindBy(css="#email")
    WebElement inputEmailaddress;
    @FindBy(css="#passwd")
    WebElement inputPassword;
    @FindBy(id="SubmitLogin")
    WebElement clickOnLogin;
    @FindBy(xpath ="//div[@class='alert alert-danger']/ol/li")
    WebElement showErrorMessage;

    public boolean isUserOnAuthenticationPage(){
        return Util.isDisplayed(isUserOnAuthenticationPage);
    }
    public boolean loginFormIsDisplayes(){
        return Util.isDisplayed(loginFormIsDisplayed);
    }
    public void enterEmailToCreateAccount(String text){
        Util.sendKeys(inputEmailToCreateAccount,text);
    }
    public void clickONCreateAccount(){
        Util.click(clickONCreateAccount);
    }
    public void inputEmailaddress(String email){
        Util.sendKeys(inputEmailaddress,email);
    }
    public void inputPassword(String pwd){
        Util.sendKeys(inputPassword,pwd);
    }
    public void clickOnLogin(){
        Util.click(clickOnLogin);
    }
    public String showErrorMessage(){
        return showErrorMessage.getText();
    }
}

