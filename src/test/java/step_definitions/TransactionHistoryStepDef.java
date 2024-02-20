package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.TransactionHistoryMyttPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TransactionHistoryStepDef {
    private final WebDriver driver = Hooks.driver;
    TransactionHistoryMyttPage transactionHistoryMyttPage = new TransactionHistoryMyttPage(driver);

    @Given("Pengelola already on homepage")
    public void verifyHomepageTH(){
        Assert.assertTrue(transactionHistoryMyttPage.verifyLogoMyttTH());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click on Sign Up button")
    public void clickSignUpButtonTH(){
        transactionHistoryMyttPage.clickSignUpButtonTH();
    }
    @When("Pengelola click on Login text")
    public void clickLoginTextTH(){
        transactionHistoryMyttPage.clickLoginTextTH();
    }
    @When("Pengelola input {string} as email and {string} as password")
    public void inputEmailAndPasswordTH(String email, String password){
        transactionHistoryMyttPage.inputEmailFieldTH(email);
        transactionHistoryMyttPage.inputPasswordFieldTH(password);
    }
    @When("Pengelola click on Login button")
    public void clickLoginButtonTH() {
        transactionHistoryMyttPage.clickLoginButtonTH();
    }
    @When("Pengelola click on label transaction history")
    public void clickLabelTH(){
        transactionHistoryMyttPage.clickLabelTransactionHistory();
    }

    @Then("Pengelola verify booking date data {string}")
    public void verifyLabelBookingDateData(String bookingDateData) {
        Assert.assertTrue(bookingDateData, transactionHistoryMyttPage.verifyBookingDateData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("Pengelola verify booking id data {string}")
    public void verifyLabelBookingIdData(String bookingIdData) {
        Assert.assertTrue(bookingIdData, transactionHistoryMyttPage.verifyBookingIdData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("Pengelola verify name data {string}")
    public void verifyLabelNameData(String nameData) {
        Assert.assertTrue(nameData, transactionHistoryMyttPage.verifyNameData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("Pengelola verify tour data {string}")
    public void verifyLabelTourData(String tourData) {
        Assert.assertTrue(tourData, transactionHistoryMyttPage.verifyTourData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("Pengelola verify tour package data {string}")
    public void verifyLabelTourPackageData(String tourPackageData) {
        Assert.assertTrue(tourPackageData, transactionHistoryMyttPage.verifyTourPackageData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("Pengelola verify quantity data {string}")
    public void verifyLabelQuantityData(String quantityData) {
        Assert.assertTrue(quantityData, transactionHistoryMyttPage.verifyQuantityData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("Pengelola verify price data {string}")
    public void verifyPriceData(String priceData) {
        Assert.assertTrue(priceData, transactionHistoryMyttPage.verifyPriceData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("Pengelola verify status data")
    public void verifyStatusData() {
        Assert.assertTrue(transactionHistoryMyttPage.verifyStatusData());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click next on transaction history list")
    public void clickNextTHList(){
        transactionHistoryMyttPage.clickButtonNextListTH();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click back on transaction history list")
    public void clickBackTHList(){
        transactionHistoryMyttPage.clickButtonBackListTH();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Pengelola click number on transaction history list")
    public void clickNumberTHList(){
        transactionHistoryMyttPage.clickButtonNumberListTH();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
