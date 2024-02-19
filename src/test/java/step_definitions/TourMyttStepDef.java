package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageObject.CityMyttPage;
import org.example.pageObject.TourMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TourMyttStepDef {
    private final WebDriver driver = Hooks.driver;
    TourMyttPage tourMyttPage = new TourMyttPage(driver);
    @Given("User should be redirected to tour page")
    public void verifyTourPage(){
        Assert.assertTrue(tourMyttPage.verifyTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("User choose package")
    public void choosePackage() throws InterruptedException {
        tourMyttPage.clickRegularPackage();
        tourMyttPage.clickDateChoice();
        Thread.sleep(3000);
    }
    @When("User add ticket {int} times")
    public void addTicket(int numTime) {
        tourMyttPage.clickPlusIcon(numTime);
    }
    @When("User click on booking button")
    public void clickBookingButton(){
        tourMyttPage.clickButtonBooking();
    }

}
