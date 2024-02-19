package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionHistoryMyttPage {
    public static WebDriver webDriver;
    public TransactionHistoryMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@class='flex justify-between items-center gap-x-10 w-full sticky top-0 z-50 bg-transparent transition-background duration-500 ease-in-out px-10']/img[@src='/assets/logo1-CvtGyCwG.png']")
    private WebElement logoWebsiteTH;
    @FindBy(xpath = "//button[@class='bg-red-500 w-32 text-white px-5 py-2 rounded-full']")
    private WebElement signUpButtonTH;
    @FindBy(xpath = "//a[.='Log in']")
    private WebElement loginTextTH;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailFieldTH;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordFieldTH;
    @FindBy(xpath = "//button[@class='w-full py-3 rounded-md bg-red-500 text-white ']")
    private WebElement loginButtonTH;
    @FindBy(xpath = "//a[.='Transaction History']")
    private WebElement labelTransactionHistory;
    @FindBy(xpath = "//td[.='2024-02-18 10:45:46']")
    private WebElement bookingDateData;
    @FindBy(xpath = "//td[.='ca996f63-6f6a-4b2d-8816-935c159cc839']")
    private WebElement bookingIdData;
    @FindBy(xpath = "//td[.='kitten']")
    private WebElement nameData;
    @FindBy(xpath = "//tr[5]/td[.='Pantai Kuta']")
    private WebElement tourData;
    @FindBy(xpath = "//tr[5]/td[.='Happy Bundling - 1 Ticket']")
    private WebElement tourPackageData;
    @FindBy(xpath = "//td[.='3']")
    private WebElement quantityData;
    @FindBy(xpath = "//tr[5]/td[.='100000']")
    private WebElement priceData;
    @FindBy(xpath = "//tr[5]/td[.='settlement']")
    private WebElement statusData;
    @FindBy(xpath = "//a[.='Next']")
    private WebElement buttonNextListTH;
    @FindBy(xpath = "//a[.='Back']")
    private WebElement buttonBackListTH;
    @FindBy(xpath = "//a[.='2']")
    private WebElement buttonNumberListTH;

    public boolean verifyLogoMyttTH(){
        return logoWebsiteTH.isDisplayed();
    }
    public void clickSignUpButtonTH(){
        signUpButtonTH.click();
    }
    public void clickLoginTextTH(){
        loginTextTH.click();
    }
    public void inputEmailFieldTH(String email){
        emailFieldTH.sendKeys(email);
    }
    public void inputPasswordFieldTH(String password){
        passwordFieldTH.sendKeys(password);
    }
    public void clickLoginButtonTH(){
        loginButtonTH.click();
    }
    public void clickLabelTransactionHistory(){
        labelTransactionHistory.click();
    }
    public boolean verifyBookingDateData(){
        return bookingDateData.isDisplayed();
    }
    public boolean verifyBookingIdData(){
        return bookingIdData.isDisplayed();
    }
    public boolean verifyNameData(){
        return nameData.isDisplayed();
    }
    public boolean verifyTourData(){
        return tourData.isDisplayed();
    }
    public boolean verifyTourPackageData(){
        return tourPackageData.isDisplayed();
    }
    public boolean verifyQuantityData(){
       return quantityData.isDisplayed();
    }
    public boolean verifyPriceData(){
        return priceData.isDisplayed();
    }
    public boolean verifyStatusData(){
        return statusData.isDisplayed();
    }
    public void clickButtonNextListTH(){
        buttonNextListTH.click();
    }
    public void clickButtonBackListTH(){
        buttonBackListTH.click();
    }
    public void clickButtonNumberListTH(){
        buttonNumberListTH.click();
    }
}
