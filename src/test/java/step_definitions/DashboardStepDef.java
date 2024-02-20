package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.DashboardPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DashboardStepDef {
    private final WebDriver driver = Hooks.driver;
    DashboardPage dashboardPage = new DashboardPage(driver);
    @Then("User should be redirected to dashboard")
    public void userShouldBeRedirectedToDashboard() {
        Assert.assertTrue(dashboardPage.verifyDashboard());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("User click on pantai kuta image")
    public void userClickOnPantaiKutaImage() {
        dashboardPage.clickTopTour();
    }

    @And("User click on ticket regular")
    public void userClickOnTicketRegular() {
        dashboardPage.clickTicketRegular();
    }

    @And("User click on family bundling")
    public void userClickOnFamilyBundling() {
        dashboardPage.clickFamilyBundling();
    }

    @And("User click on happy bundling")
    public void userClickOnHappyBundling() {
        dashboardPage.clickHappyBundling();
    }
}
