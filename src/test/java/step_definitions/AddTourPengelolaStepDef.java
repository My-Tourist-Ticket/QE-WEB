package step_definitions;

import io.cucumber.java.en.When;
import org.example.pageObject.AddTourPengelolaMyttPage;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AddTourPengelolaStepDef {
    private final WebDriver driver = Hooks.driver;
    AddTourPengelolaMyttPage addTourPengelolaMyttPage = new AddTourPengelolaMyttPage(driver);

    @When("Pengelola click on label my tour")
    public void clickLabelMT(){
        addTourPengelolaMyttPage.clickButtonLabelMyTour();
    }
    @When("Pengelola click on add tour button")
    public void clickButtonAddTour1(){
        addTourPengelolaMyttPage.clickButtonAddTour();
    }
    @When("Pengelola click on back to my tour")
    public void clickButtonBackToMyTourMT(){
        addTourPengelolaMyttPage.clickButtonBackToMyTour();
    }
    @When("Pengelola click on add tour button again")
    public void clickButtonAddTour2(){
        addTourPengelolaMyttPage.clickButtonAddTour();
    }
    @When("Pengelola input {string} as Tour Name")
    public void inputValidDataAddNewTour(String tourName){
        addTourPengelolaMyttPage.inputTourNameField(tourName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click on choose city")
    public void clickChooseCityButtonSelect(){
        addTourPengelolaMyttPage.selectChooseCityButtonField();
    }
    @When("Pengelola click on option city")
    public void chooseOptionCitySelect(){
        addTourPengelolaMyttPage.chooseOptionSelectCity();
    }
    @When("Pengelola input {string} as Search Location")
    public void inputSearchLocation(String searchLocation){
        addTourPengelolaMyttPage.inputSearchLocationField(searchLocation);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click on button search")
    public void clickButtonSearchLocation(){
        addTourPengelolaMyttPage.clickSearchLocationButton();
    }
    @When("Pengelola click on zoom in map")
    public void clickZoomInMapLocation(){
        addTourPengelolaMyttPage.clickZoomInMap();
    }
    @When("Pengelola click on zoom out map")
    public void clickZoomOutMapLocation(){
        addTourPengelolaMyttPage.clickZoomOutMap();
    }
    @When("Pengelola input {string} as Address")
    public void inputAddressFieldOnAddTour(String address){
        addTourPengelolaMyttPage.inputAddressField(address);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola input {string} as Description")
    public void inputDescFieldOnAddTour(String desc){
        addTourPengelolaMyttPage.inputDescriptionField(desc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola upload thumbnail")
    public void uploadThumnailFile(){
        File thumbnailImage = new File("E:/capstone_project/QE-WEB/src/test/resources/image/SentulParadisePark.jpg");
        addTourPengelolaMyttPage.sendUploadThumbnail(thumbnailImage);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola upload image")
    public void uploadImageFile(){
        File fileImage = new File("E:/capstone_project/QE-WEB/src/test/resources/image/SentulParadisePark.jpg");
        addTourPengelolaMyttPage.sendUploadImage(fileImage);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click on button add new tour")
    public void clickButtonAddNewTourMT() throws InterruptedException {
        addTourPengelolaMyttPage.clickButtonAddNewTour();
    }
}
