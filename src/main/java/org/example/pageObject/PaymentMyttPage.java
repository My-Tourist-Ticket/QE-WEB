package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMyttPage {

    public static WebDriver webDriver;
    public PaymentMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//p[.='Payment Details']")
    private WebElement paymentDetails;
    @FindBy(xpath = "//input[@name='full_name']")
    private WebElement fieldFullName;
    @FindBy(xpath = "//input[@name='phone_number']")
    private WebElement fieldPhoneNumber;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement fieldEmail;
    @FindBy(xpath = "//button[@id='bca']/span[@class='flex items-center justify-center']")
    private WebElement buttonBank;
    @FindBy(xpath = "//button[@class='bg-blue-500 text-white w-44 py-2 rounded-lg']")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//p[@class='text-lg font-bold']")
    private WebElement completePayment;
    public boolean verifyPaymentDetails(){
        return paymentDetails.isDisplayed();
    }
    public void inputFullName(String fullName){
        fieldFullName.sendKeys(fullName);
    }
    public void inputPhoneNumber(String phoneNumber){
        fieldPhoneNumber.sendKeys(phoneNumber);
    }
    public void inputEmail(String email){
        fieldEmail.sendKeys(email);
    }
    public void clickButtonBank(){
        buttonBank.click();
    }
    public void clickButtonSubmit(){
        buttonSubmit.click();
    }
    public boolean verifyCompletePayment(){
        return completePayment.isDisplayed();
    }
}
