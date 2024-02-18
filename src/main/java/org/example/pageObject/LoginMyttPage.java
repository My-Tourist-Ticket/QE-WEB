package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMyttPage {
    public static WebDriver webDriver;
    public LoginMyttPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//div[@class='flex justify-between items-center gap-x-10 w-full sticky top-0 z-50 bg-transparent transition-background duration-500 ease-in-out px-10']/img[@src='/assets/logo1-D-qltNBN.png']")
    private WebElement logoWebsite;
    @FindBy(xpath = "//button[@class='bg-red-500 w-32 text-white px-5 py-2 rounded-full']")
    private WebElement signUpButton;
    @FindBy(xpath = "//img[@alt='logo-brand']")
    private WebElement logoBrand;
    @FindBy(xpath = "//a[.='Log in']")
    private WebElement loginText;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@class='w-full py-3 rounded-md bg-red-500 text-white ']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='text-sm opacity-90']")
    private WebElement errorMessage;

    public boolean verifyLogoMytt(){
        return logoWebsite.isDisplayed();
    }
    public void clickSignUpButton(){
        signUpButton.click();
    }
    public boolean verifyLogoBrand(){
        return logoBrand.isDisplayed();
    }
    public void clickLoginText(){
        loginText.click();
    }
    public void inputEmailField(String email){
        emailField.sendKeys(email);
    }
    public void inputPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public String getErrorMessage(){
        return errorMessage.getText();
    }


}
