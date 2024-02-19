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
    @FindBy(xpath = "//td[.='2024-02-19 15:44:34']")
    private WebElement bookingDateData;
    @FindBy(xpath = "//td[.='d2a7c1b0-2443-4422-aa01-b3169e696a07']")
    private WebElement bookingIdData;
    @FindBy(xpath = "//tbody[@class='[&_tr:last-child]:border-0']/tr[1]/td[.='Rayhan Arjunastya Miftaharif']")
    private WebElement nameData;
    @FindBy(xpath = "//tbody[@class='[&_tr:last-child]:border-0']/tr[1]/td[.='Pantai Kuta']")
    private WebElement tourData;
    @FindBy(xpath = "//tbody[@class='[&_tr:last-child]:border-0']/tr[1]/td[.='Ticket Regular']")
    private WebElement tourPackageData;
    @FindBy(xpath = "//tbody[@class='[&_tr:last-child]:border-0']/tr[1]/td[.='11']")
    private WebElement quantityData;
    @FindBy(xpath = "//tbody[@class='[&_tr:last-child]:border-0']/tr[1]/td[.='20000']")
    private WebElement priceData;
    @FindBy(xpath = "//tbody[@class='[&_tr:last-child]:border-0']/tr[1]/td[.='pending']")
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

    //===========================================Transaction History Pengelola==========================================//

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
