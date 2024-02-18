package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomeMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomeMyttStepDef {
    private final WebDriver driver = Hooks.driver;
    HomeMyttPage homeMyttPage = new HomeMyttPage(driver);
    @Given("User should be redirected to homepage")
    public void verifyHomepage(){
        Assert.assertTrue(homeMyttPage.verifyLogoMytt());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User click on city image")
    public void clickCityImage(){
        homeMyttPage.clickBaliImage();
    }

    @Then("Verify that the page loads correctly")
    public void verifyThatThePageLoadsCorrectly() {
        Assert.assertTrue(homeMyttPage.verifyLogoMytt());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("Verify that layout is displayed correctly")
    public void verifyThatLayoutIsDisplayedCorrectly() {
        Assert.assertTrue(homeMyttPage.verifyLayoutHeader());
        Assert.assertTrue(homeMyttPage.verifyTopPickTourist());
        Assert.assertTrue(homeMyttPage.verifyCityList());
        Assert.assertTrue(homeMyttPage.verifyLayoutFooter());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
