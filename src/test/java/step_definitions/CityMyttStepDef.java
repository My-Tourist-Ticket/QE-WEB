package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageObject.CityMyttPage;
import org.example.pageObject.HomeMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CityMyttStepDef {
    private final WebDriver driver = Hooks.driver;
    CityMyttPage cityMyttPage = new CityMyttPage(driver);

    @Given("User should be redirected to city page")
    public void verifyCityPage(){
        cityMyttPage.verifyDescription();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User click on tourist attraction image")
    public void clickTourImage(){
        cityMyttPage.clickTourImage();
    }

    @And("Verify that city page load correctly")
    public void verifyThatCityPageLoadCorrectly() {
        cityMyttPage.verifyCityImage();

    }
}
