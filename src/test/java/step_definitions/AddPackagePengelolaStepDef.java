package step_definitions;

import io.cucumber.java.en.When;
import org.example.pageObject.AddPackagePengelolaMyttPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddPackagePengelolaStepDef {
    private final WebDriver driver = Hooks.driver;
    AddPackagePengelolaMyttPage addPackagePengelolaMyttPage = new AddPackagePengelolaMyttPage(driver);

    @When("Pengelola click on image tour")
    public void clickImageTourButton(){
        addPackagePengelolaMyttPage.clickImageTour();
    }
    @When("Pengelola click on add package")
    public void clickAddPackageButtonField(){
        addPackagePengelolaMyttPage.clickAddPackageButton();
    }
    @When("Pengelola input {string} as Package Name")
    public void inputValidDataAddPackage(String packageName) {
        addPackagePengelolaMyttPage.inputPackageName(packageName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click on add services button")
    public void clickAddServicesButtonField(){
        addPackagePengelolaMyttPage.clickAddServicesButton();
    }
    @When("Pengelola input {string} as services list 1")
    public void inputValidDataServicesList1(String servicesList1) {
        addPackagePengelolaMyttPage.inputServicesList1(servicesList1);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola input {string} as services list 2")
    public void inputValidDataServicesList2(String servicesList2) {
        addPackagePengelolaMyttPage.inputServicesList2(servicesList2);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click on remove services button")
    public void clickRemoveServices1(){
        addPackagePengelolaMyttPage.clickRemoveServicesList1();
    }
    @When("Pengelola input {string} as Jumlah Tiket")
    public void inputValidDataJumlahTiket(String jumket) {
        addPackagePengelolaMyttPage.inputJumlahTiket(jumket);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola input {string} as Price")
    public void inputValidDataJPrice(String price) {
        addPackagePengelolaMyttPage.inputPrice(price);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click on button submit")
    public void clickButtonSubmitField(){
        addPackagePengelolaMyttPage.clickButtonSubmit();
    }
}
