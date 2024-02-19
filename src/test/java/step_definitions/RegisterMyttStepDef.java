package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageObject.HomeMyttPage;
import org.example.pageObject.LoginMyttPage;
import org.example.pageObject.RegisterMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RegisterMyttStepDef {
    private final WebDriver driver = Hooks.driver;
    RegisterMyttPage registerMyttPage = new RegisterMyttPage(driver);
    HomeMyttPage homeMyttPage = new HomeMyttPage(driver);
    @Given("User already on home page")
    public void verifyHomepage(){
        Assert.assertTrue(homeMyttPage.verifyLogoMytt());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User click Sign Up button")
    public void clickSignUpButton(){
        homeMyttPage.clickSignUpButton();
        Assert.assertTrue(registerMyttPage.verifyLogoBrand());
    }
    @When("User click Customer")
    public void clickCustomer(){
    }
    @When("User click Pengelola")
    public void clickPengelola() throws InterruptedException {
        registerMyttPage.chooseBoxRight();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User input {string} as Fullname, {string} as Phone Number, {string} as email, and {string} as password")
    public void inputValidData(String fullName, String phonenNumber, String email, String password){
        registerMyttPage.inputFieldFullName(fullName);
        registerMyttPage.inputFieldPhoneNumber(phonenNumber);
        registerMyttPage.inputFieldEmail(email);
        registerMyttPage.inputFieldPassword(password);
    }
    @When("User input {string} as Fullname, {string} as Phone Number, {string} as email, {string} as address, {string} as no ktp and {string} as password")
    public void inputValidData2(String fullName, String phonenNumber, String email, String address, String noKTP, String password){
        registerMyttPage.inputFieldFullName(fullName);
        registerMyttPage.inputFieldPhoneNumber(phonenNumber);
        registerMyttPage.inputFieldEmail(email);
        registerMyttPage.inputFieldAddress(address);
        registerMyttPage.inputFieldNoKTP(noKTP);
        registerMyttPage.inputFieldPassword(password);
    }
    @When("User click on Register button")
    public void clickRegisterButton() throws InterruptedException {
        registerMyttPage.clickButtonRegister();
    }


}
