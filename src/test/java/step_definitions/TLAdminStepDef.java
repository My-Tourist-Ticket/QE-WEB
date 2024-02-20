package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.TLAdminPage;
import org.openqa.selenium.WebDriver;

public class TLAdminStepDef {
    private final WebDriver driver = Hooks.driver;
    TLAdminPage tlAdminPage = new TLAdminPage(driver);
    @When("User click on transaction list")
    public void userClickOnTransactionList() {
        tlAdminPage.clickTransactionListAdmin();
    }

    @And("User click on pagination dua")
    public void userClickOnPagination() {
        tlAdminPage.clickPaginationDua();
    }
    @And("User click on pagination tiga")
    public void userClickOnPaginationTiga() {
        tlAdminPage.clickPaginationTiga();
    }

}
