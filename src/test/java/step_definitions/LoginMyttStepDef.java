package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginMyttStepDef {
    private final WebDriver driver = Hooks.driver;
    LoginMyttPage loginMyttPage = new LoginMyttPage(driver);
    @Given("User already on homepage")
    public void verifyHomepage(){
        Assert.assertTrue(loginMyttPage.verifyLogoMytt());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User click on Sign Up button")
    public void clickSignUpButton(){
        loginMyttPage.clickSignUpButton();
        Assert.assertTrue(loginMyttPage.verifyLogoBrand());
    }
    @When("User click on Login text")
    public void clickLoginText(){
        loginMyttPage.clickLoginText();
        Assert.assertTrue(loginMyttPage.verifyLoginPage());
    }
    @When("User input {string} as email and {string} as password")
    public void inputEmailAndPassword(String email, String password){
        loginMyttPage.inputEmailField(email);
        loginMyttPage.inputPasswordField(password);
    }
    @When("User click on Login button")
    public void clickLoginButton() throws InterruptedException {
        loginMyttPage.clickLoginButton();
    }

    @Then("Error message {string} should appeared")
    public void errorMessageShouldAppeared(String errorMessage) {
        Assert.assertEquals(errorMessage,loginMyttPage.getErrorMessage());
    }
}
