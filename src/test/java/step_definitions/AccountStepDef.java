package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.AccountPage;
import org.example.pageObject.TourListAdminPage;
import org.openqa.selenium.WebDriver;

public class AccountStepDef {
    private final WebDriver driver = Hooks.driver;
    AccountPage accountPage = new AccountPage(driver);
    @When("User click on verification account")
    public void userClickOnVerificationAccount() {
        accountPage.clickVerificationAccount();
    }

    @And("User click action checklist")
    public void userClickActionChecklist() {
        accountPage.clickChecklist();
    }
}
