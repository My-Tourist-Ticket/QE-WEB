package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.AddVoucherPage;
import org.example.pageObject.LoginMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddVoucherStepDef {
    private final WebDriver driver = Hooks.driver;
    AddVoucherPage addVoucherPage = new AddVoucherPage(driver);
    @When("User click on add voucher")
    public void userClickOnAddVoucher() {
        addVoucherPage.clickAddVoucher();
    }

    @And("User input {string} as voucher name, {string} as voucher code")
    public void userInputAsVoucherNameAsVoucherCode(String name, String voucher_code) {
        addVoucherPage.inputVoucherName(name);
        addVoucherPage.inputVoucherCode(voucher_code);
    }

    @And("User input {string} as description, {string} as discount value")
    public void userInputAsDescriptionAsDiscountValue(String Description, String discValue) {
        addVoucherPage.inputDescription(Description);
        addVoucherPage.inputDiscountValue(discValue);
    }

    @And("User click on icon show date")
    public void userClickOnIconShowDate() {
        addVoucherPage.clickButtonAdd();
    }

    @And("User choose date on calender")
    public void userChooseDateOnCalender() {
        addVoucherPage.clickExpVoucher();
    }

    @And("User click on button add")
    public void userClickOnButtonAdd() {
        addVoucherPage.clickButtonAdd();
    }

    @Then("Show message {string} should appeared")
    public void showMessageShouldAppeared(String message) {
        Assert.assertEquals(message,addVoucherPage.getMessage());
    }
}
