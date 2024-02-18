package org.example.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterMyttPage {
    public static WebDriver webDriver;
    public RegisterMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//img[@alt='logo-brand']")
    private WebElement logoBrand;
    @FindBy(xpath = "//button[@id='radix-:rf:-trigger-Customer']")
    private WebElement customerText;
    @FindBy(xpath = "//button[@id='radix-:rf:-trigger-Pengelola']")
    private WebElement pengelolaText;
    @FindBy(xpath = "//div[@class='h-10 items-center justify-center rounded-md bg-slate-100 p-1 text-slate-500 dark:bg-slate-800 dark:text-slate-400 grid w-full grid-cols-2 mb-10']")
    private WebElement boxChoiceRight;
    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fieldFullName;
    @FindBy(xpath = "//input[@name='phone_number']")
    private WebElement fieldPhoneNumber;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement fieldEmail;
    @FindBy(xpath = "//input[@name='address']")
    private WebElement fieldAddress;
    @FindBy(xpath = "//input[@name='no_ktp']")
    private WebElement fieldNoKTP;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;
    @FindBy(xpath = "//button[@class='w-full py-3 rounded-md bg-red-500 text-white mt-1 ']")
    private WebElement buttonRegister;
    public boolean verifyLogoBrand(){
        return logoBrand.isDisplayed();
    }
    public void clickCustomerText(){
        customerText.click();
    }
    public void clickPengelolaText(){
        pengelolaText.click();
    }
    public void inputFieldFullName(String fullName){
        fieldFullName.sendKeys(fullName);
    }
    public void chooseBoxRight(){
        boxChoiceRight.sendKeys(Keys.ARROW_RIGHT);
    }
    public void inputFieldPhoneNumber(String phoneNumber){
        fieldPhoneNumber.sendKeys(phoneNumber);
    }
    public void inputFieldEmail(String email){
        fieldEmail.sendKeys(email);
    }
    public void inputFieldAddress(String address){
        fieldAddress.sendKeys(address);
    }
    public void inputFieldNoKTP(String noKTP){
        fieldNoKTP.sendKeys(noKTP);
    }
    public void inputFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }
    public void clickButtonRegister(){
        buttonRegister.click();
    }
}
