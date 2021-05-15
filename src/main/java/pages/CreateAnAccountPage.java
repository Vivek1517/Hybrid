package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Util;

public class CreateAnAccountPage extends BasePage {
    public CreateAnAccountPage(){
        PageFactory.initElements(driver,this);
    }
    HomePage hp = new HomePage();
    @FindBy(className="page-heading")
    WebElement isUserOnCreateAnAccountPage;
    @FindBy(css="#id_gender1")
    WebElement chooseTitleMr;
    @FindBy(css="#id_gender2")
    WebElement chooseTitleMrs;
    @FindBy(css="#customer_firstname")
    WebElement input1stName;
    @FindBy(css="#customer_lastname")
    WebElement inputLastName;
    @FindBy(css="#passwd")
    WebElement inputPwd;
    @FindBy(css="#days")
    WebElement selectDate;
    @FindBy(css="#months")
    WebElement selectMonth;
    @FindBy(css="#years")
    WebElement selectYear;
    @FindBy(css="#address1")
    WebElement inputAddress;
    @FindBy(css="#city")
    WebElement inputCity;
    @FindBy(css="#id_state")
    WebElement selectState;
    @FindBy(css="#id_country")
    WebElement selectCountry;
    @FindBy(css="#postcode")
    WebElement inputPostCode;
    @FindBy(css="#phone")
    WebElement inputHomeNumber;
    @FindBy(css="#phone_mobile")
    WebElement inputMobileNumber;
    @FindBy(id="submitAccount")
    WebElement clickOnRegister;
    @FindBy(xpath="//div[@class='alert alert-danger']/ol/li")
    WebElement showError;

    /*public void stepToGoToAuthenticationPage(){
        hp.verifyUserOnHomePage();
        hp.clickOnSigin();
        hp.isUserOnAuthenticationPage();
    }*/
    public String isUserOnCreateAccountPage(String actualText){
        return Util.getText(isUserOnCreateAnAccountPage);
    }
    public boolean isUserOnCreateAccountPage(){
        return Util.isDisplayed(isUserOnCreateAnAccountPage);
    }
    public void selectGender(String gender, String firstName, String lastName, String password){
        if(gender.equalsIgnoreCase("Mr")){
            Util.waitTime(10);
            Util.click(chooseTitleMr);
        }
        else {
            Util.click(chooseTitleMrs);
        }
        Util.sendKeys(input1stName,firstName);
        Util.sendKeys(inputLastName,lastName);
        Util.sendKeys(inputPwd,password);
    }

    public void selectDOB(String date, String month, String year){
        Util.waitTime(2);
        Util.slectByValue(selectDate,date);
        Util.slectByValue(selectMonth,month);
        Util.slectByValue(selectYear,year);
    }

    public void enterAddress(String address, String city, String postCode){
        Util.sendKeys(inputAddress, address);
        Util.sendKeys(inputCity, city);
        Util.sendKeys(inputPostCode, postCode);

    }

    public void selectStateAndCountry(String state, String country){
        Util.waitTime(2);
        Util.selectByVisibleText(selectState, state);
        Util.selectByVisibleText(selectCountry, country);
    }

    public void enterHomenoMobileno(String mobileNo){
        Util.sendKeys(inputMobileNumber, mobileNo);
    }

    public void clickOnRegister(){
        Util.click(clickOnRegister);
    }

    public String userShouldGetError(){
        return Util.getText(showError);
    }

}
