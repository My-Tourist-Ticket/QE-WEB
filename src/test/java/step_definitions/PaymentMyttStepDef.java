package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.PaymentMyttPage;
import org.example.pageObject.TourMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PaymentMyttStepDef {
    private final WebDriver driver = Hooks.driver;
    PaymentMyttPage paymentMyttPage = new PaymentMyttPage(driver);
    @Given("User should be redirected to payment page")
    public void verifyPaymentPage(){
        Assert.assertTrue(paymentMyttPage.verifyPaymentDetails());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Input {string} as Full Name, {string} as Phone Number, and {string} as Email")
    public void inputValidData(String fullName, String phoneNumber, String email){
        paymentMyttPage.inputFullName(fullName);
        paymentMyttPage.inputPhoneNumber(phoneNumber);
        paymentMyttPage.inputEmail(email);
    }
    @When("User choose payment method")
    public void clickPaymentMethod(){
        paymentMyttPage.clickButtonBank();
    }
    @When("User click on submit button")
    public void clickSubmitButton(){
        paymentMyttPage.clickButtonSubmit();
    }
    @Then("User should be redirected to page for completed the payment")
    public void verifyPayment(){
        Assert.assertTrue(paymentMyttPage.verifyCompletePayment());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
