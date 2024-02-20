package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.TLAdminPage;
import org.example.pageObject.TourListAdminPage;
import org.openqa.selenium.WebDriver;

public class TourListAminStepDef {
    private final WebDriver driver = Hooks.driver;
    TourListAdminPage tourListAdminPage = new TourListAdminPage(driver);
    @And("User click on tour list")
    public void userClickOnTourList() {
        tourListAdminPage.clickTourList();
    }
    @When("User click three dot menu")
    public void userClickThreeDotMenu() {
        tourListAdminPage.clickTitikTiga();
    }

    @And("User click delete menu")
    public void userClickDeleteMenu() {
        tourListAdminPage.clickDelete();
    }


}
